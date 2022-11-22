package kodlama.io.carRental.controllers;
import kodlama.io.carRental.model.dto.requestDto.colorRequestDto.CreateColorRequestDto;
import kodlama.io.carRental.model.dto.requestDto.colorRequestDto.UpdateColorRequestDto;;
import kodlama.io.carRental.model.dto.responseDto.colorResponseDto.GetAllColorResponseDto;
import kodlama.io.carRental.model.dto.responseDto.colorResponseDto.GetColorByIdResponseDto;
import kodlama.io.carRental.service.ColorService;
import kodlama.io.carRental.model.entities.Color;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/colors")
@RequiredArgsConstructor
public class ColorsController {

    private final ColorService colorService;


    @GetMapping("/getall")
    public List<GetAllColorResponseDto> getAllColors() {
        return colorService.findAll();
    }

    @GetMapping("/{id}")
    public GetColorByIdResponseDto getColorById(@PathVariable int id) {
        return colorService.getColorById(id);
    }

    @PostMapping("/add")
    public CreateColorRequestDto createColor(@RequestBody Color color) {
        return colorService.add(color);
    }

    @PutMapping("/update/{id}")
    public UpdateColorRequestDto updateColor(@RequestBody UpdateColorRequestDto requestDto, @PathVariable int id) {
        return colorService.update(requestDto,id);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteColor(@PathVariable int id) {
        colorService.delete(id);
    }

}
