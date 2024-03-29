package ru.neoflex.practice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalcController {
    @GetMapping("/plus/{a}/{b}")
    public static Integer plus(@PathVariable Integer a, @PathVariable Integer b){
        return a + b;
    }
    @GetMapping("/minus/{a}/{b}")
    public static Integer minus(@PathVariable Integer a, @PathVariable Integer b){
        return a - b;
    }
}
