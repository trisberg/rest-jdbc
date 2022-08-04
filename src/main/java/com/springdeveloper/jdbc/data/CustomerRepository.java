package com.springdeveloper.jdbc.data;

import java.util.List;

import org.springframework.data.jdbc.repository.query.Query;
import org.springframework.data.repository.CrudRepository;

public interface CustomerRepository extends CrudRepository<Customer, Long> {

	@Query("SELECT * FROM customer WHERE last_name = :lastName")
	List<Customer> findByLastname(String lastName);

	@Query("SELECT * FROM customer WHERE id = :id")
	Customer findById(long id);

}
