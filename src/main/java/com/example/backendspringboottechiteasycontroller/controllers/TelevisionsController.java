package com.example.backendspringboottechiteasycontroller.controllers;


import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RequestMapping("/televisions")
@RestController
public class TelevisionsController {
    @GetMapping()
    public ResponseEntity<String> getTelevisions(){
        return ResponseEntity.ok("televisions");
//        return new ResponseEntity<>("Televisions", HttpStatus.OK);
    }
    @GetMapping("/{id}")
    public ResponseEntity<String> getTelevision(@PathVariable Integer id){
        return ResponseEntity.ok("televisionId : " + id);
    }

    @PostMapping()
    public ResponseEntity <String> addTelevision(@RequestBody String television ){
        return ResponseEntity.created(null).body("television");
    }

    @DeleteMapping("/{id}")
    public ResponseEntity <String> deleteTelevision (@PathVariable Integer id){

        return ResponseEntity.noContent().build();
    }

    @PutMapping("/{id}")
    public ResponseEntity <String> updateTelevision (@PathVariable Integer id, @RequestBody String television){
        return ResponseEntity.noContent().build();
    }




}
