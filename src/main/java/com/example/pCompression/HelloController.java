package com.example.pCompression;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/hello")
    public String hello() {
        return "Hello, world!";
    }

    @GetMapping("/large")
    public ResponseEntity<ResponseDto> largeResponse() {
        // Generate a large response for testing compression
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 100000; i++) {
            sb.append("This is a large response. ");
        }
        ResponseDto responseDto = new ResponseDto(1,sb.toString());
        return ResponseEntity.ok(responseDto);
    }
}