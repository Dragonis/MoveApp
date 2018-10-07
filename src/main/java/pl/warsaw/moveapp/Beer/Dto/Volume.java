
package pl.warsaw.moveapp.Beer.Dto;

import com.google.gson.annotations.SerializedName;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class Volume {

    @SerializedName("value")
    private Integer value;

    @SerializedName("unit")
    private String unit;

}
