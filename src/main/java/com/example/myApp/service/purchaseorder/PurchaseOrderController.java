package com.example.myApp.service.purchaseorder;
import com.example.myApp.domain.purchaseorder.PurchaseOrderDto;
import io.swagger.v3.oas.annotations.Operation;
import org.springframework.web.bind.annotation.*;
import javax.annotation.Resource;
import java.util.List;

@RestController
public class PurchaseOrderController {

    @Resource
    private PurchaseOrderService purchaseOrderService;

    @PostMapping("/purchase/create")
    @Operation(summary = "Creates new purchase order.")
    public PurchaseOrderDto createPurchaseOrder(@RequestBody PurchaseOrderDto purchaseOrderDto) {
        return purchaseOrderService.createPurchaseOrder(purchaseOrderDto);
    }

    @GetMapping("/purchase/get")
    @Operation(summary = "Finds purchase by id")
    public PurchaseOrderDto findPurchaseById(@RequestParam Integer id) {
        return purchaseOrderService.findPurchaseById(id);
    }

    @GetMapping("/purchase/get/all")
    @Operation(summary = "Finds  all purchases")
    public List<PurchaseOrderDto> findAllPurchases() {
        return purchaseOrderService.findAllPurchases();
    }

    @PutMapping("/purchase/update")
    @Operation(summary = "Updates a purchase order")
    public void updatePurchaseOrderById(@RequestBody PurchaseOrderDto purchaseOrderDto, @RequestParam Integer id) {
        purchaseOrderService.updatePurchaseOrderById(purchaseOrderDto, id);
    }

    @DeleteMapping("/purchase/delete")
    @Operation(summary = "Deletes a purchase order")
    public void deletePurchaseOrderById(@RequestParam Integer id){
        purchaseOrderService.deletePurchaseOrderById(id);
    }
}
