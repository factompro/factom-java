/*
 * Factom PRO API
 * Factom PRO is a cloud blockchain gateway for securing your business data. Store data on the Bitcoin and Ethereum blockchains at a low fixed price of $0.01 per write. No cryptocurrency. No nodes.
 *
 * OpenAPI spec version: 1.5.0
 * Contact: support@factom.pro
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package io.swagger.client.model;

import java.util.Objects;
import java.util.Arrays;
import io.swagger.v3.oas.annotations.media.Schema;
import com.google.gson.annotations.SerializedName;
import java.io.IOException;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

/**
 * Chain/entry status:   * &#x60;queue&#x60; - Recently created and will be written on the blockchain soon   * &#x60;processing&#x60; - Sent to the blockchain, will appear in the next block   * &#x60;completed&#x60; - Appeared on the blockchain and accessible for anyone 
 */
@JsonAdapter(StatusParams.Adapter.class)
public enum StatusParams {
  QUEUE("queue"),
  PROCESSING("processing"),
  COMPLETED("completed");

  private String value;

  StatusParams(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static StatusParams fromValue(String text) {
    for (StatusParams b : StatusParams.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<StatusParams> {
    @Override
    public void write(final JsonWriter jsonWriter, final StatusParams enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public StatusParams read(final JsonReader jsonReader) throws IOException {
      Object value = jsonReader.nextString();
      return StatusParams.fromValue(String.valueOf(value));
    }
  }
}
