package de.elbosso.spacetraders.client.api;

import de.elbosso.spacetraders.client.invoker.ApiException;
import de.elbosso.spacetraders.client.invoker.ApiClient;
import de.elbosso.spacetraders.client.invoker.Configuration;
import de.elbosso.spacetraders.client.invoker.Pair;

import javax.ws.rs.core.GenericType;

import de.elbosso.spacetraders.client.model.AcceptContract200Response;
import de.elbosso.spacetraders.client.model.DeliverContract200Response;
import de.elbosso.spacetraders.client.model.DeliverContractRequest;
import de.elbosso.spacetraders.client.model.FulfillContract200Response;
import de.elbosso.spacetraders.client.model.GetContract200Response;
import de.elbosso.spacetraders.client.model.GetContracts200Response;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-06-05T09:25:51.979579Z[Etc/UTC]")
public class ContractsApi {
  private ApiClient apiClient;

  public ContractsApi() {
    this(Configuration.getDefaultApiClient());
  }

  public ContractsApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  /**
   * Accept Contract
   * Accept a contract.
   * @param contractId  (required)
   * @return a {@code AcceptContract200Response}
   * @throws ApiException if fails to make API call
   */
  public AcceptContract200Response acceptContract(String contractId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'contractId' is set
    if (contractId == null) {
      throw new ApiException(400, "Missing the required parameter 'contractId' when calling acceptContract");
    }
    
    // create path and map variables
    String localVarPath = "/my/contracts/{contractId}/accept".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "contractId" + "\\}", apiClient.escapeString(contractId.toString()));

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

    GenericType<AcceptContract200Response> localVarReturnType = new GenericType<AcceptContract200Response>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Deliver Contract
   * Deliver cargo on a given contract.
   * @param contractId The ID of the contract (required)
   * @param deliverContractRequest  (optional)
   * @return a {@code DeliverContract200Response}
   * @throws ApiException if fails to make API call
   */
  public DeliverContract200Response deliverContract(String contractId, DeliverContractRequest deliverContractRequest) throws ApiException {
    Object localVarPostBody = deliverContractRequest;
    
    // verify the required parameter 'contractId' is set
    if (contractId == null) {
      throw new ApiException(400, "Missing the required parameter 'contractId' when calling deliverContract");
    }
    
    // create path and map variables
    String localVarPath = "/my/contracts/{contractId}/deliver".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "contractId" + "\\}", apiClient.escapeString(contractId.toString()));

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

    GenericType<DeliverContract200Response> localVarReturnType = new GenericType<DeliverContract200Response>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Fulfill Contract
   * Fulfill a contract
   * @param contractId The ID of the contract (required)
   * @return a {@code FulfillContract200Response}
   * @throws ApiException if fails to make API call
   */
  public FulfillContract200Response fulfillContract(String contractId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'contractId' is set
    if (contractId == null) {
      throw new ApiException(400, "Missing the required parameter 'contractId' when calling fulfillContract");
    }
    
    // create path and map variables
    String localVarPath = "/my/contracts/{contractId}/fulfill".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "contractId" + "\\}", apiClient.escapeString(contractId.toString()));

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

    GenericType<FulfillContract200Response> localVarReturnType = new GenericType<FulfillContract200Response>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Get Contract
   * Get the details of a contract by ID.
   * @param contractId The contract ID (required)
   * @return a {@code GetContract200Response}
   * @throws ApiException if fails to make API call
   */
  public GetContract200Response getContract(String contractId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'contractId' is set
    if (contractId == null) {
      throw new ApiException(400, "Missing the required parameter 'contractId' when calling getContract");
    }
    
    // create path and map variables
    String localVarPath = "/my/contracts/{contractId}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "contractId" + "\\}", apiClient.escapeString(contractId.toString()));

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

    GenericType<GetContract200Response> localVarReturnType = new GenericType<GetContract200Response>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * List Contracts
   * List all of your contracts.
   * @param page What entry offset to request (optional)
   * @param limit How many entries to return per page (optional)
   * @return a {@code GetContracts200Response}
   * @throws ApiException if fails to make API call
   */
  public GetContracts200Response getContracts(Integer page, Integer limit) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/my/contracts".replaceAll("\\{format\\}","json");

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

    GenericType<GetContracts200Response> localVarReturnType = new GenericType<GetContracts200Response>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
}
