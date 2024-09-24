package de.supercode.superbnb.controllers;

import de.supercode.superbnb.dtos.apartmentDtos.*;
import de.supercode.superbnb.services.ApartmentService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/v1/superbnb/apartment")
public class ApartmentController {
    ApartmentService apartmentService;

    public ApartmentController(ApartmentService apartmentService) {
        this.apartmentService = apartmentService;
    }

    @PostMapping
    public ResponseEntity<RespCreateApartmentDto> createNewApartment(@RequestBody @Validated ReqCreateApartmentDto dto){
        return ResponseEntity.status(HttpStatus.CREATED).body(apartmentService.createNewApartment(dto));
    }

    @GetMapping("/{id}")
    public ResponseEntity<RespGetApartmentByIdDto> getApartmentByID(@PathVariable long id){
        RespGetApartmentByIdDto response = this.apartmentService.getApartmentById(id);
        if (response == null) throw new IllegalArgumentException("Kein Apartment unter dieser ID gefunden");
        return ResponseEntity.ok().body(response);
    }

}
