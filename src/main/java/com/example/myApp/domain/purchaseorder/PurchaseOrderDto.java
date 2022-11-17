package com.example.myApp.domain.purchaseorder;

import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDate;

/**
 * A DTO for the {@link PurchaseOrder} entity
 */
@Data
public class PurchaseOrderDto implements Serializable {
    private final Integer id;
    private final String title;
    private final LocalDate dueDate;
    private final String additionalDetails;
    private final Integer vendorId;
    private final String vendorCompanyName;
    private final String vendorAddress;
    private final String vendorPhone;
    private final String vendorWebsite;
    private final String vendorName;
    private final String vendorEmail;
    private final String vendorVendorType;
    private final String vendorDescription;
    private final BigDecimal vendorRate;
    private final Integer categoryId;
    private final String categoryName;
    private final Integer partId;
    private final String partTitle;
    private final String partDescription;
    private final String partCategory;
    private final BigDecimal partCost;
    private final Integer partQuantity;
    private final Integer partMinimumQuantity;
    private final String partBarcode;
    private final BigDecimal partArea;
    private final String partAdditionalDetails;
    private final String partImage;
    private final String requesterCompanyName;
    private final String requesterAddress;
    private final String requesterPhoneNumber;
    private final String shipToName;
    private final String shippingAddress;
    private final String shipToCompanyName;
    private final String shipToPhoneNumber;
    private final LocalDate purchaseOrderDate;
    private final String shippingMethod;
    private final String requisitioner;
    private final String terms;
    private final String notes;
}