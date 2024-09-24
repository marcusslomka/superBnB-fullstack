package de.supercode.superbnb.dtos.apartmentDtos;

import jakarta.persistence.Id;
import jakarta.validation.constraints.NotBlank;

public record RespCreateApartmentDto(
    @Id
    long id,
    @NotBlank
    String address
) {
}
