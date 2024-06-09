package br.com.vivaperifa.VivaPerifa.repositories;


import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import br.com.vivaperifa.VivaPerifa.models.ParticipanteModel;

@Repository
public interface ParticipanteRepository extends MongoRepository<ParticipanteModel, String>{
    
}
