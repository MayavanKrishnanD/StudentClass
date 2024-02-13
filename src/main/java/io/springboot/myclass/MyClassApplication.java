package io.springboot.myclass;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import org.springframework.core.env.Environment;


@SpringBootApplication

@OpenAPIDefinition(info = @Info(title = "MyClassApplication", version = "1.0", description = "REST APIs"))
public class MyClassApplication {
    private static final Logger LOGGER = LoggerFactory.getLogger(SpringApplication.class);

    @Autowired
    private Environment environment;
    @Value("${test.property}")
    private String testProperty;

    public static void main(String[] args) {
        SpringApplication.run(MyClassApplication.class, args);
    }

    // Log the value of test.property on application startup
    @EventListener(ApplicationReadyEvent.class)
    public void logTestProperty() {
        LOGGER.info("Value of test.property: {}", testProperty);
    }

    }





