package com.example.complete;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import java.net.InetAddress;
import java.net.UnknownHostException;

@SpringBootApplication
@RestController
public class DemoApplication {

  public static void main(String[] args) {
    SpringApplication.run(DemoApplication.class, args);
  }

  @GetMapping("/")
  public String index() {
    return String.format("Welcome to K8S Workshop");
  }

  @GetMapping("/healthz")
  public String healthz() {
    return String.format("Ok");
  }

  @GetMapping("/hello")
  public String hello(@RequestParam(value = "name", defaultValue = "World") String name) {

    String address = "unknown";

    try {
      address = InetAddress.getLocalHost().getHostAddress();
    } catch(UnknownHostException ex) {
      /** noop */
    }
  
    return String.format("Hello %s from address:%s!", name, address);
  }
}