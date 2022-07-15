package com.luisadorno.api.domain.log.services;

import com.luisadorno.api.domain.core.exceptions.ResourceCreationException;
import com.luisadorno.api.domain.core.exceptions.ResourceNotFoundException;
import com.luisadorno.api.domain.log.model.Log;

import java.util.Date;

public interface LogService {
    Log create(Long personId, Log log) throws ResourceCreationException;
    Iterable<Log> getByDate(Long personId, Date date) throws ResourceNotFoundException;
    Iterable<Log> getAllLogs();
}
