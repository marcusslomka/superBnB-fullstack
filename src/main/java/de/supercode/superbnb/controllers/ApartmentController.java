package de.supercode.superbnb.controllers;

import de.supercode.superbnb.dtos.CreateApartmentDto;
import de.supercode.superbnb.dtos.ResponseCreateApartmentDto;
import de.supercode.superbnb.entities.Apartment;
import de.supercode.superbnb.services.ApartmentService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/superbnb/apartment")
public class ApartmentController {
    ApartmentService apartmentService;

    public ApartmentController(ApartmentService apartmentService) {
        this.apartmentService = apartmentService;
    }

    @PostMapping
    public ResponseEntity<ResponseCreateApartmentDto> createNewApartment(@RequestBody @Validated CreateApartmentDto dto){
        return ResponseEntity.status(HttpStatus.CREATED).body(apartmentService.createNewApartment(dto));
    }



}
