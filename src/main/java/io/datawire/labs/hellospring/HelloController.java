package io.datawire.labs.hellospring;

import java.util.concurrent.TimeUnit;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    private static long start = System.currentTimeMillis();

    @GetMapping("/")
    public String sayHello() {
        return "Greetings from Spring Boot!";
    }

}
