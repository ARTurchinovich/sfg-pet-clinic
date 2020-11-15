package ru.turchinovich.sfgpetclinic.repositories;

import org.springframework.data.repository.CrudRepository;
import ru.turchinovich.sfgpetclinic.model.Owner;

public interface OwnerRepository extends CrudRepository<Owner, Long> {

    Owner findByLastName(String lastName);
}
