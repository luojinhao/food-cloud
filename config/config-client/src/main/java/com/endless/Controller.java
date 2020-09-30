package com.endless;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @Value("${name}")
    private String name;

    @Value("${myWords}")
    private String words;

    @GetMapping("/name")
    public String getName() {
        return name;
    }

    @GetMapping("/words")
    public String getWords() {

        return words;
    }

    public static void main(String[] args) {
        for(int i =0;i<100;i++){
            if(i==50){
                System.out.println("hello");
            }
        }
    }

}
