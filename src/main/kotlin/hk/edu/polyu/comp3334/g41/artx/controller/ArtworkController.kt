package hk.edu.polyu.comp3334.g41.artx.controller

import hk.edu.polyu.comp3334.g41.artx.dto.ArtWorkDto
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/api/v1/artworks")
class ArtworkController {
    /**
     * Upload an artwork. The uploader needs to be authenticated as the `author` of the uploaded artwork.
     */
    @PostMapping
    fun uploadArtwork(@RequestBody artWorkDto: ArtWorkDto): ArtWorkDto {
        TODO()
    }

    /**
     * List all artworks according to the query. If the query string is empty, return all artworks.
     */
    @GetMapping
    fun listArtworks(
        @RequestParam(name = "author", required = false) author: String?
    ): List<ArtWorkDto> {
        TODO()
    }

    /**
     * Retrieve a specific artwork by its
     */
    @GetMapping("/works/{id}")
    fun get(@PathVariable id: Long): ArtWorkDto {
        TODO()
    }
}
