package com.exam.lashagagnidze.service;

import com.exam.lashagagnidze.dto.FlightDTO;
import com.exam.lashagagnidze.entity.Flight;
import com.exam.lashagagnidze.repository.FlightRepository;
import com.exam.lashagagnidze.repository.TicketRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@AllArgsConstructor
@Service
public class FlightServiceImpl implements FlightService {

    private final FlightRepository flightRepository;
    private final TicketRepository ticketRepository;


    public Flight addFlight(Flight flight) {
        return flightRepository.save(flight);
    }

    public List<FlightDTO> getAllFlightsWithCityNames() {
        return flightRepository.getAllFlightsWithCityNames();
    }

    public FlightTicketStats getFlightTicketStatsForCurrentMonth() {
        LocalDate currentDate = LocalDate.now();
        int currentMonth = currentDate.getMonthValue();
        int flightsScheduled = flightRepository.countFlightsScheduledForMonth(currentMonth);
        int ticketsSold = ticketRepository.countTicketsSoldForMonth(currentMonth);
        return new FlightTicketStats(flightsScheduled, ticketsSold);
    }

}
