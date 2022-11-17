package com.example.myApp.domain.partsandinventory.parts;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.Optional;


public interface PartRepository extends JpaRepository<Part, Integer> {
    @Query("select p from Part p where p.id = ?1")
    Optional<Part> findPartById(Integer id);




}