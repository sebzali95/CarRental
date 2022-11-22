package kodlama.io.carRental.model.dto.requestDto.brandRequestDto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@AllArgsConstructor
@NoArgsConstructor
@Data
public class UpdateBrandRequestDto {

    private int id;

    private String brandName;
}
