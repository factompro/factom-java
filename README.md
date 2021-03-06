# swagger-java-client

Factom PRO API
- API version: 1.5.0
  - Build date: 2021-07-30T15:28:24.262574+02:00[Europe/Madrid]

Factom PRO is a cloud blockchain gateway for securing your business data. Store data on the Bitcoin and Ethereum blockchains at a low fixed price of $0.01 per write. No cryptocurrency. No nodes.

  For more information, please visit [https://factom.pro](https://factom.pro)

*Automatically generated by the [Swagger Codegen](https://github.com/swagger-api/swagger-codegen)*


## Requirements

Building the API client library requires:
1. Java 1.7+
2. Maven/Gradle

## Installation

To install the API client library to your local Maven repository, simply execute:

```shell
mvn clean install
```

To deploy it to a remote Maven repository instead, configure the settings of the repository and execute:

```shell
mvn clean deploy
```

Refer to the [OSSRH Guide](http://central.sonatype.org/pages/ossrh-guide.html) for more information.

### Maven users

Add this dependency to your project's POM:

```xml
<dependency>
  <groupId>io.swagger</groupId>
  <artifactId>swagger-java-client</artifactId>
  <version>1.0.0</version>
  <scope>compile</scope>
</dependency>
```

### Gradle users

Add this dependency to your project's build file:

```groovy
compile "io.swagger:swagger-java-client:1.0.0"
```

### Others

At first generate the JAR by executing:

```shell
mvn clean package
```

Then manually install the following JARs:

* `target/swagger-java-client-1.0.0.jar`
* `target/lib/*.jar`

## Getting Started

Please follow the [installation](#installation) instruction and execute the following Java code:

```java
import io.swagger.client.*;
import io.swagger.client.auth.*;
import io.swagger.client.model.*;
import io.swagger.client.api.ApiApi;

import java.io.File;
import java.util.*;

public class ApiApiExample {

    public static void main(String[] args) {
        
        ApiApi apiInstance = new ApiApi();
        try {
            InlineResponse200 result = apiInstance.getAPIInfo();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ApiApi#getAPIInfo");
            e.printStackTrace();
        }
    }
}
```

## Documentation for API Endpoints

All URIs are relative to *https://api.factom.pro/v1*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*ApiApi* | [**getAPIInfo**](docs/ApiApi.md#getAPIInfo) | **GET** / | Get API info
*ChainsApi* | [**createChain**](docs/ChainsApi.md#createChain) | **POST** /chains | Create chain
*ChainsApi* | [**getChain**](docs/ChainsApi.md#getChain) | **GET** /chains/{chainId} | Get chain
*ChainsApi* | [**getChainEntries**](docs/ChainsApi.md#getChainEntries) | **GET** /chains/{chainId}/entries | Get chain entries
*ChainsApi* | [**getChainFirstEntry**](docs/ChainsApi.md#getChainFirstEntry) | **GET** /chains/{chainId}/entries/first | Get first entry of the chain
*ChainsApi* | [**getChainLastEntry**](docs/ChainsApi.md#getChainLastEntry) | **GET** /chains/{chainId}/entries/last | Get last entry of the chain
*ChainsApi* | [**getUserChains**](docs/ChainsApi.md#getUserChains) | **GET** /chains | Get user&#x27;s chains
*ChainsApi* | [**searchChainEntries**](docs/ChainsApi.md#searchChainEntries) | **POST** /chains/{chainId}/entries/search | Search chain entries
*ChainsApi* | [**searchUserChains**](docs/ChainsApi.md#searchUserChains) | **POST** /chains/search | Search user&#x27;s chains
*EntriesApi* | [**createEntry**](docs/EntriesApi.md#createEntry) | **POST** /entries | Create entry
*EntriesApi* | [**getEntry**](docs/EntriesApi.md#getEntry) | **GET** /entries/{entryHash} | Get entry
*UserApi* | [**getUser**](docs/UserApi.md#getUser) | **GET** /user | Get user info

## Documentation for Models

 - [Chain](docs/Chain.md)
 - [ChainLinks](docs/ChainLinks.md)
 - [CreatedChain](docs/CreatedChain.md)
 - [CreatedChainLinks](docs/CreatedChainLinks.md)
 - [Entry](docs/Entry.md)
 - [ExtIds](docs/ExtIds.md)
 - [InlineResponse200](docs/InlineResponse200.md)
 - [InlineResponse2001](docs/InlineResponse2001.md)
 - [InlineResponse2002](docs/InlineResponse2002.md)
 - [InlineResponse2003](docs/InlineResponse2003.md)
 - [InlineResponse2004](docs/InlineResponse2004.md)
 - [InlineResponse2005](docs/InlineResponse2005.md)
 - [InlineResponse2006](docs/InlineResponse2006.md)
 - [InlineResponse200Result](docs/InlineResponse200Result.md)
 - [InlineResponse400](docs/InlineResponse400.md)
 - [InlineResponse401](docs/InlineResponse401.md)
 - [InlineResponse500](docs/InlineResponse500.md)
 - [Link](docs/Link.md)
 - [NewChain](docs/NewChain.md)
 - [NewEntry](docs/NewEntry.md)
 - [SearchExtIds](docs/SearchExtIds.md)
 - [SortParams](docs/SortParams.md)
 - [StatusParams](docs/StatusParams.md)
 - [User](docs/User.md)

## Documentation for Authorization

Authentication schemes defined for the API:
### Bearer Authorization



## Recommendation

It's recommended to create an instance of `ApiClient` per thread in a multithreaded environment to avoid any potential issues.

## Author

support@factom.pro
