package com.codedecode.foodcatalogue.controller;


import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/test")
@CrossOrigin
public class TestController {

    @GetMapping()
    public ResponseEntity<String> test(){

        return new ResponseEntity<>("with food-catalogue-MS", HttpStatus.OK);


    }
}
