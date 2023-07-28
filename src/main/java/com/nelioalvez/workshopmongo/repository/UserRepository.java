package com.nelioalvez.workshopmongo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.nelioalvez.workshopmongo.domain.User;

@Repository
public interface UserRepository extends MongoRepository<User, String>{

}
