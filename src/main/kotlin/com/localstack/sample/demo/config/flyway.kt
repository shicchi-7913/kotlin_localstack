package com.localstack.sample.demo.config

import org.flywaydb.core.Flyway
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import javax.sql.DataSource
import org.slf4j.LoggerFactory

@Configuration
class FlywayConfig {
    private val logger = LoggerFactory.getLogger(FlywayConfig::class.java)

    @Bean
    fun flyway(dataSource: DataSource): Flyway {
        val flyway = Flyway.configure()
            .dataSource(dataSource)r
            .load()
        try {
            flyway.migrate()
        } catch (e: Exception) {
            logger.error("Flyway migration failed", e)
        }
        return flyway
    }
}
