package elldimi.spring.elldimipetclinic.services;

import elldimi.spring.elldimipetclinic.model.Pet;

import java.util.Set;

public interface PetService {

    Pet findById(Long id);

    Pet save(Pet pet);

    Set<Pet> findAll();
}
