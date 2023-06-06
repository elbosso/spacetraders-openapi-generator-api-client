# DefaultApi

All URIs are relative to *https://api.spacetraders.io/v2*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getStatus**](DefaultApi.md#getStatus) | **GET** / | Get Status |
| [**register**](DefaultApi.md#register) | **POST** /register | Register New Agent |



## getStatus

> GetStatus200Response getStatus()

Get Status

Return the status of the game server.

### Example

```java
// Import classes:
import de.elbosso.spacetraders.client.invoker.ApiClient;
import de.elbosso.spacetraders.client.invoker.ApiException;
import de.elbosso.spacetraders.client.invoker.Configuration;
import de.elbosso.spacetraders.client.invoker.models.*;
import de.elbosso.spacetraders.client.api.DefaultApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.spacetraders.io/v2");

        DefaultApi apiInstance = new DefaultApi(defaultClient);
        try {
            GetStatus200Response result = apiInstance.getStatus();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DefaultApi#getStatus");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters

This endpoint does not need any parameter.

### Return type

[**GetStatus200Response**](GetStatus200Response.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |


## register

> Register201Response register(registerRequest)

Register New Agent

Creates a new agent and ties it to a temporary Account.  The agent symbol is a 3-14 character string that will represent your agent. This symbol will prefix the symbol of every ship you own. Agent symbols will be cast to all uppercase characters.  A new agent will be granted an authorization token, a contract with their starting faction, a command ship with a jump drive, and one hundred thousand credits.  &gt; #### Keep your token safe and secure &gt; &gt; Save your token during the alpha phase. There is no way to regenerate this token without starting a new agent. In the future you will be able to generate and manage your tokens from the SpaceTraders website.  You can accept your contract using the &#x60;/my/contracts/{contractId}/accept&#x60; endpoint. You will want to navigate your command ship to a nearby asteroid field and execute the &#x60;/my/ships/{shipSymbol}/extract&#x60; endpoint to mine various types of ores and minerals.  Return to the contract destination and execute the &#x60;/my/ships/{shipSymbol}/deliver&#x60; endpoint to deposit goods into the contract.  When your contract is fulfilled, you can call &#x60;/my/contracts/{contractId}/fulfill&#x60; to retrieve payment.

### Example

```java
// Import classes:
import de.elbosso.spacetraders.client.invoker.ApiClient;
import de.elbosso.spacetraders.client.invoker.ApiException;
import de.elbosso.spacetraders.client.invoker.Configuration;
import de.elbosso.spacetraders.client.invoker.models.*;
import de.elbosso.spacetraders.client.api.DefaultApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.spacetraders.io/v2");

        DefaultApi apiInstance = new DefaultApi(defaultClient);
        RegisterRequest registerRequest = new RegisterRequest(); // RegisterRequest | 
        try {
            Register201Response result = apiInstance.register(registerRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DefaultApi#register");
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
| **registerRequest** | [**RegisterRequest**](RegisterRequest.md)|  | [optional] |

### Return type

[**Register201Response**](Register201Response.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | OK |  -  |

