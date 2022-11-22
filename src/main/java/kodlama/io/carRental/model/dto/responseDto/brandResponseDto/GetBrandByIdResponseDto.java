package kodlama.io.carRental.model.dto.responseDto.brandResponseDto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class GetBrandByIdResponseDto {

    private int id;

    @Column(name = "brand_name")
    private String brandName;
}
