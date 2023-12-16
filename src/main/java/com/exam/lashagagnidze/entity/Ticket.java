package com.exam.lashagagnidze.entity;

import jakarta.persistence.*;
import lombok.*;


@EqualsAndHashCode(callSuper = true)
@Data
@NoArgsConstructor
@Entity
@Table(name = "TICKETS")
public class Ticket extends AppEntity {
    @Id
    @Column(name = "ID")
    @SequenceGenerator(name = "ticketIdSeq", sequenceName = "TICKET_ID_SEQ", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "ticketIdSeq")
    private Long id;

    @Column(name = "PASSENGER_NAME")
    private String passengerName;

    @ManyToOne
    @JoinColumn(name = "flight_id", nullable = false)
    private Flight flight;

    public Ticket(String passengerName, Flight flight) {
        this.passengerName = passengerName;
        this.flight = flight;
    }
}
