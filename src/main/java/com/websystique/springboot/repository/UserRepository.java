package com.websystique.springboot.repository;

import com.websystique.springboot.model.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends MongoRepository<User, Long> {
    void deleteById(Long id);
    boolean existsByName(String name);
}
