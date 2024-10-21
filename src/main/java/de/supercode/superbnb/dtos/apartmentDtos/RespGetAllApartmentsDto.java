package de.supercode.superbnb.dtos.apartmentDtos;

import de.supercode.superbnb.entities.Apartment;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotBlank;

import java.util.List;

public record ResGetAllApartmentsDto(
        Apartment[] apartments
) {
}
