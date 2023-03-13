package com.jojoldu.book.springboot.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    /**
     *    @RestController
     *    컨트롤러를 json을 반환하는 컨트롤러로 만들어줌
     *    예전의 @ReponseBody를 각메소드마다 선언했던 것을 한번에 사용할수 있도록 만들어줌
     */
    @GetMapping("/hello")
    public String hello(){
        return "hello";
    }
}
