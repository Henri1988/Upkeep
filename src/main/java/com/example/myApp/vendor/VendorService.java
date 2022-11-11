package com.example.myApp.vendor;


import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class VendorService {

    @Resource
    private VendorMapper vendorMapper;

    @Resource
    private VendorRepository vendorRepository;

    public VendorDto createVendor(VendorDto vendorDto) {
    }
}

