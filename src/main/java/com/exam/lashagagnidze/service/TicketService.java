package com.exam.lashagagnidze.service;

import com.exam.lashagagnidze.dto.TicketDTO;
import com.exam.lashagagnidze.entity.Ticket;

import java.util.List;

public interface TicketService {
    Ticket buyTicket(Ticket ticket);

    List<TicketDTO> getAllTicketsOnFlightWithCityNames(Long flightId);

    List<Ticket> getAllTicketsByPassenger(String passengerName);
}
