package com.exam.lashagagnidze.entity;

import jakarta.persistence.*;
import lombok.*;

@EqualsAndHashCode(callSuper = true)
@Data
@NoArgsConstructor
@Entity
@Table(name = "cities")
public class City extends AppEntity {
    @Id
    @Column(name = "id")
    @SequenceGenerator(name = "cityIdSeq", sequenceName = "CITY_ID_SEQ", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "cityIdSeq")
    Long id;

    @Column(name = "name", nullable = false, unique = true)
    String name;

    public City(String name) {
        this.name = name;
    }
}
