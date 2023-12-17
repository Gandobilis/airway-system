package com.exam.lashagagnidze.service;

import com.exam.lashagagnidze.dto.TicketDTO;
import com.exam.lashagagnidze.entity.Ticket;
import com.exam.lashagagnidze.repository.TicketRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@AllArgsConstructor
@Service
public class TicketServiceImpl implements TicketService {
    private final TicketRepository ticketRepository;

    @Override
    public Ticket buyTicket(Ticket ticket) {
        return ticketRepository.save(ticket);
    }

    @Override
    public List<TicketDTO> getAllTicketsOnFlightWithCityNames(Long flightId) {
        return ticketRepository.getAllTicketsOnFlightWithCityNames(flightId);
    }

    @Override
    public List<Ticket> getAllTicketsByPassenger(String passengerName) {
        return ticketRepository.findAllByPassengerName(passengerName);
    }
}