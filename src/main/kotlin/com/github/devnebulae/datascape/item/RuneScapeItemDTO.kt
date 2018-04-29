package com.github.devnebulae.datascape.item

import com.github.devnebulae.datascape.dto.DataTransferObject
import java.io.Serializable

/**
 * The Kotlin representation of a RuneScape item by the RSBuddy API. The API
 * provides the data in the following format:
 * `{"2": {"store": 5, "name": "Cannonball"}`. The DTO only covers the value
 * of the Map<String, ItemDto>.
 */

class RSBuddyItem {
    lateinit var name: String

    lateinit var store: String
}

typealias RuneScapeItemDTO = Map<String, RSBuddyItem>

