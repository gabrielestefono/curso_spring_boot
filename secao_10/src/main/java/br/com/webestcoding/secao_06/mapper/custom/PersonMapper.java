package br.com.webestcoding.secao_06.mapper.custom;

import java.util.Date;

import org.springframework.stereotype.Service;

import br.com.webestcoding.secao_06.data.vo.v2.PersonVOV2;
import br.com.webestcoding.secao_06.model.Person;

@Service
public class PersonMapper {
	public PersonVOV2 convertEntityToVO(Person person){
		PersonVOV2 vo = new PersonVOV2();
		vo.setAddress(person.getAddress());
		vo.setFirstName(person.getFirstName());
		vo.setGender(person.getGender());
		vo.setId(person.getId());
		vo.setLastName(person.getLastName());
		vo.setBirthday(new Date());
		return vo;
	}

	public Person convertVOToEntity(PersonVOV2 vo){
		Person person = new Person();
		person.setAddress(vo.getAddress());
		person.setFirstName(vo.getFirstName());
		person.setGender(vo.getGender());
		person.setId(vo.getId());
		person.setLastName(vo.getLastName());
		return person;
	}
}
