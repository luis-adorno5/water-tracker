package com.luisadorno.api.domain.log.model;

import lombok.*;

import javax.persistence.*;
import java.util.Date;
import java.util.Objects;

@Entity
@NoArgsConstructor
@Data
@ToString
public class Log {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Integer numberOfOz;

    @Temporal(TemporalType.TIMESTAMP)
    private Date date;

    public Log(Integer numberOfOz, Date date) {
        this.numberOfOz = numberOfOz;
        this.date = date;
    }

    @PrePersist
    protected void onCreate(){
        date = new Date();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Log log = (Log) o;
        return Objects.equals(id, log.id) && Objects.equals(numberOfOz, log.numberOfOz) && Objects.equals(date, log.date);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, numberOfOz, date);
    }
}
