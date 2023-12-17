package com.exam.lashagagnidze.controller;

import com.exam.lashagagnidze.entity.City;
import com.exam.lashagagnidze.service.CityService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@AllArgsConstructor
@RestController
@RequestMapping("/api/cities")
public class CityController {


    private final CityService service;

    @PostMapping
    public City addCity(@RequestBody City city) {
        return service.addCity(city);
    }

    @GetMapping
    public List<City> getAllCities() {
        return service.getAllCities();
    }
}
