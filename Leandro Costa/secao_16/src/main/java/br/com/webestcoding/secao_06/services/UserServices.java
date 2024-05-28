package br.com.webestcoding.secao_06.services;

import java.util.logging.Logger;

import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.linkTo;
import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.methodOn;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import br.com.webestcoding.secao_06.controllers.PersonController;
import br.com.webestcoding.secao_06.data.vo.v1.PersonVO;
import br.com.webestcoding.secao_06.exceptions.ResourceNotFoundException;
import br.com.webestcoding.secao_06.mapper.DozerMapper;
import br.com.webestcoding.secao_06.model.Person;
import br.com.webestcoding.secao_06.repositories.PersonRepository;

@Service
public class UserServices implements UserDetailsService{
	private static final Logger logger = Logger.getLogger(UserServices.class.getName());

	PersonRepository repository;

	public UserServices(PersonRepository repository) {
		this.repository = repository;
	}

	public PersonVO findById(Long id) {
		Person person = this.repository.findById(id).orElseThrow(() -> new ResourceNotFoundException("ID não encontrado!"));
		PersonVO personVO =  DozerMapper.parseObject(person, PersonVO.class);
		personVO.add(linkTo(methodOn(PersonController.class).findById(id)).withSelfRel());
		return personVO;
	}

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

	}
}
