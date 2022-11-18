package com.example.myApp.domain.purchaseorder;

import com.example.myApp.domain.category.Category;
import com.example.myApp.domain.partsandinventory.parts.Part;
import com.example.myApp.domain.purchaseorder.PurchaseOrderDto.PurchaseOrderDtoBuilder;
import com.example.myApp.domain.vendor.Vendor;
import com.example.myApp.domain.vendor.Vendor.VendorBuilder;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2022-11-18T02:15:57+0200",
    comments = "version: 1.4.2.Final, compiler: javac, environment: Java 11.0.13 (Amazon.com Inc.)"
)
@Component
public class PurchaseOrderMapperImpl implements PurchaseOrderMapper {

    @Override
    public PurchaseOrder toEntity(PurchaseOrderDto purchaseOrderDto) {
        if ( purchaseOrderDto == null ) {
            return null;
        }

        PurchaseOrder purchaseOrder = new PurchaseOrder();

        purchaseOrder.setVendor( purchaseOrderDtoToVendor( purchaseOrderDto ) );
        purchaseOrder.setCategory( purchaseOrderDtoToCategory( purchaseOrderDto ) );
        purchaseOrder.setPart( purchaseOrderDtoToPart( purchaseOrderDto ) );
        purchaseOrder.setId( purchaseOrderDto.getId() );
        purchaseOrder.setTitle( purchaseOrderDto.getTitle() );
        purchaseOrder.setDueDate( purchaseOrderDto.getDueDate() );
        purchaseOrder.setAdditionalDetails( purchaseOrderDto.getAdditionalDetails() );
        purchaseOrder.setRequesterCompanyName( purchaseOrderDto.getRequesterCompanyName() );
        purchaseOrder.setRequesterAddress( purchaseOrderDto.getRequesterAddress() );
        purchaseOrder.setRequesterPhoneNumber( purchaseOrderDto.getRequesterPhoneNumber() );
        purchaseOrder.setShipToName( purchaseOrderDto.getShipToName() );
        purchaseOrder.setShippingAddress( purchaseOrderDto.getShippingAddress() );
        purchaseOrder.setShipToCompanyName( purchaseOrderDto.getShipToCompanyName() );
        purchaseOrder.setShipToPhoneNumber( purchaseOrderDto.getShipToPhoneNumber() );
        purchaseOrder.setPurchaseOrderDate( purchaseOrderDto.getPurchaseOrderDate() );
        purchaseOrder.setShippingMethod( purchaseOrderDto.getShippingMethod() );
        purchaseOrder.setRequisitioner( purchaseOrderDto.getRequisitioner() );
        purchaseOrder.setTerms( purchaseOrderDto.getTerms() );
        purchaseOrder.setNotes( purchaseOrderDto.getNotes() );

        return purchaseOrder;
    }

    @Override
    public PurchaseOrderDto toDto(PurchaseOrder purchaseOrder) {
        if ( purchaseOrder == null ) {
            return null;
        }

        PurchaseOrderDtoBuilder purchaseOrderDto = PurchaseOrderDto.builder();

        purchaseOrderDto.vendorId( purchaseOrderVendorId( purchaseOrder ) );
        purchaseOrderDto.categoryId( purchaseOrderCategoryId( purchaseOrder ) );
        purchaseOrderDto.partId( purchaseOrderPartId( purchaseOrder ) );
        purchaseOrderDto.id( purchaseOrder.getId() );
        purchaseOrderDto.title( purchaseOrder.getTitle() );
        purchaseOrderDto.dueDate( purchaseOrder.getDueDate() );
        purchaseOrderDto.additionalDetails( purchaseOrder.getAdditionalDetails() );
        purchaseOrderDto.requesterCompanyName( purchaseOrder.getRequesterCompanyName() );
        purchaseOrderDto.requesterAddress( purchaseOrder.getRequesterAddress() );
        purchaseOrderDto.requesterPhoneNumber( purchaseOrder.getRequesterPhoneNumber() );
        purchaseOrderDto.shipToName( purchaseOrder.getShipToName() );
        purchaseOrderDto.shippingAddress( purchaseOrder.getShippingAddress() );
        purchaseOrderDto.shipToCompanyName( purchaseOrder.getShipToCompanyName() );
        purchaseOrderDto.shipToPhoneNumber( purchaseOrder.getShipToPhoneNumber() );
        purchaseOrderDto.purchaseOrderDate( purchaseOrder.getPurchaseOrderDate() );
        purchaseOrderDto.shippingMethod( purchaseOrder.getShippingMethod() );
        purchaseOrderDto.requisitioner( purchaseOrder.getRequisitioner() );
        purchaseOrderDto.terms( purchaseOrder.getTerms() );
        purchaseOrderDto.notes( purchaseOrder.getNotes() );

        return purchaseOrderDto.build();
    }

