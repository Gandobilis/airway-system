package com.exam.lashagagnidze.controller;

import com.exam.lashagagnidze.entity.Ticket;
import com.exam.lashagagnidze.service.TicketService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;


import java.util.List;

@AllArgsConstructor
@RestController
@RequestMapping("/api/tickets")
public class TicketController {


    private TicketService service;

    @PostMapping
    public Ticket buyTicket(@RequestBody Ticket ticket) {
        return service.buyTicket(ticket);
    }

    @GetMapping("/{passengerName}")
    public List<Ticket> getAllTicketsByPassenger(@PathVariable String passengerName) {
        return service.getAllTicketsByPassenger(passengerName);
    }
}
