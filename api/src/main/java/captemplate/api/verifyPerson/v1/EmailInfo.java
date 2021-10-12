
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
    "emailType",
    "emailAddress"
})
@Generated("jsonschema2pojo")
public class EmailInfo {

    /**
     * The email type. Expected values from PERSONAL, OFFICIAL
     * 
     */
    @JsonProperty("emailType")
    @JsonPropertyDescription("The email type. Expected values from PERSONAL, OFFICIAL")
    private EmailInfo.EmailType emailType;
    /**
     * The email address
     * 
     */
    @JsonProperty("emailAddress")
    @JsonPropertyDescription("The email address")
    private String emailAddress;
    @JsonIgnore
    @Valid
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public EmailInfo() {
    }

    /**
     * 
     * @param emailAddress
     * @param emailType
     */
    public EmailInfo(EmailInfo.EmailType emailType, String emailAddress) {
        super();
        this.emailType = emailType;
        this.emailAddress = emailAddress;
    }

    /**
     * The email type. Expected values from PERSONAL, OFFICIAL
     * 
     */
    @JsonProperty("emailType")
    public EmailInfo.EmailType getEmailType() {
        return emailType;
    }

    /**
     * The email type. Expected values from PERSONAL, OFFICIAL
     * 
     */
    @JsonProperty("emailType")
    public void setEmailType(EmailInfo.EmailType emailType) {
        this.emailType = emailType;
    }

    /**
     * The email address
     * 
     */
    @JsonProperty("emailAddress")
    public String getEmailAddress() {
        return emailAddress;
    }

    /**
     * The email address
     * 
     */
    @JsonProperty("emailAddress")
    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
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
        sb.append(EmailInfo.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("emailType");
        sb.append('=');
        sb.append(((this.emailType == null)?"<null>":this.emailType));
        sb.append(',');
        sb.append("emailAddress");
        sb.append('=');
        sb.append(((this.emailAddress == null)?"<null>":this.emailAddress));
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
        result = ((result* 31)+((this.emailAddress == null)? 0 :this.emailAddress.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.emailType == null)? 0 :this.emailType.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof EmailInfo) == false) {
            return false;
        }
        EmailInfo rhs = ((EmailInfo) other);
        return ((((this.emailAddress == rhs.emailAddress)||((this.emailAddress!= null)&&this.emailAddress.equals(rhs.emailAddress)))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.emailType == rhs.emailType)||((this.emailType!= null)&&this.emailType.equals(rhs.emailType))));
    }


    /**
     * The email type. Expected values from PERSONAL, OFFICIAL
     * 
     */
    @Generated("jsonschema2pojo")
    public enum EmailType {

        PERSONAL("personal"),
        OFFICIAL("official");
        private final String value;
        private final static Map<String, EmailInfo.EmailType> CONSTANTS = new HashMap<String, EmailInfo.EmailType>();

        static {
            for (EmailInfo.EmailType c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        EmailType(String value) {
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
        public static EmailInfo.EmailType fromValue(String value) {
            EmailInfo.EmailType constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

}
