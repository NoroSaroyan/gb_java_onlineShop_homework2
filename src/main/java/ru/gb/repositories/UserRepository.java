package ru.gb.repositories;

import org.springframework.data.repository.CrudRepository;
import ru.gb.entity.User;

import java.util.Optional;

public interface UserRepository extends CrudRepository<User, Long> {

    Optional<User> findByEmail(String email);
}