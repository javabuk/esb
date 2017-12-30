package esb.repositorios;

import org.springframework.data.mongodb.repository.MongoRepository;

import esb.entidades.Error;

//@Repository
public interface MongoErrorRepositorio extends MongoRepository<Error, String> {

}
