
package pl.warsaw.moveapp.Beer.Dto;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Builder
@Getter @Setter
public class BeerDto {

    @SerializedName("id")
    private Integer punkapiId;

    private String name, tagline, description;

    private Double abv, ibu, ebc, srm, ph;

    @SerializedName("first_brewed")
    private String firstBrewed;

    @SerializedName("image_url")
    private String imageUrl;

    @SerializedName("target_fg")
    private Double targetFg;

    @SerializedName("target_og")
    private Double targetOg;

    @SerializedName("attenuation_level")
    private Double attenuationLevel;

    private Volume volume;

    @SerializedName("boil_volume")
    private BoilVolume boilVolume;

    @SerializedName("method")
    private Method method;

    private Ingredients ingredients;

    @SerializedName("food_pairing")
    private List<String> foodPairing = null;

    @SerializedName("brewers_tips")
    private String brewersTips;

    @SerializedName("contributed_by")
    private String contributedBy;

}
