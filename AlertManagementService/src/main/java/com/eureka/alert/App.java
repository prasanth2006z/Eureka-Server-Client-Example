package com.eureka.alert;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * 
 * @author Prasanth.P
 *
 */
@SpringBootApplication
@EnableDiscoveryClient
public class App {
  
  public static void main(String[] args) {
    SpringApplication.run(App.class, args);
  }
}
