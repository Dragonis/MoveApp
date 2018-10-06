package pl.warsaw.moveapp.Beer;

import org.springframework.dao.DataAccessException;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import pl.warsaw.moveapp.Beer.Dto.BeerDto;

import java.util.List;

@Repository
public interface BeerRepository extends JpaRepository<BeerDao, Long> {

    List<BeerDao> findByName(String phrase);

}
