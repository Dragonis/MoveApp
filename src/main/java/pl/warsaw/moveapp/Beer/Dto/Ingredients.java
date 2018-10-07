
package pl.warsaw.moveapp.Beer.Dto;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter @Setter
public class Ingredients {

    private List<Malt> malt = null;

    private List<Hop> hops = null;

    private String yeast;

}
