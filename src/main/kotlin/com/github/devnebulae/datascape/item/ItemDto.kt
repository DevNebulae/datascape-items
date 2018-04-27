package com.github.devnebulae.datascape.item

import java.io.Serializable

/**
 * The Kotlin representation of a RuneScape item by the RSBuddy API. The API
 * provides the data as follows: `{"2": {"store": 5, "name": "Cannonball"}`.
 */
class ItemDto() : Serializable {
    /**
     * Represents the in-game name of an item. The characters contained in this
     * name may be any alphanumeric character including punctuation and spaces.
     */
    lateinit var name: String

    /**
     * The price of an item when it is bought in a store.
     */
    lateinit var store: String
}
