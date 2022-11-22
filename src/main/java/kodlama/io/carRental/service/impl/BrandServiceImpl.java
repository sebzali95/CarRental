package kodlama.io.carRental.service.impl;
import kodlama.io.carRental.model.dto.requestDto.brandRequestDto.CreateBrandRequestDto;
import kodlama.io.carRental.model.dto.requestDto.brandRequestDto.UpdateBrandRequestDto;
import kodlama.io.carRental.model.dto.responseDto.brandResponseDto.GetAllBrandResponseDto;
import kodlama.io.carRental.model.dto.responseDto.brandResponseDto.GetBrandByIdResponseDto;
import kodlama.io.carRental.model.entities.Brand;
import kodlama.io.carRental.model.mapper.BrandMapper;
import kodlama.io.carRental.repository.BrandRepository;
import kodlama.io.carRental.service.BrandService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import java.util.List;


@Service
@RequiredArgsConstructor
public class BrandServiceImpl implements BrandService {

    private final BrandRepository brandRepository;
    private final BrandMapper brandMapper;

    @Override
    public List<GetAllBrandResponseDto> findAll() {
        List<Brand> brandList = brandRepository.findAll();
        return brandMapper.toBrandDTOs(brandList);
    }

    @Override
    public GetBrandByIdResponseDto getBrandById(int id) {
        return brandRepository.findById(id)
                .map(brand -> brandMapper.toBrandDto(brand))
                .orElseThrow(() -> new RuntimeException("Brand id not found"));
    }

    @Override
    public CreateBrandRequestDto add(Brand brand) {
        Brand save = brandRepository.save(brand);
        CreateBrandRequestDto createBrandRequestDto = brandMapper.toBrandColorRequest(save);
        return createBrandRequestDto;
    }

    @Override
    public UpdateBrandRequestDto update(UpdateBrandRequestDto requestDto, int id) {
        Brand brand = brandRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Brand id not found"));
        brandMapper.update(brand, requestDto);
        brandRepository.save(brand);
        return requestDto;
    }

    @Override
    public void delete(int id) {
        brandRepository.deleteById(id);
    }
}
