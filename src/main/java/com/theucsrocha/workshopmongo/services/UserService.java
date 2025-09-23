package com.theucsrocha.workshopmongo.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.theucsrocha.workshopmongo.domain.User;
import com.theucsrocha.workshopmongo.repository.UserRepository;
import com.theucsrocha.workshopmongo.services.exception.ObjectNotFoundException;

@Service
public class UserService {

	@Autowired
	private UserRepository repo;

	public List<User> findAll() {
		return repo.findAll();

	}
	
	public User findById(String id) {
	    Optional<User> userOptional = repo.findById(id);

	    if (userOptional.isPresent()) {
	        return userOptional.get();
	    } else {
	        throw new ObjectNotFoundException("Objeto não encontrado");
	    }
	}
}
