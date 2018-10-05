
package pl.warsaw.moveapp.Beer.Dto;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Malt {

    @SerializedName("name")
    private String name;

    @SerializedName("amount")
    private Amount amount;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Amount getAmount() {
        return amount;
    }

    public void setAmount(Amount amount) {
        this.amount = amount;
    }

}
