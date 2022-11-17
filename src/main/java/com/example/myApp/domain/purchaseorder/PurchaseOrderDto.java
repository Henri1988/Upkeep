package com.example.myApp.domain.purchaseorder;

import lombok.Data;

import java.io.Serializable;
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
    private final Integer categoryId;
    private final Integer partId;
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