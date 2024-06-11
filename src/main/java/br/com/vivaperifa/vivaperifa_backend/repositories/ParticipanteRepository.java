package br.com.vivaperifa.vivaperifa_backend.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import br.com.vivaperifa.vivaperifa_backend.models.ParticipanteModel;

@Repository
public interface ParticipanteRepository extends MongoRepository<ParticipanteModel, String>{
    
}