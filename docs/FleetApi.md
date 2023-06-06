# FleetApi

All URIs are relative to *https://api.spacetraders.io/v2*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createChart**](FleetApi.md#createChart) | **POST** /my/ships/{shipSymbol}/chart | Create Chart |
| [**createShipShipScan**](FleetApi.md#createShipShipScan) | **POST** /my/ships/{shipSymbol}/scan/ships | Scan Ships |
| [**createShipSystemScan**](FleetApi.md#createShipSystemScan) | **POST** /my/ships/{shipSymbol}/scan/systems | Scan Systems |
| [**createShipWaypointScan**](FleetApi.md#createShipWaypointScan) | **POST** /my/ships/{shipSymbol}/scan/waypoints | Scan Waypoints |
| [**createSurvey**](FleetApi.md#createSurvey) | **POST** /my/ships/{shipSymbol}/survey | Create Survey |
| [**dockShip**](FleetApi.md#dockShip) | **POST** /my/ships/{shipSymbol}/dock | Dock Ship |
| [**extractResources**](FleetApi.md#extractResources) | **POST** /my/ships/{shipSymbol}/extract | Extract Resources |
| [**getMounts**](FleetApi.md#getMounts) | **GET** /my/ships/{shipSymbol}/mounts | Get Mounts |
| [**getMyShip**](FleetApi.md#getMyShip) | **GET** /my/ships/{shipSymbol} | Get Ship |
| [**getMyShipCargo**](FleetApi.md#getMyShipCargo) | **GET** /my/ships/{shipSymbol}/cargo | Get Ship Cargo |
| [**getMyShips**](FleetApi.md#getMyShips) | **GET** /my/ships | List Ships |
| [**getShipCooldown**](FleetApi.md#getShipCooldown) | **GET** /my/ships/{shipSymbol}/cooldown | Get Ship Cooldown |
| [**getShipNav**](FleetApi.md#getShipNav) | **GET** /my/ships/{shipSymbol}/nav | Get Ship Nav |
| [**installMount**](FleetApi.md#installMount) | **POST** /my/ships/{shipSymbol}/mounts/install | Install Mount |
| [**jettison**](FleetApi.md#jettison) | **POST** /my/ships/{shipSymbol}/jettison | Jettison Cargo |
| [**jumpShip**](FleetApi.md#jumpShip) | **POST** /my/ships/{shipSymbol}/jump | Jump Ship |
| [**navigateShip**](FleetApi.md#navigateShip) | **POST** /my/ships/{shipSymbol}/navigate | Navigate Ship |
| [**negotiateContract**](FleetApi.md#negotiateContract) | **POST** /my/ships/{shipSymbol}/negotiate/contract | Negotiate Contract |
| [**orbitShip**](FleetApi.md#orbitShip) | **POST** /my/ships/{shipSymbol}/orbit | Orbit Ship |
| [**patchShipNav**](FleetApi.md#patchShipNav) | **PATCH** /my/ships/{shipSymbol}/nav | Patch Ship Nav |
| [**purchaseCargo**](FleetApi.md#purchaseCargo) | **POST** /my/ships/{shipSymbol}/purchase | Purchase Cargo |
| [**purchaseShip**](FleetApi.md#purchaseShip) | **POST** /my/ships | Purchase Ship |
| [**refuelShip**](FleetApi.md#refuelShip) | **POST** /my/ships/{shipSymbol}/refuel | Refuel Ship |
| [**removeMount**](FleetApi.md#removeMount) | **POST** /my/ships/{shipSymbol}/mounts/remove | Remove Mount |
| [**sellCargo**](FleetApi.md#sellCargo) | **POST** /my/ships/{shipSymbol}/sell | Sell Cargo |
| [**shipRefine**](FleetApi.md#shipRefine) | **POST** /my/ships/{shipSymbol}/refine | Ship Refine |
| [**transferCargo**](FleetApi.md#transferCargo) | **POST** /my/ships/{shipSymbol}/transfer | Transfer Cargo |
| [**warpShip**](FleetApi.md#warpShip) | **POST** /my/ships/{shipSymbol}/warp | Warp Ship |



## createChart

> CreateChart201Response createChart(shipSymbol)

Create Chart

Command a ship to chart the current waypoint.  Waypoints in the universe are uncharted by default. These locations will not show up in the API until they have been charted by a ship.  Charting a location will record your agent as the one who created the chart.

### Example

```java
// Import classes:
import de.elbosso.spacetraders.client.invoker.ApiClient;
import de.elbosso.spacetraders.client.invoker.ApiException;
import de.elbosso.spacetraders.client.invoker.Configuration;
import de.elbosso.spacetraders.client.invoker.auth.*;
import de.elbosso.spacetraders.client.invoker.models.*;
import de.elbosso.spacetraders.client.api.FleetApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.spacetraders.io/v2");
        
        // Configure HTTP bearer authorization: AgentToken
        HttpBearerAuth AgentToken = (HttpBearerAuth) defaultClient.getAuthentication("AgentToken");
        AgentToken.setBearerToken("BEARER TOKEN");

        FleetApi apiInstance = new FleetApi(defaultClient);
        String shipSymbol = "shipSymbol_example"; // String | The symbol of the ship
        try {
            CreateChart201Response result = apiInstance.createChart(shipSymbol);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling FleetApi#createChart");
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
| **shipSymbol** | **String**| The symbol of the ship | |

### Return type

[**CreateChart201Response**](CreateChart201Response.md)

### Authorization

[AgentToken](../README.md#AgentToken)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Created |  -  |


## createShipShipScan

> CreateShipShipScan201Response createShipShipScan(shipSymbol)

Scan Ships

Activate your ship&#39;s sensor arrays to scan for ship information.

### Example

```java
// Import classes:
import de.elbosso.spacetraders.client.invoker.ApiClient;
import de.elbosso.spacetraders.client.invoker.ApiException;
import de.elbosso.spacetraders.client.invoker.Configuration;
import de.elbosso.spacetraders.client.invoker.auth.*;
import de.elbosso.spacetraders.client.invoker.models.*;
import de.elbosso.spacetraders.client.api.FleetApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.spacetraders.io/v2");
        
        // Configure HTTP bearer authorization: AgentToken
        HttpBearerAuth AgentToken = (HttpBearerAuth) defaultClient.getAuthentication("AgentToken");
        AgentToken.setBearerToken("BEARER TOKEN");

        FleetApi apiInstance = new FleetApi(defaultClient);
        String shipSymbol = "shipSymbol_example"; // String | 
        try {
            CreateShipShipScan201Response result = apiInstance.createShipShipScan(shipSymbol);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling FleetApi#createShipShipScan");
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
| **shipSymbol** | **String**|  | |

### Return type

[**CreateShipShipScan201Response**](CreateShipShipScan201Response.md)

### Authorization

[AgentToken](../README.md#AgentToken)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Created |  -  |


## createShipSystemScan

> CreateShipSystemScan201Response createShipSystemScan(shipSymbol)

Scan Systems

Activate your ship&#39;s sensor arrays to scan for system information.

### Example

```java
// Import classes:
import de.elbosso.spacetraders.client.invoker.ApiClient;
import de.elbosso.spacetraders.client.invoker.ApiException;
import de.elbosso.spacetraders.client.invoker.Configuration;
import de.elbosso.spacetraders.client.invoker.auth.*;
import de.elbosso.spacetraders.client.invoker.models.*;
import de.elbosso.spacetraders.client.api.FleetApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.spacetraders.io/v2");
        
        // Configure HTTP bearer authorization: AgentToken
        HttpBearerAuth AgentToken = (HttpBearerAuth) defaultClient.getAuthentication("AgentToken");
        AgentToken.setBearerToken("BEARER TOKEN");

        FleetApi apiInstance = new FleetApi(defaultClient);
        String shipSymbol = "shipSymbol_example"; // String | 
        try {
            CreateShipSystemScan201Response result = apiInstance.createShipSystemScan(shipSymbol);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling FleetApi#createShipSystemScan");
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
| **shipSymbol** | **String**|  | |

### Return type

[**CreateShipSystemScan201Response**](CreateShipSystemScan201Response.md)

### Authorization

[AgentToken](../README.md#AgentToken)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Created |  -  |


## createShipWaypointScan

> CreateShipWaypointScan201Response createShipWaypointScan(shipSymbol)

Scan Waypoints

Activate your ship&#39;s sensor arrays to scan for waypoint information.

### Example

```java
// Import classes:
import de.elbosso.spacetraders.client.invoker.ApiClient;
import de.elbosso.spacetraders.client.invoker.ApiException;
import de.elbosso.spacetraders.client.invoker.Configuration;
import de.elbosso.spacetraders.client.invoker.auth.*;
import de.elbosso.spacetraders.client.invoker.models.*;
import de.elbosso.spacetraders.client.api.FleetApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.spacetraders.io/v2");
        
        // Configure HTTP bearer authorization: AgentToken
        HttpBearerAuth AgentToken = (HttpBearerAuth) defaultClient.getAuthentication("AgentToken");
        AgentToken.setBearerToken("BEARER TOKEN");

        FleetApi apiInstance = new FleetApi(defaultClient);
        String shipSymbol = "shipSymbol_example"; // String | 
        try {
            CreateShipWaypointScan201Response result = apiInstance.createShipWaypointScan(shipSymbol);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling FleetApi#createShipWaypointScan");
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
| **shipSymbol** | **String**|  | |

### Return type

[**CreateShipWaypointScan201Response**](CreateShipWaypointScan201Response.md)

### Authorization

[AgentToken](../README.md#AgentToken)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Created |  -  |


## createSurvey

> CreateSurvey201Response createSurvey(shipSymbol)

Create Survey

If you want to target specific yields for an extraction, you can survey a waypoint, such as an asteroid field, and send the survey in the body of the extract request. Each survey may have multiple deposits, and if a symbol shows up more than once, that indicates a higher chance of extracting that resource.  Your ship will enter a cooldown between consecutive survey requests. Surveys will eventually expire after a period of time. Multiple ships can use the same survey for extraction.

### Example

```java
// Import classes:
import de.elbosso.spacetraders.client.invoker.ApiClient;
import de.elbosso.spacetraders.client.invoker.ApiException;
import de.elbosso.spacetraders.client.invoker.Configuration;
import de.elbosso.spacetraders.client.invoker.auth.*;
import de.elbosso.spacetraders.client.invoker.models.*;
import de.elbosso.spacetraders.client.api.FleetApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.spacetraders.io/v2");
        
        // Configure HTTP bearer authorization: AgentToken
        HttpBearerAuth AgentToken = (HttpBearerAuth) defaultClient.getAuthentication("AgentToken");
        AgentToken.setBearerToken("BEARER TOKEN");

        FleetApi apiInstance = new FleetApi(defaultClient);
        String shipSymbol = "shipSymbol_example"; // String | The symbol of the ship
        try {
            CreateSurvey201Response result = apiInstance.createSurvey(shipSymbol);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling FleetApi#createSurvey");
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
| **shipSymbol** | **String**| The symbol of the ship | |

### Return type

[**CreateSurvey201Response**](CreateSurvey201Response.md)

### Authorization

[AgentToken](../README.md#AgentToken)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Created |  -  |


## dockShip

> DockShip200Response dockShip(shipSymbol)

Dock Ship

Attempt to dock your ship at it&#39;s current location. Docking will only succeed if the waypoint is a dockable location, and your ship is capable of docking at the time of the request.  The endpoint is idempotent - successive calls will succeed even if the ship is already docked.

### Example

```java
// Import classes:
import de.elbosso.spacetraders.client.invoker.ApiClient;
import de.elbosso.spacetraders.client.invoker.ApiException;
import de.elbosso.spacetraders.client.invoker.Configuration;
import de.elbosso.spacetraders.client.invoker.auth.*;
import de.elbosso.spacetraders.client.invoker.models.*;
import de.elbosso.spacetraders.client.api.FleetApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.spacetraders.io/v2");
        
        // Configure HTTP bearer authorization: AgentToken
        HttpBearerAuth AgentToken = (HttpBearerAuth) defaultClient.getAuthentication("AgentToken");
        AgentToken.setBearerToken("BEARER TOKEN");

        FleetApi apiInstance = new FleetApi(defaultClient);
        String shipSymbol = "shipSymbol_example"; // String | The symbol of the ship
        try {
            DockShip200Response result = apiInstance.dockShip(shipSymbol);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling FleetApi#dockShip");
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
| **shipSymbol** | **String**| The symbol of the ship | |

### Return type

[**DockShip200Response**](DockShip200Response.md)

### Authorization

[AgentToken](../README.md#AgentToken)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The ship has successfully docked at it&#39;s current location. |  -  |


## extractResources

> ExtractResources201Response extractResources(shipSymbol, extractResourcesRequest)

Extract Resources

Extract resources from the waypoint into your ship. Send an optional survey as the payload to target specific yields.

### Example

```java
// Import classes:
import de.elbosso.spacetraders.client.invoker.ApiClient;
import de.elbosso.spacetraders.client.invoker.ApiException;
import de.elbosso.spacetraders.client.invoker.Configuration;
import de.elbosso.spacetraders.client.invoker.auth.*;
import de.elbosso.spacetraders.client.invoker.models.*;
import de.elbosso.spacetraders.client.api.FleetApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.spacetraders.io/v2");
        
        // Configure HTTP bearer authorization: AgentToken
        HttpBearerAuth AgentToken = (HttpBearerAuth) defaultClient.getAuthentication("AgentToken");
        AgentToken.setBearerToken("BEARER TOKEN");

        FleetApi apiInstance = new FleetApi(defaultClient);
        String shipSymbol = "shipSymbol_example"; // String | The ship symbol
        ExtractResourcesRequest extractResourcesRequest = new ExtractResourcesRequest(); // ExtractResourcesRequest | 
        try {
            ExtractResources201Response result = apiInstance.extractResources(shipSymbol, extractResourcesRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling FleetApi#extractResources");
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
| **shipSymbol** | **String**| The ship symbol | |
| **extractResourcesRequest** | [**ExtractResourcesRequest**](ExtractResourcesRequest.md)|  | [optional] |

### Return type

[**ExtractResources201Response**](ExtractResources201Response.md)

### Authorization

[AgentToken](../README.md#AgentToken)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Created |  -  |


## getMounts

> GetMounts200Response getMounts(shipSymbol)

Get Mounts

Get the mounts on a ship.

### Example

```java
// Import classes:
import de.elbosso.spacetraders.client.invoker.ApiClient;
import de.elbosso.spacetraders.client.invoker.ApiException;
import de.elbosso.spacetraders.client.invoker.Configuration;
import de.elbosso.spacetraders.client.invoker.auth.*;
import de.elbosso.spacetraders.client.invoker.models.*;
import de.elbosso.spacetraders.client.api.FleetApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.spacetraders.io/v2");
        
        // Configure HTTP bearer authorization: AgentToken
        HttpBearerAuth AgentToken = (HttpBearerAuth) defaultClient.getAuthentication("AgentToken");
        AgentToken.setBearerToken("BEARER TOKEN");

        FleetApi apiInstance = new FleetApi(defaultClient);
        String shipSymbol = "shipSymbol_example"; // String | 
        try {
            GetMounts200Response result = apiInstance.getMounts(shipSymbol);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling FleetApi#getMounts");
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
| **shipSymbol** | **String**|  | |

### Return type

[**GetMounts200Response**](GetMounts200Response.md)

### Authorization

[AgentToken](../README.md#AgentToken)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |


## getMyShip

> GetMyShip200Response getMyShip(shipSymbol)

Get Ship

Retrieve the details of your ship.

### Example

```java
// Import classes:
import de.elbosso.spacetraders.client.invoker.ApiClient;
import de.elbosso.spacetraders.client.invoker.ApiException;
import de.elbosso.spacetraders.client.invoker.Configuration;
import de.elbosso.spacetraders.client.invoker.auth.*;
import de.elbosso.spacetraders.client.invoker.models.*;
import de.elbosso.spacetraders.client.api.FleetApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.spacetraders.io/v2");
        
        // Configure HTTP bearer authorization: AgentToken
        HttpBearerAuth AgentToken = (HttpBearerAuth) defaultClient.getAuthentication("AgentToken");
        AgentToken.setBearerToken("BEARER TOKEN");

        FleetApi apiInstance = new FleetApi(defaultClient);
        String shipSymbol = "shipSymbol_example"; // String | 
        try {
            GetMyShip200Response result = apiInstance.getMyShip(shipSymbol);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling FleetApi#getMyShip");
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
| **shipSymbol** | **String**|  | |

### Return type

[**GetMyShip200Response**](GetMyShip200Response.md)

### Authorization

[AgentToken](../README.md#AgentToken)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |


## getMyShipCargo

> GetMyShipCargo200Response getMyShipCargo(shipSymbol)

Get Ship Cargo

Retrieve the cargo of your ship.

### Example

```java
// Import classes:
import de.elbosso.spacetraders.client.invoker.ApiClient;
import de.elbosso.spacetraders.client.invoker.ApiException;
import de.elbosso.spacetraders.client.invoker.Configuration;
import de.elbosso.spacetraders.client.invoker.auth.*;
import de.elbosso.spacetraders.client.invoker.models.*;
import de.elbosso.spacetraders.client.api.FleetApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.spacetraders.io/v2");
        
        // Configure HTTP bearer authorization: AgentToken
        HttpBearerAuth AgentToken = (HttpBearerAuth) defaultClient.getAuthentication("AgentToken");
        AgentToken.setBearerToken("BEARER TOKEN");

        FleetApi apiInstance = new FleetApi(defaultClient);
        String shipSymbol = "shipSymbol_example"; // String | The symbol of the ship
        try {
            GetMyShipCargo200Response result = apiInstance.getMyShipCargo(shipSymbol);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling FleetApi#getMyShipCargo");
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
| **shipSymbol** | **String**| The symbol of the ship | |

### Return type

[**GetMyShipCargo200Response**](GetMyShipCargo200Response.md)

### Authorization

[AgentToken](../README.md#AgentToken)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |


## getMyShips

> GetMyShips200Response getMyShips(page, limit)

List Ships

Retrieve all of your ships.

### Example

```java
// Import classes:
import de.elbosso.spacetraders.client.invoker.ApiClient;
import de.elbosso.spacetraders.client.invoker.ApiException;
import de.elbosso.spacetraders.client.invoker.Configuration;
import de.elbosso.spacetraders.client.invoker.auth.*;
import de.elbosso.spacetraders.client.invoker.models.*;
import de.elbosso.spacetraders.client.api.FleetApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.spacetraders.io/v2");
        
        // Configure HTTP bearer authorization: AgentToken
        HttpBearerAuth AgentToken = (HttpBearerAuth) defaultClient.getAuthentication("AgentToken");
        AgentToken.setBearerToken("BEARER TOKEN");

        FleetApi apiInstance = new FleetApi(defaultClient);
        Integer page = 56; // Integer | What entry offset to request
        Integer limit = 56; // Integer | How many entries to return per page
        try {
            GetMyShips200Response result = apiInstance.getMyShips(page, limit);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling FleetApi#getMyShips");
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

[**GetMyShips200Response**](GetMyShips200Response.md)

### Authorization

[AgentToken](../README.md#AgentToken)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |


## getShipCooldown

> GetShipCooldown200Response getShipCooldown(shipSymbol)

Get Ship Cooldown

Retrieve the details of your ship&#39;s reactor cooldown. Some actions such as activating your jump drive, scanning, or extracting resources taxes your reactor and results in a cooldown.  Your ship cannot perform additional actions until your cooldown has expired. The duration of your cooldown is relative to the power consumption of the related modules or mounts for the action taken.  Response returns a 204 status code (no-content) when the ship has no cooldown.

### Example

```java
// Import classes:
import de.elbosso.spacetraders.client.invoker.ApiClient;
import de.elbosso.spacetraders.client.invoker.ApiException;
import de.elbosso.spacetraders.client.invoker.Configuration;
import de.elbosso.spacetraders.client.invoker.auth.*;
import de.elbosso.spacetraders.client.invoker.models.*;
import de.elbosso.spacetraders.client.api.FleetApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.spacetraders.io/v2");
        
        // Configure HTTP bearer authorization: AgentToken
        HttpBearerAuth AgentToken = (HttpBearerAuth) defaultClient.getAuthentication("AgentToken");
        AgentToken.setBearerToken("BEARER TOKEN");

        FleetApi apiInstance = new FleetApi(defaultClient);
        String shipSymbol = "shipSymbol_example"; // String | 
        try {
            GetShipCooldown200Response result = apiInstance.getShipCooldown(shipSymbol);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling FleetApi#getShipCooldown");
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
| **shipSymbol** | **String**|  | |

### Return type

[**GetShipCooldown200Response**](GetShipCooldown200Response.md)

### Authorization

[AgentToken](../README.md#AgentToken)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **204** | No cooldown |  -  |


## getShipNav

> GetShipNav200Response getShipNav(shipSymbol)

Get Ship Nav

Get the current nav status of a ship.

### Example

```java
// Import classes:
import de.elbosso.spacetraders.client.invoker.ApiClient;
import de.elbosso.spacetraders.client.invoker.ApiException;
import de.elbosso.spacetraders.client.invoker.Configuration;
import de.elbosso.spacetraders.client.invoker.auth.*;
import de.elbosso.spacetraders.client.invoker.models.*;
import de.elbosso.spacetraders.client.api.FleetApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.spacetraders.io/v2");
        
        // Configure HTTP bearer authorization: AgentToken
        HttpBearerAuth AgentToken = (HttpBearerAuth) defaultClient.getAuthentication("AgentToken");
        AgentToken.setBearerToken("BEARER TOKEN");

        FleetApi apiInstance = new FleetApi(defaultClient);
        String shipSymbol = "shipSymbol_example"; // String | The ship symbol
        try {
            GetShipNav200Response result = apiInstance.getShipNav(shipSymbol);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling FleetApi#getShipNav");
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
| **shipSymbol** | **String**| The ship symbol | |

### Return type

[**GetShipNav200Response**](GetShipNav200Response.md)

### Authorization

[AgentToken](../README.md#AgentToken)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The current nav status of the ship. |  -  |


## installMount

> InstallMount201Response installMount(shipSymbol, installMountRequest)

Install Mount

Install a mount on a ship.

### Example

```java
// Import classes:
import de.elbosso.spacetraders.client.invoker.ApiClient;
import de.elbosso.spacetraders.client.invoker.ApiException;
import de.elbosso.spacetraders.client.invoker.Configuration;
import de.elbosso.spacetraders.client.invoker.auth.*;
import de.elbosso.spacetraders.client.invoker.models.*;
import de.elbosso.spacetraders.client.api.FleetApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.spacetraders.io/v2");
        
        // Configure HTTP bearer authorization: AgentToken
        HttpBearerAuth AgentToken = (HttpBearerAuth) defaultClient.getAuthentication("AgentToken");
        AgentToken.setBearerToken("BEARER TOKEN");

        FleetApi apiInstance = new FleetApi(defaultClient);
        String shipSymbol = "shipSymbol_example"; // String | 
        InstallMountRequest installMountRequest = new InstallMountRequest(); // InstallMountRequest | 
        try {
            InstallMount201Response result = apiInstance.installMount(shipSymbol, installMountRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling FleetApi#installMount");
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
| **shipSymbol** | **String**|  | |
| **installMountRequest** | [**InstallMountRequest**](InstallMountRequest.md)|  | [optional] |

### Return type

[**InstallMount201Response**](InstallMount201Response.md)

### Authorization

[AgentToken](../README.md#AgentToken)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Created |  -  |


## jettison

> Jettison200Response jettison(shipSymbol, jettisonRequest)

Jettison Cargo

Jettison cargo from your ship&#39;s cargo hold.

### Example

```java
// Import classes:
import de.elbosso.spacetraders.client.invoker.ApiClient;
import de.elbosso.spacetraders.client.invoker.ApiException;
import de.elbosso.spacetraders.client.invoker.Configuration;
import de.elbosso.spacetraders.client.invoker.auth.*;
import de.elbosso.spacetraders.client.invoker.models.*;
import de.elbosso.spacetraders.client.api.FleetApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.spacetraders.io/v2");
        
        // Configure HTTP bearer authorization: AgentToken
        HttpBearerAuth AgentToken = (HttpBearerAuth) defaultClient.getAuthentication("AgentToken");
        AgentToken.setBearerToken("BEARER TOKEN");

        FleetApi apiInstance = new FleetApi(defaultClient);
        String shipSymbol = "shipSymbol_example"; // String | 
        JettisonRequest jettisonRequest = new JettisonRequest(); // JettisonRequest | 
        try {
            Jettison200Response result = apiInstance.jettison(shipSymbol, jettisonRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling FleetApi#jettison");
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
| **shipSymbol** | **String**|  | |
| **jettisonRequest** | [**JettisonRequest**](JettisonRequest.md)|  | [optional] |

### Return type

[**Jettison200Response**](Jettison200Response.md)

### Authorization

[AgentToken](../README.md#AgentToken)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |


## jumpShip

> JumpShip200Response jumpShip(shipSymbol, jumpShipRequest)

Jump Ship

Jump your ship instantly to a target system. When used while in orbit or docked to a jump gate waypoint, any ship can use this command. When used elsewhere, jumping requires a jump drive unit and consumes a unit of antimatter (which needs to be in your cargo).

### Example

```java
// Import classes:
import de.elbosso.spacetraders.client.invoker.ApiClient;
import de.elbosso.spacetraders.client.invoker.ApiException;
import de.elbosso.spacetraders.client.invoker.Configuration;
import de.elbosso.spacetraders.client.invoker.auth.*;
import de.elbosso.spacetraders.client.invoker.models.*;
import de.elbosso.spacetraders.client.api.FleetApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.spacetraders.io/v2");
        
        // Configure HTTP bearer authorization: AgentToken
        HttpBearerAuth AgentToken = (HttpBearerAuth) defaultClient.getAuthentication("AgentToken");
        AgentToken.setBearerToken("BEARER TOKEN");

        FleetApi apiInstance = new FleetApi(defaultClient);
        String shipSymbol = "shipSymbol_example"; // String | 
        JumpShipRequest jumpShipRequest = new JumpShipRequest(); // JumpShipRequest | 
        try {
            JumpShip200Response result = apiInstance.jumpShip(shipSymbol, jumpShipRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling FleetApi#jumpShip");
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
| **shipSymbol** | **String**|  | |
| **jumpShipRequest** | [**JumpShipRequest**](JumpShipRequest.md)|  | [optional] |

### Return type

[**JumpShip200Response**](JumpShip200Response.md)

### Authorization

[AgentToken](../README.md#AgentToken)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |


## navigateShip

> NavigateShip200Response navigateShip(shipSymbol, navigateShipRequest)

Navigate Ship

Navigate to a target destination. The destination must be located within the same system as the ship. Navigating will consume the necessary fuel and supplies from the ship&#39;s manifest, and will pay out crew wages from the agent&#39;s account.  The returned response will detail the route information including the expected time of arrival. Most ship actions are unavailable until the ship has arrived at it&#39;s destination.  To travel between systems, see the ship&#39;s warp or jump actions.

### Example

```java
// Import classes:
import de.elbosso.spacetraders.client.invoker.ApiClient;
import de.elbosso.spacetraders.client.invoker.ApiException;
import de.elbosso.spacetraders.client.invoker.Configuration;
import de.elbosso.spacetraders.client.invoker.auth.*;
import de.elbosso.spacetraders.client.invoker.models.*;
import de.elbosso.spacetraders.client.api.FleetApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.spacetraders.io/v2");
        
        // Configure HTTP bearer authorization: AgentToken
        HttpBearerAuth AgentToken = (HttpBearerAuth) defaultClient.getAuthentication("AgentToken");
        AgentToken.setBearerToken("BEARER TOKEN");

        FleetApi apiInstance = new FleetApi(defaultClient);
        String shipSymbol = "shipSymbol_example"; // String | The ship symbol
        NavigateShipRequest navigateShipRequest = new NavigateShipRequest(); // NavigateShipRequest | 
        try {
            NavigateShip200Response result = apiInstance.navigateShip(shipSymbol, navigateShipRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling FleetApi#navigateShip");
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
| **shipSymbol** | **String**| The ship symbol | |
| **navigateShipRequest** | [**NavigateShipRequest**](NavigateShipRequest.md)|  | [optional] |

### Return type

[**NavigateShip200Response**](NavigateShip200Response.md)

### Authorization

[AgentToken](../README.md#AgentToken)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The successful transit information including the route details and changes to ship fuel, supplies, and crew wages paid. The route includes the expected time of arrival. |  -  |


## negotiateContract

> NegotiateContract200Response negotiateContract(shipSymbol, body)

Negotiate Contract



### Example

```java
// Import classes:
import de.elbosso.spacetraders.client.invoker.ApiClient;
import de.elbosso.spacetraders.client.invoker.ApiException;
import de.elbosso.spacetraders.client.invoker.Configuration;
import de.elbosso.spacetraders.client.invoker.auth.*;
import de.elbosso.spacetraders.client.invoker.models.*;
import de.elbosso.spacetraders.client.api.FleetApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.spacetraders.io/v2");
        
        // Configure HTTP bearer authorization: AgentToken
        HttpBearerAuth AgentToken = (HttpBearerAuth) defaultClient.getAuthentication("AgentToken");
        AgentToken.setBearerToken("BEARER TOKEN");

        FleetApi apiInstance = new FleetApi(defaultClient);
        String shipSymbol = "shipSymbol_example"; // String | 
        Object body = null; // Object | 
        try {
            NegotiateContract200Response result = apiInstance.negotiateContract(shipSymbol, body);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling FleetApi#negotiateContract");
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
| **shipSymbol** | **String**|  | |
| **body** | **Object**|  | [optional] |

### Return type

[**NegotiateContract200Response**](NegotiateContract200Response.md)

### Authorization

[AgentToken](../README.md#AgentToken)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Created |  -  |


## orbitShip

> OrbitShip200Response orbitShip(shipSymbol)

Orbit Ship

Attempt to move your ship into orbit at it&#39;s current location. The request will only succeed if your ship is capable of moving into orbit at the time of the request.  The endpoint is idempotent - successive calls will succeed even if the ship is already in orbit.

### Example

```java
// Import classes:
import de.elbosso.spacetraders.client.invoker.ApiClient;
import de.elbosso.spacetraders.client.invoker.ApiException;
import de.elbosso.spacetraders.client.invoker.Configuration;
import de.elbosso.spacetraders.client.invoker.auth.*;
import de.elbosso.spacetraders.client.invoker.models.*;
import de.elbosso.spacetraders.client.api.FleetApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.spacetraders.io/v2");
        
        // Configure HTTP bearer authorization: AgentToken
        HttpBearerAuth AgentToken = (HttpBearerAuth) defaultClient.getAuthentication("AgentToken");
        AgentToken.setBearerToken("BEARER TOKEN");

        FleetApi apiInstance = new FleetApi(defaultClient);
        String shipSymbol = "shipSymbol_example"; // String | The symbol of the ship
        try {
            OrbitShip200Response result = apiInstance.orbitShip(shipSymbol);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling FleetApi#orbitShip");
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
| **shipSymbol** | **String**| The symbol of the ship | |

### Return type

[**OrbitShip200Response**](OrbitShip200Response.md)

### Authorization

[AgentToken](../README.md#AgentToken)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The ship has successfully moved into orbit at it&#39;s current location. |  -  |


## patchShipNav

> GetShipNav200Response patchShipNav(shipSymbol, patchShipNavRequest)

Patch Ship Nav

Update the nav data of a ship, such as the flight mode.

### Example

```java
// Import classes:
import de.elbosso.spacetraders.client.invoker.ApiClient;
import de.elbosso.spacetraders.client.invoker.ApiException;
import de.elbosso.spacetraders.client.invoker.Configuration;
import de.elbosso.spacetraders.client.invoker.auth.*;
import de.elbosso.spacetraders.client.invoker.models.*;
import de.elbosso.spacetraders.client.api.FleetApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.spacetraders.io/v2");
        
        // Configure HTTP bearer authorization: AgentToken
        HttpBearerAuth AgentToken = (HttpBearerAuth) defaultClient.getAuthentication("AgentToken");
        AgentToken.setBearerToken("BEARER TOKEN");

        FleetApi apiInstance = new FleetApi(defaultClient);
        String shipSymbol = "shipSymbol_example"; // String | The ship symbol
        PatchShipNavRequest patchShipNavRequest = new PatchShipNavRequest(); // PatchShipNavRequest | 
        try {
            GetShipNav200Response result = apiInstance.patchShipNav(shipSymbol, patchShipNavRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling FleetApi#patchShipNav");
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
| **shipSymbol** | **String**| The ship symbol | |
| **patchShipNavRequest** | [**PatchShipNavRequest**](PatchShipNavRequest.md)|  | [optional] |

### Return type

[**GetShipNav200Response**](GetShipNav200Response.md)

### Authorization

[AgentToken](../README.md#AgentToken)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The updated nav status of the ship. |  -  |


## purchaseCargo

> PurchaseCargo201Response purchaseCargo(shipSymbol, purchaseCargoRequest)

Purchase Cargo

Purchase cargo.

### Example

```java
// Import classes:
import de.elbosso.spacetraders.client.invoker.ApiClient;
import de.elbosso.spacetraders.client.invoker.ApiException;
import de.elbosso.spacetraders.client.invoker.Configuration;
import de.elbosso.spacetraders.client.invoker.auth.*;
import de.elbosso.spacetraders.client.invoker.models.*;
import de.elbosso.spacetraders.client.api.FleetApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.spacetraders.io/v2");
        
        // Configure HTTP bearer authorization: AgentToken
        HttpBearerAuth AgentToken = (HttpBearerAuth) defaultClient.getAuthentication("AgentToken");
        AgentToken.setBearerToken("BEARER TOKEN");

        FleetApi apiInstance = new FleetApi(defaultClient);
        String shipSymbol = "shipSymbol_example"; // String | 
        PurchaseCargoRequest purchaseCargoRequest = new PurchaseCargoRequest(); // PurchaseCargoRequest | 
        try {
            PurchaseCargo201Response result = apiInstance.purchaseCargo(shipSymbol, purchaseCargoRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling FleetApi#purchaseCargo");
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
| **shipSymbol** | **String**|  | |
| **purchaseCargoRequest** | [**PurchaseCargoRequest**](PurchaseCargoRequest.md)|  | [optional] |

### Return type

[**PurchaseCargo201Response**](PurchaseCargo201Response.md)

### Authorization

[AgentToken](../README.md#AgentToken)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Created |  -  |


## purchaseShip

> PurchaseShip201Response purchaseShip(purchaseShipRequest)

Purchase Ship

Purchase a ship

### Example

```java
// Import classes:
import de.elbosso.spacetraders.client.invoker.ApiClient;
import de.elbosso.spacetraders.client.invoker.ApiException;
import de.elbosso.spacetraders.client.invoker.Configuration;
import de.elbosso.spacetraders.client.invoker.auth.*;
import de.elbosso.spacetraders.client.invoker.models.*;
import de.elbosso.spacetraders.client.api.FleetApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.spacetraders.io/v2");
        
        // Configure HTTP bearer authorization: AgentToken
        HttpBearerAuth AgentToken = (HttpBearerAuth) defaultClient.getAuthentication("AgentToken");
        AgentToken.setBearerToken("BEARER TOKEN");

        FleetApi apiInstance = new FleetApi(defaultClient);
        PurchaseShipRequest purchaseShipRequest = new PurchaseShipRequest(); // PurchaseShipRequest | 
        try {
            PurchaseShip201Response result = apiInstance.purchaseShip(purchaseShipRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling FleetApi#purchaseShip");
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
| **purchaseShipRequest** | [**PurchaseShipRequest**](PurchaseShipRequest.md)|  | [optional] |

### Return type

[**PurchaseShip201Response**](PurchaseShip201Response.md)

### Authorization

[AgentToken](../README.md#AgentToken)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Created |  -  |


## refuelShip

> RefuelShip200Response refuelShip(shipSymbol)

Refuel Ship

Refuel your ship from the local market.

### Example

```java
// Import classes:
import de.elbosso.spacetraders.client.invoker.ApiClient;
import de.elbosso.spacetraders.client.invoker.ApiException;
import de.elbosso.spacetraders.client.invoker.Configuration;
import de.elbosso.spacetraders.client.invoker.auth.*;
import de.elbosso.spacetraders.client.invoker.models.*;
import de.elbosso.spacetraders.client.api.FleetApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.spacetraders.io/v2");
        
        // Configure HTTP bearer authorization: AgentToken
        HttpBearerAuth AgentToken = (HttpBearerAuth) defaultClient.getAuthentication("AgentToken");
        AgentToken.setBearerToken("BEARER TOKEN");

        FleetApi apiInstance = new FleetApi(defaultClient);
        String shipSymbol = "shipSymbol_example"; // String | 
        try {
            RefuelShip200Response result = apiInstance.refuelShip(shipSymbol);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling FleetApi#refuelShip");
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
| **shipSymbol** | **String**|  | |

### Return type

[**RefuelShip200Response**](RefuelShip200Response.md)

### Authorization

[AgentToken](../README.md#AgentToken)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |


## removeMount

> RemoveMount201Response removeMount(shipSymbol, removeMountRequest)

Remove Mount

Remove a mount from a ship.

### Example

```java
// Import classes:
import de.elbosso.spacetraders.client.invoker.ApiClient;
import de.elbosso.spacetraders.client.invoker.ApiException;
import de.elbosso.spacetraders.client.invoker.Configuration;
import de.elbosso.spacetraders.client.invoker.auth.*;
import de.elbosso.spacetraders.client.invoker.models.*;
import de.elbosso.spacetraders.client.api.FleetApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.spacetraders.io/v2");
        
        // Configure HTTP bearer authorization: AgentToken
        HttpBearerAuth AgentToken = (HttpBearerAuth) defaultClient.getAuthentication("AgentToken");
        AgentToken.setBearerToken("BEARER TOKEN");

        FleetApi apiInstance = new FleetApi(defaultClient);
        String shipSymbol = "shipSymbol_example"; // String | 
        RemoveMountRequest removeMountRequest = new RemoveMountRequest(); // RemoveMountRequest | 
        try {
            RemoveMount201Response result = apiInstance.removeMount(shipSymbol, removeMountRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling FleetApi#removeMount");
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
| **shipSymbol** | **String**|  | |
| **removeMountRequest** | [**RemoveMountRequest**](RemoveMountRequest.md)|  | [optional] |

### Return type

[**RemoveMount201Response**](RemoveMount201Response.md)

### Authorization

[AgentToken](../README.md#AgentToken)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Created |  -  |


## sellCargo

> SellCargo201Response sellCargo(shipSymbol, sellCargoRequest)

Sell Cargo

Sell cargo.

### Example

```java
// Import classes:
import de.elbosso.spacetraders.client.invoker.ApiClient;
import de.elbosso.spacetraders.client.invoker.ApiException;
import de.elbosso.spacetraders.client.invoker.Configuration;
import de.elbosso.spacetraders.client.invoker.auth.*;
import de.elbosso.spacetraders.client.invoker.models.*;
import de.elbosso.spacetraders.client.api.FleetApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.spacetraders.io/v2");
        
        // Configure HTTP bearer authorization: AgentToken
        HttpBearerAuth AgentToken = (HttpBearerAuth) defaultClient.getAuthentication("AgentToken");
        AgentToken.setBearerToken("BEARER TOKEN");

        FleetApi apiInstance = new FleetApi(defaultClient);
        String shipSymbol = "shipSymbol_example"; // String | 
        SellCargoRequest sellCargoRequest = new SellCargoRequest(); // SellCargoRequest | 
        try {
            SellCargo201Response result = apiInstance.sellCargo(shipSymbol, sellCargoRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling FleetApi#sellCargo");
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
| **shipSymbol** | **String**|  | |
| **sellCargoRequest** | [**SellCargoRequest**](SellCargoRequest.md)|  | [optional] |

### Return type

[**SellCargo201Response**](SellCargo201Response.md)

### Authorization

[AgentToken](../README.md#AgentToken)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Created |  -  |


## shipRefine

> ShipRefine200Response shipRefine(shipSymbol, shipRefineRequest)

Ship Refine

Attempt to refine the raw materials on your ship. The request will only succeed if your ship is capable of refining at the time of the request.

### Example

```java
// Import classes:
import de.elbosso.spacetraders.client.invoker.ApiClient;
import de.elbosso.spacetraders.client.invoker.ApiException;
import de.elbosso.spacetraders.client.invoker.Configuration;
import de.elbosso.spacetraders.client.invoker.auth.*;
import de.elbosso.spacetraders.client.invoker.models.*;
import de.elbosso.spacetraders.client.api.FleetApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.spacetraders.io/v2");
        
        // Configure HTTP bearer authorization: AgentToken
        HttpBearerAuth AgentToken = (HttpBearerAuth) defaultClient.getAuthentication("AgentToken");
        AgentToken.setBearerToken("BEARER TOKEN");

        FleetApi apiInstance = new FleetApi(defaultClient);
        String shipSymbol = "shipSymbol_example"; // String | The symbol of the ship
        ShipRefineRequest shipRefineRequest = new ShipRefineRequest(); // ShipRefineRequest | 
        try {
            ShipRefine200Response result = apiInstance.shipRefine(shipSymbol, shipRefineRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling FleetApi#shipRefine");
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
| **shipSymbol** | **String**| The symbol of the ship | |
| **shipRefineRequest** | [**ShipRefineRequest**](ShipRefineRequest.md)|  | [optional] |

### Return type

[**ShipRefine200Response**](ShipRefine200Response.md)

### Authorization

[AgentToken](../README.md#AgentToken)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The ship has successfully started refining. |  -  |


## transferCargo

> TransferCargo200Response transferCargo(shipSymbol, transferCargoRequest)

Transfer Cargo

Transfer cargo between ships.

### Example

```java
// Import classes:
import de.elbosso.spacetraders.client.invoker.ApiClient;
import de.elbosso.spacetraders.client.invoker.ApiException;
import de.elbosso.spacetraders.client.invoker.Configuration;
import de.elbosso.spacetraders.client.invoker.auth.*;
import de.elbosso.spacetraders.client.invoker.models.*;
import de.elbosso.spacetraders.client.api.FleetApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.spacetraders.io/v2");
        
        // Configure HTTP bearer authorization: AgentToken
        HttpBearerAuth AgentToken = (HttpBearerAuth) defaultClient.getAuthentication("AgentToken");
        AgentToken.setBearerToken("BEARER TOKEN");

        FleetApi apiInstance = new FleetApi(defaultClient);
        String shipSymbol = "shipSymbol_example"; // String | 
        TransferCargoRequest transferCargoRequest = new TransferCargoRequest(); // TransferCargoRequest | 
        try {
            TransferCargo200Response result = apiInstance.transferCargo(shipSymbol, transferCargoRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling FleetApi#transferCargo");
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
| **shipSymbol** | **String**|  | |
| **transferCargoRequest** | [**TransferCargoRequest**](TransferCargoRequest.md)|  | [optional] |

### Return type

[**TransferCargo200Response**](TransferCargo200Response.md)

### Authorization

[AgentToken](../README.md#AgentToken)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Created |  -  |


## warpShip

> NavigateShip200Response warpShip(shipSymbol, navigateShipRequest)

Warp Ship

Warp your ship to a target destination in another system. Warping will consume the necessary fuel and supplies from the ship&#39;s manifest, and will pay out crew wages from the agent&#39;s account.  The returned response will detail the route information including the expected time of arrival. Most ship actions are unavailable until the ship has arrived at it&#39;s destination.

### Example

```java
// Import classes:
import de.elbosso.spacetraders.client.invoker.ApiClient;
import de.elbosso.spacetraders.client.invoker.ApiException;
import de.elbosso.spacetraders.client.invoker.Configuration;
import de.elbosso.spacetraders.client.invoker.auth.*;
import de.elbosso.spacetraders.client.invoker.models.*;
import de.elbosso.spacetraders.client.api.FleetApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.spacetraders.io/v2");
        
        // Configure HTTP bearer authorization: AgentToken
        HttpBearerAuth AgentToken = (HttpBearerAuth) defaultClient.getAuthentication("AgentToken");
        AgentToken.setBearerToken("BEARER TOKEN");

        FleetApi apiInstance = new FleetApi(defaultClient);
        String shipSymbol = "shipSymbol_example"; // String | 
        NavigateShipRequest navigateShipRequest = new NavigateShipRequest(); // NavigateShipRequest | 
        try {
            NavigateShip200Response result = apiInstance.warpShip(shipSymbol, navigateShipRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling FleetApi#warpShip");
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
| **shipSymbol** | **String**|  | |
| **navigateShipRequest** | [**NavigateShipRequest**](NavigateShipRequest.md)|  | [optional] |

### Return type

[**NavigateShip200Response**](NavigateShip200Response.md)

### Authorization

[AgentToken](../README.md#AgentToken)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The successful transit information including the route details and changes to ship fuel, supplies, and crew wages paid. The route includes the expected time of arrival. |  -  |

