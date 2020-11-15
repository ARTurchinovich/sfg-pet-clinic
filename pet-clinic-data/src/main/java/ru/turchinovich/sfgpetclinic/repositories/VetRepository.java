package ru.turchinovich.sfgpetclinic.repositories;

import org.springframework.data.repository.CrudRepository;
import ru.turchinovich.sfgpetclinic.model.Vet;

public interface VetRepository extends CrudRepository<Vet, Long> {
}
