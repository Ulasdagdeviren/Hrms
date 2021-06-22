package com.example.Hrms;

import com.cloudinary.utils.ObjectUtils;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;
import com.cloudinary.*;

import java.io.File;
import java.io.IOException;
import java.util.Map;

@SpringBootApplication
@EnableSwagger2
public class HrmsApplication {

	public static void main(String[] args) throws IOException {
		SpringApplication.run(HrmsApplication.class, args);
		Cloudinary cloudinary = new Cloudinary(ObjectUtils.asMap(
				"cloud_name", "dfkyiupon",
				"api_key", "223841498643487",
				"api_secret", "-I1kC0vSyW8vzOION6G9WQMVPCo"));
		File file = new File("my_image.jpg");
		Map uploadResult = cloudinary.uploader().upload(file, ObjectUtils.emptyMap());
	}

	@Bean
	public Docket api() {//bizim bütün apilerimizi tarıyor test ediyor postman gibi oluyor
		return new Docket(DocumentationType.SWAGGER_2)
				.select()
				.apis(RequestHandlerSelectors.any()) // kodlama ionortwindi gez requstleri
				.build();
	}
}
