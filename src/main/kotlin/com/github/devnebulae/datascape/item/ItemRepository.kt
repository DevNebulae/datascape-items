package com.github.devnebulae.datascape.item

import org.springframework.data.cassandra.repository.CassandraRepository
import org.springframework.data.rest.core.annotation.RepositoryRestResource
import java.util.UUID

@RepositoryRestResource(collectionResourceRel = "items", path = "/items")
interface ItemRepository : CassandraRepository<RuneScapeItemCassandraImpl, UUID>
