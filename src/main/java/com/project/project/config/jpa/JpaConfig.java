package org.project.project.config.jpa;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@Configuration
@EntityScan(basePackages = "org.project.project.db")
@EnableJpaRepositories(basePackages = "org.project.project.db")
public class JpaConfig {
}
