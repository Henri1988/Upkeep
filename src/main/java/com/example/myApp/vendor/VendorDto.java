package com.example.myApp.vendor;

import jdk.jshell.Snippet;
import lombok.*;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.io.Serializable;
import java.math.BigDecimal;

/**
 * A DTO for the {@link Vendor} entity
 */

@Getter
@Setter
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Builder
public class VendorDto {
    private Integer id;
    @Size(max = 100)
    @NotNull
    private String companyName;
    @Size(max = 255)
    private  String address;
    @Size(max = 255)
    private String phone;
    @Size(max = 255)
    private String website;
    @Size(max = 100)
    private String name;
    @Size(max = 255)
    private String email;
    @Size(max = 255)
    private String vendorType;
    @Size(max = 500)
    private String description;
    private BigDecimal rate;

}