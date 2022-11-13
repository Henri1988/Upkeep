package com.example.myApp.mock;


import com.example.myApp.vendor.VendorDto;

import java.math.BigDecimal;

public class VendorDtoMock {

    public static VendorDto shallowVendorDto(Integer id){

        return VendorDto.builder()
                .id(id)
                .companyName("A mock companyName")
                .address("A mock address")
                .phone("A mock phone")
                .website("A mock website")
                .name("A mock name")
                .email("A mock email")
                .vendorType("A mock vendorType")
                .description("A mock description")
                .rate(BigDecimal.valueOf(25.00))
                .build();
    }
}
