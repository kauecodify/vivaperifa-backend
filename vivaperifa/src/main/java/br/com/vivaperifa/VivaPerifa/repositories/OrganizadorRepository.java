package br.com.vivaperifa.VivaPerifa.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;

import br.com.vivaperifa.VivaPerifa.models.OrganizadorModel;

public interface OrganizadorRepository extends MongoRepository<OrganizadorModel, String>{
    
}
