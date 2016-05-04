package heiwa.spring.sample.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class SampleController {

    @RequestMapping("hello")
    public String hello(Model model) {
        model.addAttribute("hello", "Hello, spring");
        return "hello";
    }
}
