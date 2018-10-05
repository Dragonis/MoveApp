
package pl.warsaw.moveapp.Beer.Dto;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Method {

    @SerializedName("mash_temp")
    private List<MashTemp> mashTemp = null;

    @SerializedName("fermentation")
    private Fermentation fermentation;

    @SerializedName("twist")
    private String twist;

    public List<MashTemp> getMashTemp() {
        return mashTemp;
    }

    public void setMashTemp(List<MashTemp> mashTemp) {
        this.mashTemp = mashTemp;
    }

    public Fermentation getFermentation() {
        return fermentation;
    }

    public void setFermentation(Fermentation fermentation) {
        this.fermentation = fermentation;
    }

    public String getTwist() {
        return twist;
    }

    public void setTwist(String twist) {
        this.twist = twist;
    }

}
