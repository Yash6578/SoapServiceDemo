package com.saopservice.demo.controller;

import com.example.soapclient.Calculator;
import com.example.soapclient.CalculatorSoap;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
    @Autowired
    Calculator calculator;

    @GetMapping("/test")
    void test() {
        CalculatorSoap calculatorSoap = calculator.getCalculatorSoap();
        int res = calculatorSoap.add(5, 5);

        System.out.println(res);
    }
}
