package com.meuscursos.spring_web.docs;


import io.swagger.v3.oas.models.ExternalDocumentation;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;
import org.springdoc.core.models.GroupedOpenApi;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SwaggerConfig {

    @Bean
    public OpenAPI springShopOpenAPI() {
        return new OpenAPI()
                .info(new Info().title("Meus Cursos API - Swagger com Springdoc & Java 17")
                        .description("Spring Web sample application")
                        .version("v0.0.1")
                        .license(new License().name("Apache 2.0").url("http://springdoc.org")))
                        .externalDocs(new ExternalDocumentation()
                        .description("Spring Web - Meu Github")
                        .url("https://github.com/WFrauches89"));
    }
    @Bean
    public GroupedOpenApi detalheApi() {
        return GroupedOpenApi.builder()
                .group("springweb-myapplications")
                .pathsToMatch("/users/**")
                .build();
    }

}

// NO caso de utilizar o spring fox...

// <!-- SWAGGER DOCUMENTACAO -->
//<dependency>
//	<groupId>io.springfox</groupId>
//	<artifactId>springfox-swagger2</artifactId>
//	<version>2.9.2</version>
//</dependency>
//<dependency>
//	<groupId>io.springfox</groupId>
//	<artifactId>springfox-swagger-ui</artifactId>
//	<version>2.9.2</version>
//</dependency>

//
//@Configuration
//@EnableSwagger2
//public class SwaggerConfig {
//
//    private Contact contato() {
//        return new Contact(
//                "Seu nome",
//                "http://www.seusite.com.br",
//                "voce@seusite.com.br");
//    }
//
//    private ApiInfoBuilder informacoesApi() {
//
//        ApiInfoBuilder apiInfoBuilder = new ApiInfoBuilder();
//
//        apiInfoBuilder.title("Title - Rest API");
//        apiInfoBuilder.description("API exemplo de uso de Springboot REST API");
//        apiInfoBuilder.version("1.0");
//        apiInfoBuilder.termsOfServiceUrl("Termo de uso: Open Source");
//        apiInfoBuilder.license("Licença - Sua Empresa");
//        apiInfoBuilder.licenseUrl("http://www.seusite.com.br");
//        apiInfoBuilder.contact(this.contato());
//
//        return apiInfoBuilder;
//
//    }
//
//    @Bean
//    public Docket detalheApi() {
//        Docket docket = new Docket(DocumentationType.SWAGGER_2);
//
//        docket
//                .select()
//                .apis(RequestHandlerSelectors.basePackage("pacote.comseus.controllers"))
//                .paths(PathSelectors.any())
//                .build()
//                .apiInfo(this.informacoesApi().build())
//                .consumes(new HashSet<String>(Arrays.asList("application/json")))
//                .produces(new HashSet<String>(Arrays.asList("application/json")));
//
//        return docket;
//    }
//
//}