package com.busanit.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    String str1 = "안녕하세요???";
    String str2 = "fine thank and you?";

    @GetMapping("/test1")
    public String test1(){
        return str1;
    }

    @GetMapping("/test2")
    public String test2() {
        int a = 1;

//      sout + ctrl + space : System.out.println();
//      System.out.println("str2 = " + str2);
        return str2 + a;

    }

//    @GetMapping("/test3")
//    public UserDto{
//        UserDto userDto = new UserDto();
//        UserDto.setAge(20);
//        UserDto.setName("hoon");
//
//        return userDto;
//
//    }

}