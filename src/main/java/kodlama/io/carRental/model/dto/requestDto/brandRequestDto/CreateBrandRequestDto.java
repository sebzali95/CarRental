package kodlama.io.carRental.model.dto.requestDto.brandRequestDto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CreateBrandRequestDto {


    @Column(name = "brand_name")
    private String brandName;

}
