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
    @GetMapping("/vendor/find/all")
    @Operation(summary ="Finds all vendors")
    public List<VendorDto> findAllVendors(){
        return vendorService.findAllVendors();
    }
    @PutMapping("/vendor/update")
    @Operation(summary = "Updates a vendor")
    public void updateVendorById(@RequestBody VendorDto vendorDto, @RequestParam Integer vendorId){
        vendorService.updateVendor(vendorDto, vendorId);
    }
    @DeleteMapping("/vendor/delete")
    @Operation(summary = "Deletes vendor by id")
    public void deleteVendorById(Integer id){
        vendorService.deleteVendorById(id);
    }

}
