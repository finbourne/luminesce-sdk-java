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
import com.finbourne.luminesce.model.InlinedPropertyItem;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
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
 * Representation of a set of inlined properties for a given provider so that SQL can be generated to be able to inline properties into luminesce
 */
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class InlinedPropertyDesign {
  public static final String SERIALIZED_NAME_PROVIDER_NAME = "providerName";
  @SerializedName(SERIALIZED_NAME_PROVIDER_NAME)
  private String providerName;

  public static final String SERIALIZED_NAME_PROVIDER_NAME_EXTENSION = "providerNameExtension";
  @SerializedName(SERIALIZED_NAME_PROVIDER_NAME_EXTENSION)
  private String providerNameExtension;

  public static final String SERIALIZED_NAME_INLINED_PROPERTY_ITEMS = "inlinedPropertyItems";
  @SerializedName(SERIALIZED_NAME_INLINED_PROPERTY_ITEMS)
  private List<InlinedPropertyItem> inlinedPropertyItems;

  public InlinedPropertyDesign() {
  }

  public InlinedPropertyDesign providerName(String providerName) {
    
    this.providerName = providerName;
    return this;
  }

   /**
   * The provider name for which these properties are to be inlined
   * @return providerName
  **/
  @jakarta.annotation.Nullable
  public String getProviderName() {
    return providerName;
  }


  public void setProviderName(String providerName) {
    this.providerName = providerName;
  }


  public InlinedPropertyDesign providerNameExtension(String providerNameExtension) {
    
    this.providerNameExtension = providerNameExtension;
    return this;
  }

   /**
   * The provider extension name for extended providers
   * @return providerNameExtension
  **/
  @jakarta.annotation.Nullable
  public String getProviderNameExtension() {
    return providerNameExtension;
  }


  public void setProviderNameExtension(String providerNameExtension) {
    this.providerNameExtension = providerNameExtension;
  }


  public InlinedPropertyDesign inlinedPropertyItems(List<InlinedPropertyItem> inlinedPropertyItems) {
    
    this.inlinedPropertyItems = inlinedPropertyItems;
    return this;
  }

  public InlinedPropertyDesign addInlinedPropertyItemsItem(InlinedPropertyItem inlinedPropertyItemsItem) {
    if (this.inlinedPropertyItems == null) {
      this.inlinedPropertyItems = new ArrayList<>();
    }
    this.inlinedPropertyItems.add(inlinedPropertyItemsItem);
    return this;
  }

   /**
   * Collection of Inlined properties
   * @return inlinedPropertyItems
  **/
  @jakarta.annotation.Nullable
  public List<InlinedPropertyItem> getInlinedPropertyItems() {
    return inlinedPropertyItems;
  }


  public void setInlinedPropertyItems(List<InlinedPropertyItem> inlinedPropertyItems) {
    this.inlinedPropertyItems = inlinedPropertyItems;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlinedPropertyDesign inlinedPropertyDesign = (InlinedPropertyDesign) o;
    return Objects.equals(this.providerName, inlinedPropertyDesign.providerName) &&
        Objects.equals(this.providerNameExtension, inlinedPropertyDesign.providerNameExtension) &&
        Objects.equals(this.inlinedPropertyItems, inlinedPropertyDesign.inlinedPropertyItems);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(providerName, providerNameExtension, inlinedPropertyItems);
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
    sb.append("class InlinedPropertyDesign {\n");
    sb.append("    providerName: ").append(toIndentedString(providerName)).append("\n");
    sb.append("    providerNameExtension: ").append(toIndentedString(providerNameExtension)).append("\n");
    sb.append("    inlinedPropertyItems: ").append(toIndentedString(inlinedPropertyItems)).append("\n");
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
    openapiFields.add("providerNameExtension");
    openapiFields.add("inlinedPropertyItems");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to InlinedPropertyDesign
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!InlinedPropertyDesign.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in InlinedPropertyDesign is not found in the empty JSON string", InlinedPropertyDesign.openapiRequiredFields.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("providerName") != null && !jsonObj.get("providerName").isJsonNull()) && !jsonObj.get("providerName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `providerName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("providerName").toString()));
      }
      if ((jsonObj.get("providerNameExtension") != null && !jsonObj.get("providerNameExtension").isJsonNull()) && !jsonObj.get("providerNameExtension").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `providerNameExtension` to be a primitive type in the JSON string but got `%s`", jsonObj.get("providerNameExtension").toString()));
      }
      if (jsonObj.get("inlinedPropertyItems") != null && !jsonObj.get("inlinedPropertyItems").isJsonNull()) {
        JsonArray jsonArrayinlinedPropertyItems = jsonObj.getAsJsonArray("inlinedPropertyItems");
        if (jsonArrayinlinedPropertyItems != null) {
          // ensure the json data is an array
          if (!jsonObj.get("inlinedPropertyItems").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `inlinedPropertyItems` to be an array in the JSON string but got `%s`", jsonObj.get("inlinedPropertyItems").toString()));
          }

          // validate the optional field `inlinedPropertyItems` (array)
          for (int i = 0; i < jsonArrayinlinedPropertyItems.size(); i++) {
            InlinedPropertyItem.validateJsonElement(jsonArrayinlinedPropertyItems.get(i));
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!InlinedPropertyDesign.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'InlinedPropertyDesign' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<InlinedPropertyDesign> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(InlinedPropertyDesign.class));

       return (TypeAdapter<T>) new TypeAdapter<InlinedPropertyDesign>() {
           @Override
           public void write(JsonWriter out, InlinedPropertyDesign value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public InlinedPropertyDesign read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of InlinedPropertyDesign given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of InlinedPropertyDesign
  * @throws IOException if the JSON string is invalid with respect to InlinedPropertyDesign
  */
  public static InlinedPropertyDesign fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, InlinedPropertyDesign.class);
  }

 /**
  * Convert an instance of InlinedPropertyDesign to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
