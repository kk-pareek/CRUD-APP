package com.example.crud_real_example.Repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.crud_real_example.Entity.Sales;

@Repository  // Repository bean, my Complete Hibernate configuration 
public interface SalesRepository extends JpaRepository<Sales, Long>{

}