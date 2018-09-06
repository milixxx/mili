package com.example.demo.configration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.RestController;

import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class Swagger2Configration {
	
	@Bean
	public Docket createRestApi(){
		return new Docket(DocumentationType.SWAGGER_2)
		.apiInfo(apiInfo())
		.select()
		.apis(RequestHandlerSelectors.withClassAnnotation(RestController.class))
		.paths(PathSelectors.any())
		.build();
	}
	
	private ApiInfo apiInfo(){
		return new ApiInfoBuilder()
		.title("测试dubbo和swagger")
		.description("mybatis连接数据库接口")
		.contact("crx")
		.version("1.0.0")
		.build();
	}

}
