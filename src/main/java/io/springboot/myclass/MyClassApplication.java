package io.springboot.myclass;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication

@OpenAPIDefinition(info = @Info(title = "MyClassApplication", version = "1.0", description = "REST APIs"))
public class MyClassApplication {


    public static void main(String[] args) {
        SpringApplication.run(MyClassApplication.class, args);
    }

    }





