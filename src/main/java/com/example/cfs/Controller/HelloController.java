package com.example.cfs.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class HelloController {

//    @GetMapping("/students")
//    public String SayHello(){
//        return "Hello Spring-Boot";
//    }
//

    @GetMapping("/students")
    public List<String> getStudents(){
       return List.of("Rahul","Priya","Shreya");
    }

}
