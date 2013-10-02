package org.daniels.samples.webapp.dao;

import java.util.List;

import org.appfuse.dao.GenericDao;
import org.daniels.samples.webapp.model.Person;

public interface PersonDao extends GenericDao<Person, Long> {
    public List<Person> findByLastName(String lastName);
}