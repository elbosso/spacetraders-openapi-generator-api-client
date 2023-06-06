package de.elbosso.spacetraders.client.api;

import de.elbosso.spacetraders.client.invoker.ApiException;
import de.elbosso.spacetraders.client.invoker.ApiClient;
import de.elbosso.spacetraders.client.invoker.Configuration;
import de.elbosso.spacetraders.client.invoker.Pair;

import javax.ws.rs.core.GenericType;

import de.elbosso.spacetraders.client.model.GetJumpGate200Response;
import de.elbosso.spacetraders.client.model.GetMarket200Response;
import de.elbosso.spacetraders.client.model.GetShipyard200Response;
import de.elbosso.spacetraders.client.model.GetSystem200Response;
import de.elbosso.spacetraders.client.model.GetSystemWaypoints200Response;
import de.elbosso.spacetraders.client.model.GetSystems200Response;
import de.elbosso.spacetraders.client.model.GetWaypoint200Response;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-06-05T09:25:51.979579Z[Etc/UTC]")
public class SystemsApi {
  private ApiClient apiClient;

  public SystemsApi() {
    this(Configuration.getDefaultApiClient());
  }

  public SystemsApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  /**
   * Get Jump Gate
   * Get jump gate details for a waypoint.
   * @param systemSymbol The system symbol (required)
   * @param waypointSymbol The waypoint symbol (required)
   * @return a {@code GetJumpGate200Response}
   * @throws ApiException if fails to make API call
   */
  public GetJumpGate200Response getJumpGate(String systemSymbol, String waypointSymbol) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'systemSymbol' is set
    if (systemSymbol == null) {
      throw new ApiException(400, "Missing the required parameter 'systemSymbol' when calling getJumpGate");
    }
    
    // verify the required parameter 'waypointSymbol' is set
    if (waypointSymbol == null) {
      throw new ApiException(400, "Missing the required parameter 'waypointSymbol' when calling getJumpGate");
    }
    
