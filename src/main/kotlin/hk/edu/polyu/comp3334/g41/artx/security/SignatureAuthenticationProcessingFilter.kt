package hk.edu.polyu.comp3334.g41.artx.security

import com.fasterxml.jackson.databind.ObjectMapper
import org.springframework.security.authentication.AuthenticationManager
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken
import org.springframework.security.core.Authentication
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter
import javax.servlet.http.HttpServletRequest
import javax.servlet.http.HttpServletResponse

/**
 * Override default username-password filter.
 */
class SignatureAuthenticationProcessingFilter(
    authenticationManager: AuthenticationManager,
): UsernamePasswordAuthenticationFilter(authenticationManager) {
    companion object {
        val mapper: ObjectMapper = ObjectMapper()
    }

    @Suppress("NAME_SHADOWING")
    override fun attemptAuthentication(request: HttpServletRequest?, response: HttpServletResponse?): Authentication {
        val request = request!!
        require(request.method == "POST") {"Authentication Method not supported: ${request.method}"}
        val signed = mapper.readValue(request.inputStream, SignedObject::class.java)

        val auth = UsernamePasswordAuthenticationToken(signed.address, signed.signedMsg)
        return authenticationManager.authenticate(auth)
    }
}

data class SignedObject(
    var address: String? = null,
    var signedMsg: String? = null
)
