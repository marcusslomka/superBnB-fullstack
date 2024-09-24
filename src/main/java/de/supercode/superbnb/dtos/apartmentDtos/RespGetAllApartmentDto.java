package de.supercode.superbnb.dtos.apartmentDtos;

import jakarta.persistence.Id;
import jakarta.validation.constraints.NotBlank;

public record RespGetAllApartmentDto(
        @Id
        long id,
        @NotBlank
        String city,
        @NotBlank
        String address,
        boolean available
) {
}
