package br.com.vivaperifa.VivaPerifa.controllers;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.vivaperifa.VivaPerifa.models.EventoModel;
import br.com.vivaperifa.VivaPerifa.repositories.EventoRepository;

@RestController
public class EventoController {
    @Autowired
    EventoRepository repository;

    @GetMapping("/evento/{codigo}")
    public ResponseEntity<EventoModel> carregar(@PathVariable String id){
        Optional<EventoModel> obj = repository.findById(id);
        return ResponseEntity.ok(obj.get());
    }

    @GetMapping("/eventos")
    public ResponseEntity<List<EventoModel>> listar(){
        List<EventoModel> listagem = repository.findAll();
        return ResponseEntity.ok(listagem);
    }

    @PostMapping("/evento")
    public ResponseEntity<String> cadastrar(@RequestBody EventoModel obj){
        repository.save(obj);
        String msg = "Registro salvo com sucesso";
        return ResponseEntity.ok(msg);
    }
}

