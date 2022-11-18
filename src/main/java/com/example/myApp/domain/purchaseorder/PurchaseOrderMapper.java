package com.example.myApp.domain.purchaseorder;

import org.mapstruct.*;

import java.util.List;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = "spring")
public interface PurchaseOrderMapper {
    @Mapping(source = "vendorId", target = "vendor.id")
    @Mapping(source = "categoryId", target = "category.id")
    @Mapping(source = "partId", target = "part.id")
    @Mapping(target = "id", ignore = true)
    PurchaseOrder toEntity(PurchaseOrderDto purchaseOrderDto);

    @InheritInverseConfiguration(name = "toEntity")
    PurchaseOrderDto toDto(PurchaseOrder purchaseOrder);

    List<PurchaseOrderDto> toDtos(List<PurchaseOrder> order);

    @InheritConfiguration(name = "toEntity")
    @Mapping(target = "id", ignore = true)
    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    PurchaseOrder updatePurchaseOrderFromPurchaseOrderDto(PurchaseOrderDto purchaseOrderDto, @MappingTarget PurchaseOrder purchaseOrder);
}
