package com.exam.lashagagnidze.entity;

import jakarta.persistence.*;
import lombok.*;

@EqualsAndHashCode(callSuper = true)
@Data
@NoArgsConstructor
@Entity
@Table(name = "CITIES")
public class City extends AppEntity {
    @Id
    @Column(name = "ID")
    @SequenceGenerator(name = "cityIdSeq", sequenceName = "CITY_ID_SEQ", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "cityIdSeq")
    private Long id;

    @Column(name = "NAME", nullable = false, unique = true)
    private String name;

    public City(String name) {
        this.name = name;
    }
}
