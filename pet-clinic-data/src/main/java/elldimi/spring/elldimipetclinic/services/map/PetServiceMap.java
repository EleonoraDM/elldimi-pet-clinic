package elldimi.spring.elldimipetclinic.services.map;

import elldimi.spring.elldimipetclinic.model.Pet;
import elldimi.spring.elldimipetclinic.services.PetService;
import org.springframework.stereotype.Service;

@Service
public class PetServiceMap extends AbstractMapService<Pet, Long> implements PetService {

    public PetServiceMap() {
    }
}
