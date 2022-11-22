package kodlama.io.carRental.model.dto.requestDto.carRequestDto;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class UpdateCarRequestDto {

    private int id;

    private String carName;

    private String modelYear;

    private double dailyPrice;

    private String description;
}
