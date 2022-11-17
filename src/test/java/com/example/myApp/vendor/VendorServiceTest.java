package com.example.myApp.vendor;
import com.example.myApp.domain.vendor.*;
import com.example.myApp.mock.VendorDtoMock;
import com.example.myApp.mock.VendorMock;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.*;
import org.mockito.junit.jupiter.MockitoExtension;
import java.util.List;
import java.util.Optional;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.BDDMockito.given;
import static org.mockito.Mockito.*;



@ExtendWith(MockitoExtension.class)
public class VendorServiceTest {

    @Spy
    private VendorMapper vendorMapper = new VendorMapperImpl();

    @Captor
    private ArgumentCaptor<Vendor> vendorCaptor;

    @Mock
    private VendorRepository vendorRepository;

    @InjectMocks
    private VendorService vendorService ;



    @Test
    @DisplayName("Save Vendor success")
    void testCreateVendorSuccess() {

        VendorDto toSaveDto = VendorDtoMock.shallowVendorDto(null);
        when(vendorRepository.save(Mockito.any(Vendor.class)))
                .thenAnswer(i -> i.getArguments()[0]);

        VendorDto savedDto= vendorService.createVendor(toSaveDto);
        verify(vendorRepository).save(vendorCaptor.capture());
        Vendor toSaveEntity = vendorCaptor.getValue();

        verify(vendorMapper, times(1)).toEntity(toSaveDto);
        verify(vendorRepository, times(1)).save(toSaveEntity);
        verify(vendorMapper, times(1)).toDto(toSaveEntity);

        assertThat(toSaveDto).isEqualTo(savedDto);
    }

    @Test
    @DisplayName("Should find vendor by Id")
    void shouldFindVendorById() {
        Integer entityIdToFind = 1;
        Vendor resultSet = VendorMock.shallowVendor(entityIdToFind);
        when(vendorRepository.findVendorById(entityIdToFind)).thenReturn(Optional.of (resultSet));
        var result = vendorService.findVendorById(entityIdToFind);
        assertAll(
                () -> assertNotNull(result),
                () -> assertEquals(resultSet.getId(), result.getId())
        );
    }

    @Test
    @DisplayName("findAll vendors success")
    void findAllSuccess (){
        int expectedSize=10;
        List<Vendor> resultSet = VendorMock.shallowListOfVendors(expectedSize);
        when(vendorRepository.findAll()).thenReturn(resultSet);

        List<VendorDto> resultsetDto = vendorService.findAllVendors();
        verify(vendorMapper, times(expectedSize)).toDto(any(Vendor.class));
        assertThat(resultsetDto.size()).isEqualTo(expectedSize);
    }

    @Test
    @DisplayName("Vendor delete success")
    void deleteVendorById() {
        Integer entityIdToDelete = 1;
        vendorService.deleteVendorById(entityIdToDelete);
    }


//    @Test
//    @DisplayName("When given id should update vendor")
//    void updateVendor() {
//        VendorDto vendorDto =new VendorDto();
//        vendorDto.setId(89);
//        vendorDto.setCompanyName("Test name");
//
//        Vendor newVendor = new Vendor();
//        vendorDto.setCompanyName("New test name");
//
//        given(vendorRepository.findVendorById(vendorDto.getId())).willReturn(Optional.of(vendor));
//        vendorService.updateVendor(newVendor,vendorDto.getId());
//
//    }
}