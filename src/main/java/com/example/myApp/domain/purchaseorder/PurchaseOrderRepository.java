package com.example.myApp.domain.purchaseorder;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
import java.util.Optional;

public interface PurchaseOrderRepository extends JpaRepository<PurchaseOrder, Integer> {

    @Query("select p from PurchaseOrder p where p.id = ?1")
    PurchaseOrder findByPurchaseOrderId(Integer id);


    @Query("select p from PurchaseOrder p")
    List<PurchaseOrder> findAllPurchases();



}