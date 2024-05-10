package br.com.webestcoding.secao_06.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.webestcoding.secao_06.model.Person;

@Repository
public interface PersonRepository extends JpaRepository<Person, Long> {
}
