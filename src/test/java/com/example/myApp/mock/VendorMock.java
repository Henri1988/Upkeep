package com.example.myApp.mock;
import com.example.myApp.vendor.Vendor;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class VendorMock {

    public static Vendor shallowVendor(Integer id){

        return Vendor.builder()
                .id(Math.toIntExact(id))
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

    public static List<Vendor> shallowListOfVendors(int howMany){
        List<Vendor> mockVendors = new ArrayList<>();
        for (int i=0;i<howMany; i++){
            mockVendors.add(shallowVendor((int) i));
        }
        return mockVendors;
    }
}
