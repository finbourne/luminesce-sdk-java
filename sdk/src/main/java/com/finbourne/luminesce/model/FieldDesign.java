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
import com.finbourne.luminesce.model.Aggregation;
import com.finbourne.luminesce.model.DataType;
import com.finbourne.luminesce.model.FilterTermDesign;
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
 * Treatment of a single field within a QueryDesign
 */
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class FieldDesign {
  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_TABLE_ALIAS = "tableAlias";
  @SerializedName(SERIALIZED_NAME_TABLE_ALIAS)
  private String tableAlias;

  public static final String SERIALIZED_NAME_ALIAS = "alias";
  @SerializedName(SERIALIZED_NAME_ALIAS)
  private String alias;

  public static final String SERIALIZED_NAME_DATA_TYPE = "dataType";
  @SerializedName(SERIALIZED_NAME_DATA_TYPE)
  private DataType dataType;

  public static final String SERIALIZED_NAME_SHOULD_SELECT = "shouldSelect";
  @SerializedName(SERIALIZED_NAME_SHOULD_SELECT)
  private Boolean shouldSelect;

  public static final String SERIALIZED_NAME_FILTERS = "filters";
  @SerializedName(SERIALIZED_NAME_FILTERS)
  private List<FilterTermDesign> filters;

  public static final String SERIALIZED_NAME_AGGREGATIONS = "aggregations";
  @SerializedName(SERIALIZED_NAME_AGGREGATIONS)
  private List<Aggregation> aggregations;

  public static final String SERIALIZED_NAME_IS_EXPRESSION = "isExpression";
  @SerializedName(SERIALIZED_NAME_IS_EXPRESSION)
  private Boolean isExpression;

  public FieldDesign() {
  }

  public FieldDesign name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Name of the Field (column name, constant, complex expression, etc.)
   * @return name
  **/
  @jakarta.annotation.Nonnull
  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public FieldDesign tableAlias(String tableAlias) {
    
    this.tableAlias = tableAlias;
    return this;
  }

   /**
   * Alias of the Table the field belongs to
   * @return tableAlias
  **/
  @jakarta.annotation.Nullable
  public String getTableAlias() {
    return tableAlias;
  }


  public void setTableAlias(String tableAlias) {
    this.tableAlias = tableAlias;
  }


  public FieldDesign alias(String alias) {
    
    this.alias = alias;
    return this;
  }

   /**
   * Alias if any (if none the Name is used)
   * @return alias
  **/
  @jakarta.annotation.Nullable
  public String getAlias() {
    return alias;
  }


  public void setAlias(String alias) {
    this.alias = alias;
  }


  public FieldDesign dataType(DataType dataType) {
    
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


  public FieldDesign shouldSelect(Boolean shouldSelect) {
    
    this.shouldSelect = shouldSelect;
    return this;
  }

   /**
   * Should this be selected? False would imply it is only being filtered on.  Ignored when Aggregations are present
   * @return shouldSelect
  **/
  @jakarta.annotation.Nullable
  public Boolean getShouldSelect() {
    return shouldSelect;
  }


  public void setShouldSelect(Boolean shouldSelect) {
    this.shouldSelect = shouldSelect;
  }


  public FieldDesign filters(List<FilterTermDesign> filters) {
    
    this.filters = filters;
    return this;
  }

  public FieldDesign addFiltersItem(FilterTermDesign filtersItem) {
    if (this.filters == null) {
      this.filters = new ArrayList<>();
    }
    this.filters.add(filtersItem);
    return this;
  }

   /**
   * Filter clauses to apply to this field (And&#39;ed together)
   * @return filters
  **/
  @jakarta.annotation.Nullable
  public List<FilterTermDesign> getFilters() {
    return filters;
  }


  public void setFilters(List<FilterTermDesign> filters) {
    this.filters = filters;
  }


  public FieldDesign aggregations(List<Aggregation> aggregations) {
    
    this.aggregations = aggregations;
    return this;
  }

  public FieldDesign addAggregationsItem(Aggregation aggregationsItem) {
    if (this.aggregations == null) {
      this.aggregations = new ArrayList<>();
    }
    this.aggregations.add(aggregationsItem);
    return this;
  }

   /**
   * Aggregations to apply (as opposed to simply selecting)
   * @return aggregations
  **/
  @jakarta.annotation.Nullable
  public List<Aggregation> getAggregations() {
    return aggregations;
  }


  public void setAggregations(List<Aggregation> aggregations) {
    this.aggregations = aggregations;
  }


  public FieldDesign isExpression(Boolean isExpression) {
    
    this.isExpression = isExpression;
    return this;
  }

   /**
   * Is this field an expression
   * @return isExpression
  **/
  @jakarta.annotation.Nullable
  public Boolean getIsExpression() {
    return isExpression;
  }


  public void setIsExpression(Boolean isExpression) {
    this.isExpression = isExpression;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FieldDesign fieldDesign = (FieldDesign) o;
    return Objects.equals(this.name, fieldDesign.name) &&
        Objects.equals(this.tableAlias, fieldDesign.tableAlias) &&
        Objects.equals(this.alias, fieldDesign.alias) &&
        Objects.equals(this.dataType, fieldDesign.dataType) &&
        Objects.equals(this.shouldSelect, fieldDesign.shouldSelect) &&
        Objects.equals(this.filters, fieldDesign.filters) &&
        Objects.equals(this.aggregations, fieldDesign.aggregations) &&
        Objects.equals(this.isExpression, fieldDesign.isExpression);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, tableAlias, alias, dataType, shouldSelect, filters, aggregations, isExpression);
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
    sb.append("class FieldDesign {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    tableAlias: ").append(toIndentedString(tableAlias)).append("\n");
    sb.append("    alias: ").append(toIndentedString(alias)).append("\n");
    sb.append("    dataType: ").append(toIndentedString(dataType)).append("\n");
    sb.append("    shouldSelect: ").append(toIndentedString(shouldSelect)).append("\n");
    sb.append("    filters: ").append(toIndentedString(filters)).append("\n");
    sb.append("    aggregations: ").append(toIndentedString(aggregations)).append("\n");
    sb.append("    isExpression: ").append(toIndentedString(isExpression)).append("\n");
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
    openapiFields.add("tableAlias");
    openapiFields.add("alias");
    openapiFields.add("dataType");
    openapiFields.add("shouldSelect");
    openapiFields.add("filters");
    openapiFields.add("aggregations");
    openapiFields.add("isExpression");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("name");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to FieldDesign
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!FieldDesign.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in FieldDesign is not found in the empty JSON string", FieldDesign.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : FieldDesign.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if ((jsonObj.get("tableAlias") != null && !jsonObj.get("tableAlias").isJsonNull()) && !jsonObj.get("tableAlias").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `tableAlias` to be a primitive type in the JSON string but got `%s`", jsonObj.get("tableAlias").toString()));
      }
      if ((jsonObj.get("alias") != null && !jsonObj.get("alias").isJsonNull()) && !jsonObj.get("alias").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `alias` to be a primitive type in the JSON string but got `%s`", jsonObj.get("alias").toString()));
      }
      if (jsonObj.get("filters") != null && !jsonObj.get("filters").isJsonNull()) {
        JsonArray jsonArrayfilters = jsonObj.getAsJsonArray("filters");
        if (jsonArrayfilters != null) {
          // ensure the json data is an array
          if (!jsonObj.get("filters").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `filters` to be an array in the JSON string but got `%s`", jsonObj.get("filters").toString()));
          }

          // validate the optional field `filters` (array)
          for (int i = 0; i < jsonArrayfilters.size(); i++) {
            FilterTermDesign.validateJsonElement(jsonArrayfilters.get(i));
          };
        }
      }
      if (jsonObj.get("aggregations") != null && !jsonObj.get("aggregations").isJsonNull()) {
        JsonArray jsonArrayaggregations = jsonObj.getAsJsonArray("aggregations");
        if (jsonArrayaggregations != null) {
          // ensure the json data is an array
          if (!jsonObj.get("aggregations").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `aggregations` to be an array in the JSON string but got `%s`", jsonObj.get("aggregations").toString()));
          }

          // validate the optional field `aggregations` (array)
          for (int i = 0; i < jsonArrayaggregations.size(); i++) {
            Aggregation.validateJsonElement(jsonArrayaggregations.get(i));
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!FieldDesign.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'FieldDesign' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<FieldDesign> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(FieldDesign.class));

       return (TypeAdapter<T>) new TypeAdapter<FieldDesign>() {
           @Override
           public void write(JsonWriter out, FieldDesign value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public FieldDesign read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of FieldDesign given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of FieldDesign
  * @throws IOException if the JSON string is invalid with respect to FieldDesign
  */
  public static FieldDesign fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, FieldDesign.class);
  }

 /**
  * Convert an instance of FieldDesign to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
