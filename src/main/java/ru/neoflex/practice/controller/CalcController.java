package ru.neoflex.practice.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@Api(description = "Controller for calculator api")
@RestController
@RequestMapping("/api")
public class CalcController {

    @GetMapping("/plus/{a}/{b}")
    @ApiOperation("Addition method for integers")
    public static Integer plus(@PathVariable Integer a, @PathVariable Integer b){
        return a + b;
    }
    @ApiOperation("Subtraction method for integers")
    @GetMapping("/minus/{a}/{b}")
    public static Integer minus(@PathVariable Integer a, @PathVariable Integer b){
        return a - b;
    }
}
