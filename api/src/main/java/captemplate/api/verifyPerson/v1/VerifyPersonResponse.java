
package captemplate.api.verifyPerson.v1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.annotation.processing.Generated;
import javax.validation.Valid;
import captemplate.api.verifyPerson.v1.components.SystemError;
import captemplate.api.verifyPerson.v1.components.SystemWarning;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonValue;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "result",
    "systemError",
    "systemWarning"
})
@Generated("jsonschema2pojo")
public class VerifyPersonResponse {

    @JsonProperty("result")
    private VerifyPersonResponse.Result result;
    @JsonProperty("systemError")
    @Valid
    private List<SystemError> systemError = new ArrayList<SystemError>();
    @JsonProperty("systemWarning")
    @Valid
    private List<SystemWarning> systemWarning = new ArrayList<SystemWarning>();
    @JsonIgnore
    @Valid
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public VerifyPersonResponse() {
    }

    /**
     * 
     * @param result
     * @param systemError
     * @param systemWarning
     */
    public VerifyPersonResponse(VerifyPersonResponse.Result result, List<SystemError> systemError, List<SystemWarning> systemWarning) {
        super();
        this.result = result;
        this.systemError = systemError;
        this.systemWarning = systemWarning;
    }

    @JsonProperty("result")
    public VerifyPersonResponse.Result getResult() {
        return result;
    }

    @JsonProperty("result")
    public void setResult(VerifyPersonResponse.Result result) {
        this.result = result;
    }

    @JsonProperty("systemError")
    public List<SystemError> getSystemError() {
        return systemError;
    }

    @JsonProperty("systemError")
    public void setSystemError(List<SystemError> systemError) {
        this.systemError = systemError;
    }

    @JsonProperty("systemWarning")
    public List<SystemWarning> getSystemWarning() {
        return systemWarning;
    }

    @JsonProperty("systemWarning")
    public void setSystemWarning(List<SystemWarning> systemWarning) {
        this.systemWarning = systemWarning;
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
        sb.append(VerifyPersonResponse.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("result");
        sb.append('=');
        sb.append(((this.result == null)?"<null>":this.result));
        sb.append(',');
        sb.append("systemError");
        sb.append('=');
        sb.append(((this.systemError == null)?"<null>":this.systemError));
        sb.append(',');
        sb.append("systemWarning");
        sb.append('=');
        sb.append(((this.systemWarning == null)?"<null>":this.systemWarning));
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
        result = ((result* 31)+((this.result == null)? 0 :this.result.hashCode()));
        result = ((result* 31)+((this.systemError == null)? 0 :this.systemError.hashCode()));
        result = ((result* 31)+((this.systemWarning == null)? 0 :this.systemWarning.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof VerifyPersonResponse) == false) {
            return false;
        }
        VerifyPersonResponse rhs = ((VerifyPersonResponse) other);
        return (((((this.result == rhs.result)||((this.result!= null)&&this.result.equals(rhs.result)))&&((this.systemError == rhs.systemError)||((this.systemError!= null)&&this.systemError.equals(rhs.systemError))))&&((this.systemWarning == rhs.systemWarning)||((this.systemWarning!= null)&&this.systemWarning.equals(rhs.systemWarning))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))));
    }

    @Generated("jsonschema2pojo")
    public enum Result {

        APPROVED("APPROVED"),
        NOT_APPROVED("NOT_APPROVED");
        private final String value;
        private final static Map<String, VerifyPersonResponse.Result> CONSTANTS = new HashMap<String, VerifyPersonResponse.Result>();

        static {
            for (VerifyPersonResponse.Result c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        Result(String value) {
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
        public static VerifyPersonResponse.Result fromValue(String value) {
            VerifyPersonResponse.Result constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

}
