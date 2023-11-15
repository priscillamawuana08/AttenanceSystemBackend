package com.example.attendance;

import io.swagger.v3.oas.models.Components;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import org.springframework.context.annotation.Bean;

public class OpenAPIConfig {
  @Bean
  public OpenAPI customOpenAPI() {
    Info springBootInfo = new Info()
        .title("Hostel Services API")
        .version("1.0.0");
    return new OpenAPI()
        .components(new Components())
        .info(springBootInfo);
  }
}
