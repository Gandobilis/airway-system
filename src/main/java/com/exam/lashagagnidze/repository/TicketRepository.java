package com.exam.lashagagnidze.repository;

import com.exam.lashagagnidze.dto.TicketDTO;
import com.exam.lashagagnidze.entity.Ticket;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.time.Month;
import java.util.List;

public interface TicketRepository extends JpaRepository<Ticket, Long> {

    List<Ticket> findAllByPassengerName(String passengerName);

    @Query("SELECT TicketDTO" +
            "(t.id, t.flight.from.name," +
            " t.flight.destination.name, t.passengerName)" +
            " FROM Ticket t WHERE t.flight.id = :flightId")
    List<TicketDTO> getAllTicketsOnFlightWithCityNames(@Param("flightId") Long flightId);

    @Query("SELECT COUNT(t) FROM Ticket t WHERE MONTH(t.createdDate) = :month")
    int countTicketsSoldForMonth(@Param("month") int currentMonth);
}
