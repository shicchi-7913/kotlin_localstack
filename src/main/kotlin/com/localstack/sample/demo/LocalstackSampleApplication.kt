package com.localstack.sample.demo

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class LocalstackSampleApplication

fun main(args: Array<String>) {
	runApplication<LocalstackSampleApplication>(*args)
}
