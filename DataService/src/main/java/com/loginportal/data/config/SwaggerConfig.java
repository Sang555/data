package com.loginportal.data.config;

import java.util.ArrayList;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;

import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.service.VendorExtension;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
@PropertySources({
    @PropertySource("classpath:user-controller.properties"),
    @PropertySource("classpath:activeuser-controller.properties"),
    @PropertySource("classpath:deactivate-controller.properties"),
    @PropertySource("classpath:loginattempts-controller.properties"),
    @PropertySource("classpath:review-controller.properties"),
    @PropertySource("classpath:securityquestion-controller.properties"),
    @PropertySource("classpath:token-controller.properties"),
    @PropertySource("classpath:passwordhistory-controller.properties")
})
public class SwaggerConfig {
	@Bean
	public Docket customImplementation() {
		return new Docket(DocumentationType.SWAGGER_2).apiInfo(getApiInfo()).select()
				.apis(RequestHandlerSelectors.basePackage("com.loginportal.data")).paths(PathSelectors.any()).build();
	}

	private ApiInfo getApiInfo() {
		return new ApiInfo("REST API Documentation", "Documentation for all API endpoints in DataService of Login Portal", "1.0", "urn:tos",
				new Contact("Vasanth Kumar E", "", "vasanthkumar.e@publicissapient.com"), "Apache 2.0", "http://www.apache.org/licenses/LICENSE-2.0",
				new ArrayList<VendorExtension>());
	}
}
