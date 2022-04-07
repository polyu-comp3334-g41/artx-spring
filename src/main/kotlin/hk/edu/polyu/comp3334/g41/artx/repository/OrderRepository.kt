package hk.edu.polyu.comp3334.g41.artx.repository

import hk.edu.polyu.comp3334.g41.artx.entity.SwapOrder
import org.springframework.data.repository.CrudRepository

interface OrderRepository: CrudRepository<SwapOrder, Long>
