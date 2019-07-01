package com.bitcamp.web.service;

import java.util.Optional;

import com.bitcamp.web.domain.CustomerDTO;
//import com.bitcamp.web.common.util.PageProxy;
import com.bitcamp.web.entities.Customer;
import com.bitcamp.web.repositories.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * CustomerServiceImp
 */
@Service
public class CustomerService {
    @Autowired CustomerRepository customerRepository;
    
    public Long count(){
        return customerRepository.count();
    }
    public void delete(Customer entity){
        customerRepository.delete(entity);
    }
    public void deleteAll(){
        customerRepository.deleteAll();
    }
    public void deleteAll(Iterable<Customer> entities){
        customerRepository.deleteAll(entities);
    }
    public void deleteById(Long id){
        customerRepository.deleteById(id);
    }
    public boolean existsById(Long id){
        return customerRepository.existsById(id);
    }
    public Iterable<Customer> findAll(){
        return customerRepository.findAll();
    }
    public Iterable<Customer> findAllById(Iterable<Long> ids){
        return customerRepository.findAllById(ids);
    }
    public Optional<Customer> findById(Long id){
        return customerRepository.findById(id);
    }
    public Customer save(Customer entity){
        return customerRepository.save(entity);
    }
    public Iterable<Customer> saveAll(Iterable<Customer> entities){
        return customerRepository.saveAll(entities);
    }

    /*jpa 
    public Long count(){
       return customerRepository.count(); 
    }
    public void deleteById(Customer customer){
        customerRepository.delete(customer);
    }
    public void delete(Iterable<Customer> it){
        customerRepository.deleteAll(it);
    }
    public void deleteAll(){
        customerRepository.deleteAll();;
    }
    public boolean exists(Long id){
        return customerRepository.existsById(id);
    }
    public Iterable<Customer> findAll(){
        return customerRepository.findAll();
    }
    public Iterable<Customer> findAll(Iterable<Customer> it){
        return  findAll(it);
    }
    public Optional<Customer> findById(Long id){
        return customerRepository.findById(id);
    }
    public Iterable<Customer> saveAll(Iterable<Customer> it){
        return customerRepository.saveAll(it);
    }
    public Customer save(Customer customer){
        return customerRepository.save(customer);
    }
    public Optional<Customer> findByCustomerId(Long customerId){
        return customerRepository.findById(customerId);
    }
    */
}
