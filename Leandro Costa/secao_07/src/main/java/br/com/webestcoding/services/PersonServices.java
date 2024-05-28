package br.com.webestcoding.services;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;
import java.util.logging.Logger;

import org.springframework.stereotype.Service;

import br.com.webestcoding.model.Person;

@Service
public class PersonServices {
	private final AtomicLong counter = new AtomicLong();
	private Logger logger = Logger.getLogger(PersonServices.class.getName());

	public List<Person> findAll() {
		logger.info("Finding All Persons");
		List<Person> persons = new ArrayList<>();
		for (int i = 0; i < 8; i++) {
			Person person = mockPerson(i);
			persons.add(person);
		}
		return persons;
	}

	public Person findById(String id) {
		logger.info("Finding One Person");
		logger.info(id);
		Person person = new Person();
		person.setId(counter.incrementAndGet());
		person.setFirstName("Leandro");
		person.setLastName("Costa");
		person.setAddress("Uberlância MG - Brasil");
		person.setGender("Male");
		return person;
	}

	public Person create(Person person) {
		logger.info("Create One Person");
		return person;
	}

	public Person update(String id, Person person) {
		logger.info("Update One Person");
		return person;
	}

	public void delete(String id) {
		logger.info("Delete One Person");
	}

	private Person mockPerson(int i) {
		Person person = new Person();
		person.setId(counter.incrementAndGet());
		person.setFirstName("PersonName " + i);
		person.setLastName("Lastname " + i);
		person.setAddress("Some Address in Brasil");
		person.setGender(i % 2 == 0 ? "Male" : "Female");
		return person;
	}
}
