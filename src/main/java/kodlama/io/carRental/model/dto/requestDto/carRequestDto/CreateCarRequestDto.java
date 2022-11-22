package kodlama.io.carRental.model.dto.requestDto.carRequestDto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CreateCarRequestDto {

    private String carName;

    private String modelYear;

    private double dailyPrice;

    private String description;

    private int colorId;
    private int brandId;
}
