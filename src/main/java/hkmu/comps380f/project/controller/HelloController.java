package hkmu.comps380f.project.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/hello")
public class HelloController {
    @GetMapping(value = {"", "/list"})
    public String hello() {
        return "hello";
    }
}