package dalia.daniele.micro.demo.eurekaclient2.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/main2")
public class DemoController2 {
    @GetMapping("/demo")
    public String demo(){
        return "demo2";
    }
}
