package dev.lucas.ApiNinja.service;

import dev.lucas.ApiNinja.model.Ninjas;
import dev.lucas.ApiNinja.repository.NinjasRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class NinjasService {

    @Autowired
    private NinjasRepository repo; // instanciar a interface

    //Cria um novo ninja e envia pro db usando a instancia do NinjasRepository usando JPA
    public Ninjas createNinja(Ninjas ninja){
        return repo.save(ninja);
    }

    //Faz uma consulta no db e devolve uma list de ninjas
    public List<Ninjas> getAllNinjas(){
        return repo.findAll();
    }

    //Faz uma consulta no db e retorna o ninja pelo id
    public Optional<Ninjas> readNinja(Long id){
        return repo.findById(id);
    }

    //Deletar um ninja pelo id
    public void deleteNinja(Long id) {
        repo.deleteById(id);
    }
}
