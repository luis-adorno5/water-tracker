package com.luisadorno.api.domain.person.repository;

import com.luisadorno.api.domain.person.model.Person;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface PersonRepository extends JpaRepository<Person, Long> {
    Optional<Person> findByUserName(String username);
}
