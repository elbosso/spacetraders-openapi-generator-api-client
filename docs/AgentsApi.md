# AgentsApi

All URIs are relative to *https://api.spacetraders.io/v2*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getMyAgent**](AgentsApi.md#getMyAgent) | **GET** /my/agent | My Agent Details |



## getMyAgent

> GetMyAgent200Response getMyAgent()

My Agent Details

Fetch your agent&#39;s details.

### Example

```java
// Import classes:
import de.elbosso.spacetraders.client.invoker.ApiClient;
import de.elbosso.spacetraders.client.invoker.ApiException;
import de.elbosso.spacetraders.client.invoker.Configuration;
import de.elbosso.spacetraders.client.invoker.auth.*;
import de.elbosso.spacetraders.client.invoker.models.*;
import de.elbosso.spacetraders.client.api.AgentsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.spacetraders.io/v2");
        
        // Configure HTTP bearer authorization: AgentToken
        HttpBearerAuth AgentToken = (HttpBearerAuth) defaultClient.getAuthentication("AgentToken");
        AgentToken.setBearerToken("BEARER TOKEN");

        AgentsApi apiInstance = new AgentsApi(defaultClient);
        try {
            GetMyAgent200Response result = apiInstance.getMyAgent();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AgentsApi#getMyAgent");
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

[**GetMyAgent200Response**](GetMyAgent200Response.md)

### Authorization

[AgentToken](../README.md#AgentToken)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

