package hk.edu.polyu.comp3334.g41.artx.entity

import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.Id
import javax.persistence.Table

@Entity
@Table(name = "artwork")
data class Artwork(
    @Id
    @Column(name = "id")
    var id: Long? = null,  // use token id

    var author: String? = null,
    var name: String? = null,
    var description: String? = null,
    var imageUrl: String? = null
)