    @Override
    public List<PurchaseOrderDto> toDtos(List<PurchaseOrder> order) {
        if ( order == null ) {
            return null;
        }

        List<PurchaseOrderDto> list = new ArrayList<PurchaseOrderDto>( order.size() );
        for ( PurchaseOrder purchaseOrder : order ) {
            list.add( toDto( purchaseOrder ) );
        }

        return list;
    }

    @Override
    public PurchaseOrder updatePurchaseOrderFromPurchaseOrderDto(PurchaseOrderDto purchaseOrderDto, PurchaseOrder purchaseOrder) {
        if ( purchaseOrderDto == null ) {
            return null;
        }

        if ( purchaseOrder.getVendor() == null ) {
            purchaseOrder.setVendor( new Vendor() );
        }
        purchaseOrderDtoToVendor1( purchaseOrderDto, purchaseOrder.getVendor() );
        if ( purchaseOrder.getCategory() == null ) {
            purchaseOrder.setCategory( new Category() );
        }
        purchaseOrderDtoToCategory1( purchaseOrderDto, purchaseOrder.getCategory() );
        if ( purchaseOrder.getPart() == null ) {
            purchaseOrder.setPart( new Part() );
        }
        purchaseOrderDtoToPart1( purchaseOrderDto, purchaseOrder.getPart() );
        if ( purchaseOrderDto.getId() != null ) {
            purchaseOrder.setId( purchaseOrderDto.getId() );
        }
        if ( purchaseOrderDto.getTitle() != null ) {
            purchaseOrder.setTitle( purchaseOrderDto.getTitle() );
        }
        if ( purchaseOrderDto.getDueDate() != null ) {
            purchaseOrder.setDueDate( purchaseOrderDto.getDueDate() );
        }
        if ( purchaseOrderDto.getAdditionalDetails() != null ) {
            purchaseOrder.setAdditionalDetails( purchaseOrderDto.getAdditionalDetails() );
        }
        if ( purchaseOrderDto.getRequesterCompanyName() != null ) {
            purchaseOrder.setRequesterCompanyName( purchaseOrderDto.getRequesterCompanyName() );
        }
        if ( purchaseOrderDto.getRequesterAddress() != null ) {
            purchaseOrder.setRequesterAddress( purchaseOrderDto.getRequesterAddress() );
        }
        if ( purchaseOrderDto.getRequesterPhoneNumber() != null ) {
            purchaseOrder.setRequesterPhoneNumber( purchaseOrderDto.getRequesterPhoneNumber() );
        }
        if ( purchaseOrderDto.getShipToName() != null ) {
            purchaseOrder.setShipToName( purchaseOrderDto.getShipToName() );
        }
        if ( purchaseOrderDto.getShippingAddress() != null ) {
            purchaseOrder.setShippingAddress( purchaseOrderDto.getShippingAddress() );
        }
        if ( purchaseOrderDto.getShipToCompanyName() != null ) {
            purchaseOrder.setShipToCompanyName( purchaseOrderDto.getShipToCompanyName() );
        }
        if ( purchaseOrderDto.getShipToPhoneNumber() != null ) {
            purchaseOrder.setShipToPhoneNumber( purchaseOrderDto.getShipToPhoneNumber() );
        }
        if ( purchaseOrderDto.getPurchaseOrderDate() != null ) {
            purchaseOrder.setPurchaseOrderDate( purchaseOrderDto.getPurchaseOrderDate() );
        }
        if ( purchaseOrderDto.getShippingMethod() != null ) {
            purchaseOrder.setShippingMethod( purchaseOrderDto.getShippingMethod() );
        }
        if ( purchaseOrderDto.getRequisitioner() != null ) {
            purchaseOrder.setRequisitioner( purchaseOrderDto.getRequisitioner() );
        }
        if ( purchaseOrderDto.getTerms() != null ) {
            purchaseOrder.setTerms( purchaseOrderDto.getTerms() );
        }
        if ( purchaseOrderDto.getNotes() != null ) {
            purchaseOrder.setNotes( purchaseOrderDto.getNotes() );
        }

        return purchaseOrder;
    }

