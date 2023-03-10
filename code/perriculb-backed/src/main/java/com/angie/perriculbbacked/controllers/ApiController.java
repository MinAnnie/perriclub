package com.angie.perriculbbacked.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Angie Matiz
 * */
@CrossOrigin("*")
@RestController
@RequestMapping("/")
public class ApiController {

    @GetMapping("example")
    public ResponseEntity<Object> index(){
        return ResponseEntity.ok("OK :)");
    }
}
