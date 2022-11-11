package com.example.myApp.vendor;
import io.swagger.v3.oas.annotations.Operation;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;


@RestController
public class VendorController {

    @Resource
    private VendorService vendorService;


    @PostMapping("/vendor/create")
    @Operation(summary = "Adds new vendor")
    public VendorDto createVendor (@RequestBody VendorDto vendorDto){
        return vendorService.createVendor(vendorDto);
    }


    @GetMapping("/vendor/get")
    @Operation(summary = "Finds vendor my id")
    public VendorDto findVendorById(@RequestParam Integer id){
        return vendorService.findVendorById(id);
    }

    @GetMapping("/vendor/name")
    @Operation(summary = "Finds vendors by name")
    public VendorDto findVendorByName(@RequestParam String name){
        return vendorService.findVendorByName(name);
    }







}
