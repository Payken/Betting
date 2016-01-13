package com.ai;

import org.apache.tomcat.jdbc.pool.DataSource;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceBuilder;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.orm.jpa.EntityScan;
import org.springframework.context.annotation.*;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@SpringBootApplication
@EnableAutoConfiguration
@ComponentScan
@EnableJpaRepositories("com.ai.repositories")
@EntityScan("com.ai.domain")
@EnableTransactionManagement
@Import({
})


public class AiProjectApplication {

    public static void main(String[] args) {

        SpringApplication.run(AiProjectApplication.class, args);

    }
}
