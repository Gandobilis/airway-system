package com.exam.lashagagnidze.service;

import com.exam.lashagagnidze.dto.FlightDTO;
import com.exam.lashagagnidze.entity.Flight;

import java.util.List;

public interface FlightService {
    Flight addFlight(Flight flight);

    List<FlightDTO> getAllFlightsWithCityNames();

    FlightTicketStats getFlightTicketStatsForCurrentMonth();
}
