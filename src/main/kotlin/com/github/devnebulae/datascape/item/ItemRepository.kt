package com.github.devnebulae.datascape.item

import org.springframework.data.repository.CrudRepository

interface ItemRepository : CrudRepository<Item, Long>
