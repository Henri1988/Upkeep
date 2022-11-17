package com.example.myApp.domain.purchaseorder;

import org.mapstruct.*;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = "spring")
public interface PurchaseOrderMapper {
    @Mapping(source = "vendorId", target = "vendor.id")
    @Mapping(source = "categoryId", target = "category.id")
    @Mapping(source = "partId", target = "part.id")
    PurchaseOrder purchaseOrderDtoToPurchaseOrder(PurchaseOrderDto purchaseOrderDto);

    @InheritInverseConfiguration(name = "purchaseOrderDtoToPurchaseOrder")
    PurchaseOrderDto purchaseOrderToPurchaseOrderDto(PurchaseOrder purchaseOrder);

    @InheritConfiguration(name = "purchaseOrderDtoToPurchaseOrder")
    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    PurchaseOrder updatePurchaseOrderFromPurchaseOrderDto(PurchaseOrderDto purchaseOrderDto, @MappingTarget PurchaseOrder purchaseOrder);
}
