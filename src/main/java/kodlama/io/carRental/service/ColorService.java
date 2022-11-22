package kodlama.io.carRental.service;

import kodlama.io.carRental.model.dto.requestDto.brandRequestDto.CreateBrandRequestDto;
import kodlama.io.carRental.model.dto.requestDto.brandRequestDto.UpdateBrandRequestDto;
import kodlama.io.carRental.model.dto.requestDto.colorRequestDto.CreateColorRequestDto;
import kodlama.io.carRental.model.dto.requestDto.colorRequestDto.UpdateColorRequestDto;
import kodlama.io.carRental.model.dto.responseDto.brandResponseDto.GetAllBrandResponseDto;
import kodlama.io.carRental.model.dto.responseDto.brandResponseDto.GetBrandByIdResponseDto;
import kodlama.io.carRental.model.dto.responseDto.colorResponseDto.GetAllColorResponseDto;
import kodlama.io.carRental.model.dto.responseDto.colorResponseDto.GetColorByIdResponseDto;
import kodlama.io.carRental.model.entities.Brand;
import kodlama.io.carRental.model.entities.Color;

import java.util.List;

public interface ColorService {


    CreateColorRequestDto add(Color color);

    List<GetAllColorResponseDto> findAll();

    GetColorByIdResponseDto getColorById(int id);

    UpdateColorRequestDto update(UpdateColorRequestDto requestDto, int id);

    void delete(int id);
}
