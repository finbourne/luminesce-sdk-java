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
 * Which System(s) have been updated with a given request
 */
@JsonAdapter(CertificateStatus.Adapter.class)
public enum CertificateStatus {
  
  NONE("None"),
  
  WEBAPIPERSISTENCE("WebApiPersistence"),
  
  VAULT("Vault"),
  
  WEBAPIPERSISTENCEVAULT("WebApiPersistenceVault"),
  
  RABBIT("Rabbit"),
  
  WEBAPIPERSISTENCERABBIT("WebApiPersistenceRabbit"),
  
  VAULTRABBIT("VaultRabbit"),
  
  WEBAPIPERSISTENCEVAULTRABBIT("WebApiPersistenceVaultRabbit"),
  
  CONFIGSTORE("ConfigStore"),
  
  WEBAPIPERSISTENCECONFIGSTORE("WebApiPersistenceConfigStore"),
  
  VAULTCONFIGSTORE("VaultConfigStore"),
  
  WEBAPIPERSISTENCEVAULTCONFIGSTORE("WebApiPersistenceVaultConfigStore"),
  
  RABBITCONFIGSTORE("RabbitConfigStore"),
  
  WEBAPIPERSISTENCERABBITCONFIGSTORE("WebApiPersistenceRabbitConfigStore"),
  
  VAULTRABBITCONFIGSTORE("VaultRabbitConfigStore"),
  
  ALLSYSTEMS("AllSystems");

  private String value;

  CertificateStatus(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static CertificateStatus fromValue(String value) {
    for (CertificateStatus b : CertificateStatus.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<CertificateStatus> {
    @Override
    public void write(final JsonWriter jsonWriter, final CertificateStatus enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public CertificateStatus read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return CertificateStatus.fromValue(value);
    }
  }
}

