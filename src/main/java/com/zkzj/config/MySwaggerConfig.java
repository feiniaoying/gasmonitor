package com.zkzj.config;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;


/**
 * Created by chenwt on 2017/6/22.
 */
@Configuration
@EnableSwagger2
public class MySwaggerConfig {

  /*  @Bean
    public Docket restApi() {
        return new Docket(DocumentationType.SWAGGER_2)
                .select()
                .paths(Predicates.and(ant("*//**"), Predicates.not(ant("/error")), Predicates.not(ant("/management*//**")), Predicates.not(ant("/management*"))))
                .build();
    }

    private ApiInfo apiInfo() {
        return new ApiInfoBuilder()
                .title("API Test  ")
                .description("MyAPITest Description")
                .contact(new Contact("chenwt", "https://github.com/feiniaoying/gasmonitor", "feiniaoying@163.com"))
                .license("Gasmonitor 1.0")
                .licenseUrl("https://github.com/feiniaoying/gasmonitor")
                .version("1.0.0")
                .build();
    }*/


    @Bean
    public Docket createRestApi() {
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(apiInfo())
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.zkzj.controller"))
                .paths(PathSelectors.any())
                .build();
    }

    private ApiInfo apiInfo() {
        return new ApiInfoBuilder()
                .title("中科珠江臭气监测API接口Test  ")
                .description("MyAPITest Description")
                .contact(new Contact("chenwt", "https://github.com/feiniaoying/gasmonitor", "feiniaoying@163.com"))
                .license("Gasmonitor 1.0")
                .licenseUrl("https://github.com/feiniaoying/gasmonitor")
                .version("1.0.0")
                .build();
    }




}