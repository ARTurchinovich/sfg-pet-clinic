package ru.turchinovich.sfgpetclinic.repositories;

import org.springframework.data.repository.CrudRepository;
import ru.turchinovich.sfgpetclinic.model.PetType;

public interface PetTypeRepository extends CrudRepository<PetType, Long> {
}
