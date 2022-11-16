package com.example.myApp.vendor;

import lombok.*;
import org.hibernate.Hibernate;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.math.BigDecimal;
import java.util.Objects;

@Getter
@Setter
@ToString
@Builder
@Entity
@Data
@Table(name = "vendor", schema = "upkeep")
public class Vendor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Integer id;

    @Column(name = "company_name")
    private String companyName;
    private String address;
    private String phone;
    private String website;
    private String name;
    private String email;
    @Column(name = "vendor_type")
    private String vendorType;
    private String description;
    private BigDecimal rate;

    public Vendor() {

    }

    public Vendor(Integer id, String companyName, String address, String phone, String website, String name,
                  String email, String vendorType, String description, BigDecimal rate) {
        this.id = id;
        this.companyName = companyName;
        this.address = address;
        this.phone = phone;
        this.website = website;
        this.name = name;
        this.email = email;
        this.vendorType = vendorType;
        this.description = description;
        this.rate = rate;
    }
}