package ru.turchinovich.sfgpetclinic.repositories;

import org.springframework.data.repository.CrudRepository;
import ru.turchinovich.sfgpetclinic.model.Speciality;

public interface SpecialtyRepository extends CrudRepository<Speciality, Long> {
}
