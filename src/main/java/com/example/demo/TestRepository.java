package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.Map;

@Repository
public class TestRepository {

    private Map<Long , String> db = new HashMap<Long, String>();
    Long id = 1L;

    public String save(String val){
        db.put(id++,val); // 그냥 id로 하면 덮어쓰기 되어서 id++을 해야 함
        return val; // 원래 void로 해서 return 안 받아도 되는데 홈페이지에 만들어지는 거 보여주려고 String으로 해서 return 해준 거임
    }

    public String test(){
        return db.get(1L);
    }

//    public String search(Long idx) {
//        db.put(id++, idx);
//        return idx;
//    }
}
