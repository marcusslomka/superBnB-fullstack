package de.supercode.superbnb.dtos;

import jakarta.persistence.Id;
import jakarta.validation.constraints.NotBlank;

public record ResponseCreateApartmentDto(
    @Id
    long id,
    @NotBlank
    String address
) {
}
