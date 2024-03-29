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
import com.google.gson.annotations.SerializedName;

import java.io.IOException;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

/**
 * Gets or Sets MappingFlags
 */
@JsonAdapter(MappingFlags.Adapter.class)
public enum MappingFlags {
  
  NONE("None"),
  
  EXACT("Exact"),
  
  SIMILAR("Similar"),
  
  ADDITIONAL("Additional");

  private String value;

  MappingFlags(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static MappingFlags fromValue(String value) {
    for (MappingFlags b : MappingFlags.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<MappingFlags> {
    @Override
    public void write(final JsonWriter jsonWriter, final MappingFlags enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public MappingFlags read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return MappingFlags.fromValue(value);
    }
  }
}

