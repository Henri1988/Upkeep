package com.example.myApp;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.math.BigDecimal;

@Data
@Entity
@Table(name = "vendor", schema = "upkeep")
public class Vendor {
    @Id
    @Column(name = "id", nullable = false)
    private Integer id;

    @Size(max = 100)
    @NotNull
    @Column(name = "company_name", nullable = false, length = 100)
    private String companyName;

    @Size(max = 255)
    @Column(name = "address")
    private String address;

    @Size(max = 255)
    @Column(name = "phone")
    private String phone;

    @Size(max = 255)
    @Column(name = "website")
    private String website;

    @Size(max = 100)
    @Column(name = "name", length = 100)
    private String name;

    @Size(max = 255)
    @Column(name = "email")
    private String email;

    @Size(max = 255)
    @Column(name = "vendor_type")
    private String vendorType;

    @Size(max = 500)
    @Column(name = "description", length = 500)
    private String description;

    @Column(name = "rate", precision = 4, scale = 4)
    private BigDecimal rate;


}