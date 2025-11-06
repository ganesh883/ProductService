package org.example.productservice.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


// http://localhost:8080/sample/hello

@RestController
@RequestMapping("/sample")
public class SampleController {

    @GetMapping("/hello/{name}/{numberOfTimes}")
    public String sayHello(@PathVariable("name") String name, @PathVariable("numberOfTimes") int numberOfTimes) {

        String response = "";
        for (int i = 0; i < numberOfTimes; i++) {
            String s = "Hello" + name + "<br>";
            response += s;
        }

        return response;
    }

    public void sayBye(){

    }
}
