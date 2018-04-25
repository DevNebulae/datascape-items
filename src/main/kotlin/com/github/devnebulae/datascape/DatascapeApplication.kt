package com.github.devnebulae.datascape

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class DatascapeApplication

fun main(args: Array<String>) {
    runApplication<DatascapeApplication>(*args)
}
