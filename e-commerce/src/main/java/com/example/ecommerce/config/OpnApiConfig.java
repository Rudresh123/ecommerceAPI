package com.example.ecommerce.config;

import org.springframework.context.annotation.Configuration;

import io.swagger.v3.oas.models.Components;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;

@Configuration
public class OpnApiConfig {
	public OpenAPI customOpenAPI() {
        return new OpenAPI()
                .components(new Components())
                .info(new Info()
                .title("E-Commerce API")
			   .version("1.0.0")
			   .description("This is simple E-commerce Backend Project"));

	}
}
