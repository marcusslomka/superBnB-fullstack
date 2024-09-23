package de.supercode.superbnb.repositories;

import de.supercode.superbnb.entities.Apartment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ApartmentRepository extends JpaRepository<Apartment,Long> {
}
