package com.example.javeagent.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class HomeController {

    @GetMapping({"/", "/{url}"})
    public String home(@PathVariable(required = false) String url) {
        log.info("visit {} page", url);
        return "Welcome home";
    }
}
