package com.example.myApp.vendor;
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
import static org.mockito.Mockito.*;
import static org.springframework.test.util.AssertionErrors.assertEquals;


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

        //1) create some mock data (make them reusable in ohter tests)
        VendorDto toSaveDto = VendorDtoMock.shallowVendorDto(null);

        //2) prepare mocks for everything they should return
        when(vendorRepository.save(Mockito.any(Vendor.class))) //any object of type User will match here
                .thenAnswer(i -> i.getArguments()[0]); //echo 1st parameter received

        //3) class under test
        VendorDto savedDto= vendorService.createVendor(toSaveDto);

        //4) use captor in spy/mocks for everything they get as input
        verify(vendorRepository).save(vendorCaptor.capture());
        Vendor toSaveEntity = vendorCaptor.getValue();

        //5) check if all dependencies were called (eventually with check on input data)
        verify(vendorMapper, times(1)).toEntity(toSaveDto);
        verify(vendorRepository, times(1)).save(toSaveEntity);
        verify(vendorMapper, times(1)).toDto(toSaveEntity);

        //6) assertions actual vs expected
        assertThat(toSaveDto).isEqualTo(savedDto); //not usually a good practice, but equals has override using all fields
    }

    @Test
    @DisplayName("Should find vendor by Id")
    void shouldFindVendorById() {
        Integer entityIdToFind = 1;
        Vendor resultSet = VendorMock.shallowVendor(entityIdToFind);
        when(vendorRepository.findVendorById(entityIdToFind)).thenReturn(Optional.of (resultSet));

        VendorDto e1ByService = vendorService.findVendorById(entityIdToFind);



    }

    @Test
    @DisplayName("Vendor delete success")
    void deleteVendorById() {
        Integer entityIdToDelete = 1;
        vendorService.deleteVendorById(entityIdToDelete);
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


//    @Test
//    @DisplayName("partial Update success")
//    void updateVendor() {
//        Integer entityIdToUpdate = 1;
//        String updateOnVendorName = "updatedName";
//
//        Vendor foundEntity= VendorMock.shallowVendor(entityIdToUpdate);
//        VendorDto toUpdateDto =vendorMapper.toDto(foundEntity); //this is recorded therefore time expected is 2
//        toUpdateDto.setName(updateOnVendorName);
//
//
//        when(vendorRepository.findById(entityIdToUpdate)).thenReturn(Optional.of(foundEntity));
//
//        VendorDto updatedDto =vendorService.updateVendor(toUpdateDto);
//
//        verify(vendorRepository).save(vendorCaptor.capture());
//        Vendor toUpdateEntity = vendorCaptor.getValue();
//
//        verify(vendorMapper, times(1)).updateEntity(foundEntity,toUpdateDto);
//        verify(vendorRepository, times(1)).save(foundEntity);
//        verify(vendorMapper, times(2)).toDto(foundEntity);
//
//        assertThat(toUpdateDto).isEqualTo(updatedDto);
//    }
}