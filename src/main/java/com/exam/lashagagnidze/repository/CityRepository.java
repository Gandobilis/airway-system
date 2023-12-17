package com.exam.lashagagnidze.repository;

import com.exam.lashagagnidze.entity.City;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CityRepository extends JpaRepository<City, Long> {
}