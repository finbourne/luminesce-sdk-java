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
 * Binaries that can be downloaded
 */
@JsonAdapter(LuminesceBinaryType.Adapter.class)
public enum LuminesceBinaryType {
  
  COMMANDLINETOOL("CommandLineTool"),
  
  LOCALFILESYSTEM_PROVIDERS("LocalFileSystem_Providers"),
  
  EMAIL_PROVIDERS("Email_Providers"),
  
  PYTHON_PROVIDERS("Python_Providers"),
  
  AWSS3_PROVIDERS("AwsS3_Providers"),
  
  SQLDB_PROVIDERS_DB2LINUX("SqlDb_Providers_Db2Linux"),
  
  SQLDB_PROVIDERS_MYSQL("SqlDb_Providers_MySql"),
  
  SQLDB_PROVIDERS_ORACLE("SqlDb_Providers_Oracle"),
  
  SQLDB_PROVIDERS_ORACLE_SNOWFLAKE("SqlDb_Providers_Oracle_Snowflake"),
  
  SQLDB_PROVIDERS_POSTGRESQL("SqlDb_Providers_Postgresql"),
  
  SQLDB_PROVIDERS_SNOWFLAKE("SqlDb_Providers_Snowflake"),
  
  SQLDB_PROVIDERS_SQLSERVER("SqlDb_Providers_SqlServer"),
  
  SQLDB_PROVIDERS_SYBASEASE("SqlDb_Providers_SybaseAse"),
  
  SQLDB_PROVIDERS_SQLITE("SqlDb_Providers_SqLite"),
  
  SQLDB_PROVIDERS_DUCKDB("SqlDb_Providers_DuckDb"),
  
  JDBC_DRIVER("Jdbc_Driver");

  private String value;

  LuminesceBinaryType(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static LuminesceBinaryType fromValue(String value) {
    for (LuminesceBinaryType b : LuminesceBinaryType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<LuminesceBinaryType> {
    @Override
    public void write(final JsonWriter jsonWriter, final LuminesceBinaryType enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public LuminesceBinaryType read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return LuminesceBinaryType.fromValue(value);
    }
  }
}

