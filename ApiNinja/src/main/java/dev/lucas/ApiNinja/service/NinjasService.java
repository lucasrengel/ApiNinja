package dev.lucas.ApiNinja.service;

import dev.lucas.ApiNinja.repository.NinjasRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class NinjasService {

    @Autowired // instanciar a interface
    private NinjasRepository repo;
}
