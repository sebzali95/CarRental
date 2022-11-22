package kodlama.io.carRental.model.dto.responseDto.carResponseDto;

import kodlama.io.carRental.model.dto.responseDto.brandResponseDto.GetAllBrandResponseDto;
import kodlama.io.carRental.model.dto.responseDto.colorResponseDto.GetAllColorResponseDto;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class GetAllCarResponseDto {

    private int id;

    private String carName;

    private String modelYear;

    private double dailyPrice;

    private String description;
}
