package org.example.repo;

import org.example.model.Person;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonRepo extends CrudRepository<Person, Long> {
    // No need to write any code — CRUD methods are inherited:
    // - save()
    // - findById()
    // - findAll()
    // - deleteById()
    // - count()
}

