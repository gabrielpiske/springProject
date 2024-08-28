package com.garagem.restapi.cor;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.garagem.restapi.cor.entities.Cor;
import com.garagem.restapi.cor.database.RepositoryCor;

@RestController
@RequestMapping("/Cor")
public class CorREST {
    @Autowired
    private RepositoryCor repository;

    @GetMapping
    public List<Cor> listar(){
        return repository.findAll();
    }

    @PostMapping
    public void salvar(@RequestBody Cor id){
        repository.save(id);
    }

    @PutMapping
    public void alterar(@RequestBody Cor id){
        if(id.getId() > 0)
            repository.save(id);
    }

    @DeleteMapping
    public void excluir(@RequestBody Cor id){
        repository.delete(id);
    }
}
