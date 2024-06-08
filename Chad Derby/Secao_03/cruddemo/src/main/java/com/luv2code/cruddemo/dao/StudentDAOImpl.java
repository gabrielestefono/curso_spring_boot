package com.luv2code.cruddemo.dao;

import java.util.List;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.luv2code.cruddemo.entity.Student;

import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;

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

  @Override
  public Student findbyId(Integer id) {
    return this.entityManager.find(Student.class, id);
  }

  @Override
  public List<Student> findAll() {
    // Create query

    TypedQuery<Student> theQuery = entityManager.createQuery("FROM Student", Student.class);

    // return results
    return theQuery.getResultList();
  }

  @Override
  public List<Student> findByLastName(String theLastName) {
    // Create a query
    TypedQuery<Student> theQuery = entityManager.createQuery("FROM Student WHERE lastName = :theData", Student.class);
    
    // set the parameter
    theQuery.setParameter("theData", theLastName);

    // return query results
    return theQuery.getResultList();
  }

  @Override
  @Transactional
  public void updateStudent(Student student) {
    entityManager.merge(student);
  }

  @Override
  @Transactional
  public void delete(Integer id) {
    // Retrieve the student 
    Student theStudent = entityManager.find(Student.class, id);

    // Delete the Student
    entityManager.remove(theStudent);
  }

  @Override
  @Transactional
  public int deleteAll() {
    return entityManager.createQuery("DELETE FROM Student").executeUpdate();
  }

  
}
