package com.example.myApp.domain.purchaseorder;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.*;

import java.io.Serializable;
import java.time.LocalDate;

/**
 * A DTO for the {@link PurchaseOrder} entity
 */
@Data
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Builder
@JsonInclude(JsonInclude.Include.NON_NULL)
public class PurchaseOrderDto implements Serializable {
    private Integer id;
    private  String title;
    private  LocalDate dueDate;
    private  String additionalDetails;
    private  Integer vendorId;
    private  Integer categoryId;
    private  Integer partId;
    private  String requesterCompanyName;
    private  String requesterAddress;
    private  String requesterPhoneNumber;
    private  String shipToName;
    private  String shippingAddress;
    private  String shipToCompanyName;
    private  String shipToPhoneNumber;
    private  LocalDate purchaseOrderDate;
    private  String shippingMethod;
    private  String requisitioner;
    private  String terms;
    private  String notes;


}