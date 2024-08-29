package com.garagem.restapi.manufactory;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.garagem.restapi.manufactory.database.RepositoryManufactory;
import com.garagem.restapi.manufactory.entities.Manufactory;

@RestController
@RequestMapping("/manufactory")
public class ManufactoryREST {
    @Autowired
    private RepositoryManufactory repository;

    @GetMapping
    public List<Manufactory> listar(){
        return repository.findAll();
    }

    @PostMapping
    public void salvar(@RequestBody Manufactory id){
        repository.save(id);
    }

    @PutMapping
    public void alterar(@RequestBody Manufactory id){
        if(id.getId() > 0)
            repository.save(id);
    }

    @DeleteMapping
    public void excluir(@RequestBody Manufactory id){
        repository.delete(id);
    }
}
