package com.luisadorno.api.domain.person.model;

import com.luisadorno.api.domain.log.model.Log;
import lombok.*;

import javax.persistence.*;
import java.util.Objects;
import java.util.Set;

@Entity
@NoArgsConstructor
@Data
@ToString
public class Person {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String firstName;

    private String lastName;

    private Integer age;

    private Double weight;

    @OneToMany(cascade = CascadeType.ALL)
    private Set<Log> logs;

    public Person(String firstName, String lastName, Integer age, Double weight, Set<Log> logs) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.weight = weight;
        this.logs = logs;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return Objects.equals(id, person.id) && Objects.equals(firstName, person.firstName) && Objects.equals(lastName, person.lastName) && Objects.equals(age, person.age) && Objects.equals(weight, person.weight) && Objects.equals(logs, person.logs);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, firstName, lastName, age, weight, logs);
    }
}
