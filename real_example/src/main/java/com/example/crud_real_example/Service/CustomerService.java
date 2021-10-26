package com.example.crud_real_example.Service;
import java.util.List;
import java.util.Optional;
 
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.crud_real_example.Repository.CustomerRepository;
import com.example.crud_real_example.Entity.Customers;

@Service
public class CustomerService {
    @Autowired
    private CustomerRepository repository; // injection using constructor

    public Customers addCustomer(Customers customer) {
        return repository.save(customer);
    }
    public Optional<Customers> findCustomer(Long cId) {
        return repository.findById(cId);
    }
    public List<Customers> listOfCustomers() {
        return repository.findAll();
    }
    public void  deleteCustomer(Customers customer) {
        repository.delete(customer);
    }
    public void updateCustomer(Customers customer) {
        // TODO Auto-generated method stub
        repository.save(customer);
    }
}