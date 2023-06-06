package de.elbosso.spacetraders.client.api;

import de.elbosso.spacetraders.client.invoker.ApiException;
import de.elbosso.spacetraders.client.invoker.ApiClient;
import de.elbosso.spacetraders.client.invoker.Configuration;
import de.elbosso.spacetraders.client.invoker.Pair;

import javax.ws.rs.core.GenericType;

import de.elbosso.spacetraders.client.model.GetStatus200Response;
import de.elbosso.spacetraders.client.model.Register201Response;
import de.elbosso.spacetraders.client.model.RegisterRequest;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-06-05T09:25:51.979579Z[Etc/UTC]")
public class DefaultApi {
  private ApiClient apiClient;

  public DefaultApi() {
    this(Configuration.getDefaultApiClient());
  }

  public DefaultApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  /**
   * Get Status
   * Return the status of the game server.
   * @return a {@code GetStatus200Response}
   * @throws ApiException if fails to make API call
   */
  public GetStatus200Response getStatus() throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/".replaceAll("\\{format\\}","json");

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

    String[] localVarAuthNames = new String[] {  };

    GenericType<GetStatus200Response> localVarReturnType = new GenericType<GetStatus200Response>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Register New Agent
   * Creates a new agent and ties it to a temporary Account.  The agent symbol is a 3-14 character string that will represent your agent. This symbol will prefix the symbol of every ship you own. Agent symbols will be cast to all uppercase characters.  A new agent will be granted an authorization token, a contract with their starting faction, a command ship with a jump drive, and one hundred thousand credits.  &gt; #### Keep your token safe and secure &gt; &gt; Save your token during the alpha phase. There is no way to regenerate this token without starting a new agent. In the future you will be able to generate and manage your tokens from the SpaceTraders website.  You can accept your contract using the &#x60;/my/contracts/{contractId}/accept&#x60; endpoint. You will want to navigate your command ship to a nearby asteroid field and execute the &#x60;/my/ships/{shipSymbol}/extract&#x60; endpoint to mine various types of ores and minerals.  Return to the contract destination and execute the &#x60;/my/ships/{shipSymbol}/deliver&#x60; endpoint to deposit goods into the contract.  When your contract is fulfilled, you can call &#x60;/my/contracts/{contractId}/fulfill&#x60; to retrieve payment.
   * @param registerRequest  (optional)
   * @return a {@code Register201Response}
   * @throws ApiException if fails to make API call
   */
  public Register201Response register(RegisterRequest registerRequest) throws ApiException {
    Object localVarPostBody = registerRequest;
    
    // create path and map variables
    String localVarPath = "/register".replaceAll("\\{format\\}","json");

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

    String[] localVarAuthNames = new String[] {  };

    GenericType<Register201Response> localVarReturnType = new GenericType<Register201Response>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
}
