package com.smart;

import com.smart.struct.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class HelloController {
    @Autowired
    private Student student;

    @RequestMapping("/hello")
    public String hello(){
        return "Hello " + student.getName();
    }


    @RequestMapping("/say")
    public String say(){
        return "Say Hello!";
    }

    @RequestMapping("/bye")
    public String bye(){
        return "Say Bye!";
    }


    @RequestMapping("/nike")
    public String nike(){
        return "Just Do IT!";
    }
}
