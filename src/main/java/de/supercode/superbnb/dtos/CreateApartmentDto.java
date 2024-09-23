package de.supercode.superbnb.dtos;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

import java.math.BigInteger;

public record CreateApartmentDto(
        @NotBlank
        String city,
        @NotBlank
        String adress,
        @NotNull
        BigInteger costsPerNight
) {
}
