package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

// URL : 기본 --> localhost
@RestController
public class TestController {

    @Autowired
    TestService ts;

    @RequestMapping("/save")
    public String save(@RequestParam("value") String val) {
        // localhost:8080/save?value=_______
        return ts.save(val);
    }

    @RequestMapping("/search")
    public String search(@RequestParam("id") Long valId) {
        // localhost:8080/search?id=_______
        return ts.search(valId);
    }
}
