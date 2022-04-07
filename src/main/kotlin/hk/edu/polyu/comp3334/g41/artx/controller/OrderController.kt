package hk.edu.polyu.comp3334.g41.artx.controller

import hk.edu.polyu.comp3334.g41.artx.dto.OrderDto
import hk.edu.polyu.comp3334.g41.artx.entity.OrderStatus
import org.springframework.web.bind.annotation.DeleteMapping
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PatchMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping(("/api/v1/orders"))
class OrderController {
    /**
     * Make a swap order. The caller should be authenticated as the owner of the maker token.
     */
    @PostMapping
    fun makeOrder(@RequestBody orderDto: OrderDto): OrderDto {
        TODO()
    }

    /**
     * List orders according to the query. If no query, return all orders.
     */
    @GetMapping
    fun listOrders(
        @RequestParam(name = "maker", required = false) maker: String?,
        @RequestParam(name = "taker", required = false) taker: String?,
        @RequestParam(name = "status", required = false) status: OrderStatus?
    ) : List<OrderDto> {
        TODO()
    }

    @GetMapping("/{id}")
    fun getOrderDetail(@PathVariable id: Long): OrderDto {
        TODO()
    }

    /**
     * Close an order. The order state changes from `PROPOSED` to `CLOSED`. The caller should be authenticated as owner
     * of the taker token.
     */
    @PatchMapping("/{id}")
    fun closeOrder(@PathVariable id: Long) {

    }

    /**
     * Cancel an order. The order state changes from `PROPOSED` to `CANCELLED`. The caller is either the taker or the maker.
     * Note that when a taker cancels an order, the order is still listed on the smart contract. The call is reentrant.
     */
    @DeleteMapping("/{id}")
    fun cancelOrder(@PathVariable id: Long) {

    }
}