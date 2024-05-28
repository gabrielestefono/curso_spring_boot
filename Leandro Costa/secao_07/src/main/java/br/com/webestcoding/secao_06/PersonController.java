package br.com.webestcoding.secao_06;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import br.com.webestcoding.model.Person;
import br.com.webestcoding.services.PersonServices;

@RestController
@RequestMapping("/person")
public class PersonController {
    private PersonServices service;

    public PersonController(PersonServices service) {
        this.service = service;
    }

    @GetMapping("")
    public List<Person> findAll() {
        return service.findAll();
    }

    @GetMapping("/{id}")
    public Person findById(@PathVariable("id") String id) {
        return service.findById(id);
    }

    @PostMapping("")
    @ResponseStatus(HttpStatus.CREATED)
    public Person create(@RequestBody Person person) {
        return service.create(person);
    }

    @PutMapping("/{id}")
    @ResponseStatus(HttpStatus.CREATED)
    public Person update(@PathVariable("id") String id, @RequestBody Person person) {
        return service.update(id, person);
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void delete(@PathVariable("id") String id) {
        service.delete(id);
    }
}
