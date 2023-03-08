package com.example.vpctest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "*")
@RestController
public class VpcController {

    @GetMapping
    public ResponseEntity vpcTest() {
        return new ResponseEntity("hi", HttpStatus.OK);
    }
}
