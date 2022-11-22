package kodlama.io.carRental.service;
import kodlama.io.carRental.model.dto.requestDto.brandRequestDto.CreateBrandRequestDto;
import kodlama.io.carRental.model.dto.requestDto.brandRequestDto.UpdateBrandRequestDto;
import kodlama.io.carRental.model.dto.responseDto.brandResponseDto.GetAllBrandResponseDto;
import kodlama.io.carRental.model.dto.responseDto.brandResponseDto.GetBrandByIdResponseDto;
import kodlama.io.carRental.model.entities.Brand;

import java.util.List;

public interface BrandService {

    CreateBrandRequestDto add(Brand brand);

    List<GetAllBrandResponseDto> findAll();

    GetBrandByIdResponseDto getBrandById(int id);

    UpdateBrandRequestDto update(UpdateBrandRequestDto requestDto, int id);

    void delete(int id);

}
