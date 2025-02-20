package com.escom.Tarea1;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class Tarea1Application {
    public static void main(String[] args) {
      SpringApplication.run(Tarea1Application.class, args);
    }
    @GetMapping("/")
    public String hello(@RequestParam(value = "name", defaultValue = "Spring") String name) {
      return String.format("Hello %s!", name);
    }
}