package com.zkzj.config;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.context.request.async.DeferredResult;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import static com.google.common.base.Predicates.or;
import static springfox.documentation.builders.PathSelectors.regex;


/**
 * Created by chenwt on 2017/6/22.
 */
@Configuration
@EnableSwagger2
public class MySwaggerConfig {
    @Value("${swagger.show}")
    private boolean swaggerShow;
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


    /**
     * 可以定义多个组，比如本类中定义把test和demo区分开了
     * （访问页面就可以看到效果了）
     *
     */
    @Bean
    public Docket testApi() {
        return new Docket(DocumentationType.SWAGGER_2)
                .enable(this.swaggerShow)
                .groupName("test")
                .genericModelSubstitutes(DeferredResult.class)
//                .genericModelSubstitutes(ResponseEntity.class)
                .useDefaultResponseMessages(false)
                .forCodeGeneration(true)
                .pathMapping("/")// base，最终调用接口后会和paths拼接在一起
                .select()
                .paths(or(regex("/test/.*")))//过滤的接口
                .build()
                .apiInfo(testApiInfo());
    }

    private ApiInfo testApiInfo() {
        return new ApiInfoBuilder()
                .title("中科珠江臭气监测API接口Test  ")
                .description("MyAPITest Description")
                .contact(new Contact("chenwt", "https://github.com/feiniaoying/gasmonitor", "feiniaoying@163.com"))
                .license("Gasmonitor 1.0")
                .licenseUrl("https://github.com/feiniaoying/gasmonitor")
                .version("1.0.0")
                .build();
    }


    @Bean
    public Docket demoApi() {
        return new Docket(DocumentationType.SWAGGER_2)
                .enable(this.swaggerShow)
                .groupName("demo")
                .genericModelSubstitutes(DeferredResult.class)
//              .genericModelSubstitutes(ResponseEntity.class)
                .useDefaultResponseMessages(false)
                .forCodeGeneration(false)
                .pathMapping("/")
                .select()
                .paths(or(regex("/demo/.*")))//过滤的接口
                .build()
                .apiInfo(demoApiInfo());
    }

    private ApiInfo demoApiInfo() {
        ApiInfo apiInfo = new ApiInfo("IAP API",//大标题
                "Internal Application Platform.",//小标题
                "0.1",//版本
                "NO terms of service",
                "603005981@qq.com",//作者
                "The Apache License, Version 2.0",//链接显示文字
                "http://www.apache.org/licenses/LICENSE-2.0.html"//网站链接
        );

        return apiInfo;
    }


}