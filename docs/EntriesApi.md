# EntriesApi

All URIs are relative to *https://api.factom.pro/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createEntry**](EntriesApi.md#createEntry) | **POST** /entries | Create entry
[**getEntry**](EntriesApi.md#getEntry) | **GET** /entries/{entryHash} | Get entry

<a name="createEntry"></a>
# **createEntry**
> InlineResponse2006 createEntry(body, callbackUrl)

Create entry

This endpoint allows you to create entry into Factom chain.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.EntriesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


EntriesApi apiInstance = new EntriesApi();
NewEntry body = new NewEntry(); // NewEntry | 
String callbackUrl = "callbackUrl_example"; // String | URL where to send status updates
try {
    InlineResponse2006 result = apiInstance.createEntry(body, callbackUrl);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling EntriesApi#createEntry");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**NewEntry**](NewEntry.md)|  |
 **callbackUrl** | [**String**](.md)| URL where to send status updates | [optional]

### Return type

[**InlineResponse2006**](InlineResponse2006.md)

### Authorization

[Bearer Authorization](../README.md#Bearer Authorization)

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json

<a name="createEntry"></a>
# **createEntry**
> InlineResponse2006 createEntry(chainId, extIds, content, callbackUrl)

Create entry

This endpoint allows you to create entry into Factom chain.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.EntriesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


EntriesApi apiInstance = new EntriesApi();
String chainId = "chainId_example"; // String | 
ExtIds extIds = new ExtIds(); // ExtIds | 
byte[] content = null; // byte[] | 
String callbackUrl = "callbackUrl_example"; // String | URL where to send status updates
try {
    InlineResponse2006 result = apiInstance.createEntry(chainId, extIds, content, callbackUrl);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling EntriesApi#createEntry");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **chainId** | [**String**](.md)|  |
 **extIds** | [**ExtIds**](.md)|  |
 **content** | [**byte[]**](.md)|  |
 **callbackUrl** | [**String**](.md)| URL where to send status updates | [optional]

### Return type

[**InlineResponse2006**](InlineResponse2006.md)

### Authorization

[Bearer Authorization](../README.md#Bearer Authorization)

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json

<a name="getEntry"></a>
# **getEntry**
> InlineResponse2006 getEntry(entryHash)

Get entry

This endpoint returns Factom entry by it&#x27;s hash.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.EntriesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


EntriesApi apiInstance = new EntriesApi();
String entryHash = "entryHash_example"; // String | Entry Hash of the Factom entry
try {
    InlineResponse2006 result = apiInstance.getEntry(entryHash);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling EntriesApi#getEntry");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **entryHash** | [**String**](.md)| Entry Hash of the Factom entry |

### Return type

[**InlineResponse2006**](InlineResponse2006.md)

### Authorization

[Bearer Authorization](../README.md#Bearer Authorization)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

