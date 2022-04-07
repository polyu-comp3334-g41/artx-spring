package hk.edu.polyu.comp3334.g41.artx.security

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.HttpStatus
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder
import org.springframework.security.config.annotation.web.builders.HttpSecurity
import org.springframework.security.config.annotation.web.builders.WebSecurity
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter
import org.springframework.security.web.authentication.SimpleUrlAuthenticationFailureHandler

@EnableWebSecurity
class SecurityConfig: WebSecurityConfigurerAdapter() {
    @Autowired lateinit var signatureAuthenticationProvider: SignatureAuthenticationManager

    override fun configure(auth: AuthenticationManagerBuilder?) {
        super.configure(auth)
    }

    override fun configure(web: WebSecurity?) {
        super.configure(web)
    }

    override fun configure(http: HttpSecurity?) {
        http!!
            .formLogin()
                    .successHandler { req, res, auth -> res.status = HttpStatus.OK.value() } // no redirect
                    .failureHandler(SimpleUrlAuthenticationFailureHandler()).and()
            .csrf().disable()
            .headers().frameOptions().disable().and() // h2-console
            .authorizeRequests().antMatchers("/h2-console/**").permitAll().and()
            .authorizeRequests().antMatchers("/swagger-ui/**").permitAll().and()
            .authorizeRequests().antMatchers("/api/v1/users/**").permitAll().and()

        http.addFilter(SignatureAuthenticationProcessingFilter(signatureAuthenticationProvider))
    }
}
