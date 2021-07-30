# UserApi

All URIs are relative to *https://api.factom.pro/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getUser**](UserApi.md#getUser) | **GET** /user | Get user info

<a name="getUser"></a>
# **getUser**
> InlineResponse2001 getUser()

Get user info

This endpoint returns information about user, such as limits &amp; usage stats.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.UserApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


UserApi apiInstance = new UserApi();
try {
    InlineResponse2001 result = apiInstance.getUser();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UserApi#getUser");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**InlineResponse2001**](InlineResponse2001.md)

### Authorization

[Bearer Authorization](../README.md#Bearer Authorization)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

