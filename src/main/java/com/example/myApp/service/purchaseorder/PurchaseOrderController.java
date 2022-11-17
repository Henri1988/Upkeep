package com.example.myApp.service.purchaseorder;
import com.example.myApp.domain.purchaseorder.PurchaseOrderDto;
import com.example.myApp.domain.vendor.VendorDto;
import io.swagger.v3.oas.annotations.Operation;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

@RestController
public class PurchaseOrderController {

    @Resource
    private PurchaseOrderService purchaseOrderService;

    @PostMapping("/purchase/create")
    @Operation(summary = "Creates new purchase order.")
    public PurchaseOrderDto createPurchaseOrder(@RequestBody PurchaseOrderDto purchaseOrderDto){
        return purchaseOrderService.createPurchaseOrder(purchaseOrderDto);
    }

    @GetMapping("/purchase/get")
    @Operation(summary = "Finds purchase by id")
    public PurchaseOrderDto findPurchaseById(@RequestParam Integer id){
        return purchaseOrderService.findPurchaseById(id);
    }
}
