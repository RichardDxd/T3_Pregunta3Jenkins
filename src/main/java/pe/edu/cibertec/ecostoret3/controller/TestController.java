package pe.edu.cibertec.ecostoret3.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/test")
public class TestController {
    public String testJenkins(){
        return "Hola Developer";
    }
}
