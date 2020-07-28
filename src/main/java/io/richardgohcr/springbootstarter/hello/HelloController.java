package io.richardgohcr.springbootstarter.hello;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @RequestMapping("/hello")
    public String sayHi(){
        //The @Request mapping maps only to the GET method by default
        return "Hi";
    }
}
