package br.com.alura.comex.config;

import io.swagger.v3.oas.models.Components;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;
import io.swagger.v3.oas.models.media.Content;
import io.swagger.v3.oas.models.media.Schema;
import io.swagger.v3.oas.models.responses.ApiResponse;
import io.swagger.v3.oas.models.responses.ApiResponses;
import io.swagger.v3.oas.models.security.SecurityRequirement;
import io.swagger.v3.oas.models.security.SecurityScheme;
import org.springdoc.core.customizers.OpenApiCustomiser;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.http.MediaType;

import java.util.Collections;

@Configuration
@PropertySource("classpath:swagger.properties")
public class SwaggerConfig {

    @Bean
    public OpenAPI comexOpenAPI(@Value("${comex.api.title}") String apiTitle,
                                   @Value("${comex.api.description}") String apiDescription) {
        String securitySchemeName = "Api Comex";
        return new OpenAPI()
                .info(new Info().title(apiTitle).license(new License().name("Proprietary")).description(apiDescription))
                .components(new Components().addSecuritySchemes(securitySchemeName, new SecurityScheme()
                        .name(securitySchemeName)
                        .type(SecurityScheme.Type.HTTP)
                        .bearerFormat("JWT")
                        .scheme("bearer")))
                .security(Collections.singletonList(new SecurityRequirement().addList(securitySchemeName)));
    }


}
