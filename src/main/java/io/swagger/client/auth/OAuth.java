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

package io.swagger.client.auth;

import io.swagger.client.Pair;

import java.util.Map;
import java.util.List;

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2021-07-30T15:28:24.262574+02:00[Europe/Madrid]")public class OAuth implements Authentication {
  private String accessToken;

  public String getAccessToken() {
    return accessToken;
  }

  public void setAccessToken(String accessToken) {
    this.accessToken = accessToken;
  }

  @Override
  public void applyToParams(List<Pair> queryParams, Map<String, String> headerParams) {
    if (accessToken != null) {
      headerParams.put("Authorization", "Bearer " + accessToken);
    }
  }
}
