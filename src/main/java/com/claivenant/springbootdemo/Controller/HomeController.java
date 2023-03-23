package com.claivenant.springbootdemo.Controller;


import com.claivenant.springbootdemo.Model.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
public class HomeController {
    @RequestMapping("/")
    public String home(){
        return "Hello World!";
    }
    @GetMapping ("/user")
    public User user(){

        User user = new User();
        user.setId("1");
        user.setName("venant");
        user.setEmailId("venant@gmail.com");
        return user;

    }
    @GetMapping("/{id}/{id2}")
    public String pathVariable(@PathVariable String id,@PathVariable("id2") String name ){
        return "This is the pathVariable: " +id +" and  "+name;
    }
    @GetMapping("/requestParam")
    public String requestParam(@RequestParam  String name,
                               @RequestParam(name = "email",required = false,defaultValue = "") String emailId){
        return "Your name is : "+name + " and your email is : " +emailId;
    }
}
