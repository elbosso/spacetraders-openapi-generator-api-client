# SystemsApi

All URIs are relative to *https://api.spacetraders.io/v2*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getJumpGate**](SystemsApi.md#getJumpGate) | **GET** /systems/{systemSymbol}/waypoints/{waypointSymbol}/jump-gate | Get Jump Gate |
| [**getMarket**](SystemsApi.md#getMarket) | **GET** /systems/{systemSymbol}/waypoints/{waypointSymbol}/market | Get Market |
| [**getShipyard**](SystemsApi.md#getShipyard) | **GET** /systems/{systemSymbol}/waypoints/{waypointSymbol}/shipyard | Get Shipyard |
| [**getSystem**](SystemsApi.md#getSystem) | **GET** /systems/{systemSymbol} | Get System |
| [**getSystemWaypoints**](SystemsApi.md#getSystemWaypoints) | **GET** /systems/{systemSymbol}/waypoints | List Waypoints |
| [**getSystems**](SystemsApi.md#getSystems) | **GET** /systems | List Systems |
| [**getWaypoint**](SystemsApi.md#getWaypoint) | **GET** /systems/{systemSymbol}/waypoints/{waypointSymbol} | Get Waypoint |



## getJumpGate

> GetJumpGate200Response getJumpGate(systemSymbol, waypointSymbol)

Get Jump Gate

Get jump gate details for a waypoint.

### Example

```java
// Import classes:
import de.elbosso.spacetraders.client.invoker.ApiClient;
import de.elbosso.spacetraders.client.invoker.ApiException;
import de.elbosso.spacetraders.client.invoker.Configuration;
import de.elbosso.spacetraders.client.invoker.auth.*;
import de.elbosso.spacetraders.client.invoker.models.*;
import de.elbosso.spacetraders.client.api.SystemsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.spacetraders.io/v2");
        
        // Configure HTTP bearer authorization: AgentToken
        HttpBearerAuth AgentToken = (HttpBearerAuth) defaultClient.getAuthentication("AgentToken");
        AgentToken.setBearerToken("BEARER TOKEN");

        SystemsApi apiInstance = new SystemsApi(defaultClient);
        String systemSymbol = "systemSymbol_example"; // String | The system symbol
        String waypointSymbol = "waypointSymbol_example"; // String | The waypoint symbol
        try {
            GetJumpGate200Response result = apiInstance.getJumpGate(systemSymbol, waypointSymbol);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling SystemsApi#getJumpGate");
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
| **systemSymbol** | **String**| The system symbol | |
| **waypointSymbol** | **String**| The waypoint symbol | |

### Return type

[**GetJumpGate200Response**](GetJumpGate200Response.md)

### Authorization

[AgentToken](../README.md#AgentToken)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |


## getMarket

> GetMarket200Response getMarket(systemSymbol, waypointSymbol)

Get Market

Retrieve imports, exports and exchange data from a marketplace. Imports can be sold, exports can be purchased, and exchange goods can be purchased or sold. Send a ship to the waypoint to access trade good prices and recent transactions.

### Example

```java
// Import classes:
import de.elbosso.spacetraders.client.invoker.ApiClient;
import de.elbosso.spacetraders.client.invoker.ApiException;
import de.elbosso.spacetraders.client.invoker.Configuration;
import de.elbosso.spacetraders.client.invoker.auth.*;
import de.elbosso.spacetraders.client.invoker.models.*;
import de.elbosso.spacetraders.client.api.SystemsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.spacetraders.io/v2");
        
        // Configure HTTP bearer authorization: AgentToken
        HttpBearerAuth AgentToken = (HttpBearerAuth) defaultClient.getAuthentication("AgentToken");
        AgentToken.setBearerToken("BEARER TOKEN");

        SystemsApi apiInstance = new SystemsApi(defaultClient);
        String systemSymbol = "systemSymbol_example"; // String | The system symbol
        String waypointSymbol = "waypointSymbol_example"; // String | The waypoint symbol
        try {
            GetMarket200Response result = apiInstance.getMarket(systemSymbol, waypointSymbol);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling SystemsApi#getMarket");
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
| **systemSymbol** | **String**| The system symbol | |
| **waypointSymbol** | **String**| The waypoint symbol | |

### Return type

[**GetMarket200Response**](GetMarket200Response.md)

### Authorization

[AgentToken](../README.md#AgentToken)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |


## getShipyard

> GetShipyard200Response getShipyard(systemSymbol, waypointSymbol)

Get Shipyard

Get the shipyard for a waypoint. Send a ship to the waypoint to access ships that are currently available for purchase and recent transactions.

### Example

```java
// Import classes:
import de.elbosso.spacetraders.client.invoker.ApiClient;
import de.elbosso.spacetraders.client.invoker.ApiException;
import de.elbosso.spacetraders.client.invoker.Configuration;
import de.elbosso.spacetraders.client.invoker.auth.*;
import de.elbosso.spacetraders.client.invoker.models.*;
import de.elbosso.spacetraders.client.api.SystemsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.spacetraders.io/v2");
        
        // Configure HTTP bearer authorization: AgentToken
        HttpBearerAuth AgentToken = (HttpBearerAuth) defaultClient.getAuthentication("AgentToken");
        AgentToken.setBearerToken("BEARER TOKEN");

        SystemsApi apiInstance = new SystemsApi(defaultClient);
        String systemSymbol = "systemSymbol_example"; // String | The system symbol
        String waypointSymbol = "waypointSymbol_example"; // String | The waypoint symbol
        try {
            GetShipyard200Response result = apiInstance.getShipyard(systemSymbol, waypointSymbol);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling SystemsApi#getShipyard");
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
| **systemSymbol** | **String**| The system symbol | |
| **waypointSymbol** | **String**| The waypoint symbol | |

### Return type

[**GetShipyard200Response**](GetShipyard200Response.md)

### Authorization

[AgentToken](../README.md#AgentToken)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |


## getSystem

> GetSystem200Response getSystem(systemSymbol)

Get System

Get the details of a system.

### Example

```java
// Import classes:
import de.elbosso.spacetraders.client.invoker.ApiClient;
import de.elbosso.spacetraders.client.invoker.ApiException;
import de.elbosso.spacetraders.client.invoker.Configuration;
import de.elbosso.spacetraders.client.invoker.auth.*;
import de.elbosso.spacetraders.client.invoker.models.*;
import de.elbosso.spacetraders.client.api.SystemsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.spacetraders.io/v2");
        
        // Configure HTTP bearer authorization: AgentToken
        HttpBearerAuth AgentToken = (HttpBearerAuth) defaultClient.getAuthentication("AgentToken");
        AgentToken.setBearerToken("BEARER TOKEN");

        SystemsApi apiInstance = new SystemsApi(defaultClient);
        String systemSymbol = "X1-OE"; // String | The system symbol
        try {
            GetSystem200Response result = apiInstance.getSystem(systemSymbol);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling SystemsApi#getSystem");
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
| **systemSymbol** | **String**| The system symbol | [default to X1-OE] |

### Return type

[**GetSystem200Response**](GetSystem200Response.md)

### Authorization

[AgentToken](../README.md#AgentToken)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |


## getSystemWaypoints

> GetSystemWaypoints200Response getSystemWaypoints(systemSymbol, page, limit)

List Waypoints

Fetch all of the waypoints for a given system. System must be charted or a ship must be present to return waypoint details.

### Example

```java
// Import classes:
import de.elbosso.spacetraders.client.invoker.ApiClient;
import de.elbosso.spacetraders.client.invoker.ApiException;
import de.elbosso.spacetraders.client.invoker.Configuration;
import de.elbosso.spacetraders.client.invoker.auth.*;
import de.elbosso.spacetraders.client.invoker.models.*;
import de.elbosso.spacetraders.client.api.SystemsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.spacetraders.io/v2");
        
        // Configure HTTP bearer authorization: AgentToken
        HttpBearerAuth AgentToken = (HttpBearerAuth) defaultClient.getAuthentication("AgentToken");
        AgentToken.setBearerToken("BEARER TOKEN");

        SystemsApi apiInstance = new SystemsApi(defaultClient);
        String systemSymbol = "systemSymbol_example"; // String | The system symbol
        Integer page = 56; // Integer | What entry offset to request
        Integer limit = 56; // Integer | How many entries to return per page
        try {
            GetSystemWaypoints200Response result = apiInstance.getSystemWaypoints(systemSymbol, page, limit);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling SystemsApi#getSystemWaypoints");
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
| **systemSymbol** | **String**| The system symbol | |
| **page** | **Integer**| What entry offset to request | [optional] |
| **limit** | **Integer**| How many entries to return per page | [optional] |

### Return type

[**GetSystemWaypoints200Response**](GetSystemWaypoints200Response.md)

### Authorization

[AgentToken](../README.md#AgentToken)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |


## getSystems

> GetSystems200Response getSystems(page, limit)

List Systems

Return a list of all systems.

### Example

```java
// Import classes:
import de.elbosso.spacetraders.client.invoker.ApiClient;
import de.elbosso.spacetraders.client.invoker.ApiException;
import de.elbosso.spacetraders.client.invoker.Configuration;
import de.elbosso.spacetraders.client.invoker.auth.*;
import de.elbosso.spacetraders.client.invoker.models.*;
import de.elbosso.spacetraders.client.api.SystemsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.spacetraders.io/v2");
        
        // Configure HTTP bearer authorization: AgentToken
        HttpBearerAuth AgentToken = (HttpBearerAuth) defaultClient.getAuthentication("AgentToken");
        AgentToken.setBearerToken("BEARER TOKEN");

        SystemsApi apiInstance = new SystemsApi(defaultClient);
        Integer page = 56; // Integer | What entry offset to request
        Integer limit = 56; // Integer | How many entries to return per page
        try {
            GetSystems200Response result = apiInstance.getSystems(page, limit);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling SystemsApi#getSystems");
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

[**GetSystems200Response**](GetSystems200Response.md)

### Authorization

[AgentToken](../README.md#AgentToken)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |


## getWaypoint

> GetWaypoint200Response getWaypoint(systemSymbol, waypointSymbol)

Get Waypoint

View the details of a waypoint.

### Example

```java
// Import classes:
import de.elbosso.spacetraders.client.invoker.ApiClient;
import de.elbosso.spacetraders.client.invoker.ApiException;
import de.elbosso.spacetraders.client.invoker.Configuration;
import de.elbosso.spacetraders.client.invoker.auth.*;
import de.elbosso.spacetraders.client.invoker.models.*;
import de.elbosso.spacetraders.client.api.SystemsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.spacetraders.io/v2");
        
        // Configure HTTP bearer authorization: AgentToken
        HttpBearerAuth AgentToken = (HttpBearerAuth) defaultClient.getAuthentication("AgentToken");
        AgentToken.setBearerToken("BEARER TOKEN");

        SystemsApi apiInstance = new SystemsApi(defaultClient);
        String systemSymbol = "systemSymbol_example"; // String | The system symbol
        String waypointSymbol = "waypointSymbol_example"; // String | The waypoint symbol
        try {
            GetWaypoint200Response result = apiInstance.getWaypoint(systemSymbol, waypointSymbol);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling SystemsApi#getWaypoint");
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
| **systemSymbol** | **String**| The system symbol | |
| **waypointSymbol** | **String**| The waypoint symbol | |

### Return type

[**GetWaypoint200Response**](GetWaypoint200Response.md)

### Authorization

[AgentToken](../README.md#AgentToken)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

