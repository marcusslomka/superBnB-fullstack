package de.supercode.superbnb.services;

import de.supercode.superbnb.dtos.CreateApartmentDto;
import de.supercode.superbnb.dtos.ResponseCreateApartmentDto;
import de.supercode.superbnb.entities.Apartment;
import de.supercode.superbnb.repositories.ApartmentRepository;
import org.springframework.stereotype.Service;

@Service
public class ApartmentService {
    ApartmentRepository apartmentRepository;

    public ApartmentService(ApartmentRepository apartmentRepository) {
        this.apartmentRepository = apartmentRepository;
    }

    public ResponseCreateApartmentDto createNewApartment(CreateApartmentDto dto){
        Apartment apartment=new Apartment();
        apartment.setAddress(dto.address());
        apartment.setCity(dto.city());
        apartment.setCostsPerNight(dto.costsPerNight());
        this.apartmentRepository.save(apartment);
        return new ResponseCreateApartmentDto(apartment.getId(),apartment.getAddress());
    }
    public void updateApartment(Apartment apartment, long id){

    }

}
