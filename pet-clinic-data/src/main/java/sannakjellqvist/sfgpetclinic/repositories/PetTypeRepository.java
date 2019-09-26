package sannakjellqvist.sfgpetclinic.repositories;

import org.springframework.data.repository.CrudRepository;
import sannakjellqvist.sfgpetclinic.model.PetType;

public interface PetTypeRepository extends CrudRepository<PetType, Long> {
}
