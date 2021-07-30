# ApiApi

All URIs are relative to *https://api.factom.pro/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getAPIInfo**](ApiApi.md#getAPIInfo) | **GET** / | Get API info

<a name="getAPIInfo"></a>
# **getAPIInfo**
> InlineResponse200 getAPIInfo()

Get API info

This endpoint returns Factom PRO API version. Additionally, it may be used to determine that API server is available.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ApiApi;


ApiApi apiInstance = new ApiApi();
try {
    InlineResponse200 result = apiInstance.getAPIInfo();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ApiApi#getAPIInfo");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**InlineResponse200**](InlineResponse200.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

