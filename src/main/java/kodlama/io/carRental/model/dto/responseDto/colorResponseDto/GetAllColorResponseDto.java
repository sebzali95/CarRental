package kodlama.io.carRental.model.dto.responseDto.colorResponseDto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
@Data
@NoArgsConstructor
@AllArgsConstructor
public class GetAllColorResponseDto {

    private int id;

    @Column(name="color_name")
    private String colorName;
}
