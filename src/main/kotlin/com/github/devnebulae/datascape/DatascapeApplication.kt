package com.github.devnebulae.datascape

import com.fasterxml.jackson.databind.ObjectMapper
import com.fasterxml.jackson.module.kotlin.readValue
import com.github.devnebulae.datascape.item.Item
import com.github.devnebulae.datascape.item.ItemDto
import com.github.devnebulae.datascape.item.ItemRepository
import org.springframework.boot.CommandLineRunner
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.context.annotation.Bean
import org.springframework.core.io.ClassPathResource

@SpringBootApplication
class DatascapeApplication {
    @Bean
    fun runner(repository: ItemRepository) = CommandLineRunner {
        val mapper = ObjectMapper()
        val items = mapper
            .readValue<Map<String, ItemDto>>(ClassPathResource("items.json").file)
            .map { Item(it.key.toLong(), it.value.name, it.value.store.toLong()) }


        repository.saveAll(items)
    }
}

fun main(args: Array<String>) {
    runApplication<DatascapeApplication>(*args)
}
