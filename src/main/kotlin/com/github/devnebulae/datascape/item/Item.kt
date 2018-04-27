package com.github.devnebulae.datascape.item

import org.springframework.data.cassandra.core.cql.Ordering
import org.springframework.data.cassandra.core.cql.PrimaryKeyType
import org.springframework.data.cassandra.core.mapping.Column
import org.springframework.data.cassandra.core.mapping.PrimaryKeyColumn
import org.springframework.data.cassandra.core.mapping.Table
import java.io.Serializable

@Table("item")
data class Item(
    @PrimaryKeyColumn(
        name = "item_id",
        ordering = Ordering.ASCENDING,
        ordinal = 2,
        type = PrimaryKeyType.PARTITIONED
    )
    val itemId: Long,

    @Column
    val name: String,

    @Column
    val store: Long
) : Serializable
