# ChainsApi

All URIs are relative to *https://api.factom.pro/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createChain**](ChainsApi.md#createChain) | **POST** /chains | Create chain
[**getChain**](ChainsApi.md#getChain) | **GET** /chains/{chainId} | Get chain
[**getChainEntries**](ChainsApi.md#getChainEntries) | **GET** /chains/{chainId}/entries | Get chain entries
[**getChainFirstEntry**](ChainsApi.md#getChainFirstEntry) | **GET** /chains/{chainId}/entries/first | Get first entry of the chain
[**getChainLastEntry**](ChainsApi.md#getChainLastEntry) | **GET** /chains/{chainId}/entries/last | Get last entry of the chain
[**getUserChains**](ChainsApi.md#getUserChains) | **GET** /chains | Get user&#x27;s chains
[**searchChainEntries**](ChainsApi.md#searchChainEntries) | **POST** /chains/{chainId}/entries/search | Search chain entries
[**searchUserChains**](ChainsApi.md#searchUserChains) | **POST** /chains/search | Search user&#x27;s chains

<a name="createChain"></a>
# **createChain**
> InlineResponse2003 createChain(body, callbackUrl)

Create chain

This endpoint allows you to create new chain on the Factom blockchain.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ChainsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


ChainsApi apiInstance = new ChainsApi();
NewChain body = new NewChain(); // NewChain | 
String callbackUrl = "callbackUrl_example"; // String | URL where to send status updates
try {
    InlineResponse2003 result = apiInstance.createChain(body, callbackUrl);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ChainsApi#createChain");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**NewChain**](NewChain.md)|  |
 **callbackUrl** | [**String**](.md)| URL where to send status updates | [optional]

### Return type

[**InlineResponse2003**](InlineResponse2003.md)

### Authorization

[Bearer Authorization](../README.md#Bearer Authorization)

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json

<a name="createChain"></a>
# **createChain**
> InlineResponse2003 createChain(extIds, content, callbackUrl)

Create chain

This endpoint allows you to create new chain on the Factom blockchain.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ChainsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


ChainsApi apiInstance = new ChainsApi();
ExtIds extIds = new ExtIds(); // ExtIds | 
byte[] content = null; // byte[] | 
String callbackUrl = "callbackUrl_example"; // String | URL where to send status updates
try {
    InlineResponse2003 result = apiInstance.createChain(extIds, content, callbackUrl);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ChainsApi#createChain");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **extIds** | [**ExtIds**](.md)|  |
 **content** | [**byte[]**](.md)|  |
 **callbackUrl** | [**String**](.md)| URL where to send status updates | [optional]

### Return type

[**InlineResponse2003**](InlineResponse2003.md)

### Authorization

[Bearer Authorization](../README.md#Bearer Authorization)

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json

<a name="getChain"></a>
# **getChain**
> InlineResponse2004 getChain(chainId)

Get chain

This endpoint returns Factom chain by Chain ID.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ChainsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


ChainsApi apiInstance = new ChainsApi();
String chainId = "chainId_example"; // String | Chain ID of the Factom chain
try {
    InlineResponse2004 result = apiInstance.getChain(chainId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ChainsApi#getChain");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **chainId** | [**String**](.md)| Chain ID of the Factom chain |

### Return type

[**InlineResponse2004**](InlineResponse2004.md)

### Authorization

[Bearer Authorization](../README.md#Bearer Authorization)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getChainEntries"></a>
# **getChainEntries**
> InlineResponse2005 getChainEntries(chainId, start, limit, status, sort)

Get chain entries

This endpoint returns entries of Factom chain.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ChainsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


ChainsApi apiInstance = new ChainsApi();
String chainId = "chainId_example"; // String | Chain ID of the Factom chain
Integer start = 56; // Integer | Number of items to skip before returning the results
Integer limit = 56; // Integer | Number of items you would like back in each page
StatusParams status = new StatusParams(); // StatusParams | Filter results by object status
SortParams sort = new SortParams(); // SortParams | Sorting order
try {
    InlineResponse2005 result = apiInstance.getChainEntries(chainId, start, limit, status, sort);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ChainsApi#getChainEntries");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **chainId** | [**String**](.md)| Chain ID of the Factom chain |
 **start** | [**Integer**](.md)| Number of items to skip before returning the results | [optional]
 **limit** | [**Integer**](.md)| Number of items you would like back in each page | [optional]
 **status** | [**StatusParams**](.md)| Filter results by object status | [optional]
 **sort** | [**SortParams**](.md)| Sorting order | [optional]

### Return type

[**InlineResponse2005**](InlineResponse2005.md)

### Authorization

[Bearer Authorization](../README.md#Bearer Authorization)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getChainFirstEntry"></a>
# **getChainFirstEntry**
> InlineResponse2006 getChainFirstEntry(chainId)

Get first entry of the chain

This endpoint returns first entry of chain.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ChainsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


ChainsApi apiInstance = new ChainsApi();
String chainId = "chainId_example"; // String | Chain ID of the Factom chain
try {
    InlineResponse2006 result = apiInstance.getChainFirstEntry(chainId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ChainsApi#getChainFirstEntry");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **chainId** | [**String**](.md)| Chain ID of the Factom chain |

### Return type

[**InlineResponse2006**](InlineResponse2006.md)

### Authorization

[Bearer Authorization](../README.md#Bearer Authorization)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getChainLastEntry"></a>
# **getChainLastEntry**
> InlineResponse2006 getChainLastEntry(chainId)

Get last entry of the chain

This endpoint returns last entry of chain.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ChainsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


ChainsApi apiInstance = new ChainsApi();
String chainId = "chainId_example"; // String | Chain ID of the Factom chain
try {
    InlineResponse2006 result = apiInstance.getChainLastEntry(chainId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ChainsApi#getChainLastEntry");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **chainId** | [**String**](.md)| Chain ID of the Factom chain |

### Return type

[**InlineResponse2006**](InlineResponse2006.md)

### Authorization

[Bearer Authorization](../README.md#Bearer Authorization)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getUserChains"></a>
# **getUserChains**
> InlineResponse2002 getUserChains(all, start, limit, status, sort)

Get user&#x27;s chains

This endpoint returns all chains, with that API user works.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ChainsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


ChainsApi apiInstance = new ChainsApi();
Integer all = 56; // Integer | Return chains from entire blockchain (rather than only chains that the API user has touched)
Integer start = 56; // Integer | Number of items to skip before returning the results
Integer limit = 56; // Integer | Number of items you would like back in each page
StatusParams status = new StatusParams(); // StatusParams | Filter results by object status
SortParams sort = new SortParams(); // SortParams | Sorting order
try {
    InlineResponse2002 result = apiInstance.getUserChains(all, start, limit, status, sort);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ChainsApi#getUserChains");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **all** | [**Integer**](.md)| Return chains from entire blockchain (rather than only chains that the API user has touched) | [optional]
 **start** | [**Integer**](.md)| Number of items to skip before returning the results | [optional]
 **limit** | [**Integer**](.md)| Number of items you would like back in each page | [optional]
 **status** | [**StatusParams**](.md)| Filter results by object status | [optional]
 **sort** | [**SortParams**](.md)| Sorting order | [optional]

### Return type

[**InlineResponse2002**](InlineResponse2002.md)

### Authorization

[Bearer Authorization](../README.md#Bearer Authorization)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="searchChainEntries"></a>
# **searchChainEntries**
> InlineResponse2005 searchChainEntries(body, chainId, start, limit, status, sort)

Search chain entries

This endpoint allows you to search among entries of the chain by one or multiple external IDs.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ChainsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


ChainsApi apiInstance = new ChainsApi();
SearchExtIds body = new SearchExtIds(); // SearchExtIds | 
String chainId = "chainId_example"; // String | Chain ID of the Factom chain
Integer start = 56; // Integer | Number of items to skip before returning the results
Integer limit = 56; // Integer | Number of items you would like back in each page
StatusParams status = new StatusParams(); // StatusParams | Filter results by object status
SortParams sort = new SortParams(); // SortParams | Sorting order
try {
    InlineResponse2005 result = apiInstance.searchChainEntries(body, chainId, start, limit, status, sort);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ChainsApi#searchChainEntries");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**SearchExtIds**](SearchExtIds.md)|  |
 **chainId** | [**String**](.md)| Chain ID of the Factom chain |
 **start** | [**Integer**](.md)| Number of items to skip before returning the results | [optional]
 **limit** | [**Integer**](.md)| Number of items you would like back in each page | [optional]
 **status** | [**StatusParams**](.md)| Filter results by object status | [optional]
 **sort** | [**SortParams**](.md)| Sorting order | [optional]

### Return type

[**InlineResponse2005**](InlineResponse2005.md)

### Authorization

[Bearer Authorization](../README.md#Bearer Authorization)

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json

<a name="searchChainEntries"></a>
# **searchChainEntries**
> InlineResponse2005 searchChainEntries(extIds, chainId, start, limit, status, sort)

Search chain entries

This endpoint allows you to search among entries of the chain by one or multiple external IDs.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ChainsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


ChainsApi apiInstance = new ChainsApi();
ExtIds extIds = new ExtIds(); // ExtIds | 
String chainId = "chainId_example"; // String | Chain ID of the Factom chain
Integer start = 56; // Integer | Number of items to skip before returning the results
Integer limit = 56; // Integer | Number of items you would like back in each page
StatusParams status = new StatusParams(); // StatusParams | Filter results by object status
SortParams sort = new SortParams(); // SortParams | Sorting order
try {
    InlineResponse2005 result = apiInstance.searchChainEntries(extIds, chainId, start, limit, status, sort);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ChainsApi#searchChainEntries");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **extIds** | [**ExtIds**](.md)|  |
 **chainId** | [**String**](.md)| Chain ID of the Factom chain |
 **start** | [**Integer**](.md)| Number of items to skip before returning the results | [optional]
 **limit** | [**Integer**](.md)| Number of items you would like back in each page | [optional]
 **status** | [**StatusParams**](.md)| Filter results by object status | [optional]
 **sort** | [**SortParams**](.md)| Sorting order | [optional]

### Return type

[**InlineResponse2005**](InlineResponse2005.md)

### Authorization

[Bearer Authorization](../README.md#Bearer Authorization)

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json

<a name="searchUserChains"></a>
# **searchUserChains**
> InlineResponse2002 searchUserChains(body, all, start, limit, status, sort)

Search user&#x27;s chains

This endpoint allows you to search among user&#x27;s chains by one or multiple external IDs.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ChainsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


ChainsApi apiInstance = new ChainsApi();
SearchExtIds body = new SearchExtIds(); // SearchExtIds | 
Integer all = 56; // Integer | Return chains from entire blockchain (rather than only chains that the API user has touched)
Integer start = 56; // Integer | Number of items to skip before returning the results
Integer limit = 56; // Integer | Number of items you would like back in each page
StatusParams status = new StatusParams(); // StatusParams | Filter results by object status
SortParams sort = new SortParams(); // SortParams | Sorting order
try {
    InlineResponse2002 result = apiInstance.searchUserChains(body, all, start, limit, status, sort);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ChainsApi#searchUserChains");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**SearchExtIds**](SearchExtIds.md)|  |
 **all** | [**Integer**](.md)| Return chains from entire blockchain (rather than only chains that the API user has touched) | [optional]
 **start** | [**Integer**](.md)| Number of items to skip before returning the results | [optional]
 **limit** | [**Integer**](.md)| Number of items you would like back in each page | [optional]
 **status** | [**StatusParams**](.md)| Filter results by object status | [optional]
 **sort** | [**SortParams**](.md)| Sorting order | [optional]

### Return type

[**InlineResponse2002**](InlineResponse2002.md)

### Authorization

[Bearer Authorization](../README.md#Bearer Authorization)

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json

<a name="searchUserChains"></a>
# **searchUserChains**
> InlineResponse2002 searchUserChains(extIds, all, start, limit, status, sort)

Search user&#x27;s chains

This endpoint allows you to search among user&#x27;s chains by one or multiple external IDs.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ChainsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


ChainsApi apiInstance = new ChainsApi();
ExtIds extIds = new ExtIds(); // ExtIds | 
Integer all = 56; // Integer | Return chains from entire blockchain (rather than only chains that the API user has touched)
Integer start = 56; // Integer | Number of items to skip before returning the results
Integer limit = 56; // Integer | Number of items you would like back in each page
StatusParams status = new StatusParams(); // StatusParams | Filter results by object status
SortParams sort = new SortParams(); // SortParams | Sorting order
try {
    InlineResponse2002 result = apiInstance.searchUserChains(extIds, all, start, limit, status, sort);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ChainsApi#searchUserChains");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **extIds** | [**ExtIds**](.md)|  |
 **all** | [**Integer**](.md)| Return chains from entire blockchain (rather than only chains that the API user has touched) | [optional]
 **start** | [**Integer**](.md)| Number of items to skip before returning the results | [optional]
 **limit** | [**Integer**](.md)| Number of items you would like back in each page | [optional]
 **status** | [**StatusParams**](.md)| Filter results by object status | [optional]
 **sort** | [**SortParams**](.md)| Sorting order | [optional]

### Return type

[**InlineResponse2002**](InlineResponse2002.md)

### Authorization

[Bearer Authorization](../README.md#Bearer Authorization)

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json

