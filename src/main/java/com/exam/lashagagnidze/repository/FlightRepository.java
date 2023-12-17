package com.exam.lashagagnidze.repository;

import com.exam.lashagagnidze.dto.FlightDTO;
import com.exam.lashagagnidze.entity.City;
import com.exam.lashagagnidze.entity.Flight;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface FlightRepository extends JpaRepository<Flight, Long> {

    List<Flight> getFlightsByFrom(City from);

    @Query("SELECT COUNT(f) FROM Flight f WHERE MONTH(f.createdDate) = :month")
    int countFlightsScheduledForMonth(@Param("month") int currentMonth);

    @Query("SELECT FlightDTO(f.id, f.from.name, f.destination.name) FROM Flight f")
    List<FlightDTO> getAllFlightsWithCityNames();
}