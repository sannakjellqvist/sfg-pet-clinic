package sannakjellqvist.sfgpetclinic.services;

import sannakjellqvist.sfgpetclinic.model.Owner;

public interface OwnerService extends CrudService<Owner, Long> {

    Owner findByLastName(String lastName);
}
