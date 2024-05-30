package dev.lucas.ApiNinja.controller;

import dev.lucas.ApiNinja.model.Ninjas;
import dev.lucas.ApiNinja.service.NinjasService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/ninjas")
public class NinjasController {

    @Autowired
    private NinjasService service; //instanciar a classe

    //localhost:8080/api/ninjas/create
    //POST
    @PostMapping("/add")
    public ResponseEntity<Ninjas> createNinjas(@RequestBody Ninjas ninja) {
        Ninjas newNinja = service.createNinja(ninja);
        return new ResponseEntity<>(newNinja, HttpStatus.CREATED);
    }

    //localhost:8080/api/ninjas/all
    @GetMapping("/all")
    public ResponseEntity<List<Ninjas>> getAllNinjas(){
        List<Ninjas> allNinjas = service.getAllNinjas();
        return new ResponseEntity<>(allNinjas, HttpStatus.OK);
    }

    //localhost:8080/api/ninjas/get/1
    @GetMapping("/get/{id}")
    public Optional<Ninjas> readNinja(@PathVariable Long id){
        return service.readNinja(id);
    }

    //localhost:8080/api/ninjas/delete/1
    @DeleteMapping("/delete/{id}")
    public void deleteNija(@PathVariable Long id){
        service.deleteNinja(id);
    }
}
