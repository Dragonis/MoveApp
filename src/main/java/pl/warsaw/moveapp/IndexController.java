package pl.warsaw.moveapp;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import pl.warsaw.moveapp.Beer.BeerService;
import pl.warsaw.moveapp.Beer.Dto.BeerDto;

import java.util.List;

@RestController("/")
public class IndexController {

    BeerService beerService;

    public IndexController(BeerService beerService) {
        this.beerService = beerService;
    }

    @GetMapping(value="/", produces=MediaType.APPLICATION_JSON_VALUE)
    public List<BeerDto> index(){
        beerService.insertFixturesIntoDatabase(beerService.getAllBeersFromExternalAPI());
        return beerService.getAllDataFromDatabase();
    }

    @GetMapping(value="/foodpairings/search/{phrase}", produces=MediaType.APPLICATION_JSON_VALUE)
    public List<BeerDto> findByPhrase(@PathVariable("phrase") String phrase) {
        return beerService.findBeersWithPhrase(phrase);
    }

    @PostMapping("/beers")
    public void insertBeer(@RequestBody BeerDto dto) {
        beerService.insertBeerDtoIntoDatabase(dto);
    }

}
