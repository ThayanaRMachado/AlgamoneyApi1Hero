package com.example.algamoneyapi1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import com.example.algamoneyapi1.config.property.AlgamoneyApi1Property;

@SpringBootApplication
@EnableConfigurationProperties(AlgamoneyApi1Property.class)
public class AlgamoneyApi1Application {

	public static void main(String[] args) {
		SpringApplication.run(AlgamoneyApi1Application.class, args);
	}

	@Bean
	 public WebMvcConfigurer corsConfigurer() {
        return new WebMvcConfigurer() {
            @Override
            public void addCorsMappings(CorsRegistry registry) {
                registry.addMapping("/*").allowedOrigins("http://localhost:8000");
            }
		};
	}
}
