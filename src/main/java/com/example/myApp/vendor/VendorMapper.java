package com.example.myApp.vendor;

import org.mapstruct.*;

import java.util.List;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = "spring")
public interface VendorMapper {
    @Mapping(target = "id", ignore = true)
    Vendor vendorDtoToVendor(VendorDto vendorDto);

    VendorDto vendorToVendorDto(Vendor vendor);

    List<VendorDto> toDtos(List<Vendor> vendor);

    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    Vendor updateEntity(VendorDto vendorDto, @MappingTarget Vendor vendor);
}
