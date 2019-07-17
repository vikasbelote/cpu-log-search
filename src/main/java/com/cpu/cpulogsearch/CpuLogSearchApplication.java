package com.cpu.cpulogsearch;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
@EnableJpaRepositories
public class CpuLogSearchApplication {

	public static void main(String[] args) {
		SpringApplication.run(CpuLogSearchApplication.class, args);
	}

}
