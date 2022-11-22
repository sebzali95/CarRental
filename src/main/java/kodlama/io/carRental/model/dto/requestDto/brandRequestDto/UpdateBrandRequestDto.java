package kodlama.io.carRental.model.dto.requestDto.brandRequestDto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class UpdateBrandRequestDto {

    private int id;

    @Column(name = "brand_name")
    private String brandName;
}
