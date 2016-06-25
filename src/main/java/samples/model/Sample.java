
package samples.model;

import com.fasterxml.jackson.annotation.*;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

import javax.annotation.Generated;
import java.util.*;


/**
 * Sample Schema
 * <p>
 * The schema of a Sample
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({
//    "tString",
    "tInteger",
    "tNumber",
    "tDate",
    "tBoolean",
    "tArrayRef"
})
public class Sample {

    /**
     * The type string.
     * 
     */
//    @JsonProperty("tString")
//    private String tString;
    /**
     * The type integer.
     * (Required)
     * 
     */
    @JsonProperty("tInteger")
    private Integer tInteger;
    /**
     * The type number.
     * 
     */
    @JsonProperty("tNumber")
    private Float tNumber;
    /**
     * The type date.
     * 
     */
    @JsonProperty("tDate")
    private Date tDate = new Date(1298539523112L);
    /**
     * The type boolean.
     * 
     */
    @JsonProperty("tBoolean")
    private Boolean tBoolean = true;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("tArrayRef")
    private List<TArrayRef> tArrayRef = new ArrayList<TArrayRef>();
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    protected final static Object NOT_FOUND_VALUE = new Object();

    /**
     * The type string.
     * 
     * @return
     *     The tString
     */
//    @JsonProperty("tString")
//    public String getTString() {
//        return tString;
//    }
//
//    /**
//     * The type string.
//     *
//     * @param tString
//     *     The tString
//     */
//    @JsonProperty("tString")
//    public void setTString(String tString) {
//        this.tString = tString;
//    }

    /**
     * The type integer.
     * (Required)
     * 
     * @return
     *     The tInteger
     */
    @JsonProperty("tInteger")
    public Integer getTInteger() {
        return tInteger;
    }

    /**
     * The type integer.
     * (Required)
     * 
     * @param tInteger
     *     The tInteger
     */
    @JsonProperty("tInteger")
    public void setTInteger(Integer tInteger) {
        this.tInteger = tInteger;
    }

    /**
     * The type number.
     * 
     * @return
     *     The tNumber
     */
    @JsonProperty("tNumber")
    public Float getTNumber() {
        return tNumber;
    }

    /**
     * The type number.
     * 
     * @param tNumber
     *     The tNumber
     */
    @JsonProperty("tNumber")
    public void setTNumber(Float tNumber) {
        this.tNumber = tNumber;
    }

    /**
     * The type date.
     * 
     * @return
     *     The tDate
     */
    @JsonProperty("tDate")
    public Date getTDate() {
        return tDate;
    }

    /**
     * The type date.
     * 
     * @param tDate
     *     The tDate
     */
    @JsonProperty("tDate")
    public void setTDate(Date tDate) {
        this.tDate = tDate;
    }

    /**
     * The type boolean.
     * 
     * @return
     *     The tBoolean
     */
    @JsonProperty("tBoolean")
    public Boolean getTBoolean() {
        return tBoolean;
    }

    /**
     * The type boolean.
     * 
     * @param tBoolean
     *     The tBoolean
     */
    @JsonProperty("tBoolean")
    public void setTBoolean(Boolean tBoolean) {
        this.tBoolean = tBoolean;
    }

    /**
     * 
     * (Required)
     * 
     * @return
     *     The tArrayRef
     */
    @JsonProperty("tArrayRef")
    public List<TArrayRef> getTArrayRef() {
        return tArrayRef;
    }

    /**
     * 
     * (Required)
     * 
     * @param tArrayRef
     *     The tArrayRef
     */
    @JsonProperty("tArrayRef")
    public void setTArrayRef(List<TArrayRef> tArrayRef) {
        this.tArrayRef = tArrayRef;
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

            if ("tInteger".equals(name)) {
                if (value instanceof Integer) {
                    setTInteger(((Integer) value));
                } else {
                    throw new IllegalArgumentException(("property \"tInteger\" is of type \"java.lang.Integer\", but got "+ value.getClass().toString()));
                }
                return true;
            } else {
                if ("tNumber".equals(name)) {
                    if (value instanceof Float) {
                        setTNumber(((Float) value));
                    } else {
                        throw new IllegalArgumentException(("property \"tNumber\" is of type \"java.lang.Float\", but got "+ value.getClass().toString()));
                    }
                    return true;
                } else {
                    if ("tDate".equals(name)) {
                        if (value instanceof Date) {
                            setTDate(((Date) value));
                        } else {
                            throw new IllegalArgumentException(("property \"tDate\" is of type \"java.util.Date\", but got "+ value.getClass().toString()));
                        }
                        return true;
                    } else {
                        if ("tBoolean".equals(name)) {
                            if (value instanceof Boolean) {
                                setTBoolean(((Boolean) value));
                            } else {
                                throw new IllegalArgumentException(("property \"tBoolean\" is of type \"java.lang.Boolean\", but got "+ value.getClass().toString()));
                            }
                            return true;
                        } else {
                            if ("tArrayRef".equals(name)) {
                                if (value instanceof List) {
                                    setTArrayRef(((List<TArrayRef> ) value));
                                } else {
                                    throw new IllegalArgumentException(("property \"tArrayRef\" is of type \"java.util.List<com.test.samples.model.TArrayRef>\", but got "+ value.getClass().toString()));
                                }
                                return true;
                            } else {
                                return false;
                            }
                        }
                    }
                }

        }
    }

    protected Object declaredPropertyOrNotFound(String name, Object notFoundValue) {

            if ("tInteger".equals(name)) {
                return getTInteger();
            } else {
                if ("tNumber".equals(name)) {
                    return getTNumber();
                } else {
                    if ("tDate".equals(name)) {
                        return getTDate();
                    } else {
                        if ("tBoolean".equals(name)) {
                            return getTBoolean();
                        } else {
                            if ("tArrayRef".equals(name)) {
                                return getTArrayRef();
                            } else {
                                return notFoundValue;
                            }
                        }
                    }
                }
            }

    }

    @SuppressWarnings({
        "unchecked"
    })
    public<T >T get(String name) {
        Object value = declaredPropertyOrNotFound(name, Sample.NOT_FOUND_VALUE);
        if (Sample.NOT_FOUND_VALUE!= value) {
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
        return new HashCodeBuilder().append(tInteger).append(tNumber).append(tDate).append(tBoolean).append(tArrayRef).append(additionalProperties).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Sample) == false) {
            return false;
        }
        Sample rhs = ((Sample) other);
        return new EqualsBuilder().append(tInteger, rhs.tInteger).append(tNumber, rhs.tNumber).append(tDate, rhs.tDate).append(tBoolean, rhs.tBoolean).append(tArrayRef, rhs.tArrayRef).append(additionalProperties, rhs.additionalProperties).isEquals();
    }

}
