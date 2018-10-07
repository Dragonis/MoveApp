package pl.warsaw.moveapp.Beer;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BeerRepository extends JpaRepository<BeerDao, Long> {

    List<BeerDao> findByName(String phrase);

}
