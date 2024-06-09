package br.com.vivaperifa.VivaPerifa.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;

import br.com.vivaperifa.VivaPerifa.models.EventoModel;

public interface EventoRepository extends MongoRepository<EventoModel, String>{
    
}
