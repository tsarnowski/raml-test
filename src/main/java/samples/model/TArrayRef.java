
package samples.model;

import com.fasterxml.jackson.annotation.*;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

import javax.annotation.Generated;
import java.util.HashMap;
import java.util.Map;


/**
 * tRef
 * <p>
 * A definition reference.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({
    "refId"
})
public class TArrayRef {

    /**
     * The identifier of a reference.
     * 
     */
    @JsonProperty("refId")
    private String refId;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    protected final static Object NOT_FOUND_VALUE = new Object();

    /**
     * The identifier of a reference.
     * 
     * @return
     *     The refId
     */
    @JsonProperty("refId")
    public String getRefId() {
        return refId;
    }

    /**
     * The identifier of a reference.
     * 
     * @param refId
     *     The refId
     */
    @JsonProperty("refId")
    public void setRefId(String refId) {
        this.refId = refId;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    protected boolean declaredProperty(String name, Object value) {
        if ("refId".equals(name)) {
            if (value instanceof String) {
                setRefId(((String) value));
            } else {
                throw new IllegalArgumentException(("property \"refId\" is of type \"java.lang.String\", but got "+ value.getClass().toString()));
            }
            return true;
        } else {
            return false;
        }
    }

    protected Object declaredPropertyOrNotFound(String name, Object notFoundValue) {
        if ("refId".equals(name)) {
            return getRefId();
        } else {
            return notFoundValue;
        }
    }

    @SuppressWarnings({
        "unchecked"
    })
    public<T >T get(String name) {
        Object value = declaredPropertyOrNotFound(name, TArrayRef.NOT_FOUND_VALUE);
        if (TArrayRef.NOT_FOUND_VALUE!= value) {
            return ((T) value);
        } else {
            return ((T) getAdditionalProperties().get(name));
        }
    }

    public void set(String name, Object value) {
        if (!declaredProperty(name, value)) {
            getAdditionalProperties().put(name, ((Object) value));
        }
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(refId).append(additionalProperties).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof TArrayRef) == false) {
            return false;
        }
        TArrayRef rhs = ((TArrayRef) other);
        return new EqualsBuilder().append(refId, rhs.refId).append(additionalProperties, rhs.additionalProperties).isEquals();
    }

}
