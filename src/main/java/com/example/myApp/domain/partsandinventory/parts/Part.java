package com.example.myApp.domain.partsandinventory.parts;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.math.BigDecimal;

@Getter
@Setter
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "part", schema = "upkeep")
public class Part {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Integer id;

    @Column(name = "title", nullable = false, length = 100)
    private String title;

    @Column(name = "description", length = 500)
    private String description;

    @Column(name = "category")
    private String category;

    @Column(name = "cost", precision = 4, scale = 4)
    private BigDecimal cost;

    @Column(name = "quantity")
    private Integer quantity;

    @Column(name = "minimum_quantity")
    private Integer minimumQuantity;

    @Column(name = "barcode", length = 100)
    private String barcode;

    @Column(name = "area", precision = 4, scale = 4)
    private BigDecimal area;

    @Column(name = "additional_details", length = 500)
    private String additionalDetails;

    @Column(name = "image")
    private String image;
}