package de.supercode.superbnb.services;

import de.supercode.superbnb.dtos.apartmentDtos.ReqCreateApartmentDto;
import de.supercode.superbnb.dtos.apartmentDtos.RespCreateApartmentDto;
import de.supercode.superbnb.dtos.apartmentDtos.RespGetApartmentByIdDto;
import de.supercode.superbnb.entities.Apartment;
import de.supercode.superbnb.repositories.ApartmentRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ApartmentService {
    ApartmentRepository apartmentRepository;

    public ApartmentService(ApartmentRepository apartmentRepository) {
        this.apartmentRepository = apartmentRepository;
    }

    public RespCreateApartmentDto createNewApartment(ReqCreateApartmentDto dto) {
        Apartment apartment = new Apartment();
        apartment.setAddress(dto.address());
        apartment.setCity(dto.city());
        apartment.setCostsPerNight(dto.costsPerNight());
        this.apartmentRepository.save(apartment);
        return new RespCreateApartmentDto(apartment.getId(), apartment.getAddress());
    }

    public RespGetApartmentByIdDto getApartmentById(long id) {
        Optional<Apartment> toGetApartment = this.apartmentRepository.findById(id);
        if (toGetApartment.isEmpty())
            return null;
        else {
            return new RespGetApartmentByIdDto(
                    toGetApartment.get().getId(),
                    toGetApartment.get().getCity(),
                    toGetApartment.get().getAddress(),
                    toGetApartment.get().getCostsPerNight(),
                    toGetApartment.get().isAvailable());
        }
    }

}