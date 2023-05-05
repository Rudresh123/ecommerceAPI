package com.example.ecommerce;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;

@SpringBootApplication
@OpenAPIDefinition(info = @Info(
					title = "E-Commerce API", 
					version = "1.0.0", 
					description = "This is simple E-commerce Backend Project",
					contact = @Contact(
				            name = "Rudresha M",
				            url = "https://xz4zzfzhczbzyvbrho1ejq.on.drv.tw/My%20Portfolio/Rudresh-portfolio/www.index.html.com",
				            email = "rudresha.m1997@gmail.com")))
public class ECommerceApplication {

	public static void main(String[] args) {
		SpringApplication.run(ECommerceApplication.class, args);
	}

}
