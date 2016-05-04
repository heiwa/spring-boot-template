package heiwa.spring.sample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@ComponentScan
@EnableAutoConfiguration
public class App {

    @RequestMapping("/")
    @ResponseBody
    public String home() {
        return "Hello, Spring Boot!";
    }

    public static void main(String[] args) {
        SpringApplication.run(App.class, args);
    }

}