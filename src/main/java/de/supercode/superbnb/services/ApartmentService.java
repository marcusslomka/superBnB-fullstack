package de.supercode.superbnb.services;

import de.supercode.superbnb.dtos.CreateApartmentDto;
import de.supercode.superbnb.entities.Apartment;
import de.supercode.superbnb.repositories.ApartmentRepository;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;

@Service
public class ApartmentService {
    ApartmentRepository apartmentRepository;

    public ApartmentService(ApartmentRepository apartmentRepository) {
        this.apartmentRepository = apartmentRepository;
    }

    public void createNewApartment(CreateApartmentDto dto){
        Apartment apartment=new Apartment();
        apartment.setAdress(dto.adress());
        apartment.setCity(dto.city());
        apartment.setCostsPerNight(dto.costsPerNight());
        this.apartmentRepository.save(apartment);

    }
    public void updateApartment(Apartment apartment, long id){

    }

}
