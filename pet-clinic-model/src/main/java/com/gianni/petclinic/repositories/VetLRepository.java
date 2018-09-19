package com.gianni.petclinic.repositories;

import com.gianni.petclinic.model.Vet;
import org.springframework.data.repository.CrudRepository;

public interface VetLRepository extends CrudRepository<Vet, Long> {
}
