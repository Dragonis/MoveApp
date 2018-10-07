package pl.warsaw.moveapp;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import pl.warsaw.moveapp.Beer.BeerFacade;
import pl.warsaw.moveapp.Beer.Dto.BeerDto;

import java.util.List;

@RestController("/")
@AllArgsConstructor
public class IndexController {

    private BeerFacade facade;

    @GetMapping("/")
    public List<BeerDto> index(){
        facade.insertFixturesIntoDatabase(facade.getAllBeersFromExternalAPI());
        return facade.getAllDataFromDatabase();
    }

    @GetMapping("/foodpairings/search/{phrase}")
    public List<BeerDto> findByPhrase(@PathVariable("phrase") String phrase) {
        return facade.findBeersWithPhrase(phrase);
    }

    @PostMapping("/beers")
    public void insertBeer(@RequestBody BeerDto dto) {
        facade.insertBeerDtoIntoDatabase(dto);
    }

}
