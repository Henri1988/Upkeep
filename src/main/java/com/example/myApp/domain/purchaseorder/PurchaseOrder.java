package com.example.myApp.domain.purchaseorder;

import com.example.myApp.domain.category.Category;
import com.example.myApp.domain.partsandinventory.parts.Part;
import com.example.myApp.domain.vendor.Vendor;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.time.LocalDate;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "purchase_order", schema = "upkeep")
public class PurchaseOrder {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Integer id;

    @Column(name = "title", nullable = false)
    private String title;

    @Column(name = "due_date")
    private LocalDate dueDate;

    @Column(name = "additional_details", length = 500)
    private String additionalDetails;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "vendor_id", nullable = false)
    private Vendor vendor;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "category_id", nullable = false)
    private Category category;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "part_id", nullable = false)
    private Part part;

    @Column(name = "requester_company_name")
    private String requesterCompanyName;

    @Column(name = "requester_address")
    private String requesterAddress;

    @Column(name = "requester_phone_number", length = 100)
    private String requesterPhoneNumber;

    @Column(name = "ship_to_name")
    private String shipToName;

    @Column(name = "shipping_address")
    private String shippingAddress;

    @Column(name = "ship_to_company_name", length = 100)
    private String shipToCompanyName;

    @Column(name = "ship_to_phone_number", length = 100)
    private String shipToPhoneNumber;

    @Column(name = "purchase_order_date")
    private LocalDate purchaseOrderDate;

    @Column(name = "shipping_method", length = 100)
    private String shippingMethod;

    @Column(name = "requisitioner")
    private String requisitioner;

    @Column(name = "terms", length = 500)
    private String terms;

    @Column(name = "notes", length = 500)
    private String notes;

}