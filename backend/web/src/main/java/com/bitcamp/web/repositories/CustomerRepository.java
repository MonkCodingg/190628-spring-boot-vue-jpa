package com.bitcamp.web.repositories;

import com.bitcamp.web.domain.CustomerDTO;
import com.bitcamp.web.entities.Customer;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * CustomerRepository
 */
@Repository
public interface CustomerRepository extends CrudRepository<Customer, Long> {//<엔터티, 롱> 
    public CustomerDTO findByCustomerId(String customerId);
    public CustomerDTO findByPassword(String password);
	public Customer findByCustomerIdAndPassword(String customerId, String password);
}