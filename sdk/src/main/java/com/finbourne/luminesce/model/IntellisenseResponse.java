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
import com.finbourne.luminesce.model.IntellisenseItem;
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
 * IntellisenseResponse
 */
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class IntellisenseResponse {
  public static final String SERIALIZED_NAME_AUTO_COMPLETE_LIST = "autoCompleteList";
  @SerializedName(SERIALIZED_NAME_AUTO_COMPLETE_LIST)
  private List<IntellisenseItem> autoCompleteList = new ArrayList<>();

  public static final String SERIALIZED_NAME_TRY_AGAIN_SOON_FOR_MORE = "tryAgainSoonForMore";
  @SerializedName(SERIALIZED_NAME_TRY_AGAIN_SOON_FOR_MORE)
  private Boolean tryAgainSoonForMore;

  public static final String SERIALIZED_NAME_SQL_WITH_MARKER = "sqlWithMarker";
  @SerializedName(SERIALIZED_NAME_SQL_WITH_MARKER)
  private String sqlWithMarker;

  public IntellisenseResponse() {
  }

  public IntellisenseResponse autoCompleteList(List<IntellisenseItem> autoCompleteList) {
    
    this.autoCompleteList = autoCompleteList;
    return this;
  }

  public IntellisenseResponse addAutoCompleteListItem(IntellisenseItem autoCompleteListItem) {
    if (this.autoCompleteList == null) {
      this.autoCompleteList = new ArrayList<>();
    }
    this.autoCompleteList.add(autoCompleteListItem);
    return this;
  }

   /**
   * The available items at this point
   * @return autoCompleteList
  **/
  @jakarta.annotation.Nonnull
  public List<IntellisenseItem> getAutoCompleteList() {
    return autoCompleteList;
  }


  public void setAutoCompleteList(List<IntellisenseItem> autoCompleteList) {
    this.autoCompleteList = autoCompleteList;
  }


  public IntellisenseResponse tryAgainSoonForMore(Boolean tryAgainSoonForMore) {
    
    this.tryAgainSoonForMore = tryAgainSoonForMore;
    return this;
  }

   /**
   * Should the caller try again soon? (true means a cache is being built and this is a preliminary response!)
   * @return tryAgainSoonForMore
  **/
  @jakarta.annotation.Nonnull
  public Boolean getTryAgainSoonForMore() {
    return tryAgainSoonForMore;
  }


  public void setTryAgainSoonForMore(Boolean tryAgainSoonForMore) {
    this.tryAgainSoonForMore = tryAgainSoonForMore;
  }


  public IntellisenseResponse sqlWithMarker(String sqlWithMarker) {
    
    this.sqlWithMarker = sqlWithMarker;
    return this;
  }

   /**
   * The overall SQL this is for with a character marker for where the Intellisense is for
   * @return sqlWithMarker
  **/
  @jakarta.annotation.Nonnull
  public String getSqlWithMarker() {
    return sqlWithMarker;
  }


  public void setSqlWithMarker(String sqlWithMarker) {
    this.sqlWithMarker = sqlWithMarker;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IntellisenseResponse intellisenseResponse = (IntellisenseResponse) o;
    return Objects.equals(this.autoCompleteList, intellisenseResponse.autoCompleteList) &&
        Objects.equals(this.tryAgainSoonForMore, intellisenseResponse.tryAgainSoonForMore) &&
        Objects.equals(this.sqlWithMarker, intellisenseResponse.sqlWithMarker);
  }

  @Override
  public int hashCode() {
    return Objects.hash(autoCompleteList, tryAgainSoonForMore, sqlWithMarker);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IntellisenseResponse {\n");
    sb.append("    autoCompleteList: ").append(toIndentedString(autoCompleteList)).append("\n");
    sb.append("    tryAgainSoonForMore: ").append(toIndentedString(tryAgainSoonForMore)).append("\n");
    sb.append("    sqlWithMarker: ").append(toIndentedString(sqlWithMarker)).append("\n");
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
    openapiFields.add("autoCompleteList");
    openapiFields.add("tryAgainSoonForMore");
    openapiFields.add("sqlWithMarker");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("autoCompleteList");
    openapiRequiredFields.add("tryAgainSoonForMore");
    openapiRequiredFields.add("sqlWithMarker");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to IntellisenseResponse
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!IntellisenseResponse.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in IntellisenseResponse is not found in the empty JSON string", IntellisenseResponse.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : IntellisenseResponse.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // ensure the json data is an array
      if (!jsonObj.get("autoCompleteList").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `autoCompleteList` to be an array in the JSON string but got `%s`", jsonObj.get("autoCompleteList").toString()));
      }

      JsonArray jsonArrayautoCompleteList = jsonObj.getAsJsonArray("autoCompleteList");
      // validate the required field `autoCompleteList` (array)
      for (int i = 0; i < jsonArrayautoCompleteList.size(); i++) {
        IntellisenseItem.validateJsonElement(jsonArrayautoCompleteList.get(i));
      };
      if (!jsonObj.get("sqlWithMarker").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `sqlWithMarker` to be a primitive type in the JSON string but got `%s`", jsonObj.get("sqlWithMarker").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!IntellisenseResponse.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'IntellisenseResponse' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<IntellisenseResponse> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(IntellisenseResponse.class));

       return (TypeAdapter<T>) new TypeAdapter<IntellisenseResponse>() {
           @Override
           public void write(JsonWriter out, IntellisenseResponse value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public IntellisenseResponse read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of IntellisenseResponse given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of IntellisenseResponse
  * @throws IOException if the JSON string is invalid with respect to IntellisenseResponse
  */
  public static IntellisenseResponse fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, IntellisenseResponse.class);
  }

 /**
  * Convert an instance of IntellisenseResponse to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
