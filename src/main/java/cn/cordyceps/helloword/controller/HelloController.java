package cn.cordyceps.helloword.controller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController //@ResponseBody+@Controller
@RequestMapping("/hello") //路由映射
public class HelloController {

    public HelloController()
    {
        System.out.println("HelloController");
    }

    @RequestMapping("/world")
    public  String hello()
    {
        return "hello world";
    }
}
