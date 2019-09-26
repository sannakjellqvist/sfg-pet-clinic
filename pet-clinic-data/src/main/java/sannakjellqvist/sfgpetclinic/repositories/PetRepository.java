package sannakjellqvist.sfgpetclinic.repositories;

import org.springframework.data.repository.CrudRepository;
import sannakjellqvist.sfgpetclinic.model.Pet;

public interface PetRepository extends CrudRepository<Pet, Long> {
}
