package sannakjellqvist.sfgpetclinic.repositories;

import org.springframework.data.repository.CrudRepository;
import sannakjellqvist.sfgpetclinic.model.Speciality;

public interface SpecialtyRepository extends CrudRepository<Speciality, Long> {
}
