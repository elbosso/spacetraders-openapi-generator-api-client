package de.elbosso.spacetraders.client.api;

import de.elbosso.spacetraders.client.invoker.ApiException;
import de.elbosso.spacetraders.client.invoker.ApiClient;
import de.elbosso.spacetraders.client.invoker.Configuration;
import de.elbosso.spacetraders.client.invoker.Pair;

import javax.ws.rs.core.GenericType;

import de.elbosso.spacetraders.client.model.GetFaction200Response;
import de.elbosso.spacetraders.client.model.GetFactions200Response;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-06-05T09:25:51.979579Z[Etc/UTC]")
public class FactionsApi {
  private ApiClient apiClient;

  public FactionsApi() {
    this(Configuration.getDefaultApiClient());
  }

  public FactionsApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  /**
   * Get Faction
   * View the details of a faction.
   * @param factionSymbol The faction symbol (required)
   * @return a {@code GetFaction200Response}
   * @throws ApiException if fails to make API call
   */
  public GetFaction200Response getFaction(String factionSymbol) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'factionSymbol' is set
    if (factionSymbol == null) {
      throw new ApiException(400, "Missing the required parameter 'factionSymbol' when calling getFaction");
    }
    
    // create path and map variables
    String localVarPath = "/factions/{factionSymbol}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "factionSymbol" + "\\}", apiClient.escapeString(factionSymbol.toString()));

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

    GenericType<GetFaction200Response> localVarReturnType = new GenericType<GetFaction200Response>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * List Factions
   * List all discovered factions in the game.
   * @param page What entry offset to request (optional)
   * @param limit How many entries to return per page (optional)
   * @return a {@code GetFactions200Response}
   * @throws ApiException if fails to make API call
   */
  public GetFactions200Response getFactions(Integer page, Integer limit) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/factions".replaceAll("\\{format\\}","json");

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

    GenericType<GetFactions200Response> localVarReturnType = new GenericType<GetFactions200Response>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
}
