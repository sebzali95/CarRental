package kodlama.io.carRental.service.impl;

import kodlama.io.carRental.model.dto.requestDto.colorRequestDto.CreateColorRequestDto;
import kodlama.io.carRental.model.dto.requestDto.colorRequestDto.UpdateColorRequestDto;
import kodlama.io.carRental.model.dto.responseDto.colorResponseDto.GetAllColorResponseDto;
import kodlama.io.carRental.model.dto.responseDto.colorResponseDto.GetColorByIdResponseDto;
import kodlama.io.carRental.model.entities.Color;
import kodlama.io.carRental.model.mapper.ColorMapper;
import kodlama.io.carRental.repository.ColorRepository;
import kodlama.io.carRental.service.ColorService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ColorServiceImpl implements ColorService {

    private final ColorRepository colorRepository;
    private final ColorMapper colorMapper;


    @Override
    public List<GetAllColorResponseDto> findAll() {
        List<Color> colorList = colorRepository.findAll();
        return colorMapper.toColorDTOs(colorList);
    }

    @Override
    public CreateColorRequestDto add(Color color) {
        Color save = colorRepository.save(color);
        CreateColorRequestDto createColorRequestDto = colorMapper.toCreateColorRequest(save);
        return createColorRequestDto;
    }


    @Override
    public GetColorByIdResponseDto getColorById(int id) {
        return colorRepository.findById(id)
                .map(color -> colorMapper.toColorDto(color))
                .orElseThrow(() -> new RuntimeException("Color id not found"));
    }

    @Override
    public UpdateColorRequestDto update(UpdateColorRequestDto requestDto, int id) {
        Color color = colorRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Color id not found"));
        colorMapper.update(color, requestDto);
        colorRepository.save(color);
        return requestDto;
    }

    @Override
    public void delete(int id) {
        colorRepository.deleteById(id);
    }
}
