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

    // Without set leght size is error message 'Wartość za długa dla kolumny "DESCRIPTION VARCHAR(255)"'
    @Column(length = 4096)
    String description;

    String imageUrl;

    Double ibu;

}
