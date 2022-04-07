package hk.edu.polyu.comp3334.g41.artx.repository

import hk.edu.polyu.comp3334.g41.artx.entity.Artwork
import org.springframework.data.repository.CrudRepository

interface ArtworkRepository: CrudRepository<Artwork, Long>
