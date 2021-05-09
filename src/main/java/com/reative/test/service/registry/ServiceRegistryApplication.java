package com.reative.test.service.registry;

import com.reative.test.service.registry.util.ProfileUtils;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class ServiceRegistryApplication {

  public static void main(String[] args) {
    SpringApplication springApplication = new SpringApplication(ServiceRegistryApplication.class);
    ProfileUtils.setAsDev(springApplication);
    springApplication.run(args);
  }
}
