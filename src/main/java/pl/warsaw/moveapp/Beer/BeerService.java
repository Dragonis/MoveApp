package pl.warsaw.moveapp.Beer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import pl.warsaw.moveapp.Beer.Dto.BeerDto;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

@Service
public class BeerService {

    @Autowired
    BeerRepository beerRepository;

    @PersistenceContext
    EntityManager entityManager;

    private BeerInitializationDatabase initializedb;

    private AppProperties properties;

    private BeerBuilder builder;

    public BeerService(Environment env) {
        this.properties = new AppProperties(env);
        this.initializedb = new BeerInitializationDatabase(env);
        this.builder = new BeerBuilder();
    }

    public BeerDto[] getAllBeersFromExternalAPI() {
        return initializedb.getAllBeersFromExternalAPI();
    }

    @Transactional
    public void insertFixturesIntoDatabase(BeerDto[] dtos) {;
        List<BeerDao> daos = builder.buildFromDtoToDao(dtos);
        for (BeerDao dao : daos) {
            beerRepository.save(dao);
        }
    }

    @Transactional
    public void insertBeerDtoIntoDatabase(BeerDto dto){
        beerRepository.save(builder.buildFromDtoToDao(dto));
    }

    public List<BeerDto> getAllDataFromDatabase() {

        return builder.buildFromDaoToDto(beerRepository.findAll());
    }

    public List<BeerDto> findBeersWithPhrase(String phrase) {
       return builder.buildFromDaoToDto(beerRepository.findByName(phrase));
    }
}
