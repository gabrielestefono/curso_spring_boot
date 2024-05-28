package br.com.webestcoding.secao_06.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.webestcoding.secao_06.model.Book;

@Repository
public interface BookRepository extends JpaRepository<Book, Long>{

}
