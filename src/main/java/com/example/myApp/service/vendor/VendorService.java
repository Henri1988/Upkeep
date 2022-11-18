package com.example.myApp.service.vendor;
import com.example.myApp.domain.vendor.Vendor;
import com.example.myApp.domain.vendor.VendorDto;
import com.example.myApp.domain.vendor.VendorMapper;
import com.example.myApp.domain.vendor.VendorRepository;
import com.example.myApp.exception.NotFoundException;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.List;
import java.util.Optional;

@Service
public class VendorService {

    @Resource
    private VendorRepository vendorRepository;
    @Resource
    private VendorMapper vendorMapper;


    public VendorDto createVendor(VendorDto vendorDto) {
        Vendor vendor =vendorMapper.toEntity(vendorDto);
        vendorRepository.save(vendor);
        return vendorMapper.toDto(vendor);
    }

    public VendorDto findVendorById(Integer id) {
        Vendor vendor =vendorRepository.findVendorById(id);

        return vendorMapper.toDto(vendor);
    }

    public VendorDto findVendorByName(String name) {
        Vendor vendor =vendorRepository.findByCompanyName(name);
        return vendorMapper.toDto(vendor);
    }

    public List<VendorDto> findAllVendors() {
        List<Vendor>vendors=vendorRepository.findAll();
        return vendorMapper.toDtos(vendors);
    }

    public void updateVendor(VendorDto vendorDto, Integer vendorId) {
        Vendor vendor = vendorRepository.getById(vendorId);
        vendorMapper.updateEntity(vendorDto,vendor);
        vendorRepository.save(vendor);
    }

    public void deleteVendorById(Integer id) {
        Vendor vendor =vendorRepository.getById(id);
        vendorRepository.delete(vendor);
    }
}

