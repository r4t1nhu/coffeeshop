package com.example.demo.controllers;

import com.example.demo.controllers.dto.CoffeeListDTO;
import com.example.demo.services.CoffeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/v1/coffee")
public class CoffeeController {

    @Autowired
    private CoffeeService coffeeService;

    @GetMapping()
    public CoffeeListDTO getCoffees(){
        return coffeeService.getCoffees();
    }

    @PostMapping()
    public String createCoffee(){
        return "Vc criou um cafe";
    }

    @PutMapping()
    public String modifyCoffee(){
        return "Vc modificou um cafe";
    }

    @DeleteMapping()
    public String deleteCoffee(){
        return "Vc removeu um cafe";
    }
}
