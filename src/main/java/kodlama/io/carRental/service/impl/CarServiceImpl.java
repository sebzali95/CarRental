package kodlama.io.carRental.service.impl;

import kodlama.io.carRental.model.dto.requestDto.carRequestDto.CreateCarRequestDto;
import kodlama.io.carRental.model.dto.requestDto.carRequestDto.UpdateCarRequestDto;
import kodlama.io.carRental.model.dto.responseDto.carResponseDto.GetAllCarResponseDto;
import kodlama.io.carRental.model.dto.responseDto.carResponseDto.GetCarByIdResponseDto;
import kodlama.io.carRental.model.entities.Brand;
import kodlama.io.carRental.model.entities.Car;
import kodlama.io.carRental.model.entities.Color;
import kodlama.io.carRental.model.mapper.CarMapper;
import kodlama.io.carRental.repository.BrandRepository;
import kodlama.io.carRental.repository.CarRepository;
import kodlama.io.carRental.repository.ColorRepository;
import kodlama.io.carRental.service.CarService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CarServiceImpl implements CarService {

    private final CarRepository carRepository;
    private final BrandRepository brandRepository;
    private final ColorRepository colorRepository;
    private final CarMapper carMapper;


    @Override
    public List<GetAllCarResponseDto> findAll() {
        List<Car> carList = carRepository.findAll();
        return carMapper.toCarDTOs(carList);
    }

    @Override
    public CreateCarRequestDto add(CreateCarRequestDto requestDto) {
        Car car = carMapper.toCreateCarDto(requestDto);
        Color color = colorRepository.findById(requestDto.getBrandId())
                .orElseThrow(() -> new RuntimeException("color id couldn't find by id :" + requestDto.getColorId()));
        Brand brand = brandRepository.findById(requestDto.getBrandId())
                .orElseThrow(() -> new RuntimeException("brand id couldn't find by id :" + requestDto.getBrandId()));
        car.setCarName(requestDto.getCarName());
        car.setColor(color);
        car.setBrand(brand);
        carRepository.save(car);
        return requestDto;
    }


    @Override
    public GetCarByIdResponseDto getCarById(int id) {
        return carRepository.findById(id)
                .map(car -> carMapper.toCarDto(car))
                .orElseThrow(() -> new RuntimeException("Car id not found"));
    }

    @Override
    public UpdateCarRequestDto update(UpdateCarRequestDto requestDto, int id) {
        Car car = carRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Car id not found"));
        carMapper.update(car, requestDto);
        carRepository.save(car);
        return requestDto;
    }

    @Override
    public void delete(int id) {
        carRepository.deleteById(id);
    }
}
