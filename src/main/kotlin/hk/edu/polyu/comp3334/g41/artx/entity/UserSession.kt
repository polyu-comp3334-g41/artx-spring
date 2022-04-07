package hk.edu.polyu.comp3334.g41.artx.entity

import javax.persistence.Entity
import javax.persistence.Id

@Entity
data class UserSession(
    @Id
    var address: String? = null,
    var nonce: Long? = null,
)
