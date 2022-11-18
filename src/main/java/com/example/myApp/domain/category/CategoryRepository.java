package com.example.myApp.domain.category;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.Optional;


public interface CategoryRepository extends JpaRepository<Category, Integer> {

    @Query("select c from Category c where c.id = ?1")
    Category findByCategoryId(Integer id);

}