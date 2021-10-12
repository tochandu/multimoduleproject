
package captemplate.api.verifyPerson.v1;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.processing.Generated;
import javax.validation.Valid;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "streetNumber",
    "streetName",
    "cityName",
    "stateCode",
    "zipCode"
})
@Generated("jsonschema2pojo")
public class DomesticAddress {

    /**
     * The street number from the address
     * 
     */
    @JsonProperty("streetNumber")
    @JsonPropertyDescription("The street number from the address")
    private String streetNumber;
    /**
     * The street name from the address
     * 
     */
    @JsonProperty("streetName")
    @JsonPropertyDescription("The street name from the address")
    private String streetName;
    /**
     * The city name from the address
     * 
     */
    @JsonProperty("cityName")
    @JsonPropertyDescription("The city name from the address")
    private String cityName;
    /**
     * The 2 character state code from the address
     * 
     */
    @JsonProperty("stateCode")
    @JsonPropertyDescription("The 2 character state code from the address")
    private String stateCode;
    /**
     * The zip code from the address is a recommended field for verification
     * 
     */
    @JsonProperty("zipCode")
    @JsonPropertyDescription("The zip code from the address is a recommended field for verification")
    private String zipCode;
    @JsonIgnore
    @Valid
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public DomesticAddress() {
    }

    /**
     * 
     * @param zipCode
     * @param streetName
     * @param cityName
     * @param streetNumber
     * @param stateCode
     */
    public DomesticAddress(String streetNumber, String streetName, String cityName, String stateCode, String zipCode) {
        super();
        this.streetNumber = streetNumber;
        this.streetName = streetName;
        this.cityName = cityName;
        this.stateCode = stateCode;
        this.zipCode = zipCode;
    }

    /**
     * The street number from the address
     * 
     */
    @JsonProperty("streetNumber")
    public String getStreetNumber() {
        return streetNumber;
    }

    /**
     * The street number from the address
     * 
     */
    @JsonProperty("streetNumber")
    public void setStreetNumber(String streetNumber) {
        this.streetNumber = streetNumber;
    }

    /**
     * The street name from the address
     * 
     */
    @JsonProperty("streetName")
    public String getStreetName() {
        return streetName;
    }

    /**
     * The street name from the address
     * 
     */
    @JsonProperty("streetName")
    public void setStreetName(String streetName) {
        this.streetName = streetName;
    }

    /**
     * The city name from the address
     * 
     */
    @JsonProperty("cityName")
    public String getCityName() {
        return cityName;
    }

    /**
     * The city name from the address
     * 
     */
    @JsonProperty("cityName")
    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    /**
     * The 2 character state code from the address
     * 
     */
    @JsonProperty("stateCode")
    public String getStateCode() {
        return stateCode;
    }

    /**
     * The 2 character state code from the address
     * 
     */
    @JsonProperty("stateCode")
    public void setStateCode(String stateCode) {
        this.stateCode = stateCode;
    }

    /**
     * The zip code from the address is a recommended field for verification
     * 
     */
    @JsonProperty("zipCode")
    public String getZipCode() {
        return zipCode;
    }

    /**
     * The zip code from the address is a recommended field for verification
     * 
     */
    @JsonProperty("zipCode")
    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(DomesticAddress.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("streetNumber");
        sb.append('=');
        sb.append(((this.streetNumber == null)?"<null>":this.streetNumber));
        sb.append(',');
        sb.append("streetName");
        sb.append('=');
        sb.append(((this.streetName == null)?"<null>":this.streetName));
        sb.append(',');
        sb.append("cityName");
        sb.append('=');
        sb.append(((this.cityName == null)?"<null>":this.cityName));
        sb.append(',');
        sb.append("stateCode");
        sb.append('=');
        sb.append(((this.stateCode == null)?"<null>":this.stateCode));
        sb.append(',');
        sb.append("zipCode");
        sb.append('=');
        sb.append(((this.zipCode == null)?"<null>":this.zipCode));
        sb.append(',');
        sb.append("additionalProperties");
        sb.append('=');
        sb.append(((this.additionalProperties == null)?"<null>":this.additionalProperties));
        sb.append(',');
        if (sb.charAt((sb.length()- 1)) == ',') {
            sb.setCharAt((sb.length()- 1), ']');
        } else {
            sb.append(']');
        }
        return sb.toString();
    }

    @Override
    public int hashCode() {
        int result = 1;
        result = ((result* 31)+((this.zipCode == null)? 0 :this.zipCode.hashCode()));
        result = ((result* 31)+((this.streetName == null)? 0 :this.streetName.hashCode()));
        result = ((result* 31)+((this.cityName == null)? 0 :this.cityName.hashCode()));
        result = ((result* 31)+((this.streetNumber == null)? 0 :this.streetNumber.hashCode()));
        result = ((result* 31)+((this.stateCode == null)? 0 :this.stateCode.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof DomesticAddress) == false) {
            return false;
        }
        DomesticAddress rhs = ((DomesticAddress) other);
        return (((((((this.zipCode == rhs.zipCode)||((this.zipCode!= null)&&this.zipCode.equals(rhs.zipCode)))&&((this.streetName == rhs.streetName)||((this.streetName!= null)&&this.streetName.equals(rhs.streetName))))&&((this.cityName == rhs.cityName)||((this.cityName!= null)&&this.cityName.equals(rhs.cityName))))&&((this.streetNumber == rhs.streetNumber)||((this.streetNumber!= null)&&this.streetNumber.equals(rhs.streetNumber))))&&((this.stateCode == rhs.stateCode)||((this.stateCode!= null)&&this.stateCode.equals(rhs.stateCode))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))));
    }

}
