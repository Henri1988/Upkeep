package com.example.myApp.vendor;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2022-11-11T19:52:21+0200",
    comments = "version: 1.4.2.Final, compiler: javac, environment: Java 11.0.13 (Amazon.com Inc.)"
)
@Component
public class VendorMapperImpl implements VendorMapper {

    @Override
    public Vendor vendorDtoToVendor(VendorDto vendorDto) {
        if ( vendorDto == null ) {
            return null;
        }

        Vendor vendor = new Vendor();

        vendor.setCompanyName( vendorDto.getCompanyName() );
        vendor.setAddress( vendorDto.getAddress() );
        vendor.setPhone( vendorDto.getPhone() );
        vendor.setWebsite( vendorDto.getWebsite() );
        vendor.setName( vendorDto.getName() );
        vendor.setEmail( vendorDto.getEmail() );
        vendor.setVendorType( vendorDto.getVendorType() );
        vendor.setDescription( vendorDto.getDescription() );
        vendor.setRate( vendorDto.getRate() );

        return vendor;
    }

    @Override
    public VendorDto vendorToVendorDto(Vendor vendor) {
        if ( vendor == null ) {
            return null;
        }

        VendorDto vendorDto = new VendorDto();

        vendorDto.setId( vendor.getId() );
        vendorDto.setCompanyName( vendor.getCompanyName() );
        vendorDto.setAddress( vendor.getAddress() );
        vendorDto.setPhone( vendor.getPhone() );
        vendorDto.setWebsite( vendor.getWebsite() );
        vendorDto.setName( vendor.getName() );
        vendorDto.setEmail( vendor.getEmail() );
        vendorDto.setVendorType( vendor.getVendorType() );
        vendorDto.setDescription( vendor.getDescription() );
        vendorDto.setRate( vendor.getRate() );

        return vendorDto;
    }

    @Override
    public List<VendorDto> toDtos(List<Vendor> vendor) {
        if ( vendor == null ) {
            return null;
        }

        List<VendorDto> list = new ArrayList<VendorDto>( vendor.size() );
        for ( Vendor vendor1 : vendor ) {
            list.add( vendorToVendorDto( vendor1 ) );
        }

        return list;
    }

    @Override
    public Vendor updateVendorFromVendorDto(VendorDto vendorDto, Vendor vendor) {
        if ( vendorDto == null ) {
            return null;
        }

        if ( vendorDto.getId() != null ) {
            vendor.setId( vendorDto.getId() );
        }
        if ( vendorDto.getCompanyName() != null ) {
            vendor.setCompanyName( vendorDto.getCompanyName() );
        }
        if ( vendorDto.getAddress() != null ) {
            vendor.setAddress( vendorDto.getAddress() );
        }
        if ( vendorDto.getPhone() != null ) {
            vendor.setPhone( vendorDto.getPhone() );
        }
        if ( vendorDto.getWebsite() != null ) {
            vendor.setWebsite( vendorDto.getWebsite() );
        }
        if ( vendorDto.getName() != null ) {
            vendor.setName( vendorDto.getName() );
        }
        if ( vendorDto.getEmail() != null ) {
            vendor.setEmail( vendorDto.getEmail() );
        }
        if ( vendorDto.getVendorType() != null ) {
            vendor.setVendorType( vendorDto.getVendorType() );
        }
        if ( vendorDto.getDescription() != null ) {
            vendor.setDescription( vendorDto.getDescription() );
        }
        if ( vendorDto.getRate() != null ) {
            vendor.setRate( vendorDto.getRate() );
        }

        return vendor;
    }
}
