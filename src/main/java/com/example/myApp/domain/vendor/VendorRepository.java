package com.example.myApp.domain.vendor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;


@Repository
public interface VendorRepository extends JpaRepository<Vendor, Integer> {

    @Query(("select o from Vendor o where o.id = ?1"))
    Optional<Vendor> findVendorById(Integer integer);

    @Query("select v from Vendor v where v.companyName = ?1")
    Vendor findByCompanyName(String companyName);










}