package br.com.vivaperifa.VivaPerifa.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.vivaperifa.VivaPerifa.models.ParticipanteModel;
import br.com.vivaperifa.VivaPerifa.repositories.ParticipanteRepository;

@RestController
@CrossOrigin(origins="localhost:3000")
public class ParticipanteController {
    
    @Autowired
    ParticipanteRepository repository;

    @GetMapping("/participante/{id}")
    public ResponseEntity<ParticipanteModel> carregar(@PathVariable String id){
        Optional<ParticipanteModel> obj = repository.findById(id);
        return ResponseEntity.ok(obj.get());
    }

    @GetMapping("/participantes")
    public ResponseEntity<List<ParticipanteModel>> listar(){
        List<ParticipanteModel> listagem = repository.findAll();
        return ResponseEntity.ok(listagem);
    }

    @PostMapping("/participante")
    public ResponseEntity<String> cadastrar(@RequestBody ParticipanteModel obj){
        repository.save(obj);
        String msg = "Registro salvo com sucesso";
        return ResponseEntity.ok(msg);
    }

    
}
