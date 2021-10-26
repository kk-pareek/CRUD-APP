package com.example.crud_real_example.Service;
import java.util.List;
import java.util.Optional;
 
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.crud_real_example.Repository.SalesRepository;
import com.example.crud_real_example.Entity.Sales;


@Service
public class SalesService {
    @Autowired
    private SalesRepository repository; // injection using constructor

    public Sales addSales(Sales sales) {
        return repository.save(sales);
    }
    public Optional<Sales> findSales(Long sId) {
        return repository.findById(sId);
    }
    public List<Sales> listOfSales() {
        return repository.findAll();
    }
    public void  deleteSales(Sales sales) {
        repository.delete(sales);
    }
    public void updateSales(Sales sales) {
        // TODO Auto-generated method stub
        repository.save(sales);
    }
}