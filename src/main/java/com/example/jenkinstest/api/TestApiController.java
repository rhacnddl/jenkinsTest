package com.example.jenkinstest.api;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/tests")
public class TestApiController {

    @GetMapping("/hello")
    public HelloResponse getHello(){
        return new HelloResponse(1L, "Hello World V3");
    }

    @Getter
    @Setter
    @AllArgsConstructor
    @NoArgsConstructor
    static class HelloResponse{
        private Long id;
        private String content;
    }
}
