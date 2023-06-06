# ContractsApi

All URIs are relative to *https://api.spacetraders.io/v2*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**acceptContract**](ContractsApi.md#acceptContract) | **POST** /my/contracts/{contractId}/accept | Accept Contract |
| [**deliverContract**](ContractsApi.md#deliverContract) | **POST** /my/contracts/{contractId}/deliver | Deliver Contract |
| [**fulfillContract**](ContractsApi.md#fulfillContract) | **POST** /my/contracts/{contractId}/fulfill | Fulfill Contract |
| [**getContract**](ContractsApi.md#getContract) | **GET** /my/contracts/{contractId} | Get Contract |
| [**getContracts**](ContractsApi.md#getContracts) | **GET** /my/contracts | List Contracts |



## acceptContract

> AcceptContract200Response acceptContract(contractId)

Accept Contract

Accept a contract.

### Example

```java
// Import classes:
import de.elbosso.spacetraders.client.invoker.ApiClient;
import de.elbosso.spacetraders.client.invoker.ApiException;
import de.elbosso.spacetraders.client.invoker.Configuration;
import de.elbosso.spacetraders.client.invoker.auth.*;
import de.elbosso.spacetraders.client.invoker.models.*;
import de.elbosso.spacetraders.client.api.ContractsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.spacetraders.io/v2");
        
        // Configure HTTP bearer authorization: AgentToken
        HttpBearerAuth AgentToken = (HttpBearerAuth) defaultClient.getAuthentication("AgentToken");
        AgentToken.setBearerToken("BEARER TOKEN");

        ContractsApi apiInstance = new ContractsApi(defaultClient);
        String contractId = "contractId_example"; // String | 
        try {
            AcceptContract200Response result = apiInstance.acceptContract(contractId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ContractsApi#acceptContract");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **contractId** | **String**|  | |

### Return type

[**AcceptContract200Response**](AcceptContract200Response.md)

### Authorization

[AgentToken](../README.md#AgentToken)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |


## deliverContract

> DeliverContract200Response deliverContract(contractId, deliverContractRequest)

Deliver Contract

Deliver cargo on a given contract.

### Example

```java
// Import classes:
import de.elbosso.spacetraders.client.invoker.ApiClient;
import de.elbosso.spacetraders.client.invoker.ApiException;
import de.elbosso.spacetraders.client.invoker.Configuration;
import de.elbosso.spacetraders.client.invoker.auth.*;
import de.elbosso.spacetraders.client.invoker.models.*;
import de.elbosso.spacetraders.client.api.ContractsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.spacetraders.io/v2");
        
        // Configure HTTP bearer authorization: AgentToken
        HttpBearerAuth AgentToken = (HttpBearerAuth) defaultClient.getAuthentication("AgentToken");
        AgentToken.setBearerToken("BEARER TOKEN");

        ContractsApi apiInstance = new ContractsApi(defaultClient);
        String contractId = "contractId_example"; // String | The ID of the contract
        DeliverContractRequest deliverContractRequest = new DeliverContractRequest(); // DeliverContractRequest | 
        try {
            DeliverContract200Response result = apiInstance.deliverContract(contractId, deliverContractRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ContractsApi#deliverContract");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **contractId** | **String**| The ID of the contract | |
| **deliverContractRequest** | [**DeliverContractRequest**](DeliverContractRequest.md)|  | [optional] |

### Return type

[**DeliverContract200Response**](DeliverContract200Response.md)

### Authorization

[AgentToken](../README.md#AgentToken)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |


## fulfillContract

> FulfillContract200Response fulfillContract(contractId)

Fulfill Contract

Fulfill a contract

### Example

```java
// Import classes:
import de.elbosso.spacetraders.client.invoker.ApiClient;
import de.elbosso.spacetraders.client.invoker.ApiException;
import de.elbosso.spacetraders.client.invoker.Configuration;
import de.elbosso.spacetraders.client.invoker.auth.*;
import de.elbosso.spacetraders.client.invoker.models.*;
import de.elbosso.spacetraders.client.api.ContractsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.spacetraders.io/v2");
        
        // Configure HTTP bearer authorization: AgentToken
        HttpBearerAuth AgentToken = (HttpBearerAuth) defaultClient.getAuthentication("AgentToken");
        AgentToken.setBearerToken("BEARER TOKEN");

        ContractsApi apiInstance = new ContractsApi(defaultClient);
        String contractId = "contractId_example"; // String | The ID of the contract
        try {
            FulfillContract200Response result = apiInstance.fulfillContract(contractId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ContractsApi#fulfillContract");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **contractId** | **String**| The ID of the contract | |

### Return type

[**FulfillContract200Response**](FulfillContract200Response.md)

### Authorization

[AgentToken](../README.md#AgentToken)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |


## getContract

> GetContract200Response getContract(contractId)

Get Contract

Get the details of a contract by ID.

### Example

```java
// Import classes:
import de.elbosso.spacetraders.client.invoker.ApiClient;
import de.elbosso.spacetraders.client.invoker.ApiException;
import de.elbosso.spacetraders.client.invoker.Configuration;
import de.elbosso.spacetraders.client.invoker.auth.*;
import de.elbosso.spacetraders.client.invoker.models.*;
import de.elbosso.spacetraders.client.api.ContractsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.spacetraders.io/v2");
        
        // Configure HTTP bearer authorization: AgentToken
        HttpBearerAuth AgentToken = (HttpBearerAuth) defaultClient.getAuthentication("AgentToken");
        AgentToken.setBearerToken("BEARER TOKEN");

        ContractsApi apiInstance = new ContractsApi(defaultClient);
        String contractId = "contractId_example"; // String | The contract ID
        try {
            GetContract200Response result = apiInstance.getContract(contractId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ContractsApi#getContract");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **contractId** | **String**| The contract ID | |

### Return type

[**GetContract200Response**](GetContract200Response.md)

### Authorization

[AgentToken](../README.md#AgentToken)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |


## getContracts

> GetContracts200Response getContracts(page, limit)

List Contracts

List all of your contracts.

### Example

```java
// Import classes:
import de.elbosso.spacetraders.client.invoker.ApiClient;
import de.elbosso.spacetraders.client.invoker.ApiException;
import de.elbosso.spacetraders.client.invoker.Configuration;
import de.elbosso.spacetraders.client.invoker.auth.*;
import de.elbosso.spacetraders.client.invoker.models.*;
import de.elbosso.spacetraders.client.api.ContractsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.spacetraders.io/v2");
        
        // Configure HTTP bearer authorization: AgentToken
        HttpBearerAuth AgentToken = (HttpBearerAuth) defaultClient.getAuthentication("AgentToken");
        AgentToken.setBearerToken("BEARER TOKEN");

        ContractsApi apiInstance = new ContractsApi(defaultClient);
        Integer page = 56; // Integer | What entry offset to request
        Integer limit = 56; // Integer | How many entries to return per page
        try {
            GetContracts200Response result = apiInstance.getContracts(page, limit);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ContractsApi#getContracts");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **page** | **Integer**| What entry offset to request | [optional] |
| **limit** | **Integer**| How many entries to return per page | [optional] |

### Return type

[**GetContracts200Response**](GetContracts200Response.md)

### Authorization

[AgentToken](../README.md#AgentToken)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

