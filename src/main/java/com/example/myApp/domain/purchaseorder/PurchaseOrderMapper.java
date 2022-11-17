package com.example.myApp.domain.purchaseorder;

import org.mapstruct.*;

import java.util.List;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = "spring")
public interface PurchaseOrderMapper {
    @Mapping(source = "vendorId", target = "vendor.id")
    @Mapping(source = "vendorCompanyName", target = "vendor.companyName")
    @Mapping(source = "vendorAddress", target = "vendor.address")
    @Mapping(source = "vendorPhone", target = "vendor.phone")
    @Mapping(source = "vendorWebsite", target = "vendor.website")
    @Mapping(source = "vendorName", target = "vendor.name")
    @Mapping(source = "vendorEmail", target = "vendor.email")
    @Mapping(source = "vendorVendorType", target = "vendor.vendorType")
    @Mapping(source = "vendorDescription", target = "vendor.description")
    @Mapping(source = "vendorRate", target = "vendor.rate")
    @Mapping(source = "categoryId", target = "category.id")
    @Mapping(source = "categoryName", target = "category.name")
    @Mapping(source = "partId", target = "part.id")
    @Mapping(source = "partTitle", target = "part.title")
    @Mapping(source = "partDescription", target = "part.description")
    @Mapping(source = "partCategory", target = "part.category")
    @Mapping(source = "partCost", target = "part.cost")
    @Mapping(source = "partQuantity", target = "part.quantity")
    @Mapping(source = "partMinimumQuantity", target = "part.minimumQuantity")
    @Mapping(source = "partBarcode", target = "part.barcode")
    @Mapping(source = "partArea", target = "part.area")
    @Mapping(source = "partAdditionalDetails", target = "part.additionalDetails")
    @Mapping(source = "partImage", target = "part.image")
    @Mapping(target = "id", ignore = true)
    PurchaseOrder toEntity(PurchaseOrderDto purchaseOrderDto);

   // @InheritInverseConfiguration(name = "purchaseOrderDtoToPurchaseOrder")
    PurchaseOrderDto toDto(PurchaseOrder purchaseOrder);

    List<PurchaseOrderDto> toDtos(List<PurchaseOrder> order);

    //@InheritConfiguration(name = "purchaseOrderDtoToPurchaseOrder")
    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    PurchaseOrder updateEntity(PurchaseOrderDto purchaseOrderDto, @MappingTarget PurchaseOrder purchaseOrder);
}
