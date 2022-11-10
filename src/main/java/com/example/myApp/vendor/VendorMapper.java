package com.example.myApp.vendor;

import org.mapstruct.*;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = "spring")

public interface VendorMapper {

    Vendor vendorDtoToVendor(VendorDto vendorDto);

    VendorDto vendorToVendorDto(Vendor vendor);

    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    Vendor updateVendorFromVendorDto(VendorDto vendorDto, @MappingTarget Vendor vendor);
}
