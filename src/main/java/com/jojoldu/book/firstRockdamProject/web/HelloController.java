package com.jojoldu.book.firstRockdamProject.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController// 1. 컨트롤러를 JSON을 반환 하는 컨트롤러로 만들어 줍니다.
              // 2. 예전에는 @ResponseBody를 각 메소드마다 선언했던 것을 한번에 사용할 수 있게 해줍니다.

public class HelloController {

    @GetMapping("/hello") // HTTP Method인 Get의 요청을 받ㅇ르 수 있는 API를 만들어 줍니다.
                // 예전에는 @RequestMapping(method =RequsetMethod.GET)으로 사용되었습니다.이제 이 프로젝트는 /hello 요청이 오면 문자열 hello를 반환하는 기능을 가지게 되었습니다.

    public String hello(){

        return "hello";
    }
}
