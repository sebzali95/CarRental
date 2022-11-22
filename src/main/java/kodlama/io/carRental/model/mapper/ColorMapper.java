package kodlama.io.carRental.model.mapper;

import kodlama.io.carRental.model.dto.requestDto.colorRequestDto.CreateColorRequestDto;
import kodlama.io.carRental.model.dto.requestDto.colorRequestDto.UpdateColorRequestDto;
import kodlama.io.carRental.model.dto.responseDto.colorResponseDto.GetAllColorResponseDto;
import kodlama.io.carRental.model.dto.responseDto.colorResponseDto.GetColorByIdResponseDto;
import kodlama.io.carRental.model.entities.Color;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;

import java.util.List;

@Mapper(componentModel = "spring")
public interface ColorMapper {

    List<GetAllColorResponseDto> toColorDTOs(List<Color> colors);

    GetColorByIdResponseDto toColorDto(Color color);

    CreateColorRequestDto toCreateColorRequest(Color color);

    void update(@MappingTarget Color color, UpdateColorRequestDto updateColorRequestDto);
}
