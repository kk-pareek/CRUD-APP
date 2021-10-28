package com.example.crud.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.crud.Entity.*;

import java.util.List;

public interface BookRepository extends JpaRepository<Book, Long>{
    List<Book> findBybookId(Long id);
    List<Book> findBybookName(String bookName);
}
