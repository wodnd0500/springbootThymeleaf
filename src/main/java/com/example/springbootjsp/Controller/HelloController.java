package com.example.springbootjsp.Controller;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/controller/**")
public class HelloController {

    @GetMapping("/index")
    public String Hello(){
        return "/boards/index";
    }

/*
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller // 어노테이션을 입력하면 알아서 상단에 import 가 된다!
public class HelloController {

    @GetMapping("/")
    public String Hello() {
        return "index";
    }
}
*/
}

