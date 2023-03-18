package io.github.ddongeee.searchblog.interfaces;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

//todo: deprecated
@RestController
public class HelloController {
    @GetMapping("/hello")
    public String hello() {
        return "hello world!";
    }
}
