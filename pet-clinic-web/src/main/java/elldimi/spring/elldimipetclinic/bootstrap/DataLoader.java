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

    public DataLoader(OwnerService ownerService, VetService vetService) {
        this.ownerService = ownerService;
        this.vetService = vetService;
    }

    @Override
    public void run(String... args) throws Exception {

        Owner owner1 = new Owner();
        owner1.setFirstName("Denis");
        owner1.setLastName("Ivanov");
        ownerService.save(owner1);

        Owner owner2 = new Owner();
        owner2.setFirstName("Kalina");
        owner2.setLastName("Mileva");
        ownerService.save(owner2);

        System.out.println("Loaded owners...");

        Vet vet1 = new Vet();
        vet1.setFirstName("Toma");
        vet1.setLastName("Tomov");
        vetService.save(vet1);

        Vet vet2 = new Vet();
        vet2.setFirstName("Marina");
        vet2.setLastName("Markova");
        vetService.save(vet2);

        System.out.println("Loaded Vets...");

    }
}
