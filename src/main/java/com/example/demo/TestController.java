package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

// URL : 기본 --> localhost
@RestController
public class TestController {
    // localhost/test

    @Autowired // TestService ts = new TestService();
    TestService ts;

    // Autowired 대신
    // public TestController(TestService ts){
    // this. ts = ts;}

    @RequestMapping(value = "/test", method = RequestMethod.GET) // localhost/test라고 요청이 오면 바로 밑 메소드 실행
    public String test() {return ts.test();}

    @RequestMapping("/search")
    public String search(@RequestParam("id") Long idx) {// 레파지토리에 id가 long으로 되엉 ㅣㅆ음 ("id" / id 실무에서는 통합 / 여기서는 구별하라고 다로 해주심
        return ts.search(idx);
    }

    @RequestMapping("/apple")
    public String apple(){return "apple";}

    @RequestMapping("/save")
    public String save(@RequestParam("value") String val){ //RequestParam: save? 뒤에 오는 값들 중에 value라는 것을 담아서 다음 값에 줄게
        return ts.save(val);
        //localhost:8080/save?value=_______ -> value 값이 8080 페이지에 뿌려져야 함.
        //없는 메소드 먼저 만들고 -> 스프링으로 메소드 만들어줌 (Alt Enter)

    }
}