    // create path and map variables
    String localVarPath = "/systems/{systemSymbol}/waypoints/{waypointSymbol}/jump-gate".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "systemSymbol" + "\\}", apiClient.escapeString(systemSymbol.toString()))
      .replaceAll("\\{" + "waypointSymbol" + "\\}", apiClient.escapeString(waypointSymbol.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    
    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "AgentToken" };

    GenericType<GetJumpGate200Response> localVarReturnType = new GenericType<GetJumpGate200Response>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Get Market
   * Retrieve imports, exports and exchange data from a marketplace. Imports can be sold, exports can be purchased, and exchange goods can be purchased or sold. Send a ship to the waypoint to access trade good prices and recent transactions.
   * @param systemSymbol The system symbol (required)
   * @param waypointSymbol The waypoint symbol (required)
   * @return a {@code GetMarket200Response}
   * @throws ApiException if fails to make API call
   */
  public GetMarket200Response getMarket(String systemSymbol, String waypointSymbol) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'systemSymbol' is set
    if (systemSymbol == null) {
      throw new ApiException(400, "Missing the required parameter 'systemSymbol' when calling getMarket");
    }
    
    // verify the required parameter 'waypointSymbol' is set
    if (waypointSymbol == null) {
      throw new ApiException(400, "Missing the required parameter 'waypointSymbol' when calling getMarket");
    }
    
    // create path and map variables
    String localVarPath = "/systems/{systemSymbol}/waypoints/{waypointSymbol}/market".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "systemSymbol" + "\\}", apiClient.escapeString(systemSymbol.toString()))
      .replaceAll("\\{" + "waypointSymbol" + "\\}", apiClient.escapeString(waypointSymbol.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    
    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "AgentToken" };

    GenericType<GetMarket200Response> localVarReturnType = new GenericType<GetMarket200Response>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Get Shipyard
   * Get the shipyard for a waypoint. Send a ship to the waypoint to access ships that are currently available for purchase and recent transactions.
   * @param systemSymbol The system symbol (required)
   * @param waypointSymbol The waypoint symbol (required)
   * @return a {@code GetShipyard200Response}
   * @throws ApiException if fails to make API call
   */
  public GetShipyard200Response getShipyard(String systemSymbol, String waypointSymbol) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'systemSymbol' is set
    if (systemSymbol == null) {
      throw new ApiException(400, "Missing the required parameter 'systemSymbol' when calling getShipyard");
    }
    
    // verify the required parameter 'waypointSymbol' is set
    if (waypointSymbol == null) {
      throw new ApiException(400, "Missing the required parameter 'waypointSymbol' when calling getShipyard");
    }
    
    // create path and map variables
    String localVarPath = "/systems/{systemSymbol}/waypoints/{waypointSymbol}/shipyard".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "systemSymbol" + "\\}", apiClient.escapeString(systemSymbol.toString()))
      .replaceAll("\\{" + "waypointSymbol" + "\\}", apiClient.escapeString(waypointSymbol.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    
    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "AgentToken" };

    GenericType<GetShipyard200Response> localVarReturnType = new GenericType<GetShipyard200Response>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Get System
   * Get the details of a system.
   * @param systemSymbol The system symbol (required)
   * @return a {@code GetSystem200Response}
   * @throws ApiException if fails to make API call
   */
  public GetSystem200Response getSystem(String systemSymbol) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'systemSymbol' is set
    if (systemSymbol == null) {
      throw new ApiException(400, "Missing the required parameter 'systemSymbol' when calling getSystem");
    }
    
    // create path and map variables
    String localVarPath = "/systems/{systemSymbol}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "systemSymbol" + "\\}", apiClient.escapeString(systemSymbol.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    
    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "AgentToken" };

    GenericType<GetSystem200Response> localVarReturnType = new GenericType<GetSystem200Response>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * List Waypoints
   * Fetch all of the waypoints for a given system. System must be charted or a ship must be present to return waypoint details.
   * @param systemSymbol The system symbol (required)
   * @param page What entry offset to request (optional)
   * @param limit How many entries to return per page (optional)
   * @return a {@code GetSystemWaypoints200Response}
   * @throws ApiException if fails to make API call
   */
  public GetSystemWaypoints200Response getSystemWaypoints(String systemSymbol, Integer page, Integer limit) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'systemSymbol' is set
    if (systemSymbol == null) {
      throw new ApiException(400, "Missing the required parameter 'systemSymbol' when calling getSystemWaypoints");
    }
    
    // create path and map variables
    String localVarPath = "/systems/{systemSymbol}/waypoints".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "systemSymbol" + "\\}", apiClient.escapeString(systemSymbol.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "page", page));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "limit", limit));

    
    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "AgentToken" };

    GenericType<GetSystemWaypoints200Response> localVarReturnType = new GenericType<GetSystemWaypoints200Response>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * List Systems
   * Return a list of all systems.
   * @param page What entry offset to request (optional)
   * @param limit How many entries to return per page (optional)
   * @return a {@code GetSystems200Response}
   * @throws ApiException if fails to make API call
   */
  public GetSystems200Response getSystems(Integer page, Integer limit) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/systems".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "page", page));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "limit", limit));

    
    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "AgentToken" };

    GenericType<GetSystems200Response> localVarReturnType = new GenericType<GetSystems200Response>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Get Waypoint
   * View the details of a waypoint.
   * @param systemSymbol The system symbol (required)
   * @param waypointSymbol The waypoint symbol (required)
   * @return a {@code GetWaypoint200Response}
   * @throws ApiException if fails to make API call
   */
  public GetWaypoint200Response getWaypoint(String systemSymbol, String waypointSymbol) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'systemSymbol' is set
    if (systemSymbol == null) {
      throw new ApiException(400, "Missing the required parameter 'systemSymbol' when calling getWaypoint");
    }
    
    // verify the required parameter 'waypointSymbol' is set
    if (waypointSymbol == null) {
      throw new ApiException(400, "Missing the required parameter 'waypointSymbol' when calling getWaypoint");
    }
    
    // create path and map variables
    String localVarPath = "/systems/{systemSymbol}/waypoints/{waypointSymbol}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "systemSymbol" + "\\}", apiClient.escapeString(systemSymbol.toString()))
      .replaceAll("\\{" + "waypointSymbol" + "\\}", apiClient.escapeString(waypointSymbol.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    
    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "AgentToken" };

    GenericType<GetWaypoint200Response> localVarReturnType = new GenericType<GetWaypoint200Response>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
}
