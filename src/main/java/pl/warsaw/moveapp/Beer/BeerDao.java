package pl.warsaw.moveapp.Beer;

import lombok.*;

import javax.persistence.*;

@Entity(name = "Beer")
@Builder
@Getter @Setter
@AllArgsConstructor
@NoArgsConstructor
public class BeerDao {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer punkapiId;

    private String name;

    private String tagline;

    private String firstBrewed;

    @Column(length = 4096)
    private String description;

    private String imageUrl;

    private Double ibu;

}
