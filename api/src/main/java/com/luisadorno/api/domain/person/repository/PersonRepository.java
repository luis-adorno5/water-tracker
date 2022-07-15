package com.luisadorno.api.domain.person.repository;

import com.luisadorno.api.domain.person.model.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonRepository extends JpaRepository<Person, Long> {
}
