package com.localstack.sample.demo.config

import org.flywaydb.core.Flyway
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import javax.sql.DataSource

@Configuration
class FlywayConfig {
    @Bean
    fun flyway(dataSource: DataSource): Flyway {
        val flyway = Flyway.configure()
            .dataSource(dataSource)
            .load()
        try {
            flyway.migrate()
        } catch (e: Exception) {
            e.printStackTrace()
        }
        return flyway
    }
}
