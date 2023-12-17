package com.exam.lashagagnidze.entity;

import jakarta.persistence.*;
import lombok.*;


@EqualsAndHashCode(callSuper = true)
@Data
@NoArgsConstructor
@Entity
@Table(name = "tickets")
public class Ticket extends AppEntity {
    @Id
    @Column(name = "id")
    @SequenceGenerator(name = "ticketIdSeq", sequenceName = "TICKET_ID_SEQ", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "ticketIdSeq")
    Long id;

    @Column(name = "passenger_name", nullable = false)
    String passengerName;

    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name = "flight_id", nullable = false)
    Flight flight;

    public Ticket(String passengerName, Flight flight) {
        this.passengerName = passengerName;
        this.flight = flight;
    }
}
