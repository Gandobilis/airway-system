package com.exam.lashagagnidze.service;


import com.exam.lashagagnidze.entity.City;

import java.util.List;

public interface CityService {
    City addCity(City city);

    List<City> getAllCities();
}
