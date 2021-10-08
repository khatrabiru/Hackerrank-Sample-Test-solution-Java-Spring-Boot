package com.hackerrank.sample.controller;
import com.hackerrank.sample.dto.StringResponse;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@RestController
@RequestMapping("")
public class SampleController {

    @GetMapping("/defaultHello")
    public StringResponse defaultHello(@RequestParam(required = false) String message) {
        return new StringResponse("Default Hello World!");
    }

    @PostMapping("/customHello")
    public StringResponse customHello(@RequestParam String message) {
        return new StringResponse("Custom " + message);
    }
}
