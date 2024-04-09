package com.salesjose.workshopmongodb.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.salesjose.workshopmongodb.domain.User;
import com.salesjose.workshopmongodb.dto.UserDTO;
import com.salesjose.workshopmongodb.repositories.UserRepository;
import com.salesjose.workshopmongodb.services.exceptions.ObjectNotFoundException;

@Service
public class UserService {

    @Autowired
    private UserRepository repo;

    public List<User> findAll() {
        return repo.findAll();
    }

    public User findById(String id) {
        Optional<User> user = repo.findById(id);
        return user.orElseThrow(() -> new ObjectNotFoundException("Objeto nao encontrado"));
    }

    public User insert(User user) {
        return repo.insert(user);
    }

    public User fromDto(UserDTO userDto) {
        return new User(userDto.getId(), userDto.getName(), userDto.getEmail());
    }

    public void delete(String id) {
        findById(id);
        repo.deleteById(id);
    }
}
