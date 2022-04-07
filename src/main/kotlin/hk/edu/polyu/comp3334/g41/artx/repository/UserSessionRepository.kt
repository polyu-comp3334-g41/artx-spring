package hk.edu.polyu.comp3334.g41.artx.repository

import hk.edu.polyu.comp3334.g41.artx.entity.UserSession
import org.springframework.data.repository.CrudRepository

interface UserSessionRepository: CrudRepository<UserSession, String>
