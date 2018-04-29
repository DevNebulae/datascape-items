package com.github.devnebulae.datascape

import com.fasterxml.jackson.databind.ObjectMapper
import com.fasterxml.jackson.module.kotlin.readValue
import com.github.devnebulae.datascape.item.RuneScapeItemCassandraImpl
import com.github.devnebulae.datascape.item.RuneScapeItemRepository
import com.github.devnebulae.datascape.item.RuneScapeItemDTO
import org.springframework.boot.CommandLineRunner
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.context.annotation.Bean
import org.springframework.core.io.ClassPathResource

@SpringBootApplication
class DatascapeApplication {
    @Bean
    fun runner(repository: RuneScapeItemRepository) = CommandLineRunner {
        val mapper = ObjectMapper()
        val items = mapper
            .readValue<RuneScapeItemDTO>(ClassPathResource("items.json").file)
            .map { RuneScapeItemCassandraImpl(it.key.toLong(), it.value.name, it.value.store.toLong()) }

        repository.saveAll(items)
    }
}

fun main(args: Array<String>) {
    runApplication<DatascapeApplication>(*args)
}
