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
import com.example.crud_real_example.Service.SalesService;
import com.example.crud_real_example.Entity.Sales;


@RestController
public class SalesController {
    @Autowired(required = true)
    private SalesService salesService;

    @GetMapping("/")
    public String hey() {
        return "Welcome to Java Sales";
    }
    @PostMapping("/sales")
    public String addSales(@RequestBody Sales sales) {
    
        salesService.addSales(sales);
        return "Record Saved";
    }
    @GetMapping("/sales")
    public List<Sales> listSales() {

        return salesService.listOfSales();
    }
    @GetMapping("/sales/{id}")
    public Optional<Sales> listSales(@PathVariable Long sid) {

        return salesService.findSales(sid);
    }
    @PutMapping("/sales")
    public String updateSales(@RequestBody Sales sales) {
        
    	salesService.updateSales(sales);
        return "Record update";
    }
    @DeleteMapping("/sales")
    public String deleteSales(@RequestBody Sales sales) {
       
    	salesService.deleteSales(sales);
        return "Record Deleted";
    }
}