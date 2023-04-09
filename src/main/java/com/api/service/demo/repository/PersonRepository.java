package com.api.service.demo.repository;

import com.api.service.demo.model.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

/**
 * @author tobi
 * @Date : 9/4/2023
 * @Time : 9:24 PM
 * @desc : ...
 */
public interface PersonRepository extends JpaRepository<Person, Long>, JpaSpecificationExecutor<Person> {
}
