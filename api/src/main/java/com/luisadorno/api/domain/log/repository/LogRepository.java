package com.luisadorno.api.domain.log.repository;

import com.luisadorno.api.domain.log.model.Log;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LogRepository extends JpaRepository<Log, Long> {
}
