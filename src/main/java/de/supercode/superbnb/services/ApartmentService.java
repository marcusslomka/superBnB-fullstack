package de.supercode.superbnb.services;

import de.supercode.superbnb.entities.Apartment;
import de.supercode.superbnb.repositories.ApartmentRepository;
import org.springframework.stereotype.Service;

@Service
public class ApartmentService {
    ApartmentRepository apartmentRepository;

    public ApartmentService(ApartmentRepository apartmentRepository) {
        this.apartmentRepository = apartmentRepository;
    }

    public void createNewApartment(Apartment apartment){
        this.apartmentRepository.save(apartment);
    }


}
