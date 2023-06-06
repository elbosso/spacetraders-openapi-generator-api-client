package de.elbosso.spacetraders.client.api;

import de.elbosso.spacetraders.client.invoker.ApiException;
import de.elbosso.spacetraders.client.invoker.ApiClient;
import de.elbosso.spacetraders.client.invoker.Configuration;
import de.elbosso.spacetraders.client.invoker.Pair;

import javax.ws.rs.core.GenericType;

import de.elbosso.spacetraders.client.model.CreateChart201Response;
import de.elbosso.spacetraders.client.model.CreateShipShipScan201Response;
import de.elbosso.spacetraders.client.model.CreateShipSystemScan201Response;
import de.elbosso.spacetraders.client.model.CreateShipWaypointScan201Response;
import de.elbosso.spacetraders.client.model.CreateSurvey201Response;
import de.elbosso.spacetraders.client.model.DockShip200Response;
import de.elbosso.spacetraders.client.model.ExtractResources201Response;
import de.elbosso.spacetraders.client.model.ExtractResourcesRequest;
import de.elbosso.spacetraders.client.model.GetMounts200Response;
import de.elbosso.spacetraders.client.model.GetMyShip200Response;
import de.elbosso.spacetraders.client.model.GetMyShipCargo200Response;
import de.elbosso.spacetraders.client.model.GetMyShips200Response;
import de.elbosso.spacetraders.client.model.GetShipCooldown200Response;
import de.elbosso.spacetraders.client.model.GetShipNav200Response;
import de.elbosso.spacetraders.client.model.InstallMount201Response;
import de.elbosso.spacetraders.client.model.InstallMountRequest;
import de.elbosso.spacetraders.client.model.Jettison200Response;
import de.elbosso.spacetraders.client.model.JettisonRequest;
import de.elbosso.spacetraders.client.model.JumpShip200Response;
import de.elbosso.spacetraders.client.model.JumpShipRequest;
import de.elbosso.spacetraders.client.model.NavigateShip200Response;
import de.elbosso.spacetraders.client.model.NavigateShipRequest;
import de.elbosso.spacetraders.client.model.NegotiateContract200Response;
import de.elbosso.spacetraders.client.model.OrbitShip200Response;
import de.elbosso.spacetraders.client.model.PatchShipNavRequest;
import de.elbosso.spacetraders.client.model.PurchaseCargo201Response;
import de.elbosso.spacetraders.client.model.PurchaseCargoRequest;
import de.elbosso.spacetraders.client.model.PurchaseShip201Response;
import de.elbosso.spacetraders.client.model.PurchaseShipRequest;
import de.elbosso.spacetraders.client.model.RefuelShip200Response;
import de.elbosso.spacetraders.client.model.RemoveMount201Response;
import de.elbosso.spacetraders.client.model.RemoveMountRequest;
import de.elbosso.spacetraders.client.model.SellCargo201Response;
import de.elbosso.spacetraders.client.model.SellCargoRequest;
import de.elbosso.spacetraders.client.model.ShipRefine200Response;
import de.elbosso.spacetraders.client.model.ShipRefineRequest;
import de.elbosso.spacetraders.client.model.TransferCargo200Response;
import de.elbosso.spacetraders.client.model.TransferCargoRequest;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-06-05T09:25:51.979579Z[Etc/UTC]")
public class FleetApi {
  private ApiClient apiClient;

  public FleetApi() {
    this(Configuration.getDefaultApiClient());
  }

  public FleetApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  /**
   * Create Chart
   * Command a ship to chart the current waypoint.  Waypoints in the universe are uncharted by default. These locations will not show up in the API until they have been charted by a ship.  Charting a location will record your agent as the one who created the chart.
   * @param shipSymbol The symbol of the ship (required)
   * @return a {@code CreateChart201Response}
   * @throws ApiException if fails to make API call
   */
  public CreateChart201Response createChart(String shipSymbol) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'shipSymbol' is set
    if (shipSymbol == null) {
      throw new ApiException(400, "Missing the required parameter 'shipSymbol' when calling createChart");
    }
    
