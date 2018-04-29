package com.github.devnebulae.datascape.item

import org.springframework.data.annotation.Id
import org.springframework.data.cassandra.core.cql.Ordering
import org.springframework.data.cassandra.core.cql.PrimaryKeyType
import org.springframework.data.cassandra.core.mapping.PrimaryKeyColumn
import org.springframework.data.cassandra.core.mapping.Table
import java.io.Serializable
import java.util.UUID

@Table("item")
data class RuneScapeItemCassandraImpl(
    override val itemId: Long,

    override val name: String,

    override val store: Long
) : RuneScapeItem, Serializable {
    @Id
    @PrimaryKeyColumn(
        name = "id",
        ordering = Ordering.ASCENDING,
        ordinal = 1,
        type = PrimaryKeyType.PARTITIONED
    )
    val id = UUID.randomUUID()
}
