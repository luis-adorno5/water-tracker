package com.luisadorno.api.domain.log.services;

import com.luisadorno.api.domain.core.exceptions.ResourceCreationException;
import com.luisadorno.api.domain.core.exceptions.ResourceNotFoundException;
import com.luisadorno.api.domain.log.model.Log;
import com.luisadorno.api.domain.log.repository.LogRepository;
import com.luisadorno.api.domain.person.model.Person;
import com.luisadorno.api.domain.person.services.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
public class LogServiceImpl implements LogService{

    private LogRepository logRepository;
    private PersonService personService;

    @Autowired
    public LogServiceImpl(LogRepository logRepository, PersonService personService) {
        this.logRepository = logRepository;
        this.personService = personService;
    }

    @Override
    public Log create(Long personId, Log log) throws ResourceCreationException {
        Person person = personService.getPersonById(personId);
        log.setPerson(person);
        return logRepository.save(log);
    }

    @Override
    public Iterable<Log> getByDate(Long personId, Date date) throws ResourceNotFoundException {
        return null;
    }

    @Override
    public Iterable<Log> getAllLogs() {
        return null;
    }
}
