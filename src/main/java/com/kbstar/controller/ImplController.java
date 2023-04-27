package com.kbstar.controller;

import org.json.simple.JSONArray;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Random;

@RestController
public class ImplController {
    @RequestMapping("/chart")
    public Object chart(){
        JSONArray ja = new JSONArray();
        for(int i=1;i<=60;i++){
            JSONArray ja1 = new JSONArray();
            for(int a=1;a<=3;a++){
                Random r = new Random();
                int num = r.nextInt(9)+1;
                ja1.add(num);
            }
            ja.add(ja1);
        }
        return ja;
    }
}
