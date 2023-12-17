package com.exam.lashagagnidze.controller;

import com.exam.lashagagnidze.dto.FlightDTO;
import com.exam.lashagagnidze.entity.Flight;
import com.exam.lashagagnidze.service.FlightService;
import com.exam.lashagagnidze.service.FlightTicketStats;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;


import java.util.List;

@AllArgsConstructor
@RestController
@RequestMapping("/api/flights")
public class FlightController {

    private final FlightService service;

    @PostMapping
    public Flight addFlight(@RequestBody Flight flight) {
        return service.addFlight(flight);
    }

    @GetMapping
    public List<FlightDTO> getAllFlightsWithCityNames() {
        return service.getAllFlightsWithCityNames();
    }

    @GetMapping("/stats")
    public FlightTicketStats getFlightTicketStatsForCurrentMonth() {
        return service.getFlightTicketStatsForCurrentMonth();
    }
}