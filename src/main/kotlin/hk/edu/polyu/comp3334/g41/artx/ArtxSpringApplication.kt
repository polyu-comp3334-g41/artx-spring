package hk.edu.polyu.comp3334.g41.artx

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import springfox.documentation.swagger2.annotations.EnableSwagger2

@EnableSwagger2
@SpringBootApplication
class ArtxSpringApplication

fun main(args: Array<String>) {
    runApplication<ArtxSpringApplication>(*args)
}
