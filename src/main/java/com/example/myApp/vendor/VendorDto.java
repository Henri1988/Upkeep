package com.example.myApp.vendor;

import lombok.Data;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.io.Serializable;
import java.math.BigDecimal;

/**
 * A DTO for the {@link Vendor} entity
 */
@Data
public class VendorDto implements Serializable {

    private final Integer id;
    @Size(max = 100)
    @NotNull
    private final String companyName;
    @Size(max = 255)
    private final String address;
    @Size(max = 255)
    private final String phone;
    @Size(max = 255)
    private final String website;
    @Size(max = 100)
    private final String name;
    @Size(max = 255)
    private final String email;
    @Size(max = 255)
    private final String vendorType;
    @Size(max = 500)
    private final String description;

    private final BigDecimal rate;
}