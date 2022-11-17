package com.example.myApp.domain.purchaseorder;

import com.example.myApp.domain.category.Category;
import com.example.myApp.domain.partsandinventory.parts.Part;
import com.example.myApp.domain.vendor.Vendor;
import com.example.myApp.domain.vendor.Vendor.VendorBuilder;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2022-11-17T22:37:19+0200",
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

        Integer id = null;
        String title = null;
        LocalDate dueDate = null;
        String additionalDetails = null;
        String requesterCompanyName = null;
        String requesterAddress = null;
        String requesterPhoneNumber = null;
        String shipToName = null;
        String shippingAddress = null;
        String shipToCompanyName = null;
        String shipToPhoneNumber = null;
        LocalDate purchaseOrderDate = null;
        String shippingMethod = null;
        String requisitioner = null;
        String terms = null;
        String notes = null;

        id = purchaseOrder.getId();
        title = purchaseOrder.getTitle();
        dueDate = purchaseOrder.getDueDate();
        additionalDetails = purchaseOrder.getAdditionalDetails();
        requesterCompanyName = purchaseOrder.getRequesterCompanyName();
        requesterAddress = purchaseOrder.getRequesterAddress();
        requesterPhoneNumber = purchaseOrder.getRequesterPhoneNumber();
        shipToName = purchaseOrder.getShipToName();
        shippingAddress = purchaseOrder.getShippingAddress();
        shipToCompanyName = purchaseOrder.getShipToCompanyName();
        shipToPhoneNumber = purchaseOrder.getShipToPhoneNumber();
        purchaseOrderDate = purchaseOrder.getPurchaseOrderDate();
        shippingMethod = purchaseOrder.getShippingMethod();
        requisitioner = purchaseOrder.getRequisitioner();
        terms = purchaseOrder.getTerms();
        notes = purchaseOrder.getNotes();

        Integer vendorId = null;
        String vendorCompanyName = null;
        String vendorAddress = null;
        String vendorPhone = null;
        String vendorWebsite = null;
        String vendorName = null;
        String vendorEmail = null;
        String vendorVendorType = null;
        String vendorDescription = null;
        BigDecimal vendorRate = null;
        Integer categoryId = null;
        String categoryName = null;
        Integer partId = null;
        String partTitle = null;
        String partDescription = null;
        String partCategory = null;
        BigDecimal partCost = null;
        Integer partQuantity = null;
        Integer partMinimumQuantity = null;
        String partBarcode = null;
        BigDecimal partArea = null;
        String partAdditionalDetails = null;
        String partImage = null;

        PurchaseOrderDto purchaseOrderDto = new PurchaseOrderDto( id, title, dueDate, additionalDetails, vendorId, vendorCompanyName, vendorAddress, vendorPhone, vendorWebsite, vendorName, vendorEmail, vendorVendorType, vendorDescription, vendorRate, categoryId, categoryName, partId, partTitle, partDescription, partCategory, partCost, partQuantity, partMinimumQuantity, partBarcode, partArea, partAdditionalDetails, partImage, requesterCompanyName, requesterAddress, requesterPhoneNumber, shipToName, shippingAddress, shipToCompanyName, shipToPhoneNumber, purchaseOrderDate, shippingMethod, requisitioner, terms, notes );

        return purchaseOrderDto;
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
    public PurchaseOrder updateEntity(PurchaseOrderDto purchaseOrderDto, PurchaseOrder purchaseOrder) {
        if ( purchaseOrderDto == null ) {
            return null;
        }

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
        vendor.companyName( purchaseOrderDto.getVendorCompanyName() );
        vendor.address( purchaseOrderDto.getVendorAddress() );
        vendor.phone( purchaseOrderDto.getVendorPhone() );
        vendor.website( purchaseOrderDto.getVendorWebsite() );
        vendor.name( purchaseOrderDto.getVendorName() );
        vendor.email( purchaseOrderDto.getVendorEmail() );
        vendor.vendorType( purchaseOrderDto.getVendorVendorType() );
        vendor.description( purchaseOrderDto.getVendorDescription() );
        vendor.rate( purchaseOrderDto.getVendorRate() );

        return vendor.build();
    }

    protected Category purchaseOrderDtoToCategory(PurchaseOrderDto purchaseOrderDto) {
        if ( purchaseOrderDto == null ) {
            return null;
        }

        Category category = new Category();

        category.setId( purchaseOrderDto.getCategoryId() );
        category.setName( purchaseOrderDto.getCategoryName() );

        return category;
    }

    protected Part purchaseOrderDtoToPart(PurchaseOrderDto purchaseOrderDto) {
        if ( purchaseOrderDto == null ) {
            return null;
        }

        Part part = new Part();

        part.setId( purchaseOrderDto.getPartId() );
        part.setTitle( purchaseOrderDto.getPartTitle() );
        part.setDescription( purchaseOrderDto.getPartDescription() );
        part.setCategory( purchaseOrderDto.getPartCategory() );
        part.setCost( purchaseOrderDto.getPartCost() );
        part.setQuantity( purchaseOrderDto.getPartQuantity() );
        part.setMinimumQuantity( purchaseOrderDto.getPartMinimumQuantity() );
        part.setBarcode( purchaseOrderDto.getPartBarcode() );
        part.setArea( purchaseOrderDto.getPartArea() );
        part.setAdditionalDetails( purchaseOrderDto.getPartAdditionalDetails() );
        part.setImage( purchaseOrderDto.getPartImage() );

        return part;
    }
}
