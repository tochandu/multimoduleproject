
package captemplate.api.verifyPerson.v1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.annotation.processing.Generated;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "individualName",
    "domesticAddress",
    "phoneNumbers",
    "emailInfo"
})
@Generated("jsonschema2pojo")
public class VerifyPersonRequest {

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("individualName")
    @Valid
    @NotNull
    private IndividualName individualName;
    @JsonProperty("domesticAddress")
    @Valid
    private DomesticAddress domesticAddress;
    @JsonProperty("phoneNumbers")
    @Valid
    private List<PhoneNumber> phoneNumbers = new ArrayList<PhoneNumber>();
    @JsonProperty("emailInfo")
    @Valid
    private EmailInfo emailInfo;
    @JsonIgnore
    @Valid
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public VerifyPersonRequest() {
    }

    /**
     * 
     * @param emailInfo
     * @param individualName
     * @param phoneNumbers
     * @param domesticAddress
     */
    public VerifyPersonRequest(IndividualName individualName, DomesticAddress domesticAddress, List<PhoneNumber> phoneNumbers, EmailInfo emailInfo) {
        super();
        this.individualName = individualName;
        this.domesticAddress = domesticAddress;
        this.phoneNumbers = phoneNumbers;
        this.emailInfo = emailInfo;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("individualName")
    public IndividualName getIndividualName() {
        return individualName;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("individualName")
    public void setIndividualName(IndividualName individualName) {
        this.individualName = individualName;
    }

    @JsonProperty("domesticAddress")
    public DomesticAddress getDomesticAddress() {
        return domesticAddress;
    }

    @JsonProperty("domesticAddress")
    public void setDomesticAddress(DomesticAddress domesticAddress) {
        this.domesticAddress = domesticAddress;
    }

    @JsonProperty("phoneNumbers")
    public List<PhoneNumber> getPhoneNumbers() {
        return phoneNumbers;
    }

    @JsonProperty("phoneNumbers")
    public void setPhoneNumbers(List<PhoneNumber> phoneNumbers) {
        this.phoneNumbers = phoneNumbers;
    }

    @JsonProperty("emailInfo")
    public EmailInfo getEmailInfo() {
        return emailInfo;
    }

    @JsonProperty("emailInfo")
    public void setEmailInfo(EmailInfo emailInfo) {
        this.emailInfo = emailInfo;
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
        sb.append(VerifyPersonRequest.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("individualName");
        sb.append('=');
        sb.append(((this.individualName == null)?"<null>":this.individualName));
        sb.append(',');
        sb.append("domesticAddress");
        sb.append('=');
        sb.append(((this.domesticAddress == null)?"<null>":this.domesticAddress));
        sb.append(',');
        sb.append("phoneNumbers");
        sb.append('=');
        sb.append(((this.phoneNumbers == null)?"<null>":this.phoneNumbers));
        sb.append(',');
        sb.append("emailInfo");
        sb.append('=');
        sb.append(((this.emailInfo == null)?"<null>":this.emailInfo));
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
        result = ((result* 31)+((this.individualName == null)? 0 :this.individualName.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.phoneNumbers == null)? 0 :this.phoneNumbers.hashCode()));
        result = ((result* 31)+((this.domesticAddress == null)? 0 :this.domesticAddress.hashCode()));
        result = ((result* 31)+((this.emailInfo == null)? 0 :this.emailInfo.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof VerifyPersonRequest) == false) {
            return false;
        }
        VerifyPersonRequest rhs = ((VerifyPersonRequest) other);
        return ((((((this.individualName == rhs.individualName)||((this.individualName!= null)&&this.individualName.equals(rhs.individualName)))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.phoneNumbers == rhs.phoneNumbers)||((this.phoneNumbers!= null)&&this.phoneNumbers.equals(rhs.phoneNumbers))))&&((this.domesticAddress == rhs.domesticAddress)||((this.domesticAddress!= null)&&this.domesticAddress.equals(rhs.domesticAddress))))&&((this.emailInfo == rhs.emailInfo)||((this.emailInfo!= null)&&this.emailInfo.equals(rhs.emailInfo))));
    }

}
