package com.hemanth.productdemo;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/product")
public class Controller {

    @GetMapping("/message")
    public ResponseEntity<String> displayMessage(){
        return ResponseEntity.ok("Hello Spring world");
    }
}