package com.example.myApp.vendor;

import com.example.myApp.vendor.Vendor.VendorBuilder;
import com.example.myApp.vendor.VendorDto.VendorDtoBuilder;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2022-11-14T00:16:14+0200",
    comments = "version: 1.4.2.Final, compiler: javac, environment: Java 11.0.13 (Amazon.com Inc.)"
)
@Component
public class VendorMapperImpl implements VendorMapper {

    @Override
    public Vendor toEntity(VendorDto vendorDto) {
        if ( vendorDto == null ) {
            return null;
        }

        VendorBuilder vendor = Vendor.builder();

        vendor.companyName( vendorDto.getCompanyName() );
        vendor.address( vendorDto.getAddress() );
        vendor.phone( vendorDto.getPhone() );
        vendor.website( vendorDto.getWebsite() );
        vendor.name( vendorDto.getName() );
        vendor.email( vendorDto.getEmail() );
        vendor.vendorType( vendorDto.getVendorType() );
        vendor.description( vendorDto.getDescription() );
        vendor.rate( vendorDto.getRate() );

        return vendor.build();
    }

    @Override
    public VendorDto toDto(Vendor vendor) {
        if ( vendor == null ) {
            return null;
        }

        VendorDtoBuilder vendorDto = VendorDto.builder();

        vendorDto.id( vendor.getId() );
        vendorDto.companyName( vendor.getCompanyName() );
        vendorDto.address( vendor.getAddress() );
        vendorDto.phone( vendor.getPhone() );
        vendorDto.website( vendor.getWebsite() );
        vendorDto.name( vendor.getName() );
        vendorDto.email( vendor.getEmail() );
        vendorDto.vendorType( vendor.getVendorType() );
        vendorDto.description( vendor.getDescription() );
        vendorDto.rate( vendor.getRate() );

        return vendorDto.build();
    }

    @Override
    public List<VendorDto> toDtos(List<Vendor> vendor) {
        if ( vendor == null ) {
            return null;
        }

        List<VendorDto> list = new ArrayList<VendorDto>( vendor.size() );
        for ( Vendor vendor1 : vendor ) {
            list.add( toDto( vendor1 ) );
        }

        return list;
    }

    @Override
    public void updateEntity(VendorDto vendorDto, Vendor vendor) {
        if ( vendorDto == null ) {
            return;
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
    }
}
