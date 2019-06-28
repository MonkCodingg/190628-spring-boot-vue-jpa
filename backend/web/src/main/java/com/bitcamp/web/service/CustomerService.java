package com.bitcamp.web.service;

import java.util.ArrayList;
import java.util.List;
//import com.bitcamp.web.common.util.PageProxy;
import com.bitcamp.web.domain.CustomerDTO;
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
        
    }
 
    
    public List<CustomerDTO> findCustomers() {
        List<CustomerDTO> x = new ArrayList();
        return x;
    }

    
    public List<CustomerDTO> findCustomersByOption(CustomerDTO option) {
        List<CustomerDTO> x = new ArrayList();
        return x;
    }

    
    public CustomerDTO findCustomerByCustomerId(String customerId) {
        CustomerDTO dto = new CustomerDTO();
        return dto;
    }

    
    public int updateCustomer(CustomerDTO customer) {
 //       int res = customerMapper.updateCustomer(customer);
        int res =1;
        if (res == 1) {
            System.out.println("서비스 수정 성공");
        } else {
            System.out.println("서비스 수정 실패");
        }
        return 1;
    }

    
    public void deleteCustomer(CustomerDTO customer) {
 //       customerMapper.deleteCustomer(customer);
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

}