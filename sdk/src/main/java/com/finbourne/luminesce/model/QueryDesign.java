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
import com.finbourne.luminesce.model.FieldDesign;
import com.finbourne.luminesce.model.OrderByTermDesign;
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
 * Representation of a \&quot;designable Query\&quot; suitable for formatting to SQL or being built from compliant SQL.
 */
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class QueryDesign {
  public static final String SERIALIZED_NAME_TABLE_NAME = "tableName";
  @SerializedName(SERIALIZED_NAME_TABLE_NAME)
  private String tableName;

  public static final String SERIALIZED_NAME_ALIAS = "alias";
  @SerializedName(SERIALIZED_NAME_ALIAS)
  private String alias;

  public static final String SERIALIZED_NAME_FIELDS = "fields";
  @SerializedName(SERIALIZED_NAME_FIELDS)
  private List<FieldDesign> fields = new ArrayList<>();

  public static final String SERIALIZED_NAME_ORDER_BY = "orderBy";
  @SerializedName(SERIALIZED_NAME_ORDER_BY)
  private List<OrderByTermDesign> orderBy;

  public static final String SERIALIZED_NAME_LIMIT = "limit";
  @SerializedName(SERIALIZED_NAME_LIMIT)
  private Integer limit;

  public static final String SERIALIZED_NAME_WARNINGS = "warnings";
  @SerializedName(SERIALIZED_NAME_WARNINGS)
  private List<String> warnings;

  public static final String SERIALIZED_NAME_AVAILABLE_FIELDS = "availableFields";
  @SerializedName(SERIALIZED_NAME_AVAILABLE_FIELDS)
  private List<AvailableField> availableFields;

  public QueryDesign() {
  }

  public QueryDesign tableName(String tableName) {
    
    this.tableName = tableName;
    return this;
  }

   /**
   * Name of the table being designed
   * @return tableName
  **/
  @jakarta.annotation.Nonnull
  public String getTableName() {
    return tableName;
  }


  public void setTableName(String tableName) {
    this.tableName = tableName;
  }


  public QueryDesign alias(String alias) {
    
    this.alias = alias;
    return this;
  }

   /**
   * Alias for the table in the generated SQL, if any
   * @return alias
  **/
  @jakarta.annotation.Nullable
  public String getAlias() {
    return alias;
  }


  public void setAlias(String alias) {
    this.alias = alias;
  }


  public QueryDesign fields(List<FieldDesign> fields) {
    
    this.fields = fields;
    return this;
  }

  public QueryDesign addFieldsItem(FieldDesign fieldsItem) {
    if (this.fields == null) {
      this.fields = new ArrayList<>();
    }
    this.fields.add(fieldsItem);
    return this;
  }

   /**
   * Fields to be selected, aggregated over and/or filtered on
   * @return fields
  **/
  @jakarta.annotation.Nonnull
  public List<FieldDesign> getFields() {
    return fields;
  }


  public void setFields(List<FieldDesign> fields) {
    this.fields = fields;
  }


  public QueryDesign orderBy(List<OrderByTermDesign> orderBy) {
    
    this.orderBy = orderBy;
    return this;
  }

  public QueryDesign addOrderByItem(OrderByTermDesign orderByItem) {
    if (this.orderBy == null) {
      this.orderBy = new ArrayList<>();
    }
    this.orderBy.add(orderByItem);
    return this;
  }

   /**
   * Order By clauses to apply
   * @return orderBy
  **/
  @jakarta.annotation.Nullable
  public List<OrderByTermDesign> getOrderBy() {
    return orderBy;
  }


  public void setOrderBy(List<OrderByTermDesign> orderBy) {
    this.orderBy = orderBy;
  }


  public QueryDesign limit(Integer limit) {
    
    this.limit = limit;
    return this;
  }

   /**
   * Row limit to apply, if any
   * @return limit
  **/
  @jakarta.annotation.Nullable
  public Integer getLimit() {
    return limit;
  }


  public void setLimit(Integer limit) {
    this.limit = limit;
  }


  public QueryDesign warnings(List<String> warnings) {
    
    this.warnings = warnings;
    return this;
  }

  public QueryDesign addWarningsItem(String warningsItem) {
    if (this.warnings == null) {
      this.warnings = new ArrayList<>();
    }
    this.warnings.add(warningsItem);
    return this;
  }

   /**
   * Any warnings to show the user when converting from SQL to this representation
   * @return warnings
  **/
  @jakarta.annotation.Nullable
  public List<String> getWarnings() {
    return warnings;
  }


  public void setWarnings(List<String> warnings) {
    this.warnings = warnings;
  }


  public QueryDesign availableFields(List<AvailableField> availableFields) {
    
    this.availableFields = availableFields;
    return this;
  }

  public QueryDesign addAvailableFieldsItem(AvailableField availableFieldsItem) {
    if (this.availableFields == null) {
      this.availableFields = new ArrayList<>();
    }
    this.availableFields.add(availableFieldsItem);
    return this;
  }

   /**
   * Fields that are known to be available for design when parsing SQL
   * @return availableFields
  **/
  @jakarta.annotation.Nullable
  public List<AvailableField> getAvailableFields() {
    return availableFields;
  }


  public void setAvailableFields(List<AvailableField> availableFields) {
    this.availableFields = availableFields;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    QueryDesign queryDesign = (QueryDesign) o;
    return Objects.equals(this.tableName, queryDesign.tableName) &&
        Objects.equals(this.alias, queryDesign.alias) &&
        Objects.equals(this.fields, queryDesign.fields) &&
        Objects.equals(this.orderBy, queryDesign.orderBy) &&
        Objects.equals(this.limit, queryDesign.limit) &&
        Objects.equals(this.warnings, queryDesign.warnings) &&
        Objects.equals(this.availableFields, queryDesign.availableFields);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(tableName, alias, fields, orderBy, limit, warnings, availableFields);
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
    sb.append("class QueryDesign {\n");
    sb.append("    tableName: ").append(toIndentedString(tableName)).append("\n");
    sb.append("    alias: ").append(toIndentedString(alias)).append("\n");
    sb.append("    fields: ").append(toIndentedString(fields)).append("\n");
    sb.append("    orderBy: ").append(toIndentedString(orderBy)).append("\n");
    sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
    sb.append("    warnings: ").append(toIndentedString(warnings)).append("\n");
    sb.append("    availableFields: ").append(toIndentedString(availableFields)).append("\n");
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
    openapiFields.add("tableName");
    openapiFields.add("alias");
    openapiFields.add("fields");
    openapiFields.add("orderBy");
    openapiFields.add("limit");
    openapiFields.add("warnings");
    openapiFields.add("availableFields");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("tableName");
    openapiRequiredFields.add("fields");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to QueryDesign
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!QueryDesign.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in QueryDesign is not found in the empty JSON string", QueryDesign.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : QueryDesign.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("tableName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `tableName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("tableName").toString()));
      }
      if ((jsonObj.get("alias") != null && !jsonObj.get("alias").isJsonNull()) && !jsonObj.get("alias").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `alias` to be a primitive type in the JSON string but got `%s`", jsonObj.get("alias").toString()));
      }
      // ensure the json data is an array
      if (!jsonObj.get("fields").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `fields` to be an array in the JSON string but got `%s`", jsonObj.get("fields").toString()));
      }

      JsonArray jsonArrayfields = jsonObj.getAsJsonArray("fields");
      // validate the required field `fields` (array)
      for (int i = 0; i < jsonArrayfields.size(); i++) {
        FieldDesign.validateJsonElement(jsonArrayfields.get(i));
      };
      if (jsonObj.get("orderBy") != null && !jsonObj.get("orderBy").isJsonNull()) {
        JsonArray jsonArrayorderBy = jsonObj.getAsJsonArray("orderBy");
        if (jsonArrayorderBy != null) {
          // ensure the json data is an array
          if (!jsonObj.get("orderBy").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `orderBy` to be an array in the JSON string but got `%s`", jsonObj.get("orderBy").toString()));
          }

          // validate the optional field `orderBy` (array)
          for (int i = 0; i < jsonArrayorderBy.size(); i++) {
            OrderByTermDesign.validateJsonElement(jsonArrayorderBy.get(i));
          };
        }
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("warnings") != null && !jsonObj.get("warnings").isJsonNull() && !jsonObj.get("warnings").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `warnings` to be an array in the JSON string but got `%s`", jsonObj.get("warnings").toString()));
      }
      if (jsonObj.get("availableFields") != null && !jsonObj.get("availableFields").isJsonNull()) {
        JsonArray jsonArrayavailableFields = jsonObj.getAsJsonArray("availableFields");
        if (jsonArrayavailableFields != null) {
          // ensure the json data is an array
          if (!jsonObj.get("availableFields").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `availableFields` to be an array in the JSON string but got `%s`", jsonObj.get("availableFields").toString()));
          }

          // validate the optional field `availableFields` (array)
          for (int i = 0; i < jsonArrayavailableFields.size(); i++) {
            AvailableField.validateJsonElement(jsonArrayavailableFields.get(i));
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!QueryDesign.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'QueryDesign' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<QueryDesign> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(QueryDesign.class));

       return (TypeAdapter<T>) new TypeAdapter<QueryDesign>() {
           @Override
           public void write(JsonWriter out, QueryDesign value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public QueryDesign read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of QueryDesign given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of QueryDesign
  * @throws IOException if the JSON string is invalid with respect to QueryDesign
  */
  public static QueryDesign fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, QueryDesign.class);
  }

 /**
  * Convert an instance of QueryDesign to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
