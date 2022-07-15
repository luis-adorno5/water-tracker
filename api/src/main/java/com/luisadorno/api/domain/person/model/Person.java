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

    private String userName;

    private Integer age;

    private Double weight;

    public Person(String firstName, String lastName, String userName, Integer age, Double weight) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.userName = userName;
        this.age = age;
        this.weight = weight;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return Objects.equals(id, person.id) && Objects.equals(firstName, person.firstName) && Objects.equals(lastName, person.lastName) && Objects.equals(age, person.age) && Objects.equals(weight, person.weight);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, firstName, lastName, age, weight);
    }
}
