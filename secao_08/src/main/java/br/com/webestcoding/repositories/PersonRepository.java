package br.com.webestcoding.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.webestcoding.model.Person;

@Repository
public interface PersonRepository extends JpaRepository<Person, Long> {
}
