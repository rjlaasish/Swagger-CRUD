package com.laughingsquad.employeemanagementsystem.config;

import org.springframework.context.annotation.Bean;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * @author Aasish 2021-06-24
 */
@Configuration
@EnableSwagger2
public class swaggerConfig {
    @Bean
    public Docket api() {
        return new Docket(DocumentationType.SWAGGER_2)
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.laughingsquad.employeemanagementsystem"))
                .paths(PathSelectors.regex("/api.*"))
                .build();
    }

}
