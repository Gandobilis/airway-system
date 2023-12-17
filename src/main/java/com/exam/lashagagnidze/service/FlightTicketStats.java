package com.exam.lashagagnidze.service;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class FlightTicketStats {

    private int flightsScheduled;
    private int ticketsSold;
}