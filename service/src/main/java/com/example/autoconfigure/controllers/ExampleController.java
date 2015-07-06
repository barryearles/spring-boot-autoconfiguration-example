package com.example.autoconfigure.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * The ExampleController#getData result is autoconfigured
 */
@RestController
public class ExampleController {

    @Resource(name = "result")
    String result;

    @RequestMapping("/getData")
    public String getData() {
        return result;
    }
}
