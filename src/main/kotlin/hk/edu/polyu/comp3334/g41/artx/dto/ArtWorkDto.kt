package hk.edu.polyu.comp3334.g41.artx.dto

data class ArtWorkDto(
    var id: Long? = null,
    var tokenId: Long? = null,
    var author: String? = null,  // eth address
    var name: String? = null,
    var description: String? = null,
    var imageUrl: String? = null
)