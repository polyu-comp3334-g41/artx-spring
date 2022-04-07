package hk.edu.polyu.comp3334.g41.artx.dto

import hk.edu.polyu.comp3334.g41.artx.entity.OrderStatus

data class OrderDto(
    var id: Long? = null,
    var makerArtworkId: Long? = null,
    var takerArtworkId: Long? = null,
    var status: OrderStatus? = null
)
