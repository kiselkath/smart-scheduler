package org.example.web;

import org.example.model.Person;
import org.example.repo.PersonRepo;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@RestController
@RequestMapping("/people")
public class PersonController {
    private final PersonRepo repo;

    public PersonController(PersonRepo repo) {
        this.repo = repo;
    }

    @GetMapping("/{id}")
    public Optional<Person> getPerson(@PathVariable Long id){
        return repo.findById(id);
    }

    @PostMapping
    public Person createPerson(@RequestBody Person person){
        return repo.save(person);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Object> deletePerson(@PathVariable Long id){
        if (repo.existsById(id)) {
            repo.deleteById(id);
            return ResponseEntity.noContent().build(); // 204 No Content
        } else {
            return ResponseEntity.notFound().build(); // 404 Not Found
        }
    }
}