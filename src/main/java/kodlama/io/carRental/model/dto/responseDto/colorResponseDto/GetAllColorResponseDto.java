package kodlama.io.carRental.model.dto.responseDto.colorResponseDto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class GetAllColorResponseDto {

    private int id;

    private String colorName;
}
