package ru.ugtel.dao;

import java.util.Date;
import java.util.List;
 
import ru.ugtel.entity.Person;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
 
@Repository
public interface PersonDAO extends CrudRepository<Person, Long> {
 
    public List<Person> findByFullNameLike(String name);
 
    public List<Person> findByDateOfBirthGreaterThan(Date date);
 
}