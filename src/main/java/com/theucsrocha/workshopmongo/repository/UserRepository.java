package com.theucsrocha.workshopmongo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.theucsrocha.workshopmongo.domain.User;

@Repository
public class UserRepository extends MongoRepository<User, String> {

}
