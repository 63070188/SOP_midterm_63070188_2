package com.example.sop_midterm_63070188_2.controller;

import com.example.sop_midterm_63070188_2.service.CalculatorPriceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalculatorPriceController {
    @Autowired
    private CalculatorPriceService service;

    public CalculatorPriceController(CalculatorPriceService service) {
        this.service = service;
    }

    @GetMapping("/getPrice/{cost}/{profit}")
    public double  serviceGetProducts(@PathVariable double cost, @PathVariable double profit){
        return service.getPrice(cost, profit);
    }
}
