package com.example.sop_midterm_63070188_2.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CalculatorPriceService {

    public double getPrice(double productCost, double productProfit){
        return productCost+productProfit;
    }
}
