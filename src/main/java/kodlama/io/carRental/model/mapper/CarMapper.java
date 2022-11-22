package kodlama.io.carRental.model.mapper;
import kodlama.io.carRental.model.dto.requestDto.carRequestDto.CreateCarRequestDto;
import kodlama.io.carRental.model.dto.requestDto.carRequestDto.UpdateCarRequestDto;
import kodlama.io.carRental.model.dto.responseDto.carResponseDto.GetAllCarResponseDto;
import kodlama.io.carRental.model.dto.responseDto.carResponseDto.GetCarByIdResponseDto;
import kodlama.io.carRental.model.entities.Car;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;

import java.util.List;

@Mapper(componentModel = "spring")
public interface CarMapper {


    List<GetAllCarResponseDto> toCarDTOs(List<Car> cars);

    GetCarByIdResponseDto toCarDto(Car cars);

    Car toCreateCarDto(CreateCarRequestDto createCarRequestDto);

    void update(@MappingTarget Car cars, UpdateCarRequestDto updateCarRequestDto);
}
