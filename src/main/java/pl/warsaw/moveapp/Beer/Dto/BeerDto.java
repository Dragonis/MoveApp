
package pl.warsaw.moveapp.Beer.Dto;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class BeerDto {

    @SerializedName("id")
    private Integer punkapiId;

    @SerializedName("name")
    private String name;

    @SerializedName("tagline")
    private String tagline;

    @SerializedName("first_brewed")
    private String firstBrewed;

    @SerializedName("description")
    private String description;

    @SerializedName("image_url")
    private String imageUrl;

    @SerializedName("abv")
    private Double abv;

    @SerializedName("ibu")
    private Integer ibu;

    @SerializedName("target_fg")
    private Integer targetFg;

    @SerializedName("target_og")
    private Integer targetOg;

    @SerializedName("ebc")
    private Integer ebc;

    @SerializedName("srm")
    private Integer srm;

    @SerializedName("ph")
    private Double ph;

    @SerializedName("attenuation_level")
    private Integer attenuationLevel;

    @SerializedName("volume")
    private Volume volume;

    @SerializedName("boil_volume")
    private BoilVolume boilVolume;

    @SerializedName("method")
    private Method method;

    @SerializedName("ingredients")
    private Ingredients ingredients;

    @SerializedName("food_pairing")
    private List<String> foodPairing = null;

    @SerializedName("brewers_tips")
    private String brewersTips;

    @SerializedName("contributed_by")
    private String contributedBy;

    public Integer getPunkapiId() {
        return punkapiId;
    }

    public void setPunkapiId(Integer punkapiId) {
        this.punkapiId = punkapiId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTagline() {
        return tagline;
    }

    public void setTagline(String tagline) {
        this.tagline = tagline;
    }

    public String getFirstBrewed() {
        return firstBrewed;
    }

    public void setFirstBrewed(String firstBrewed) {
        this.firstBrewed = firstBrewed;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public Double getAbv() {
        return abv;
    }

    public void setAbv(Double abv) {
        this.abv = abv;
    }

    public Integer getIbu() {
        return ibu;
    }

    public void setIbu(Integer ibu) {
        this.ibu = ibu;
    }

    public Integer getTargetFg() {
        return targetFg;
    }

    public void setTargetFg(Integer targetFg) {
        this.targetFg = targetFg;
    }

    public Integer getTargetOg() {
        return targetOg;
    }

    public void setTargetOg(Integer targetOg) {
        this.targetOg = targetOg;
    }

    public Integer getEbc() {
        return ebc;
    }

    public void setEbc(Integer ebc) {
        this.ebc = ebc;
    }

    public Integer getSrm() {
        return srm;
    }

    public void setSrm(Integer srm) {
        this.srm = srm;
    }

    public Double getPh() {
        return ph;
    }

    public void setPh(Double ph) {
        this.ph = ph;
    }

    public Integer getAttenuationLevel() {
        return attenuationLevel;
    }

    public void setAttenuationLevel(Integer attenuationLevel) {
        this.attenuationLevel = attenuationLevel;
    }

    public Volume getVolume() {
        return volume;
    }

    public void setVolume(Volume volume) {
        this.volume = volume;
    }

    public BoilVolume getBoilVolume() {
        return boilVolume;
    }

    public void setBoilVolume(BoilVolume boilVolume) {
        this.boilVolume = boilVolume;
    }

    public Method getMethod() {
        return method;
    }

    public void setMethod(Method method) {
        this.method = method;
    }

    public Ingredients getIngredients() {
        return ingredients;
    }

    public void setIngredients(Ingredients ingredients) {
        this.ingredients = ingredients;
    }

    public List<String> getFoodPairing() {
        return foodPairing;
    }

    public void setFoodPairing(List<String> foodPairing) {
        this.foodPairing = foodPairing;
    }

    public String getBrewersTips() {
        return brewersTips;
    }

    public void setBrewersTips(String brewersTips) {
        this.brewersTips = brewersTips;
    }

    public String getContributedBy() {
        return contributedBy;
    }

    public void setContributedBy(String contributedBy) {
        this.contributedBy = contributedBy;
    }

}
