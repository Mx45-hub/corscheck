package com.corsapp.corsapplication.controller;

//C:\Users\Musa\corsapplication\src\main\java\com\corsapp\corsapplication\model\Coffee.java

import com.corsapp.corsapplication.model.*;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/coffee")
@CrossOrigin //make available to anyone
//@CrossOrigin(origins = "http://localhost:3000")
public class CoffeeController {

    private List<Coffee> coffeeList = new ArrayList<>();

    public CoffeeController() {
        coffeeList.add(new Coffee(1, "Caffè Americano", Size.GRANDE));
        coffeeList.add(new Coffee(2, "Caffè Latte", Size.VENTI));
        coffeeList.add(new Coffee(3, "Caffè Caramel Macchiato", Size.TALL));
        coffeeList.add(new Coffee(4, "Sweet Latte", Size.TALL));
    }


    @CrossOrigin
    @GetMapping
    public List<Coffee> findAll() {
        return coffeeList;
    }


    //@CrossOrigin(origins = "http://localhost:3000") only allow specific port
    @DeleteMapping
    public void delete() {
        // delete a coffee
    }

}
