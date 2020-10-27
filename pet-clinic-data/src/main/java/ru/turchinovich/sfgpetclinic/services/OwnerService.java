package ru.turchinovich.sfgpetclinic.services;

import ru.turchinovich.sfgpetclinic.model.Owner;

import java.util.Set;

public interface OwnerService extends CrudService<Owner, Long> {

    Owner findByLastName(String lastName);
}
