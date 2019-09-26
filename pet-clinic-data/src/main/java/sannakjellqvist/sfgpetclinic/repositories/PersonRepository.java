package sannakjellqvist.sfgpetclinic.repositories;

import org.springframework.data.repository.CrudRepository;
import sannakjellqvist.sfgpetclinic.model.Person;

public interface PersonRepository extends CrudRepository<Person, Long> {
}
