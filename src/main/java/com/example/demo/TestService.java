package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TestService {
    public String save;

    @Autowired // 의존성 주입을 해야 16번째줄에서 오류가 안남.
    TestRepository tr;

    public String test() {return "test";}

    public String save(String val) {
        return tr.save(val); // return tr.save(val) 에러나는 이유 : return 하면 값이 있어야 하는데 save가 void 였음 그래서 String으로 바꿈
    }

    public String search(Long idx) {
        return tr.search(idx);
    }
}
