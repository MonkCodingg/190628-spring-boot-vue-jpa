package com.bitcamp.web.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

//import com.bitcamp.web.common.util.PageProxy;
import com.bitcamp.web.domain.CustomerDTO;
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
     
    public void addCustomer(Customer customer) {
        customerRepository.save(customer);
    }
 
    public List<CustomerDTO> findCustomers() {
        Iterable<Customer> customer = customerRepository.findAll();
        
        return null;
    }

    public List<CustomerDTO> findCustomersByOption(CustomerDTO option) {
        List<CustomerDTO> x = new ArrayList();
        return x;
    }
   
    public CustomerDTO findCustomerByCustomerId(String customerId) {
        
       return customerRepository.findByCustomerId(customerId);
    }
   
    public int updateCustomer(CustomerDTO customer) {
 
        int res =1;
        if (res == 1) {
            System.out.println("서비스 수정 성공");
        } else {
            System.out.println("서비스 수정 실패");
        }
        return 1;
    }
   
    public void deleteCustomer(CustomerDTO customer) {
 
    }
   
    public Long countAll() {
        return customerRepository.count();
    }
    
    public CustomerDTO login(CustomerDTO customer) { // 값이 아니라 인스턴스
        System.out.println("컨트롤러에서 넘어온 name: "+customer.getCustomerId());
        System.out.println("컨트롤러에서 넘어온 pass: "+customer.getPassword());
        CustomerDTO dto = new CustomerDTO();
        return dto;
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