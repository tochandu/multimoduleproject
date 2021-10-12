
package captemplate.api.verifyPerson.v1;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.processing.Generated;
import javax.validation.Valid;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonValue;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "phoneType",
    "phoneNumber",
    "phonePreference"
})
@Generated("jsonschema2pojo")
public class PhoneNumber {

    /**
     * The Phone type. Expected values from HOME, WORK, CELL
     * 
     */
    @JsonProperty("phoneType")
    @JsonPropertyDescription("The Phone type. Expected values from HOME, WORK, CELL")
    private PhoneNumber.PhoneType phoneType;
    /**
     * The Phone number is a required field for verification
     * 
     */
    @JsonProperty("phoneNumber")
    @JsonPropertyDescription("The Phone number is a required field for verification")
    private String phoneNumber;
    /**
     * The Phone Preference. Expected values from PRIMARY, SECONDARY
     * 
     */
    @JsonProperty("phonePreference")
    @JsonPropertyDescription("The Phone Preference. Expected values from PRIMARY, SECONDARY")
    private PhoneNumber.PhonePreference phonePreference;
    @JsonIgnore
    @Valid
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public PhoneNumber() {
    }

    /**
     * 
     * @param phoneType
     * @param phoneNumber
     * @param phonePreference
     */
    public PhoneNumber(PhoneNumber.PhoneType phoneType, String phoneNumber, PhoneNumber.PhonePreference phonePreference) {
        super();
        this.phoneType = phoneType;
        this.phoneNumber = phoneNumber;
        this.phonePreference = phonePreference;
    }

    /**
     * The Phone type. Expected values from HOME, WORK, CELL
     * 
     */
    @JsonProperty("phoneType")
    public PhoneNumber.PhoneType getPhoneType() {
        return phoneType;
    }

    /**
     * The Phone type. Expected values from HOME, WORK, CELL
     * 
     */
    @JsonProperty("phoneType")
    public void setPhoneType(PhoneNumber.PhoneType phoneType) {
        this.phoneType = phoneType;
    }

    /**
     * The Phone number is a required field for verification
     * 
     */
    @JsonProperty("phoneNumber")
    public String getPhoneNumber() {
        return phoneNumber;
    }

    /**
     * The Phone number is a required field for verification
     * 
     */
    @JsonProperty("phoneNumber")
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    /**
     * The Phone Preference. Expected values from PRIMARY, SECONDARY
     * 
     */
    @JsonProperty("phonePreference")
    public PhoneNumber.PhonePreference getPhonePreference() {
        return phonePreference;
    }

    /**
     * The Phone Preference. Expected values from PRIMARY, SECONDARY
     * 
     */
    @JsonProperty("phonePreference")
    public void setPhonePreference(PhoneNumber.PhonePreference phonePreference) {
        this.phonePreference = phonePreference;
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
        sb.append(PhoneNumber.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("phoneType");
        sb.append('=');
        sb.append(((this.phoneType == null)?"<null>":this.phoneType));
        sb.append(',');
        sb.append("phoneNumber");
        sb.append('=');
        sb.append(((this.phoneNumber == null)?"<null>":this.phoneNumber));
        sb.append(',');
        sb.append("phonePreference");
        sb.append('=');
        sb.append(((this.phonePreference == null)?"<null>":this.phonePreference));
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
        result = ((result* 31)+((this.phoneType == null)? 0 :this.phoneType.hashCode()));
        result = ((result* 31)+((this.phoneNumber == null)? 0 :this.phoneNumber.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.phonePreference == null)? 0 :this.phonePreference.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof PhoneNumber) == false) {
            return false;
        }
        PhoneNumber rhs = ((PhoneNumber) other);
        return (((((this.phoneType == rhs.phoneType)||((this.phoneType!= null)&&this.phoneType.equals(rhs.phoneType)))&&((this.phoneNumber == rhs.phoneNumber)||((this.phoneNumber!= null)&&this.phoneNumber.equals(rhs.phoneNumber))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.phonePreference == rhs.phonePreference)||((this.phonePreference!= null)&&this.phonePreference.equals(rhs.phonePreference))));
    }


    /**
     * The Phone Preference. Expected values from PRIMARY, SECONDARY
     * 
     */
    @Generated("jsonschema2pojo")
    public enum PhonePreference {

        PRIMARY("PRIMARY"),
        SECONDARY("SECONDARY");
        private final String value;
        private final static Map<String, PhoneNumber.PhonePreference> CONSTANTS = new HashMap<String, PhoneNumber.PhonePreference>();

        static {
            for (PhoneNumber.PhonePreference c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        PhonePreference(String value) {
            this.value = value;
        }

        @Override
        public String toString() {
            return this.value;
        }

        @JsonValue
        public String value() {
            return this.value;
        }

        @JsonCreator
        public static PhoneNumber.PhonePreference fromValue(String value) {
            PhoneNumber.PhonePreference constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }


    /**
     * The Phone type. Expected values from HOME, WORK, CELL
     * 
     */
    @Generated("jsonschema2pojo")
    public enum PhoneType {

        HOME("HOME"),
        WORK("WORK"),
        CELL("CELL");
        private final String value;
        private final static Map<String, PhoneNumber.PhoneType> CONSTANTS = new HashMap<String, PhoneNumber.PhoneType>();

        static {
            for (PhoneNumber.PhoneType c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        PhoneType(String value) {
            this.value = value;
        }

        @Override
        public String toString() {
            return this.value;
        }

        @JsonValue
        public String value() {
            return this.value;
        }

        @JsonCreator
        public static PhoneNumber.PhoneType fromValue(String value) {
            PhoneNumber.PhoneType constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

}
