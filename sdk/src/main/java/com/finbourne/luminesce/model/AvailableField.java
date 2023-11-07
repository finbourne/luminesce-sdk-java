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
import com.finbourne.luminesce.model.DataType;
import com.finbourne.luminesce.model.FieldType;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.util.Arrays;
import org.openapitools.jackson.nullable.JsonNullable;

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
public class AvailableField {
  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_DATA_TYPE = "dataType";
  @SerializedName(SERIALIZED_NAME_DATA_TYPE)
  private DataType dataType;

  public static final String SERIALIZED_NAME_FIELD_TYPE = "fieldType";
  @SerializedName(SERIALIZED_NAME_FIELD_TYPE)
  private FieldType fieldType;

  public static final String SERIALIZED_NAME_IS_MAIN = "isMain";
  @SerializedName(SERIALIZED_NAME_IS_MAIN)
  private Boolean isMain;

  public static final String SERIALIZED_NAME_IS_PRIMARY_KEY = "isPrimaryKey";
  @SerializedName(SERIALIZED_NAME_IS_PRIMARY_KEY)
  private Boolean isPrimaryKey;

  public AvailableField() {
  }

  public AvailableField name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Name of the Field
   * @return name
  **/
  @jakarta.annotation.Nonnull
  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public AvailableField dataType(DataType dataType) {
    
    this.dataType = dataType;
    return this;
  }

   /**
   * Get dataType
   * @return dataType
  **/
  @jakarta.annotation.Nullable
  public DataType getDataType() {
    return dataType;
  }


  public void setDataType(DataType dataType) {
    this.dataType = dataType;
  }


  public AvailableField fieldType(FieldType fieldType) {
    
    this.fieldType = fieldType;
    return this;
  }

   /**
   * Get fieldType
   * @return fieldType
  **/
  @jakarta.annotation.Nonnull
  public FieldType getFieldType() {
    return fieldType;
  }


  public void setFieldType(FieldType fieldType) {
    this.fieldType = fieldType;
  }


  public AvailableField isMain(Boolean isMain) {
    
    this.isMain = isMain;
    return this;
  }

   /**
   * Is this a Main Field within the Provider
   * @return isMain
  **/
  @jakarta.annotation.Nullable
  public Boolean getIsMain() {
    return isMain;
  }


  public void setIsMain(Boolean isMain) {
    this.isMain = isMain;
  }


  public AvailableField isPrimaryKey(Boolean isPrimaryKey) {
    
    this.isPrimaryKey = isPrimaryKey;
    return this;
  }

   /**
   * Is this a member of the PrimaryKey of the Provider
   * @return isPrimaryKey
  **/
  @jakarta.annotation.Nullable
  public Boolean getIsPrimaryKey() {
    return isPrimaryKey;
  }


  public void setIsPrimaryKey(Boolean isPrimaryKey) {
    this.isPrimaryKey = isPrimaryKey;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AvailableField availableField = (AvailableField) o;
    return Objects.equals(this.name, availableField.name) &&
        Objects.equals(this.dataType, availableField.dataType) &&
        Objects.equals(this.fieldType, availableField.fieldType) &&
        Objects.equals(this.isMain, availableField.isMain) &&
        Objects.equals(this.isPrimaryKey, availableField.isPrimaryKey);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, dataType, fieldType, isMain, isPrimaryKey);
  }

  private static <T> int hashCodeNullable(JsonNullable<T> a) {
    if (a == null) {
      return 1;
    }
    return a.isPresent() ? Arrays.deepHashCode(new Object[]{a.get()}) : 31;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AvailableField {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    dataType: ").append(toIndentedString(dataType)).append("\n");
    sb.append("    fieldType: ").append(toIndentedString(fieldType)).append("\n");
    sb.append("    isMain: ").append(toIndentedString(isMain)).append("\n");
    sb.append("    isPrimaryKey: ").append(toIndentedString(isPrimaryKey)).append("\n");
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
    openapiFields.add("name");
    openapiFields.add("dataType");
    openapiFields.add("fieldType");
    openapiFields.add("isMain");
    openapiFields.add("isPrimaryKey");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("name");
    openapiRequiredFields.add("fieldType");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to AvailableField
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!AvailableField.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in AvailableField is not found in the empty JSON string", AvailableField.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : AvailableField.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AvailableField.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AvailableField' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AvailableField> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AvailableField.class));

       return (TypeAdapter<T>) new TypeAdapter<AvailableField>() {
           @Override
           public void write(JsonWriter out, AvailableField value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AvailableField read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of AvailableField given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AvailableField
  * @throws IOException if the JSON string is invalid with respect to AvailableField
  */
  public static AvailableField fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AvailableField.class);
  }

 /**
  * Convert an instance of AvailableField to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
