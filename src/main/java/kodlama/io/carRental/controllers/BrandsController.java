package kodlama.io.carRental.controllers;
import kodlama.io.carRental.model.dto.requestDto.brandRequestDto.CreateBrandRequestDto;
import kodlama.io.carRental.model.dto.requestDto.brandRequestDto.UpdateBrandRequestDto;
import kodlama.io.carRental.model.dto.responseDto.brandResponseDto.GetAllBrandResponseDto;
import kodlama.io.carRental.model.dto.responseDto.brandResponseDto.GetBrandByIdResponseDto;
import kodlama.io.carRental.model.entities.Brand;
import kodlama.io.carRental.service.BrandService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/brands")
@RequiredArgsConstructor
public class BrandsController {

    private final BrandService brandService;


    @GetMapping("/getall")
    public List<GetAllBrandResponseDto> findAllBrands() {
        return brandService.findAll();
    }

    @GetMapping("/{id}")
    public GetBrandByIdResponseDto getBrandById(@PathVariable int id) {
        return brandService.getBrandById(id);
    }

    @PostMapping("/add")
    public CreateBrandRequestDto createBrand(@RequestBody Brand brand) {
        return brandService.add(brand);
    }

    @PutMapping("/update/{id}")
    public UpdateBrandRequestDto updateBrand(@RequestBody UpdateBrandRequestDto requestDto, @PathVariable int id) {
        return brandService.update(requestDto, id);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteBrand(@PathVariable int id) {
        brandService.delete(id);
    }
}
