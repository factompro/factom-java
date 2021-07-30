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
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.client.model.ExtIds;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
/**
 * NewChain
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2021-07-30T15:28:24.262574+02:00[Europe/Madrid]")
public class NewChain {
  @SerializedName("extIds")
  private ExtIds extIds = null;

  @SerializedName("content")
  private byte[] content = null;

  public NewChain extIds(ExtIds extIds) {
    this.extIds = extIds;
    return this;
  }

   /**
   * Get extIds
   * @return extIds
  **/
  @Schema(required = true, description = "")
  public ExtIds getExtIds() {
    return extIds;
  }

  public void setExtIds(ExtIds extIds) {
    this.extIds = extIds;
  }

  public NewChain content(byte[] content) {
    this.content = content;
    return this;
  }

   /**
   * Get content
   * @return content
  **/
  @Schema(description = "")
  public byte[] getContent() {
    return content;
  }

  public void setContent(byte[] content) {
    this.content = content;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NewChain newChain = (NewChain) o;
    return Objects.equals(this.extIds, newChain.extIds) &&
        Objects.equals(this.content, newChain.content);
  }

  @Override
  public int hashCode() {
    return Objects.hash(extIds, content);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NewChain {\n");
    
    sb.append("    extIds: ").append(toIndentedString(extIds)).append("\n");
    sb.append("    content: ").append(toIndentedString(content)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}
