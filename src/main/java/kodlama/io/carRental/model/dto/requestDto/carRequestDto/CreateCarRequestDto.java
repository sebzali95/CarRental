package kodlama.io.carRental.model.dto.requestDto.carRequestDto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CreateCarRequestDto {

    @Column(name = "car_name")
    private String carName;

    @Column(name = "model_year")
    private String modelYear;

    @Column(name = "daily_price")
    private double dailyPrice;

    @Column(name = "description")
    private String description;

    private int colorId;
    private int brandId;
}
