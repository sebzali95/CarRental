package kodlama.io.carRental.model.dto.responseDto.colorResponseDto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
@Data
@NoArgsConstructor
@AllArgsConstructor
public class GetColorByIdResponseDto {

    private int id;

    private String colorName;
}
