package elldimi.spring.elldimipetclinic.services.map;

import elldimi.spring.elldimipetclinic.model.Vet;
import elldimi.spring.elldimipetclinic.services.VetService;
import org.springframework.stereotype.Service;

@Service
public class VetServiceMap extends AbstractMapService<Vet, Long> implements VetService {

    public VetServiceMap() {
    }
}
