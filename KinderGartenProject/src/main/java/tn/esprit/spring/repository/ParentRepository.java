package tn.esprit.spring.repository;

import org.springframework.data.repository.CrudRepository; 
import org.springframework.stereotype.Repository;

import tn.esprit.spring.entities.Parent;


import org.springframework.data.jpa.repository.JpaRepository;

import tn.esprit.spring.entities.Parent;

@Repository
public interface ParentRepository extends JpaRepository<Parent,Long> {

}
