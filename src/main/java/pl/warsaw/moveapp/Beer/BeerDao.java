package pl.warsaw.moveapp.Beer;

import javax.persistence.*;

@Entity(name = "Beer")
public class BeerDao {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Integer punkapiId;

    String name;

    String tagline;

    String firstBrewed;

    String description;

    String imageUrl;

    Integer ibu;

}
