package br.com.webestcoding.secao_06.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;

@Configuration
public class OpenApiConfig {

	@Bean
	public OpenAPI customOpenAPI() {
		return new OpenAPI()
			.info(
				new Info()
					.title("RESTFul API com Java 21 e Spring Boot 3")
					.version("v1")
					.description("Minha descrição temporária")
					.termsOfService("https://copilot.microsoft.com/")
					.license(
						new License()
						.name("Apache 2.0")
						.url("https://copilot.microsoft.com/")
					)
			);
	}
}
