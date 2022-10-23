package com.example.sbootdemo;

import java.util.HashMap;
import java.util.Map;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/demo")
public class HelloController {
    @GetMapping
    public ResponseEntity getDemo() {

        Map<String, String> map = new HashMap<>();
        map.put("hello", "dunia");

        return ResponseEntity.ok(map);
    }
}
