package elldimi.spring.elldimipetclinic.bootstrap;

import elldimi.spring.elldimipetclinic.model.Owner;
import elldimi.spring.elldimipetclinic.model.Vet;
import elldimi.spring.elldimipetclinic.services.OwnerService;
import elldimi.spring.elldimipetclinic.services.VetService;
import elldimi.spring.elldimipetclinic.services.map.OwnerServiceMap;
import elldimi.spring.elldimipetclinic.services.map.VetServiceMap;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements CommandLineRunner {
    private final OwnerService ownerService;
    private final VetService vetService;

    public DataLoader() {
        ownerService = new OwnerServiceMap();
        vetService = new VetServiceMap();
    }

    @Override
    public void run(String... args) throws Exception {

        Owner owner1 = new Owner();
        owner1.setId(1L);
        owner1.setFirstName("Denis");
        owner1.setLastName("Ivanov");
        ownerService.save(1L, owner1);

        Owner owner2 = new Owner();
        owner2.setId(2L);
        owner2.setFirstName("Kalina");
        owner2.setLastName("Mileva");
        ownerService.save(2L, owner2);

        System.out.println("Loaded owners...");

        Vet vet1 = new Vet();
        vet1.setId(1L);
        vet1.setFirstName("Toma");
        vet1.setLastName("Tomov");
        vetService.save(1L, vet1);

        Vet vet2 = new Vet();
        vet2.setId(2L);
        vet2.setFirstName("Marina");
        vet2.setLastName("Markova");
        vetService.save(2L, vet2);

        System.out.println("Loaded Vets...");

    }
}
