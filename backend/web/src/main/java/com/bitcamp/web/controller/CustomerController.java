package com.bitcamp.web.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import javax.persistence.EntityNotFoundException;
import com.bitcamp.web.common.lambda.ISupplier;
import com.bitcamp.web.domain.CustomerDTO;
import com.bitcamp.web.entities.Customer;
import com.bitcamp.web.repositories.CustomerRepository;
import com.bitcamp.web.service.CustomerService;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

/**
 * CustomerController
 */
// @Controller soap방식
//@CrossOrigin(origins = "http://localhost:8080", maxAge = 3600)
@CrossOrigin(origins = "http://localhost:3000", maxAge = 3600)
@RestController // controller 자식 : 기능 추가될 수록 자식.
@RequestMapping("/customers")
public class CustomerController {
    
    /**
     *
     */

    private static final HashMap<String, String> HASH_MAP = new HashMap<>();
    @Autowired
    CustomerService customerService;
    @Autowired
    CustomerDTO customer;
    @Autowired
    ModelMapper modelMapper;
    @Autowired
    CustomerRepository repo;

    // @Bean
    // public ModelMapper modelMapper(){
    // ModelMapper modelMapper = new ModelMapper ();
    // return modelMapper;
    // }

    @Bean
    public ModelMapper modelMapper() {
        return new ModelMapper();
    }

    @GetMapping("/count")
    public Long count() {
        return customerService.count();
    }

    /*
     * @DeleteMapping("/{id}") public void delete(CustomerDTO dto){
     * customerService.delete(null); }
     * 
     * @DeleteMapping("/{id}") public void deleteAll(){
     * customerService.deleteAll();//트랜잭션 걸림. }
     * 
     * @DeleteMapping("/{id}") public void deleteAll(Iterable<CustomerDTO> dtos){
     * customerService.deleteAll(null);//트랜잭션 걸림. }
     */
    
    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable Long id) {
        System.out.println("deleteById 함수 들어옴 id: "+ id);
        customerService.deleteById(id);
    }

    @GetMapping("/exists/{id}")
    public boolean existsById(@PathVariable String id) {
        Long l = Long.parseLong(id);
        return customerService.existsById(l);
    }

    @GetMapping("")
    public Iterable<CustomerDTO> findAll() {
        System.out.println("findAll 들어옴");

        Iterable<Customer> entities = customerService.findAll();
        List<CustomerDTO> list = new ArrayList<>();
        for (Customer s : entities) {
            CustomerDTO cust = modelMapper.map(s, CustomerDTO.class);
            list.add(cust);
        }
        System.out.println(list);
        return list;

    }

    /*
     * @GetMapping("/{id}")//id 모든 게시글 가져오기 public Iterable<CustomerDTO>
     * findAllById(Iterable<Long> ids){ Iterable<Customer> entity =
     * customerService.findAllById(ids); return null; }
     */
    @GetMapping("/{id}")
    public CustomerDTO findById(@PathVariable String id) {
        System.out.println("findById 들어온 아이디: " + id);
        Customer entity = customerService.findById(Long.parseLong(id)).orElseThrow(EntityNotFoundException::new);
        System.out.println(">>>>" + entity.toString());
        CustomerDTO c = modelMapper.map(entity, CustomerDTO.class);
        System.out.println("조회 결과: " + c.toString());
        return c;
    }

    @PostMapping("")
    public HashMap<String, String> save(@RequestBody CustomerDTO dto){
        System.out.println("save 들어옴" + dto.toString());
        HashMap<String, String> map = new HashMap<>();

        Customer entity = new Customer();
        entity.setAddress(dto.getAddress());
        entity.setCity(dto.getCity());
        entity.setCustomerId(dto.getCustomerId());
        entity.setCustomerName(dto.getCustomerName());
        entity.setPassword(dto.getPassword());
        entity.setPhone(dto.getPhone());
        entity.setPhoto(dto.getPhoto());
        entity.setPostalcode(dto.getPostalcode());
        entity.setSsn(dto.getSsn());
        //Customer entity = BeanUtils.copyProperties(dto, new Customer());
        //Customer entity = modelMapper.map(dto, Customer.class);
        System.out.println("엔티티로 바뀐 정보: "+ entity.toString());
        customerService.save(entity);
        map.put("result", "SUCCESS");
        return map;
    }
   /*  @PutMapping("/")
    public Iterable<CustomerDTO> saveAll(Iterable<CustomerDTO> dtos){
        Iterable<Customer> entities =customerService.saveAll(dtos);
        return null;
    } */

    @PostMapping("/login")// post -> requestbody
    public CustomerDTO login(@RequestBody CustomerDTO dto){
        System.out.println("로그인 진입");
        System.out.println("ID: "+dto.getCustomerId());
        System.out.println("PW: "+dto.getPassword());
        ISupplier fx = (()-> {
            return repo.findByCustomerIdAndPassword(dto.getCustomerId(), 
            dto.getPassword());
        });
        return modelMapper.map(fx.get(), CustomerDTO.class);
    }
    
}