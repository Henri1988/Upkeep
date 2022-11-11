package com.example.myApp.vendor;


import io.swagger.v3.oas.annotations.Operation;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;


@RestController
public class VendorController {

    @Resource
    private VendorService vendorService;


    @PostMapping("/vendor/create")
    @Operation(summary = "Adds new vendor")
    public VendorDto createVendor (@RequestBody VendorDto vendorDto){
        return vendorService.createVendor(vendorDto);

    }





}
