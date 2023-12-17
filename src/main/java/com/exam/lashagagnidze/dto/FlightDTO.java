package com.exam.lashagagnidze.dto;

public record FlightDTO(
        CityDTO departureCity,
        CityDTO arrivalCity
) {
}
