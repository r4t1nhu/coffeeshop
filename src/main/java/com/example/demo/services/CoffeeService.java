package com.example.demo.services;

import com.example.demo.controllers.dto.CoffeeDTO;
import com.example.demo.controllers.dto.CoffeeListDTO;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class CoffeeService {

    public CoffeeListDTO getCoffees(){

        CoffeeDTO coffee = new CoffeeDTO();

        coffee.setId(1L);
        coffee.setName("Cafe Pilao");
        coffee.setBrand("Pilao");
        List<String> flavors = Arrays.asList("Chocolate", "Full black");
        coffee.setFlavors(flavors);

        CoffeeDTO coffee2 = new CoffeeDTO();

        coffee2.setId(2L);
        coffee2.setName("Cafe Pele");
        coffee2.setBrand("Pele");
        List<String> flavors2 = Arrays.asList("Abacate", "Ameixa seca");
        coffee2.setFlavors(flavors2);

        List<CoffeeDTO> list  = new ArrayList<>();
        list.add(coffee);
        list.add(coffee2);

        CoffeeListDTO response = new CoffeeListDTO();
        response.setCoffeeList(list);

        return response;
    }
}
