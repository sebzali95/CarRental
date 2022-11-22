package kodlama.io.carRental.service;

import kodlama.io.carRental.model.dto.requestDto.brandRequestDto.CreateBrandRequestDto;
import kodlama.io.carRental.model.dto.requestDto.brandRequestDto.UpdateBrandRequestDto;
import kodlama.io.carRental.model.dto.requestDto.carRequestDto.CreateCarRequestDto;
import kodlama.io.carRental.model.dto.requestDto.carRequestDto.UpdateCarRequestDto;
import kodlama.io.carRental.model.dto.responseDto.brandResponseDto.GetAllBrandResponseDto;
import kodlama.io.carRental.model.dto.responseDto.brandResponseDto.GetBrandByIdResponseDto;
import kodlama.io.carRental.model.dto.responseDto.carResponseDto.GetAllCarResponseDto;
import kodlama.io.carRental.model.dto.responseDto.carResponseDto.GetCarByIdResponseDto;
import kodlama.io.carRental.model.entities.Brand;
import kodlama.io.carRental.model.entities.Car;

import java.util.List;

public interface CarService {


    CreateCarRequestDto add(CreateCarRequestDto carRequestDto);

    List<GetAllCarResponseDto> findAll();

    GetCarByIdResponseDto getCarById(int id);

    UpdateCarRequestDto update(UpdateCarRequestDto requestDto, int id);

    void delete(int id);
}
