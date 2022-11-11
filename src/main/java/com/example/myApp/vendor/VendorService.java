package com.example.myApp.vendor;


import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class VendorService {

    @Resource
    private VendorRepository vendorRepository;
    @Resource
    private VendorMapper  vendorMapper;

    public VendorDto createVendor(VendorDto vendorDto) {
        Vendor vendor =vendorMapper.vendorDtoToVendor(vendorDto);
        vendorRepository.save(vendor);

        return vendorMapper.vendorToVendorDto(vendor);
    }
}

