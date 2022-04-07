package hk.edu.polyu.comp3334.g41.artx.entity

import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.EnumType
import javax.persistence.Enumerated
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id
import javax.persistence.JoinColumn
import javax.persistence.ManyToOne
import javax.persistence.OneToOne
import javax.persistence.Table

@Entity
@Table(name = "swap_order")
data class SwapOrder(
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    var id: Long? = null,

    @OneToOne
    @JoinColumn(name = "maker_id", referencedColumnName = "id")
    var maker: Artwork? = null,

    @ManyToOne
    @JoinColumn(name = "taker_id", referencedColumnName = "id")
    var taker: Artwork? = null,

    @Enumerated(EnumType.STRING)
    var status: OrderStatus? = null
)

enum class OrderStatus {
    PROPOSED, CLOSED, CANCELLED
}
