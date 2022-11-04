package br.com.alura.comex.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("classpath:swagger.properties")
public class SwaggerConfig {
}
