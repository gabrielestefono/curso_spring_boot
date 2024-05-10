package br.com.webestcoding.secao_06.services;

import java.util.List;
import java.util.logging.Logger;

import org.springframework.stereotype.Service;

import br.com.webestcoding.secao_06.data.vo.v1.PersonVO;
import br.com.webestcoding.secao_06.exceptions.ResourceNotFoundException;
import br.com.webestcoding.secao_06.mapper.DozerMapper;
import br.com.webestcoding.secao_06.model.Person;
import br.com.webestcoding.secao_06.repositories.PersonRepository;

@Service
public class PersonServices {
	private Logger logger = Logger.getLogger(PersonServices.class.getName());

	PersonRepository repository;

	public PersonServices(PersonRepository repository) {
		this.repository = repository;
	}

	public List<PersonVO> findAll() {
		logger.info("Finding All Persons");
		return DozerMapper.parseListObjects(this.repository.findAll(), PersonVO.class);
	}

	public PersonVO findById(Long id) {
		Person person = this.repository.findById(id).orElseThrow(() -> new ResourceNotFoundException("ID não encontrado!"));
		return DozerMapper.parseObject(person, PersonVO.class);
	}

	public PersonVO create(PersonVO person) {
		logger.info("Create One PersonVO");
		Person personSave = DozerMapper.parseObject(person, Person.class);
		return DozerMapper.parseObject(this.repository.save(personSave), PersonVO.class);
	}

	public PersonVO update(Long id, PersonVO person) {
		logger.info("Update One PersonVO");
		PersonVO personFound = this.findById(id);
		Person personFoundData = DozerMapper.parseObject(personFound, Person.class);
		personFoundData.setFirstName(person.getFirstName());
		personFoundData.setLastName(person.getLastName());
		personFoundData.setGender(person.getGender());
		personFoundData.setAddress(person.getAddress());
		return DozerMapper.parseObject(this.repository.save(personFoundData), PersonVO.class);
	}

	public void delete(Long id) {
		Person person = DozerMapper.parseObject(this.findById(id), Person.class);
		this.repository.delete(person);
	}
}
