package com.sohyeon.board.springboot.web;

import com.sohyeon.board.springboot.web.dto.HelloResponseDto;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @GetMapping("/hello")
    public String hello(){
        return "hello";
    }

    @GetMapping("/hello/dto")
    public HelloResponseDto helloDto(@RequestParam("name") String name, @RequestParam("amount") int amount){
      //외부에서 넘겨준 name, amount 파라미터를 가져옴
        return new HelloResponseDto(name,amount);
    }
}

