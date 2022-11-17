package com.example.myApp.service.purchaseorder;


import com.example.myApp.domain.purchaseorder.PurchaseOrderDto;
import io.swagger.v3.oas.annotations.Operation;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class PurchaseOrderController {

    @Resource
    private PurchaseOrderService purchaseOrderService;

    @PostMapping("/purchase/create")
    @Operation(summary = "Creates new purchase order.")
    public PurchaseOrderDto createPurchaseOrder(PurchaseOrderDto purchaseOrderDto){
        return purchaseOrderService.createPurchaseOrder(purchaseOrderDto);

    }
}
