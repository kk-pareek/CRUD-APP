package com.example.crud_real_example.Controller;

import java.util.List;
import java.util.Optional;
 
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.example.crud_real_example.Service.CustomerService;
import com.example.crud_real_example.Entity.Customers;

@RestController
public class CustomerController {
    @Autowired(required = true)
    private CustomerService customerService;

//    @GetMapping("/")
//    public String welcome() {
//        return "Welcome to Java Customer";
//    }
    @PostMapping("/customer")
    public String addCustomer(@RequestBody Customers customer) {
    
        customerService.addCustomer(customer);
        return "Record Saved";
    }
    @GetMapping("/customer")
    public List<Customers> listCustomer() {

        return customerService.listOfCustomers();
    }
    @GetMapping("/customer/{id}")
    public Optional<Customers> listCustomer(@PathVariable Long cid) {

        return customerService.findCustomer(cid);
    }
    @PutMapping("/customer")
    public String updateCustomer(@RequestBody Customers customer) {
        
    	customerService.updateCustomer(customer);
        return "Record update";
    }
    @DeleteMapping("/customer")
    public String deleteCustomer(@RequestBody Customers customer) {
       
    	customerService.deleteCustomer(customer);
        return "Record Deleted";
    }
}