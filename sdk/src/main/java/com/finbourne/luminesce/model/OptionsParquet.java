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
 * Additional options applicable to the given SourceType
 */
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class OptionsParquet {
  public static final String SERIALIZED_NAME_COLUMN_NAMES_WANTED = "columnNamesWanted";
  @SerializedName(SERIALIZED_NAME_COLUMN_NAMES_WANTED)
  private String columnNamesWanted;

  public OptionsParquet() {
  }

  public OptionsParquet columnNamesWanted(String columnNamesWanted) {
    
    this.columnNamesWanted = columnNamesWanted;
    return this;
  }

   /**
   * Column (by Name) that should be returned (comma delimited list)
   * @return columnNamesWanted
  **/
  @jakarta.annotation.Nullable
  public String getColumnNamesWanted() {
    return columnNamesWanted;
  }


  public void setColumnNamesWanted(String columnNamesWanted) {
    this.columnNamesWanted = columnNamesWanted;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OptionsParquet optionsParquet = (OptionsParquet) o;
    return Objects.equals(this.columnNamesWanted, optionsParquet.columnNamesWanted);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(columnNamesWanted);
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
    sb.append("class OptionsParquet {\n");
    sb.append("    columnNamesWanted: ").append(toIndentedString(columnNamesWanted)).append("\n");
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
    openapiFields.add("columnNamesWanted");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to OptionsParquet
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!OptionsParquet.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in OptionsParquet is not found in the empty JSON string", OptionsParquet.openapiRequiredFields.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("columnNamesWanted") != null && !jsonObj.get("columnNamesWanted").isJsonNull()) && !jsonObj.get("columnNamesWanted").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `columnNamesWanted` to be a primitive type in the JSON string but got `%s`", jsonObj.get("columnNamesWanted").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!OptionsParquet.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'OptionsParquet' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<OptionsParquet> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(OptionsParquet.class));

       return (TypeAdapter<T>) new TypeAdapter<OptionsParquet>() {
           @Override
           public void write(JsonWriter out, OptionsParquet value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public OptionsParquet read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of OptionsParquet given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of OptionsParquet
  * @throws IOException if the JSON string is invalid with respect to OptionsParquet
  */
  public static OptionsParquet fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, OptionsParquet.class);
  }

 /**
  * Convert an instance of OptionsParquet to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
