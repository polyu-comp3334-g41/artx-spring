package hk.edu.polyu.comp3334.g41.artx.security

import org.slf4j.Logger
import org.slf4j.LoggerFactory
import org.springframework.security.authentication.AuthenticationManager
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken
import org.springframework.security.core.Authentication
import org.springframework.stereotype.Service

@Service
class SignatureAuthenticationManager: AuthenticationManager {
    companion object {
        val logger: Logger = LoggerFactory.getLogger(SignatureAuthenticationManager::class.java)
    }

    override fun authenticate(authentication: Authentication?): Authentication {
        logger.info("Authenticating {}, credential: {}", authentication!!.name, authentication.credentials)
        return UsernamePasswordAuthenticationToken(authentication.principal, authentication.credentials, listOf())
    }
}
