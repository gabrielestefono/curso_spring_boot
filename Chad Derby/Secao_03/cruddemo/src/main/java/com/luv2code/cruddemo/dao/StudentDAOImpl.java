package com.luv2code.cruddemo.dao;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.luv2code.cruddemo.entity.Student;

import jakarta.persistence.EntityManager;

@Repository
public class StudentDAOImpl implements StudentDAO {

  // Define field for entity manager
  private final EntityManager entityManager;

  // Inject entity manager using constructor injection
  public StudentDAOImpl(EntityManager entityManager) {
    this.entityManager = entityManager;
  }

  /// Implement the save method
  @Override
  @Transactional
  public void save(Student theStudent) {
    this.entityManager.persist(theStudent);
  }
}
