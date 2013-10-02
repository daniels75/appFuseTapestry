package org.daniels.samples.webapp.service.impl;

import java.util.List;

import javax.jws.WebService;

import org.appfuse.service.impl.GenericManagerImpl;
import org.daniels.samples.webapp.dao.PersonDao;
import org.daniels.samples.webapp.model.Person;
import org.daniels.samples.webapp.service.PersonManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("personManager")
@WebService(serviceName = "PersonService", endpointInterface = "org.daniels.samples.webapp.service.PersonManager")
public class PersonManagerImpl extends GenericManagerImpl<Person, Long> implements PersonManager {
    PersonDao personDao;

    public PersonManagerImpl() {}

    @Autowired
    public PersonManagerImpl(PersonDao personDao) {
        super(personDao);
        this.personDao = personDao;
    }

    public List<Person> findByLastName(String lastName) {
        return personDao.findByLastName(lastName);
    }

    public List<Person> getPeople() {
        return personDao.getAll();
    }
}