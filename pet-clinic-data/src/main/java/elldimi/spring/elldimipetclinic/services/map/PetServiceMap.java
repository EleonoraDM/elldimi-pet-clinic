package elldimi.spring.elldimipetclinic.services.map;

import elldimi.spring.elldimipetclinic.model.Pet;
import elldimi.spring.elldimipetclinic.services.PetService;

public class PetServiceMap extends AbstractMapService<Pet, Long> implements PetService {

    public PetServiceMap() {
    }
}
