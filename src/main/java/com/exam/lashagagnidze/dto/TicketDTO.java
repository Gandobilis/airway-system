package com.exam.lashagagnidze.dto;

public record TicketDTO(
        FlightDTO flight,
        String passengerName
) {
}