    // create path and map variables
    String localVarPath = "/my/ships/{shipSymbol}/chart".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "shipSymbol" + "\\}", apiClient.escapeString(shipSymbol.toString()));

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

    GenericType<CreateChart201Response> localVarReturnType = new GenericType<CreateChart201Response>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Scan Ships
   * Activate your ship&#39;s sensor arrays to scan for ship information.
   * @param shipSymbol  (required)
   * @return a {@code CreateShipShipScan201Response}
   * @throws ApiException if fails to make API call
   */
  public CreateShipShipScan201Response createShipShipScan(String shipSymbol) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'shipSymbol' is set
    if (shipSymbol == null) {
      throw new ApiException(400, "Missing the required parameter 'shipSymbol' when calling createShipShipScan");
    }
    
    // create path and map variables
    String localVarPath = "/my/ships/{shipSymbol}/scan/ships".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "shipSymbol" + "\\}", apiClient.escapeString(shipSymbol.toString()));

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

    GenericType<CreateShipShipScan201Response> localVarReturnType = new GenericType<CreateShipShipScan201Response>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Scan Systems
   * Activate your ship&#39;s sensor arrays to scan for system information.
   * @param shipSymbol  (required)
   * @return a {@code CreateShipSystemScan201Response}
   * @throws ApiException if fails to make API call
   */
  public CreateShipSystemScan201Response createShipSystemScan(String shipSymbol) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'shipSymbol' is set
    if (shipSymbol == null) {
      throw new ApiException(400, "Missing the required parameter 'shipSymbol' when calling createShipSystemScan");
    }
    
    // create path and map variables
    String localVarPath = "/my/ships/{shipSymbol}/scan/systems".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "shipSymbol" + "\\}", apiClient.escapeString(shipSymbol.toString()));

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

    GenericType<CreateShipSystemScan201Response> localVarReturnType = new GenericType<CreateShipSystemScan201Response>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Scan Waypoints
   * Activate your ship&#39;s sensor arrays to scan for waypoint information.
   * @param shipSymbol  (required)
   * @return a {@code CreateShipWaypointScan201Response}
   * @throws ApiException if fails to make API call
   */
  public CreateShipWaypointScan201Response createShipWaypointScan(String shipSymbol) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'shipSymbol' is set
    if (shipSymbol == null) {
      throw new ApiException(400, "Missing the required parameter 'shipSymbol' when calling createShipWaypointScan");
    }
    
    // create path and map variables
    String localVarPath = "/my/ships/{shipSymbol}/scan/waypoints".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "shipSymbol" + "\\}", apiClient.escapeString(shipSymbol.toString()));

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

    GenericType<CreateShipWaypointScan201Response> localVarReturnType = new GenericType<CreateShipWaypointScan201Response>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Create Survey
   * If you want to target specific yields for an extraction, you can survey a waypoint, such as an asteroid field, and send the survey in the body of the extract request. Each survey may have multiple deposits, and if a symbol shows up more than once, that indicates a higher chance of extracting that resource.  Your ship will enter a cooldown between consecutive survey requests. Surveys will eventually expire after a period of time. Multiple ships can use the same survey for extraction.
   * @param shipSymbol The symbol of the ship (required)
   * @return a {@code CreateSurvey201Response}
   * @throws ApiException if fails to make API call
   */
  public CreateSurvey201Response createSurvey(String shipSymbol) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'shipSymbol' is set
    if (shipSymbol == null) {
      throw new ApiException(400, "Missing the required parameter 'shipSymbol' when calling createSurvey");
    }
    
    // create path and map variables
    String localVarPath = "/my/ships/{shipSymbol}/survey".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "shipSymbol" + "\\}", apiClient.escapeString(shipSymbol.toString()));

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

    GenericType<CreateSurvey201Response> localVarReturnType = new GenericType<CreateSurvey201Response>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Dock Ship
   * Attempt to dock your ship at it&#39;s current location. Docking will only succeed if the waypoint is a dockable location, and your ship is capable of docking at the time of the request.  The endpoint is idempotent - successive calls will succeed even if the ship is already docked.
   * @param shipSymbol The symbol of the ship (required)
   * @return a {@code DockShip200Response}
   * @throws ApiException if fails to make API call
   */
  public DockShip200Response dockShip(String shipSymbol) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'shipSymbol' is set
    if (shipSymbol == null) {
      throw new ApiException(400, "Missing the required parameter 'shipSymbol' when calling dockShip");
    }
    
    // create path and map variables
    String localVarPath = "/my/ships/{shipSymbol}/dock".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "shipSymbol" + "\\}", apiClient.escapeString(shipSymbol.toString()));

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

    GenericType<DockShip200Response> localVarReturnType = new GenericType<DockShip200Response>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Extract Resources
   * Extract resources from the waypoint into your ship. Send an optional survey as the payload to target specific yields.
   * @param shipSymbol The ship symbol (required)
   * @param extractResourcesRequest  (optional)
   * @return a {@code ExtractResources201Response}
   * @throws ApiException if fails to make API call
   */
  public ExtractResources201Response extractResources(String shipSymbol, ExtractResourcesRequest extractResourcesRequest) throws ApiException {
    Object localVarPostBody = extractResourcesRequest;
    
    // verify the required parameter 'shipSymbol' is set
    if (shipSymbol == null) {
      throw new ApiException(400, "Missing the required parameter 'shipSymbol' when calling extractResources");
    }
    
    // create path and map variables
    String localVarPath = "/my/ships/{shipSymbol}/extract".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "shipSymbol" + "\\}", apiClient.escapeString(shipSymbol.toString()));

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
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "AgentToken" };

    GenericType<ExtractResources201Response> localVarReturnType = new GenericType<ExtractResources201Response>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Get Mounts
   * Get the mounts on a ship.
   * @param shipSymbol  (required)
   * @return a {@code GetMounts200Response}
   * @throws ApiException if fails to make API call
   */
  public GetMounts200Response getMounts(String shipSymbol) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'shipSymbol' is set
    if (shipSymbol == null) {
      throw new ApiException(400, "Missing the required parameter 'shipSymbol' when calling getMounts");
    }
    
    // create path and map variables
    String localVarPath = "/my/ships/{shipSymbol}/mounts".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "shipSymbol" + "\\}", apiClient.escapeString(shipSymbol.toString()));

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

    GenericType<GetMounts200Response> localVarReturnType = new GenericType<GetMounts200Response>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Get Ship
   * Retrieve the details of your ship.
   * @param shipSymbol  (required)
   * @return a {@code GetMyShip200Response}
   * @throws ApiException if fails to make API call
   */
  public GetMyShip200Response getMyShip(String shipSymbol) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'shipSymbol' is set
    if (shipSymbol == null) {
      throw new ApiException(400, "Missing the required parameter 'shipSymbol' when calling getMyShip");
    }
    
    // create path and map variables
    String localVarPath = "/my/ships/{shipSymbol}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "shipSymbol" + "\\}", apiClient.escapeString(shipSymbol.toString()));

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

    GenericType<GetMyShip200Response> localVarReturnType = new GenericType<GetMyShip200Response>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Get Ship Cargo
   * Retrieve the cargo of your ship.
   * @param shipSymbol The symbol of the ship (required)
   * @return a {@code GetMyShipCargo200Response}
   * @throws ApiException if fails to make API call
   */
  public GetMyShipCargo200Response getMyShipCargo(String shipSymbol) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'shipSymbol' is set
    if (shipSymbol == null) {
      throw new ApiException(400, "Missing the required parameter 'shipSymbol' when calling getMyShipCargo");
    }
    
    // create path and map variables
    String localVarPath = "/my/ships/{shipSymbol}/cargo".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "shipSymbol" + "\\}", apiClient.escapeString(shipSymbol.toString()));

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

    GenericType<GetMyShipCargo200Response> localVarReturnType = new GenericType<GetMyShipCargo200Response>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * List Ships
   * Retrieve all of your ships.
   * @param page What entry offset to request (optional)
   * @param limit How many entries to return per page (optional)
   * @return a {@code GetMyShips200Response}
   * @throws ApiException if fails to make API call
   */
  public GetMyShips200Response getMyShips(Integer page, Integer limit) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/my/ships".replaceAll("\\{format\\}","json");

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

    GenericType<GetMyShips200Response> localVarReturnType = new GenericType<GetMyShips200Response>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Get Ship Cooldown
   * Retrieve the details of your ship&#39;s reactor cooldown. Some actions such as activating your jump drive, scanning, or extracting resources taxes your reactor and results in a cooldown.  Your ship cannot perform additional actions until your cooldown has expired. The duration of your cooldown is relative to the power consumption of the related modules or mounts for the action taken.  Response returns a 204 status code (no-content) when the ship has no cooldown.
   * @param shipSymbol  (required)
   * @return a {@code GetShipCooldown200Response}
   * @throws ApiException if fails to make API call
   */
  public GetShipCooldown200Response getShipCooldown(String shipSymbol) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'shipSymbol' is set
    if (shipSymbol == null) {
      throw new ApiException(400, "Missing the required parameter 'shipSymbol' when calling getShipCooldown");
    }
    
    // create path and map variables
    String localVarPath = "/my/ships/{shipSymbol}/cooldown".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "shipSymbol" + "\\}", apiClient.escapeString(shipSymbol.toString()));

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

    GenericType<GetShipCooldown200Response> localVarReturnType = new GenericType<GetShipCooldown200Response>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Get Ship Nav
   * Get the current nav status of a ship.
   * @param shipSymbol The ship symbol (required)
   * @return a {@code GetShipNav200Response}
   * @throws ApiException if fails to make API call
   */
  public GetShipNav200Response getShipNav(String shipSymbol) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'shipSymbol' is set
    if (shipSymbol == null) {
      throw new ApiException(400, "Missing the required parameter 'shipSymbol' when calling getShipNav");
    }
    
    // create path and map variables
    String localVarPath = "/my/ships/{shipSymbol}/nav".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "shipSymbol" + "\\}", apiClient.escapeString(shipSymbol.toString()));

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

    GenericType<GetShipNav200Response> localVarReturnType = new GenericType<GetShipNav200Response>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Install Mount
   * Install a mount on a ship.
   * @param shipSymbol  (required)
   * @param installMountRequest  (optional)
   * @return a {@code InstallMount201Response}
   * @throws ApiException if fails to make API call
   */
  public InstallMount201Response installMount(String shipSymbol, InstallMountRequest installMountRequest) throws ApiException {
    Object localVarPostBody = installMountRequest;
    
    // verify the required parameter 'shipSymbol' is set
    if (shipSymbol == null) {
      throw new ApiException(400, "Missing the required parameter 'shipSymbol' when calling installMount");
    }
    
    // create path and map variables
    String localVarPath = "/my/ships/{shipSymbol}/mounts/install".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "shipSymbol" + "\\}", apiClient.escapeString(shipSymbol.toString()));

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
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "AgentToken" };

    GenericType<InstallMount201Response> localVarReturnType = new GenericType<InstallMount201Response>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Jettison Cargo
   * Jettison cargo from your ship&#39;s cargo hold.
   * @param shipSymbol  (required)
   * @param jettisonRequest  (optional)
   * @return a {@code Jettison200Response}
   * @throws ApiException if fails to make API call
   */
  public Jettison200Response jettison(String shipSymbol, JettisonRequest jettisonRequest) throws ApiException {
    Object localVarPostBody = jettisonRequest;
    
    // verify the required parameter 'shipSymbol' is set
    if (shipSymbol == null) {
      throw new ApiException(400, "Missing the required parameter 'shipSymbol' when calling jettison");
    }
    
    // create path and map variables
    String localVarPath = "/my/ships/{shipSymbol}/jettison".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "shipSymbol" + "\\}", apiClient.escapeString(shipSymbol.toString()));

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
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "AgentToken" };

    GenericType<Jettison200Response> localVarReturnType = new GenericType<Jettison200Response>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Jump Ship
   * Jump your ship instantly to a target system. When used while in orbit or docked to a jump gate waypoint, any ship can use this command. When used elsewhere, jumping requires a jump drive unit and consumes a unit of antimatter (which needs to be in your cargo).
   * @param shipSymbol  (required)
   * @param jumpShipRequest  (optional)
   * @return a {@code JumpShip200Response}
   * @throws ApiException if fails to make API call
   */
  public JumpShip200Response jumpShip(String shipSymbol, JumpShipRequest jumpShipRequest) throws ApiException {
    Object localVarPostBody = jumpShipRequest;
    
    // verify the required parameter 'shipSymbol' is set
    if (shipSymbol == null) {
      throw new ApiException(400, "Missing the required parameter 'shipSymbol' when calling jumpShip");
    }
    
    // create path and map variables
    String localVarPath = "/my/ships/{shipSymbol}/jump".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "shipSymbol" + "\\}", apiClient.escapeString(shipSymbol.toString()));

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
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "AgentToken" };

    GenericType<JumpShip200Response> localVarReturnType = new GenericType<JumpShip200Response>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Navigate Ship
   * Navigate to a target destination. The destination must be located within the same system as the ship. Navigating will consume the necessary fuel and supplies from the ship&#39;s manifest, and will pay out crew wages from the agent&#39;s account.  The returned response will detail the route information including the expected time of arrival. Most ship actions are unavailable until the ship has arrived at it&#39;s destination.  To travel between systems, see the ship&#39;s warp or jump actions.
   * @param shipSymbol The ship symbol (required)
   * @param navigateShipRequest  (optional)
   * @return a {@code NavigateShip200Response}
   * @throws ApiException if fails to make API call
   */
  public NavigateShip200Response navigateShip(String shipSymbol, NavigateShipRequest navigateShipRequest) throws ApiException {
    Object localVarPostBody = navigateShipRequest;
    
    // verify the required parameter 'shipSymbol' is set
    if (shipSymbol == null) {
      throw new ApiException(400, "Missing the required parameter 'shipSymbol' when calling navigateShip");
    }
    
    // create path and map variables
    String localVarPath = "/my/ships/{shipSymbol}/navigate".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "shipSymbol" + "\\}", apiClient.escapeString(shipSymbol.toString()));

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
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "AgentToken" };

    GenericType<NavigateShip200Response> localVarReturnType = new GenericType<NavigateShip200Response>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Negotiate Contract
   * 
   * @param shipSymbol  (required)
   * @param body  (optional)
   * @return a {@code NegotiateContract200Response}
   * @throws ApiException if fails to make API call
   */
  public NegotiateContract200Response negotiateContract(String shipSymbol, Object body) throws ApiException {
    Object localVarPostBody = body;
    
    // verify the required parameter 'shipSymbol' is set
    if (shipSymbol == null) {
      throw new ApiException(400, "Missing the required parameter 'shipSymbol' when calling negotiateContract");
    }
    
    // create path and map variables
    String localVarPath = "/my/ships/{shipSymbol}/negotiate/contract".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "shipSymbol" + "\\}", apiClient.escapeString(shipSymbol.toString()));

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
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "AgentToken" };

    GenericType<NegotiateContract200Response> localVarReturnType = new GenericType<NegotiateContract200Response>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Orbit Ship
   * Attempt to move your ship into orbit at it&#39;s current location. The request will only succeed if your ship is capable of moving into orbit at the time of the request.  The endpoint is idempotent - successive calls will succeed even if the ship is already in orbit.
   * @param shipSymbol The symbol of the ship (required)
   * @return a {@code OrbitShip200Response}
   * @throws ApiException if fails to make API call
   */
  public OrbitShip200Response orbitShip(String shipSymbol) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'shipSymbol' is set
    if (shipSymbol == null) {
      throw new ApiException(400, "Missing the required parameter 'shipSymbol' when calling orbitShip");
    }
    
    // create path and map variables
    String localVarPath = "/my/ships/{shipSymbol}/orbit".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "shipSymbol" + "\\}", apiClient.escapeString(shipSymbol.toString()));

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

    GenericType<OrbitShip200Response> localVarReturnType = new GenericType<OrbitShip200Response>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Patch Ship Nav
   * Update the nav data of a ship, such as the flight mode.
   * @param shipSymbol The ship symbol (required)
   * @param patchShipNavRequest  (optional)
   * @return a {@code GetShipNav200Response}
   * @throws ApiException if fails to make API call
   */
  public GetShipNav200Response patchShipNav(String shipSymbol, PatchShipNavRequest patchShipNavRequest) throws ApiException {
    Object localVarPostBody = patchShipNavRequest;
    
    // verify the required parameter 'shipSymbol' is set
    if (shipSymbol == null) {
      throw new ApiException(400, "Missing the required parameter 'shipSymbol' when calling patchShipNav");
    }
    
    // create path and map variables
    String localVarPath = "/my/ships/{shipSymbol}/nav".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "shipSymbol" + "\\}", apiClient.escapeString(shipSymbol.toString()));

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
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "AgentToken" };

    GenericType<GetShipNav200Response> localVarReturnType = new GenericType<GetShipNav200Response>() {};
    return apiClient.invokeAPI(localVarPath, "PATCH", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Purchase Cargo
   * Purchase cargo.
   * @param shipSymbol  (required)
   * @param purchaseCargoRequest  (optional)
   * @return a {@code PurchaseCargo201Response}
   * @throws ApiException if fails to make API call
   */
  public PurchaseCargo201Response purchaseCargo(String shipSymbol, PurchaseCargoRequest purchaseCargoRequest) throws ApiException {
    Object localVarPostBody = purchaseCargoRequest;
    
    // verify the required parameter 'shipSymbol' is set
    if (shipSymbol == null) {
      throw new ApiException(400, "Missing the required parameter 'shipSymbol' when calling purchaseCargo");
    }
    
    // create path and map variables
    String localVarPath = "/my/ships/{shipSymbol}/purchase".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "shipSymbol" + "\\}", apiClient.escapeString(shipSymbol.toString()));

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
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "AgentToken" };

    GenericType<PurchaseCargo201Response> localVarReturnType = new GenericType<PurchaseCargo201Response>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Purchase Ship
   * Purchase a ship
   * @param purchaseShipRequest  (optional)
   * @return a {@code PurchaseShip201Response}
   * @throws ApiException if fails to make API call
   */
  public PurchaseShip201Response purchaseShip(PurchaseShipRequest purchaseShipRequest) throws ApiException {
    Object localVarPostBody = purchaseShipRequest;
    
    // create path and map variables
    String localVarPath = "/my/ships".replaceAll("\\{format\\}","json");

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
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "AgentToken" };

    GenericType<PurchaseShip201Response> localVarReturnType = new GenericType<PurchaseShip201Response>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Refuel Ship
   * Refuel your ship from the local market.
   * @param shipSymbol  (required)
   * @return a {@code RefuelShip200Response}
   * @throws ApiException if fails to make API call
   */
  public RefuelShip200Response refuelShip(String shipSymbol) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'shipSymbol' is set
    if (shipSymbol == null) {
      throw new ApiException(400, "Missing the required parameter 'shipSymbol' when calling refuelShip");
    }
    
    // create path and map variables
    String localVarPath = "/my/ships/{shipSymbol}/refuel".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "shipSymbol" + "\\}", apiClient.escapeString(shipSymbol.toString()));

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

    GenericType<RefuelShip200Response> localVarReturnType = new GenericType<RefuelShip200Response>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Remove Mount
   * Remove a mount from a ship.
   * @param shipSymbol  (required)
   * @param removeMountRequest  (optional)
   * @return a {@code RemoveMount201Response}
   * @throws ApiException if fails to make API call
   */
  public RemoveMount201Response removeMount(String shipSymbol, RemoveMountRequest removeMountRequest) throws ApiException {
    Object localVarPostBody = removeMountRequest;
    
    // verify the required parameter 'shipSymbol' is set
    if (shipSymbol == null) {
      throw new ApiException(400, "Missing the required parameter 'shipSymbol' when calling removeMount");
    }
    
    // create path and map variables
    String localVarPath = "/my/ships/{shipSymbol}/mounts/remove".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "shipSymbol" + "\\}", apiClient.escapeString(shipSymbol.toString()));

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
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "AgentToken" };

    GenericType<RemoveMount201Response> localVarReturnType = new GenericType<RemoveMount201Response>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Sell Cargo
   * Sell cargo.
   * @param shipSymbol  (required)
   * @param sellCargoRequest  (optional)
   * @return a {@code SellCargo201Response}
   * @throws ApiException if fails to make API call
   */
  public SellCargo201Response sellCargo(String shipSymbol, SellCargoRequest sellCargoRequest) throws ApiException {
    Object localVarPostBody = sellCargoRequest;
    
    // verify the required parameter 'shipSymbol' is set
    if (shipSymbol == null) {
      throw new ApiException(400, "Missing the required parameter 'shipSymbol' when calling sellCargo");
    }
    
    // create path and map variables
    String localVarPath = "/my/ships/{shipSymbol}/sell".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "shipSymbol" + "\\}", apiClient.escapeString(shipSymbol.toString()));

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
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "AgentToken" };

    GenericType<SellCargo201Response> localVarReturnType = new GenericType<SellCargo201Response>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Ship Refine
   * Attempt to refine the raw materials on your ship. The request will only succeed if your ship is capable of refining at the time of the request.
   * @param shipSymbol The symbol of the ship (required)
   * @param shipRefineRequest  (optional)
   * @return a {@code ShipRefine200Response}
   * @throws ApiException if fails to make API call
   */
  public ShipRefine200Response shipRefine(String shipSymbol, ShipRefineRequest shipRefineRequest) throws ApiException {
    Object localVarPostBody = shipRefineRequest;
    
    // verify the required parameter 'shipSymbol' is set
    if (shipSymbol == null) {
      throw new ApiException(400, "Missing the required parameter 'shipSymbol' when calling shipRefine");
    }
    
    // create path and map variables
    String localVarPath = "/my/ships/{shipSymbol}/refine".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "shipSymbol" + "\\}", apiClient.escapeString(shipSymbol.toString()));

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
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "AgentToken" };

    GenericType<ShipRefine200Response> localVarReturnType = new GenericType<ShipRefine200Response>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Transfer Cargo
   * Transfer cargo between ships.
   * @param shipSymbol  (required)
   * @param transferCargoRequest  (optional)
   * @return a {@code TransferCargo200Response}
   * @throws ApiException if fails to make API call
   */
  public TransferCargo200Response transferCargo(String shipSymbol, TransferCargoRequest transferCargoRequest) throws ApiException {
    Object localVarPostBody = transferCargoRequest;
    
    // verify the required parameter 'shipSymbol' is set
    if (shipSymbol == null) {
      throw new ApiException(400, "Missing the required parameter 'shipSymbol' when calling transferCargo");
    }
    
    // create path and map variables
    String localVarPath = "/my/ships/{shipSymbol}/transfer".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "shipSymbol" + "\\}", apiClient.escapeString(shipSymbol.toString()));

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
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "AgentToken" };

    GenericType<TransferCargo200Response> localVarReturnType = new GenericType<TransferCargo200Response>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Warp Ship
   * Warp your ship to a target destination in another system. Warping will consume the necessary fuel and supplies from the ship&#39;s manifest, and will pay out crew wages from the agent&#39;s account.  The returned response will detail the route information including the expected time of arrival. Most ship actions are unavailable until the ship has arrived at it&#39;s destination.
   * @param shipSymbol  (required)
   * @param navigateShipRequest  (optional)
   * @return a {@code NavigateShip200Response}
   * @throws ApiException if fails to make API call
   */
  public NavigateShip200Response warpShip(String shipSymbol, NavigateShipRequest navigateShipRequest) throws ApiException {
    Object localVarPostBody = navigateShipRequest;
    
    // verify the required parameter 'shipSymbol' is set
    if (shipSymbol == null) {
      throw new ApiException(400, "Missing the required parameter 'shipSymbol' when calling warpShip");
    }
    
    // create path and map variables
    String localVarPath = "/my/ships/{shipSymbol}/warp".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "shipSymbol" + "\\}", apiClient.escapeString(shipSymbol.toString()));

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
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "AgentToken" };

    GenericType<NavigateShip200Response> localVarReturnType = new GenericType<NavigateShip200Response>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
}
