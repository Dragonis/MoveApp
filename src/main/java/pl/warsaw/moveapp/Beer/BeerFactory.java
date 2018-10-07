package pl.warsaw.moveapp.Beer;

import lombok.NoArgsConstructor;
import pl.warsaw.moveapp.Beer.Dto.BeerDto;

import java.util.ArrayList;
import java.util.List;

@NoArgsConstructor
public class BeerFactory {

    List<BeerDao> buildFromDtoToDao(BeerDto[] dtos) {

        List<BeerDao> daos = new ArrayList<>();

        for(BeerDto dto : dtos) {

            daos.add(BeerDao
            .builder()
                .punkapiId(dto.getPunkapiId())
                .name(dto.getName())
                .tagline(dto.getTagline())
                .firstBrewed(dto.getFirstBrewed())
                .description(dto.getDescription())
                .imageUrl(dto.getImageUrl())
                .ibu(dto.getIbu())
            .build());

        }

        return daos;
    }

    BeerDao buildFromDtoToDao(BeerDto dto) {

        return BeerDao
        .builder()
            .punkapiId(dto.getPunkapiId())
            .name(dto.getName())
            .tagline(dto.getTagline())
            .firstBrewed(dto.getFirstBrewed())
            .description(dto.getDescription())
            .imageUrl(dto.getImageUrl())
            .ibu(dto.getIbu())
        .build();

    }

    List<BeerDto> buildFromDaoToDto(List<BeerDao> daos) {

        List<BeerDto> dtos = new ArrayList<>();

        for(BeerDao dao : daos) {
            dtos.add(BeerDto
            .builder()
                .punkapiId(dao.getPunkapiId())
                .name(dao.getName())
                .tagline(dao.getTagline())
                .brewersTips(dao.getFirstBrewed())
                .description(dao.getDescription())
                .imageUrl(dao.getImageUrl())
                .ibu(dao.getIbu())
            .build());
        }

        return dtos;
    }
}
