package com.example.myApp.service.purchaseorder;


import com.example.myApp.domain.category.Category;
import com.example.myApp.domain.category.CategoryRepository;
import com.example.myApp.domain.partsandinventory.parts.Part;
import com.example.myApp.domain.partsandinventory.parts.PartRepository;
import com.example.myApp.domain.purchaseorder.PurchaseOrder;
import com.example.myApp.domain.purchaseorder.PurchaseOrderDto;
import com.example.myApp.domain.purchaseorder.PurchaseOrderMapper;
import com.example.myApp.domain.purchaseorder.PurchaseOrderRepository;
import com.example.myApp.domain.vendor.Vendor;
import com.example.myApp.domain.vendor.VendorRepository;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Optional;


@Service
public class PurchaseOrderService {
    @Resource
    private PurchaseOrderRepository purchaseOrderRepository;
    @Resource
    private CategoryRepository categoryRepository;
    @Resource
    private VendorRepository vendorRepository;
    @Resource
    private PartRepository partRepository;
    @Resource
    private PurchaseOrderMapper purchaseOrderMapper;


    public PurchaseOrderDto createPurchaseOrder(PurchaseOrderDto purchaseOrderDto) {

        PurchaseOrder purchaseOrder = purchaseOrderMapper.toEntity(purchaseOrderDto);

        Optional<Category> category = categoryRepository.findByCategoryId(purchaseOrderDto.getCategoryId());
        Optional<Vendor> vendor =vendorRepository.findVendorById(purchaseOrderDto.getVendorId());
        Optional<Part> part=partRepository.findPartById(purchaseOrderDto.getPartId());
        purchaseOrder.setCategory(category.get());
        purchaseOrder.setVendor(vendor.get());
        purchaseOrder.setPart(part.get());

        purchaseOrderRepository.save(purchaseOrder);
        return purchaseOrderMapper.toDto(purchaseOrder);
    }


    public PurchaseOrderDto findPurchaseById(Integer id) {
        Optional<PurchaseOrder> purchaseOrder = purchaseOrderRepository.findByPurchaseOrderId(id);
        return purchaseOrderMapper.toDto(purchaseOrder.get());
    }

    public List<PurchaseOrderDto> findAllPurchases() {
        List<PurchaseOrder> orders =purchaseOrderRepository.findAllPurchases();
        return purchaseOrderMapper.toDtos(orders);
    }

    public void updatePurchaseOrderById(PurchaseOrderDto purchaseOrderDto, Integer id) {
        Optional<PurchaseOrder> purchaseOrder = purchaseOrderRepository.findByPurchaseOrderId(id);
        purchaseOrderMapper.updatePurchaseOrderFromPurchaseOrderDto(purchaseOrderDto, purchaseOrder.get());
        purchaseOrderRepository.save(purchaseOrder.get());
    }

    public void deletePurchaseOrderById(Integer id) {
        Optional<PurchaseOrder> purchaseOrder = purchaseOrderRepository.findByPurchaseOrderId(id);
        purchaseOrderRepository.delete(purchaseOrder.get());
    }
}
