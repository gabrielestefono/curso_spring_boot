package br.com.webestcoding.secao_06.services;

import java.util.List;
import java.util.concurrent.atomic.AtomicLong;
import java.util.logging.Logger;

import org.springframework.stereotype.Service;

import br.com.webestcoding.secao_06.exceptions.ResourceNotFoundException;
import br.com.webestcoding.secao_06.model.Person;
import br.com.webestcoding.secao_06.repositories.PersonRepository;

@Service
public class PersonServices {
	private final AtomicLong counter = new AtomicLong();
	private Logger logger = Logger.getLogger(PersonServices.class.getName());

	PersonRepository repository;

	public PersonServices(PersonRepository repository) {
		this.repository = repository;
	}

	public List<Person> findAll() {
		logger.info("Finding All Persons");
		return this.repository.findAll();
	}

	public Person findById(Long id) {
		return this.repository.findById(id).orElseThrow(() -> new ResourceNotFoundException("ID não encontrado!"));
	}

	public Person create(Person person) {
		logger.info("Create One Person");
		return this.repository.save(person);
	}

	public Person update(Long id, Person person) {
		logger.info("Update One Person");
		Person personFound = this.findById(id);
		personFound.setFirstName(person.getFirstName());
		personFound.setLastName(person.getLastName());
		personFound.setGender(person.getGender());
		personFound.setAddress(person.getAddress());
		return this.repository.save(personFound);
	}

	public void delete(Long id) {
		Person person = this.findById(id);
		this.repository.delete(person);
	}
}
