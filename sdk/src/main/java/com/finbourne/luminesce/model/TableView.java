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
import com.finbourne.luminesce.model.ColumnStateType;
import com.finbourne.luminesce.model.FilterModel;
import com.finbourne.luminesce.model.TableMeta;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
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
 * Representation of the table structure
 */
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class TableView {
  public static final String SERIALIZED_NAME_HEADER_NAMES = "headerNames";
  @SerializedName(SERIALIZED_NAME_HEADER_NAMES)
  private Map<String, String> headerNames = new HashMap<>();

  public static final String SERIALIZED_NAME_COLUMN_STATE = "columnState";
  @SerializedName(SERIALIZED_NAME_COLUMN_STATE)
  private List<ColumnStateType> columnState = new ArrayList<>();

  public static final String SERIALIZED_NAME_FILTERS = "filters";
  @SerializedName(SERIALIZED_NAME_FILTERS)
  private Map<String, FilterModel> filters;

  public static final String SERIALIZED_NAME_META = "meta";
  @SerializedName(SERIALIZED_NAME_META)
  private TableMeta meta;

  public TableView() {
  }

  public TableView headerNames(Map<String, String> headerNames) {
    
    this.headerNames = headerNames;
    return this;
  }

  public TableView putHeaderNamesItem(String key, String headerNamesItem) {
    if (this.headerNames == null) {
      this.headerNames = new HashMap<>();
    }
    this.headerNames.put(key, headerNamesItem);
    return this;
  }

   /**
   * Mapping of column ids to aliases
   * @return headerNames
  **/
  @jakarta.annotation.Nonnull
  public Map<String, String> getHeaderNames() {
    return headerNames;
  }


  public void setHeaderNames(Map<String, String> headerNames) {
    this.headerNames = headerNames;
  }


  public TableView columnState(List<ColumnStateType> columnState) {
    
    this.columnState = columnState;
    return this;
  }

  public TableView addColumnStateItem(ColumnStateType columnStateItem) {
    if (this.columnState == null) {
      this.columnState = new ArrayList<>();
    }
    this.columnState.add(columnStateItem);
    return this;
  }

   /**
   * Array of all columns in the dashboard
   * @return columnState
  **/
  @jakarta.annotation.Nonnull
  public List<ColumnStateType> getColumnState() {
    return columnState;
  }


  public void setColumnState(List<ColumnStateType> columnState) {
    this.columnState = columnState;
  }


  public TableView filters(Map<String, FilterModel> filters) {
    
    this.filters = filters;
    return this;
  }

  public TableView putFiltersItem(String key, FilterModel filtersItem) {
    if (this.filters == null) {
      this.filters = new HashMap<>();
    }
    this.filters.put(key, filtersItem);
    return this;
  }

   /**
   * Filters applied to columns in the dashboard
   * @return filters
  **/
  @jakarta.annotation.Nullable
  public Map<String, FilterModel> getFilters() {
    return filters;
  }


  public void setFilters(Map<String, FilterModel> filters) {
    this.filters = filters;
  }


  public TableView meta(TableMeta meta) {
    
    this.meta = meta;
    return this;
  }

   /**
   * Get meta
   * @return meta
  **/
  @jakarta.annotation.Nonnull
  public TableMeta getMeta() {
    return meta;
  }


  public void setMeta(TableMeta meta) {
    this.meta = meta;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TableView tableView = (TableView) o;
    return Objects.equals(this.headerNames, tableView.headerNames) &&
        Objects.equals(this.columnState, tableView.columnState) &&
        Objects.equals(this.filters, tableView.filters) &&
        Objects.equals(this.meta, tableView.meta);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(headerNames, columnState, filters, meta);
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
    sb.append("class TableView {\n");
    sb.append("    headerNames: ").append(toIndentedString(headerNames)).append("\n");
    sb.append("    columnState: ").append(toIndentedString(columnState)).append("\n");
    sb.append("    filters: ").append(toIndentedString(filters)).append("\n");
    sb.append("    meta: ").append(toIndentedString(meta)).append("\n");
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
    openapiFields.add("headerNames");
    openapiFields.add("columnState");
    openapiFields.add("filters");
    openapiFields.add("meta");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("headerNames");
    openapiRequiredFields.add("columnState");
    openapiRequiredFields.add("meta");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to TableView
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!TableView.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in TableView is not found in the empty JSON string", TableView.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : TableView.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // ensure the json data is an array
      if (!jsonObj.get("columnState").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `columnState` to be an array in the JSON string but got `%s`", jsonObj.get("columnState").toString()));
      }

      JsonArray jsonArraycolumnState = jsonObj.getAsJsonArray("columnState");
      // validate the required field `columnState` (array)
      for (int i = 0; i < jsonArraycolumnState.size(); i++) {
        ColumnStateType.validateJsonElement(jsonArraycolumnState.get(i));
      };
      // validate the required field `meta`
      TableMeta.validateJsonElement(jsonObj.get("meta"));
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!TableView.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'TableView' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<TableView> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(TableView.class));

       return (TypeAdapter<T>) new TypeAdapter<TableView>() {
           @Override
           public void write(JsonWriter out, TableView value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public TableView read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of TableView given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of TableView
  * @throws IOException if the JSON string is invalid with respect to TableView
  */
  public static TableView fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, TableView.class);
  }

 /**
  * Convert an instance of TableView to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
