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
import com.finbourne.luminesce.model.IntellisenseType;
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
 * Representation of an item in an Intellisense popup
 */
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class IntellisenseItem {
  public static final String SERIALIZED_NAME_CAPTION = "caption";
  @SerializedName(SERIALIZED_NAME_CAPTION)
  private String caption;

  public static final String SERIALIZED_NAME_VALUE = "value";
  @SerializedName(SERIALIZED_NAME_VALUE)
  private String value;

  public static final String SERIALIZED_NAME_META = "meta";
  @SerializedName(SERIALIZED_NAME_META)
  private String meta;

  public static final String SERIALIZED_NAME_SCORE = "score";
  @SerializedName(SERIALIZED_NAME_SCORE)
  private Integer score;

  public static final String SERIALIZED_NAME_DOC_H_T_M_L = "docHTML";
  @SerializedName(SERIALIZED_NAME_DOC_H_T_M_L)
  private String docHTML;

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private IntellisenseType type;

  public IntellisenseItem() {
  }

  public IntellisenseItem caption(String caption) {
    
    this.caption = caption;
    return this;
  }

   /**
   * The value to show the user in the popup
   * @return caption
  **/
  @jakarta.annotation.Nonnull
  public String getCaption() {
    return caption;
  }


  public void setCaption(String caption) {
    this.caption = caption;
  }


  public IntellisenseItem value(String value) {
    
    this.value = value;
    return this;
  }

   /**
   * The value to substitute in
   * @return value
  **/
  @jakarta.annotation.Nonnull
  public String getValue() {
    return value;
  }


  public void setValue(String value) {
    this.value = value;
  }


  public IntellisenseItem meta(String meta) {
    
    this.meta = meta;
    return this;
  }

   /**
   * The light-grey text shown to the right of the Caption in the popup
   * @return meta
  **/
  @jakarta.annotation.Nullable
  public String getMeta() {
    return meta;
  }


  public void setMeta(String meta) {
    this.meta = meta;
  }


  public IntellisenseItem score(Integer score) {
    
    this.score = score;
    return this;
  }

   /**
   * How important is this. Bigger is more important.
   * @return score
  **/
  @jakarta.annotation.Nullable
  public Integer getScore() {
    return score;
  }


  public void setScore(Integer score) {
    this.score = score;
  }


  public IntellisenseItem docHTML(String docHTML) {
    
    this.docHTML = docHTML;
    return this;
  }

   /**
   * Popup further info (as in a whole documentation article!)
   * @return docHTML
  **/
  @jakarta.annotation.Nullable
  public String getDocHTML() {
    return docHTML;
  }


  public void setDocHTML(String docHTML) {
    this.docHTML = docHTML;
  }


  public IntellisenseItem type(IntellisenseType type) {
    
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @jakarta.annotation.Nullable
  public IntellisenseType getType() {
    return type;
  }


  public void setType(IntellisenseType type) {
    this.type = type;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IntellisenseItem intellisenseItem = (IntellisenseItem) o;
    return Objects.equals(this.caption, intellisenseItem.caption) &&
        Objects.equals(this.value, intellisenseItem.value) &&
        Objects.equals(this.meta, intellisenseItem.meta) &&
        Objects.equals(this.score, intellisenseItem.score) &&
        Objects.equals(this.docHTML, intellisenseItem.docHTML) &&
        Objects.equals(this.type, intellisenseItem.type);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(caption, value, meta, score, docHTML, type);
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
    sb.append("class IntellisenseItem {\n");
    sb.append("    caption: ").append(toIndentedString(caption)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
    sb.append("    meta: ").append(toIndentedString(meta)).append("\n");
    sb.append("    score: ").append(toIndentedString(score)).append("\n");
    sb.append("    docHTML: ").append(toIndentedString(docHTML)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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
    openapiFields.add("caption");
    openapiFields.add("value");
    openapiFields.add("meta");
    openapiFields.add("score");
    openapiFields.add("docHTML");
    openapiFields.add("type");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("caption");
    openapiRequiredFields.add("value");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to IntellisenseItem
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!IntellisenseItem.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in IntellisenseItem is not found in the empty JSON string", IntellisenseItem.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : IntellisenseItem.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("caption").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `caption` to be a primitive type in the JSON string but got `%s`", jsonObj.get("caption").toString()));
      }
      if (!jsonObj.get("value").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `value` to be a primitive type in the JSON string but got `%s`", jsonObj.get("value").toString()));
      }
      if ((jsonObj.get("meta") != null && !jsonObj.get("meta").isJsonNull()) && !jsonObj.get("meta").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `meta` to be a primitive type in the JSON string but got `%s`", jsonObj.get("meta").toString()));
      }
      if ((jsonObj.get("docHTML") != null && !jsonObj.get("docHTML").isJsonNull()) && !jsonObj.get("docHTML").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `docHTML` to be a primitive type in the JSON string but got `%s`", jsonObj.get("docHTML").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!IntellisenseItem.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'IntellisenseItem' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<IntellisenseItem> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(IntellisenseItem.class));

       return (TypeAdapter<T>) new TypeAdapter<IntellisenseItem>() {
           @Override
           public void write(JsonWriter out, IntellisenseItem value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public IntellisenseItem read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of IntellisenseItem given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of IntellisenseItem
  * @throws IOException if the JSON string is invalid with respect to IntellisenseItem
  */
  public static IntellisenseItem fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, IntellisenseItem.class);
  }

 /**
  * Convert an instance of IntellisenseItem to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
