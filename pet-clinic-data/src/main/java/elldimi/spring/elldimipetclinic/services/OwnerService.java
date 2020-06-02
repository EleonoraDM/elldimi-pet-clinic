package elldimi.spring.elldimipetclinic.services;

import elldimi.spring.elldimipetclinic.model.Owner;

public interface OwnerService extends CrudService<Owner, Long> {

    Owner findByLastName(String lastName);

}
