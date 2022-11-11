package com.example.myApp.vendor;


import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Optional;

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

    public VendorDto findVendorById(Integer id) {
        Optional<Vendor> vendor =vendorRepository.findVendorById(id);
        return vendorMapper.vendorToVendorDto(vendor.get());
    }

    public VendorDto findVendorByName(String name) {
        Vendor vendor =vendorRepository.findByCompanyName(name);
        return vendorMapper.vendorToVendorDto(vendor);
    }

    public List<VendorDto> findAllVendors() {
        List<Vendor>vendors=vendorRepository.findAll();
        return vendorMapper.toDtos(vendors);
    }

    public VendorDto updateVendor(VendorDto vendorDto, Integer vendorId) {
        Vendor vendor = vendorRepository.getById(vendorId);
        Vendor updatedVendor = vendorMapper.updateEntity(vendorDto,vendor);
        return vendorMapper.vendorToVendorDto(updatedVendor);
    }
}

