package jp.xet.spike.springkotlin

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class SpringKotlinSpikeApplication

fun main(args: Array<String>) {
	runApplication<SpringKotlinSpikeApplication>(*args)
}
