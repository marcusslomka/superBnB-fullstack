package de.supercode.superbnb.dtos.apartmentDtos;

import jakarta.persistence.Id;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

import java.math.BigInteger;

public record RespGetApartmentByIdDto(
        @Id
        long id,
        @NotBlank
        String city,
        @NotBlank
        String address,
        @NotNull
        BigInteger costsPerNight,
        boolean available
) {
}
