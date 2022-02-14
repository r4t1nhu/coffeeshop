package com.example.demo.controllers.dto;

import java.util.List;

public class CoffeeListDTO {

    private List<CoffeeDTO> coffeeList;

    public List<CoffeeDTO> getCoffeeList() {
        return coffeeList;
    }

    public void setCoffeeList(List<CoffeeDTO> coffeeList) {
        this.coffeeList = coffeeList;
    }
}
