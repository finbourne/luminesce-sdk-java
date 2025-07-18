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
import com.finbourne.luminesce.model.AvailableField;
import com.finbourne.luminesce.model.DesignJoinType;
import com.finbourne.luminesce.model.OnClauseTermDesign;
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
 * Treatment of a joined-to-table a QueryDesign
 */
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class JoinedTableDesign {
  public static final String SERIALIZED_NAME_JOINED_TABLE_NAME = "joinedTableName";
  @SerializedName(SERIALIZED_NAME_JOINED_TABLE_NAME)
  private String joinedTableName;

  public static final String SERIALIZED_NAME_JOINED_TABLE_ALIAS = "joinedTableAlias";
  @SerializedName(SERIALIZED_NAME_JOINED_TABLE_ALIAS)
  private String joinedTableAlias;

  public static final String SERIALIZED_NAME_LEFT_TABLE_ALIAS = "leftTableAlias";
  @SerializedName(SERIALIZED_NAME_LEFT_TABLE_ALIAS)
  private String leftTableAlias;

  public static final String SERIALIZED_NAME_JOIN_TYPE = "joinType";
  @SerializedName(SERIALIZED_NAME_JOIN_TYPE)
  private DesignJoinType joinType;

  public static final String SERIALIZED_NAME_ON_CLAUSE_TERMS = "onClauseTerms";
  @SerializedName(SERIALIZED_NAME_ON_CLAUSE_TERMS)
  private List<OnClauseTermDesign> onClauseTerms = new ArrayList<>();

  public static final String SERIALIZED_NAME_RIGHT_TABLE_AVAILABLE_FIELDS = "rightTableAvailableFields";
  @SerializedName(SERIALIZED_NAME_RIGHT_TABLE_AVAILABLE_FIELDS)
  private List<AvailableField> rightTableAvailableFields;

  public JoinedTableDesign() {
  }

  public JoinedTableDesign joinedTableName(String joinedTableName) {
    
    this.joinedTableName = joinedTableName;
    return this;
  }

   /**
   * Name of the table on the right side of the join
   * @return joinedTableName
  **/
  @jakarta.annotation.Nonnull
  public String getJoinedTableName() {
    return joinedTableName;
  }


  public void setJoinedTableName(String joinedTableName) {
    this.joinedTableName = joinedTableName;
  }


  public JoinedTableDesign joinedTableAlias(String joinedTableAlias) {
    
    this.joinedTableAlias = joinedTableAlias;
    return this;
  }

   /**
   * Alias for the table on the right side of the join
   * @return joinedTableAlias
  **/
  @jakarta.annotation.Nonnull
  public String getJoinedTableAlias() {
    return joinedTableAlias;
  }


  public void setJoinedTableAlias(String joinedTableAlias) {
    this.joinedTableAlias = joinedTableAlias;
  }


  public JoinedTableDesign leftTableAlias(String leftTableAlias) {
    
    this.leftTableAlias = leftTableAlias;
    return this;
  }

   /**
   * Alias for the table on the left side of the join
   * @return leftTableAlias
  **/
  @jakarta.annotation.Nonnull
  public String getLeftTableAlias() {
    return leftTableAlias;
  }


  public void setLeftTableAlias(String leftTableAlias) {
    this.leftTableAlias = leftTableAlias;
  }


  public JoinedTableDesign joinType(DesignJoinType joinType) {
    
    this.joinType = joinType;
    return this;
  }

   /**
   * Get joinType
   * @return joinType
  **/
  @jakarta.annotation.Nonnull
  public DesignJoinType getJoinType() {
    return joinType;
  }


  public void setJoinType(DesignJoinType joinType) {
    this.joinType = joinType;
  }


  public JoinedTableDesign onClauseTerms(List<OnClauseTermDesign> onClauseTerms) {
    
    this.onClauseTerms = onClauseTerms;
    return this;
  }

  public JoinedTableDesign addOnClauseTermsItem(OnClauseTermDesign onClauseTermsItem) {
    if (this.onClauseTerms == null) {
      this.onClauseTerms = new ArrayList<>();
    }
    this.onClauseTerms.add(onClauseTermsItem);
    return this;
  }

   /**
   * Filter clauses to apply to this join in the on clause
   * @return onClauseTerms
  **/
  @jakarta.annotation.Nonnull
  public List<OnClauseTermDesign> getOnClauseTerms() {
    return onClauseTerms;
  }


  public void setOnClauseTerms(List<OnClauseTermDesign> onClauseTerms) {
    this.onClauseTerms = onClauseTerms;
  }


  public JoinedTableDesign rightTableAvailableFields(List<AvailableField> rightTableAvailableFields) {
    
    this.rightTableAvailableFields = rightTableAvailableFields;
    return this;
  }

  public JoinedTableDesign addRightTableAvailableFieldsItem(AvailableField rightTableAvailableFieldsItem) {
    if (this.rightTableAvailableFields == null) {
      this.rightTableAvailableFields = new ArrayList<>();
    }
    this.rightTableAvailableFields.add(rightTableAvailableFieldsItem);
    return this;
  }

   /**
   * Fields that are known to be available for design when parsing SQL, of the right hand table
   * @return rightTableAvailableFields
  **/
  @jakarta.annotation.Nullable
  public List<AvailableField> getRightTableAvailableFields() {
    return rightTableAvailableFields;
  }


  public void setRightTableAvailableFields(List<AvailableField> rightTableAvailableFields) {
    this.rightTableAvailableFields = rightTableAvailableFields;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    JoinedTableDesign joinedTableDesign = (JoinedTableDesign) o;
    return Objects.equals(this.joinedTableName, joinedTableDesign.joinedTableName) &&
        Objects.equals(this.joinedTableAlias, joinedTableDesign.joinedTableAlias) &&
        Objects.equals(this.leftTableAlias, joinedTableDesign.leftTableAlias) &&
        Objects.equals(this.joinType, joinedTableDesign.joinType) &&
        Objects.equals(this.onClauseTerms, joinedTableDesign.onClauseTerms) &&
        Objects.equals(this.rightTableAvailableFields, joinedTableDesign.rightTableAvailableFields);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(joinedTableName, joinedTableAlias, leftTableAlias, joinType, onClauseTerms, rightTableAvailableFields);
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
    sb.append("class JoinedTableDesign {\n");
    sb.append("    joinedTableName: ").append(toIndentedString(joinedTableName)).append("\n");
    sb.append("    joinedTableAlias: ").append(toIndentedString(joinedTableAlias)).append("\n");
    sb.append("    leftTableAlias: ").append(toIndentedString(leftTableAlias)).append("\n");
    sb.append("    joinType: ").append(toIndentedString(joinType)).append("\n");
    sb.append("    onClauseTerms: ").append(toIndentedString(onClauseTerms)).append("\n");
    sb.append("    rightTableAvailableFields: ").append(toIndentedString(rightTableAvailableFields)).append("\n");
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
    openapiFields.add("joinedTableName");
    openapiFields.add("joinedTableAlias");
    openapiFields.add("leftTableAlias");
    openapiFields.add("joinType");
    openapiFields.add("onClauseTerms");
    openapiFields.add("rightTableAvailableFields");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("joinedTableName");
    openapiRequiredFields.add("joinedTableAlias");
    openapiRequiredFields.add("leftTableAlias");
    openapiRequiredFields.add("joinType");
    openapiRequiredFields.add("onClauseTerms");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to JoinedTableDesign
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!JoinedTableDesign.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in JoinedTableDesign is not found in the empty JSON string", JoinedTableDesign.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : JoinedTableDesign.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("joinedTableName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `joinedTableName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("joinedTableName").toString()));
      }
      if (!jsonObj.get("joinedTableAlias").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `joinedTableAlias` to be a primitive type in the JSON string but got `%s`", jsonObj.get("joinedTableAlias").toString()));
      }
      if (!jsonObj.get("leftTableAlias").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `leftTableAlias` to be a primitive type in the JSON string but got `%s`", jsonObj.get("leftTableAlias").toString()));
      }
      // ensure the json data is an array
      if (!jsonObj.get("onClauseTerms").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `onClauseTerms` to be an array in the JSON string but got `%s`", jsonObj.get("onClauseTerms").toString()));
      }

      JsonArray jsonArrayonClauseTerms = jsonObj.getAsJsonArray("onClauseTerms");
      // validate the required field `onClauseTerms` (array)
      for (int i = 0; i < jsonArrayonClauseTerms.size(); i++) {
        OnClauseTermDesign.validateJsonElement(jsonArrayonClauseTerms.get(i));
      };
      if (jsonObj.get("rightTableAvailableFields") != null && !jsonObj.get("rightTableAvailableFields").isJsonNull()) {
        JsonArray jsonArrayrightTableAvailableFields = jsonObj.getAsJsonArray("rightTableAvailableFields");
        if (jsonArrayrightTableAvailableFields != null) {
          // ensure the json data is an array
          if (!jsonObj.get("rightTableAvailableFields").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `rightTableAvailableFields` to be an array in the JSON string but got `%s`", jsonObj.get("rightTableAvailableFields").toString()));
          }

          // validate the optional field `rightTableAvailableFields` (array)
          for (int i = 0; i < jsonArrayrightTableAvailableFields.size(); i++) {
            AvailableField.validateJsonElement(jsonArrayrightTableAvailableFields.get(i));
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!JoinedTableDesign.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'JoinedTableDesign' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<JoinedTableDesign> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(JoinedTableDesign.class));

       return (TypeAdapter<T>) new TypeAdapter<JoinedTableDesign>() {
           @Override
           public void write(JsonWriter out, JoinedTableDesign value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public JoinedTableDesign read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of JoinedTableDesign given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of JoinedTableDesign
  * @throws IOException if the JSON string is invalid with respect to JoinedTableDesign
  */
  public static JoinedTableDesign fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, JoinedTableDesign.class);
  }

 /**
  * Convert an instance of JoinedTableDesign to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
