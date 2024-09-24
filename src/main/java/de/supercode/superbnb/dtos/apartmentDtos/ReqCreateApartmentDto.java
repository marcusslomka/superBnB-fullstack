package de.supercode.superbnb.dtos.apartmentDtos;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

import java.math.BigInteger;

public record ReqCreateApartmentDto(
        @NotBlank
        String city,
        @NotBlank
        String address,
        @NotNull
        BigInteger costsPerNight
) {
}
