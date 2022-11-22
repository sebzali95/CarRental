package kodlama.io.carRental.controllers;
import kodlama.io.carRental.model.dto.requestDto.carRequestDto.CreateCarRequestDto;
import kodlama.io.carRental.model.dto.requestDto.carRequestDto.UpdateCarRequestDto;
import kodlama.io.carRental.model.dto.responseDto.carResponseDto.GetAllCarResponseDto;
import kodlama.io.carRental.model.dto.responseDto.carResponseDto.GetCarByIdResponseDto;
import kodlama.io.carRental.service.CarService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import java.util.List;


@RestController
@RequestMapping("/cars")
@RequiredArgsConstructor
public class CarsController {

    private final CarService carService;


    @GetMapping("/getall")
    public List<GetAllCarResponseDto> findAllCars() {
        return carService.findAll();
    }

    @GetMapping("/{id}")
    public GetCarByIdResponseDto getCarById(@PathVariable int id) {
        return carService.getCarById(id);
    }

    @PostMapping("/add")
    public CreateCarRequestDto createCar(@RequestBody CreateCarRequestDto requestDto) {
        return carService.add(requestDto);
    }

    @PutMapping("/update/{id}")
    public UpdateCarRequestDto updateCar(@RequestBody UpdateCarRequestDto requestDto, @PathVariable int id) {
        return carService.update(requestDto, id);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteCar(@PathVariable int id) {
        carService.delete(id);
    }
}
