package no.hvl.dat250.expass5;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    //@GetMapping("/")
    public String index() {
        return "Greetings from Spring Boot!";
    }

}