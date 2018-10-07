package pl.warsaw.moveapp.Beer;

import lombok.AllArgsConstructor;
import org.springframework.core.env.Environment;
import org.springframework.transaction.annotation.Transactional;
import pl.warsaw.moveapp.Beer.Dto.BeerDto;

import java.util.List;

@AllArgsConstructor
@Transactional
public class BeerFacade {

    private BeerRepository repository;
    private BeerFactory builder;
    private Environment env;

    public BeerDto[] getAllBeersFromExternalAPI() {
       BeerInitializeDatabase initdb = new BeerInitializeDatabase(env);
       return initdb.getAllBeersFromExternalAPI();
    }

    public void insertFixturesIntoDatabase(BeerDto[] dtos) {;
        List<BeerDao> daos = builder.buildFromDtoToDao(dtos);
        for (BeerDao dao : daos) {
            repository.save(dao);
        }
    }

    public void insertBeerDtoIntoDatabase(BeerDto dto){
        repository.save(builder.buildFromDtoToDao(dto));
    }

    public List<BeerDto> getAllDataFromDatabase() {

        return builder.buildFromDaoToDto(repository.findAll());
    }

    public List<BeerDto> findBeersWithPhrase(String phrase) {

        String capitalizedWord = phrase.substring(0, 1).toUpperCase() + phrase.substring(1);

        return builder.buildFromDaoToDto(repository.findByName(capitalizedWord));
    }
}
