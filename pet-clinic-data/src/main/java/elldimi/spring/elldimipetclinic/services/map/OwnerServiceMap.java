package elldimi.spring.elldimipetclinic.services.map;

import elldimi.spring.elldimipetclinic.model.Owner;
import elldimi.spring.elldimipetclinic.services.OwnerService;

import java.util.Set;

public class OwnerServiceMap extends AbstractMapService<Owner, Long> implements OwnerService {

    public OwnerServiceMap() {
    }

    @Override
    public Owner findByLastName(String lastName) {
        Set<Owner> owners = this.findAll();

        Owner wantedOwner = owners
                .stream()
                .filter(owner -> owner.getLastName().equals(lastName))
                .findFirst()
                .orElse(null);

        return wantedOwner;
    }
}
