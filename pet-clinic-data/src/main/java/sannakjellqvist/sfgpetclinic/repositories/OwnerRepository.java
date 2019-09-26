package sannakjellqvist.sfgpetclinic.repositories;

import org.springframework.data.repository.CrudRepository;
import sannakjellqvist.sfgpetclinic.model.Owner;

public interface OwnerRepository extends CrudRepository<Owner, Long> {

    Owner findByLastName(String lastName);
}
