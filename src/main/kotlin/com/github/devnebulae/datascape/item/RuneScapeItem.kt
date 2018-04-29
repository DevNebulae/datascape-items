package com.github.devnebulae.datascape.item

interface RuneScapeItem {
    /**
     * The in-game unique identifier of an item. The identifier is a 32-bit
     * signed integer. The item ID may not be used as a identifier in an entity,
     * due to it being subject to change.
     */
    val itemId: Long

    /**
     * The in-game name of an item. The characters contained in this name may be
     * any alphanumeric character including punctuation.
     */
    val name: String

    /**
     * The price of an item when it is bought in a store in gp.
     */
    val store: Long
}
