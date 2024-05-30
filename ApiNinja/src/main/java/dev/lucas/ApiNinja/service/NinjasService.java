package dev.lucas.ApiNinja.service;

import dev.lucas.ApiNinja.model.Ninjas;
import dev.lucas.ApiNinja.repository.NinjasRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class NinjasService {

    @Autowired // instanciar a interface
    private NinjasRepository repo;

    //Cria um novo ninja usando a instancia do NinjasRepository usando JPA
    public Ninjas createNinja(Ninjas ninja){
        return repo.save(ninja);
    }
}
