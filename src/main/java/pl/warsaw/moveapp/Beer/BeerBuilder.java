package pl.warsaw.moveapp.Beer;

import pl.warsaw.moveapp.Beer.Dto.BeerDto;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class BeerBuilder {

    private BeerDto temp;

    List<BeerDao> buildFromDtoToDao(BeerDto[] dtos) {
        List<BeerDao> daos = new ArrayList<>();
        BeerDao dao;
        for(BeerDto dto: dtos) {
            dao = new BeerDao();
            dao.punkapiId = dto.getPunkapiId();
            dao.name = dto.getName();
            dao.tagline = dto.getTagline();
            dao.firstBrewed = dto.getFirstBrewed();
            dao.description = dto.getDescription();
            dao.imageUrl = dto.getImageUrl();
            dao.ibu = dto.getIbu();
            daos.add(dao);
        }
        return daos;

    }

    BeerDao buildFromDtoToDao(BeerDto dto) {
        BeerDao dao = new BeerDao();
        dao.punkapiId = dto.getPunkapiId();
        dao.name = dto.getName();
        dao.tagline = dto.getTagline();
        dao.firstBrewed = dto.getFirstBrewed();
        dao.description = dto.getDescription();
        dao.imageUrl = dto.getImageUrl();
        dao.ibu = dto.getIbu();
        return dao;
    }

    List<BeerDto> buildFromDaoToDto(List<BeerDao> daos) {
        List<BeerDto> dtos = new ArrayList<>();
        for(BeerDao dao : daos) {
            temp = new BeerDto();
            temp.setPunkapiId(dao.punkapiId);
            temp.setName(dao.name);
            temp.setTagline(dao.tagline);
            temp.setBrewersTips(dao.firstBrewed);
            temp.setDescription(dao.description);
            temp.setImageUrl(dao.imageUrl);
            temp.setIbu(dao.ibu);
            dtos.add(temp);
            temp = null;
        }
        return dtos;
    }

}
