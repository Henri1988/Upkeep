package com.example.myApp.vendor;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;

import static org.junit.jupiter.api.Assertions.*;


public class VendorServiceTest {


    @Mock
    private VendorRepository vendorRepository;

    @InjectMocks
    private VendorService vendorService ;



    @Test
    void createVendor() {
    }


    @Test
    @DisplayName("Should find post by Id")
    void shouldFindVendorById() {
    }
}