    protected Vendor purchaseOrderDtoToVendor(PurchaseOrderDto purchaseOrderDto) {
        if ( purchaseOrderDto == null ) {
            return null;
        }

        VendorBuilder vendor = Vendor.builder();

        vendor.id( purchaseOrderDto.getVendorId() );

        return vendor.build();
    }

    protected Category purchaseOrderDtoToCategory(PurchaseOrderDto purchaseOrderDto) {
        if ( purchaseOrderDto == null ) {
            return null;
        }

        Category category = new Category();

        category.setId( purchaseOrderDto.getCategoryId() );

        return category;
    }

    protected Part purchaseOrderDtoToPart(PurchaseOrderDto purchaseOrderDto) {
        if ( purchaseOrderDto == null ) {
            return null;
        }

        Part part = new Part();

        part.setId( purchaseOrderDto.getPartId() );

        return part;
    }

    private Integer purchaseOrderVendorId(PurchaseOrder purchaseOrder) {
        if ( purchaseOrder == null ) {
            return null;
        }
        Vendor vendor = purchaseOrder.getVendor();
        if ( vendor == null ) {
            return null;
        }
        Integer id = vendor.getId();
        if ( id == null ) {
            return null;
        }
        return id;
    }

    private Integer purchaseOrderCategoryId(PurchaseOrder purchaseOrder) {
        if ( purchaseOrder == null ) {
            return null;
        }
        Category category = purchaseOrder.getCategory();
        if ( category == null ) {
            return null;
        }
        Integer id = category.getId();
        if ( id == null ) {
            return null;
        }
        return id;
    }

    private Integer purchaseOrderPartId(PurchaseOrder purchaseOrder) {
        if ( purchaseOrder == null ) {
            return null;
        }
        Part part = purchaseOrder.getPart();
        if ( part == null ) {
            return null;
        }
        Integer id = part.getId();
        if ( id == null ) {
            return null;
        }
        return id;
    }

    protected void purchaseOrderDtoToVendor1(PurchaseOrderDto purchaseOrderDto, Vendor mappingTarget) {
        if ( purchaseOrderDto == null ) {
            return;
        }

        if ( purchaseOrderDto.getVendorId() != null ) {
            mappingTarget.setId( purchaseOrderDto.getVendorId() );
        }
    }

    protected void purchaseOrderDtoToCategory1(PurchaseOrderDto purchaseOrderDto, Category mappingTarget) {
        if ( purchaseOrderDto == null ) {
            return;
        }

        if ( purchaseOrderDto.getCategoryId() != null ) {
            mappingTarget.setId( purchaseOrderDto.getCategoryId() );
        }
    }

    protected void purchaseOrderDtoToPart1(PurchaseOrderDto purchaseOrderDto, Part mappingTarget) {
        if ( purchaseOrderDto == null ) {
            return;
        }

        if ( purchaseOrderDto.getPartId() != null ) {
            mappingTarget.setId( purchaseOrderDto.getPartId() );
        }
    }
}
