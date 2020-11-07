package ru.turchinovich.sfgpetclinic.services.map;

import org.springframework.stereotype.Service;
import ru.turchinovich.sfgpetclinic.model.Pet;
import ru.turchinovich.sfgpetclinic.model.Speciality;
import ru.turchinovich.sfgpetclinic.model.Vet;
import ru.turchinovich.sfgpetclinic.services.CrudService;
import ru.turchinovich.sfgpetclinic.services.SpecialtyService;
import ru.turchinovich.sfgpetclinic.services.VetService;

import java.util.Set;

@Service
public class VetServiceMap extends AbstractMapService<Vet, Long> implements VetService {

    private final SpecialtyService specialtyService;

    public VetServiceMap(SpecialtyService specialtyService) {
        this.specialtyService = specialtyService;
    }

    @Override
    public Set<Vet> findAll() {
        return super.findAll();
    }

    @Override
    public Vet findById(Long id) {
        return super.findById(id);
    }

    @Override
    public Vet save(Vet object) {

        if (object.getSpecialities().size() > 0) {
            object.getSpecialities().forEach(speciality -> {
                if(speciality.getId() == null) {
                    Speciality savedSpecialty = specialtyService.save(speciality);
                    speciality.setId(savedSpecialty.getId());
                }
            });
        }
        return super.save(object);
    }

    @Override
    public void delete(Vet object) {
        super.delete(object);
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }
}
