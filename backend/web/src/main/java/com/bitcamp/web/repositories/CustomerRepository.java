package com.bitcamp.web.repositories;

import java.util.Optional;

import com.bitcamp.web.domain.CustomerDTO;
import com.bitcamp.web.entities.Customer;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * CustomerRepository
 */
@Repository
public interface CustomerRepository extends CrudRepository<Customer, Long> {  
    public CustomerDTO findByCustomerId(String customerId); 
    public CustomerDTO login(Customer customer);
}