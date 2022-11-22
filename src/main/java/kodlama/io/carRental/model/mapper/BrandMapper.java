package kodlama.io.carRental.model.mapper;

import kodlama.io.carRental.model.dto.requestDto.brandRequestDto.CreateBrandRequestDto;
import kodlama.io.carRental.model.dto.requestDto.brandRequestDto.UpdateBrandRequestDto;
import kodlama.io.carRental.model.dto.responseDto.brandResponseDto.GetAllBrandResponseDto;
import kodlama.io.carRental.model.dto.responseDto.brandResponseDto.GetBrandByIdResponseDto;
import kodlama.io.carRental.model.entities.Brand;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;

import java.util.List;

@Mapper(componentModel = "spring")
public interface BrandMapper {


    List<GetAllBrandResponseDto> toBrandDTOs(List<Brand> brands);

    GetBrandByIdResponseDto toBrandDto(Brand brand);

    CreateBrandRequestDto toBrandColorRequest(Brand brand);

    void update(@MappingTarget Brand brand, UpdateBrandRequestDto updateBrandRequestDto);
}
