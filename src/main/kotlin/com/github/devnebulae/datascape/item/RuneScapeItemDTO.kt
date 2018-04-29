package com.github.devnebulae.datascape.item

class RSBuddyItem {
    lateinit var name: String

    lateinit var store: String
}

/**
 * Models a response of the RSBuddy API to a value object. The RSBuddy API
 * provides data in the following format:
 * `{"2": {"store": 5, "name": "Cannonball"}}`.
 */
typealias RuneScapeItemDTO = Map<String, RSBuddyItem>
