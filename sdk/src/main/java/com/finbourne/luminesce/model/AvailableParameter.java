/*
 * FINBOURNE Luminesce Web API
 *
 * Contact: info@finbourne.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package com.finbourne.luminesce.model;

import java.util.Objects;
import com.finbourne.luminesce.model.MappableField;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import com.finbourne.luminesce.JSON;

/**
 * Information about a field that can be designed on (regardless if it currently is)  Kind of a \&quot;mini-available catalog entry\&quot;
 */
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AvailableParameter {
  public static final String SERIALIZED_NAME_PROVIDER_NAME = "providerName";
  @SerializedName(SERIALIZED_NAME_PROVIDER_NAME)
  private String providerName;

  public static final String SERIALIZED_NAME_PARAMETER_NAME = "parameterName";
  @SerializedName(SERIALIZED_NAME_PARAMETER_NAME)
  private String parameterName;

  public static final String SERIALIZED_NAME_FIELDS = "fields";
  @SerializedName(SERIALIZED_NAME_FIELDS)
  private List<MappableField> fields = new ArrayList<>();

  public AvailableParameter() {
  }

  public AvailableParameter providerName(String providerName) {
    
    this.providerName = providerName;
    return this;
  }

   /**
   * Name of the Provider with a TableParameter
   * @return providerName
  **/
  @jakarta.annotation.Nonnull
  public String getProviderName() {
    return providerName;
  }


  public void setProviderName(String providerName) {
    this.providerName = providerName;
  }


  public AvailableParameter parameterName(String parameterName) {
    
    this.parameterName = parameterName;
    return this;
  }

   /**
   * Name of the TableParameter on the Provider
   * @return parameterName
  **/
  @jakarta.annotation.Nonnull
  public String getParameterName() {
    return parameterName;
  }


  public void setParameterName(String parameterName) {
    this.parameterName = parameterName;
  }


  public AvailableParameter fields(List<MappableField> fields) {
    
    this.fields = fields;
    return this;
  }

  public AvailableParameter addFieldsItem(MappableField fieldsItem) {
    if (this.fields == null) {
      this.fields = new ArrayList<>();
    }
    this.fields.add(fieldsItem);
    return this;
  }

   /**
   * Fields that can be mapped to
   * @return fields
  **/
  @jakarta.annotation.Nonnull
  public List<MappableField> getFields() {
    return fields;
  }


  public void setFields(List<MappableField> fields) {
    this.fields = fields;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AvailableParameter availableParameter = (AvailableParameter) o;
    return Objects.equals(this.providerName, availableParameter.providerName) &&
        Objects.equals(this.parameterName, availableParameter.parameterName) &&
        Objects.equals(this.fields, availableParameter.fields);
  }

  @Override
  public int hashCode() {
    return Objects.hash(providerName, parameterName, fields);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AvailableParameter {\n");
    sb.append("    providerName: ").append(toIndentedString(providerName)).append("\n");
    sb.append("    parameterName: ").append(toIndentedString(parameterName)).append("\n");
    sb.append("    fields: ").append(toIndentedString(fields)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }


  public static HashSet<String> openapiFields;
  public static HashSet<String> openapiRequiredFields;

  static {
    // a set of all properties/fields (JSON key names)
    openapiFields = new HashSet<String>();
    openapiFields.add("providerName");
    openapiFields.add("parameterName");
    openapiFields.add("fields");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("providerName");
    openapiRequiredFields.add("parameterName");
    openapiRequiredFields.add("fields");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to AvailableParameter
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!AvailableParameter.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in AvailableParameter is not found in the empty JSON string", AvailableParameter.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : AvailableParameter.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("providerName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `providerName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("providerName").toString()));
      }
      if (!jsonObj.get("parameterName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `parameterName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("parameterName").toString()));
      }
      // ensure the json data is an array
      if (!jsonObj.get("fields").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `fields` to be an array in the JSON string but got `%s`", jsonObj.get("fields").toString()));
      }

      JsonArray jsonArrayfields = jsonObj.getAsJsonArray("fields");
      // validate the required field `fields` (array)
      for (int i = 0; i < jsonArrayfields.size(); i++) {
        MappableField.validateJsonElement(jsonArrayfields.get(i));
      };
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AvailableParameter.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AvailableParameter' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AvailableParameter> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AvailableParameter.class));

       return (TypeAdapter<T>) new TypeAdapter<AvailableParameter>() {
           @Override
           public void write(JsonWriter out, AvailableParameter value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AvailableParameter read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of AvailableParameter given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AvailableParameter
  * @throws IOException if the JSON string is invalid with respect to AvailableParameter
  */
  public static AvailableParameter fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AvailableParameter.class);
  }

 /**
  * Convert an instance of AvailableParameter to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
