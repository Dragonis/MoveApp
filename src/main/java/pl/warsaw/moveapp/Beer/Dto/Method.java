
package pl.warsaw.moveapp.Beer.Dto;

import com.google.gson.annotations.SerializedName;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter @Setter
public class Method {

    @SerializedName("mash_temp")
    private List<MashTemp> mashTemp = null;

    private Fermentation fermentation;

    private String twist;

}
