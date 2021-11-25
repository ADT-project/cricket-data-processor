package com.ipl.cricketprocessor;

import java.nio.file.Path; 

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.cassandra.CqlSessionBuilderCustomizer;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

import com.ipl.cricketprocessor.connection.DataStaxAstraProperties;

/**
 * Main class with main() that runs the Spring Boot app
 */

@SpringBootApplication
@ComponentScan({"com.ipl.cricketprocessor","com.ipl.cricketprocessor.connection","com.ipl.cricketprocessor.deliveries","com.ipl.cricketprocessor.match","com.ipl.cricketprocessor.search"})
@EnableConfigurationProperties(DataStaxAstraProperties.class)
public class CricketProcessorApp {

	public static void main(String[] args) {
		SpringApplication.run(CricketProcessorApp.class, args);
	}

    /**
     * It is mandate to have  the Astra secure bundle to connect to the database
     */
	@Bean
    public CqlSessionBuilderCustomizer sessionBuilderCustomizer(DataStaxAstraProperties astraProperties) {
        Path bundle = astraProperties.getSecureConnectBundle().toPath();
        return builder -> builder.withCloudSecureConnectBundle(bundle);
    }
	

}
