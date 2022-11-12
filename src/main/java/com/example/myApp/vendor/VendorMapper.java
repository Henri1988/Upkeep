package com.example.myApp.vendor;

import org.mapstruct.*;

import java.util.List;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = "spring")
public interface VendorMapper {
    @Mapping(target = "id", ignore = true)
    Vendor toEntity(VendorDto vendorDto);

    VendorDto toDto(Vendor vendor);

    List<VendorDto> toDtos(List<Vendor> vendor);

    @InheritConfiguration(name = "toEntity")
    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    void updateEntity(VendorDto vendorDto, @MappingTarget Vendor vendor);
}
