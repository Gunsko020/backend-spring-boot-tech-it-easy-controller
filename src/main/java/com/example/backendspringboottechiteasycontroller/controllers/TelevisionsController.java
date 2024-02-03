package com.example.backendspringboottechiteasycontroller.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TelevisionsController {
    @GetMapping("/televisions")
    public ResponseEntity<String> getTelevison(){
        return ResponseEntity.ok("Televisions");
//        return new ResponseEntity<>("Televisions", HttpStatus.OK);
    }
}
