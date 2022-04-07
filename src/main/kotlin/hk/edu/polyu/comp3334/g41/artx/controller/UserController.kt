package hk.edu.polyu.comp3334.g41.artx.controller

import hk.edu.polyu.comp3334.g41.artx.entity.UserSession
import hk.edu.polyu.comp3334.g41.artx.repository.UserSessionRepository
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController
import kotlin.random.Random

@RestController
@RequestMapping("/login")
class UserController(
    val userSessionRepo: UserSessionRepository
) {
    /**
     * Generate a new nonce for the requested address. Insert a new record if the address is not included in the database yet.
     */
    @GetMapping
    fun getNonce(@RequestParam(name = "address") address: String): Long {
        val nonce = Random.Default.nextLong()
        userSessionRepo.save(
            UserSession(address, nonce)
        )

        return nonce
    }
}
