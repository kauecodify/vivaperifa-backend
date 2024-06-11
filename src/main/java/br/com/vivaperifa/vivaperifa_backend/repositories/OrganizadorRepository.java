package br.com.vivaperifa.vivaperifa_backend.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;

import br.com.vivaperifa.vivaperifa_backend.models.OrganizadorModel;

public interface OrganizadorRepository extends MongoRepository<OrganizadorModel, String>{
    
}