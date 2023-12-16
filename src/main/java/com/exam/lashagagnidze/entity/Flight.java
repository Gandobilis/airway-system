package com.exam.lashagagnidze.entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;


@EqualsAndHashCode(callSuper = true)
@Data
@NoArgsConstructor
@Entity
@Table(name = "FLIGHTS")
public class Flight extends AppEntity {
    @Id
    @Column(name = "ID", updatable = false)
    @SequenceGenerator(name = "flightIdSeq", sequenceName = "FLIGHT_ID_SEQ", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "flightIdSeq")
    private Long id;

    @ManyToOne
    @JoinColumn(name = "departure_city_id", nullable = false)
    private City from;

    @ManyToOne
    @JoinColumn(name = "arrival_city_id", nullable = false)
    private City destination;
}