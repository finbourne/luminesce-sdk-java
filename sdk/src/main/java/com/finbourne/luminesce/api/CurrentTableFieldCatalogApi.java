/*
 * FINBOURNE Luminesce Web API
 *
 * Contact: info@finbourne.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package com.finbourne.luminesce.api;

import com.finbourne.luminesce.ApiCallback;
import com.finbourne.luminesce.ApiClient;
import com.finbourne.luminesce.ApiException;
import com.finbourne.luminesce.ApiResponse;
import com.finbourne.luminesce.Configuration;
import com.finbourne.luminesce.Pair;
import com.finbourne.luminesce.ProgressRequestBody;
import com.finbourne.luminesce.ProgressResponseBody;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;



import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CurrentTableFieldCatalogApi {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public CurrentTableFieldCatalogApi() {
        this(Configuration.getDefaultApiClient());
    }

    public CurrentTableFieldCatalogApi(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return localVarApiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public int getHostIndex() {
        return localHostIndex;
    }

    public void setHostIndex(int hostIndex) {
        this.localHostIndex = hostIndex;
    }

    public String getCustomBaseUrl() {
        return localCustomBaseUrl;
    }

    public void setCustomBaseUrl(String customBaseUrl) {
        this.localCustomBaseUrl = customBaseUrl;
    }

    private okhttp3.Call getCatalogCall(String freeTextSearch, Boolean jsonProper, Boolean useCache, final ApiCallback _callback) throws ApiException {
        String basePath = null;
        // Operation Servers
        String[] localBasePaths = new String[] {  };

        // Determine Base Path to Use
        if (localCustomBaseUrl != null){
            basePath = localCustomBaseUrl;
        } else if ( localBasePaths.length > 0 ) {
            basePath = localBasePaths[localHostIndex];
        } else {
            basePath = null;
        }

        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/api/Catalog";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (freeTextSearch != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("freeTextSearch", freeTextSearch));
        }

        if (jsonProper != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("jsonProper", jsonProper));
        }

        if (useCache != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("useCache", useCache));
        }

        final String[] localVarAccepts = {
            "text/plain",
            "application/json",
            "text/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] { "oauth2" };
        return localVarApiClient.buildCall(basePath, localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call getCatalogValidateBeforeCall(String freeTextSearch, Boolean jsonProper, Boolean useCache, final ApiCallback _callback) throws ApiException {
        return getCatalogCall(freeTextSearch, jsonProper, useCache, _callback);

    }


    private ApiResponse<String> getCatalogWithHttpInfo(String freeTextSearch, Boolean jsonProper, Boolean useCache) throws ApiException {
        okhttp3.Call localVarCall = getCatalogValidateBeforeCall(freeTextSearch, jsonProper, useCache, null);
        Type localVarReturnType = new TypeToken<String>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    private okhttp3.Call getCatalogAsync(String freeTextSearch, Boolean jsonProper, Boolean useCache, final ApiCallback<String> _callback) throws ApiException {

        okhttp3.Call localVarCall = getCatalogValidateBeforeCall(freeTextSearch, jsonProper, useCache, _callback);
        Type localVarReturnType = new TypeToken<String>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    public class APIgetCatalogRequest {
        private String freeTextSearch;
        private Boolean jsonProper;
        private Boolean useCache;

        private APIgetCatalogRequest() {
        }

        /**
         * Set freeTextSearch
         * @param freeTextSearch Limit the catalog to only things in some way dealing with the passed in text string (optional)
         * @return APIgetCatalogRequest
         */
        public APIgetCatalogRequest freeTextSearch(String freeTextSearch) {
            this.freeTextSearch = freeTextSearch;
            return this;
        }

        /**
         * Set jsonProper
         * @param jsonProper Should this be text/json (not json-encoded-as-a-string) (optional, default to false)
         * @return APIgetCatalogRequest
         */
        public APIgetCatalogRequest jsonProper(Boolean jsonProper) {
            this.jsonProper = jsonProper;
            return this;
        }

        /**
         * Set useCache
         * @param useCache Should the available cache be used? false is effectively to pick up a change in the catalog (optional, default to false)
         * @return APIgetCatalogRequest
         */
        public APIgetCatalogRequest useCache(Boolean useCache) {
            this.useCache = useCache;
            return this;
        }

        /**
         * Build call for getCatalog
         * @param _callback ApiCallback API callback
         * @return Call to execute
         * @throws ApiException If fail to serialize the request body object
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call buildCall(final ApiCallback _callback) throws ApiException {
            return getCatalogCall(freeTextSearch, jsonProper, useCache, _callback);
        }

        /**
         * Execute getCatalog request
         * @return String
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
         </table>
         */
        public String execute() throws ApiException {
            ApiResponse<String> localVarResp = getCatalogWithHttpInfo(freeTextSearch, jsonProper, useCache);
            return localVarResp.getData();
        }

        /**
         * Execute getCatalog request with HTTP info returned
         * @return ApiResponse&lt;String&gt;
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
         </table>
         */
        public ApiResponse<String> executeWithHttpInfo() throws ApiException {
            return getCatalogWithHttpInfo(freeTextSearch, jsonProper, useCache);
        }

        /**
         * Execute getCatalog request (asynchronously)
         * @param _callback The callback to be executed when the API call finishes
         * @return The request call
         * @throws ApiException If fail to process the API call, e.g. serializing the request body object
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call executeAsync(final ApiCallback<String> _callback) throws ApiException {
            return getCatalogAsync(freeTextSearch, jsonProper, useCache, _callback);
        }
    }

    /**
     * GetCatalog: Shows Table and Field level information on Providers that are currently running that you have access to (in Json format)
     *  Returns the User&#39;s full version of the catalog (Providers and their fields)  The following error codes are to be anticipated with standard Problem Detail reports: - 401 Unauthorized - 403 Forbidden 
     * @return APIgetCatalogRequest
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
     </table>
     */
    public APIgetCatalogRequest getCatalog() {
        return new APIgetCatalogRequest();
    }
    private okhttp3.Call getFieldsCall(String tableLike, final ApiCallback _callback) throws ApiException {
        String basePath = null;
        // Operation Servers
        String[] localBasePaths = new String[] {  };

        // Determine Base Path to Use
        if (localCustomBaseUrl != null){
            basePath = localCustomBaseUrl;
        } else if ( localBasePaths.length > 0 ) {
            basePath = localBasePaths[localHostIndex];
        } else {
            basePath = null;
        }

        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/api/Catalog/fields";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (tableLike != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("tableLike", tableLike));
        }

        final String[] localVarAccepts = {
            "text/plain",
            "application/json",
            "text/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] { "oauth2" };
        return localVarApiClient.buildCall(basePath, localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call getFieldsValidateBeforeCall(String tableLike, final ApiCallback _callback) throws ApiException {
        return getFieldsCall(tableLike, _callback);

    }


    private ApiResponse<String> getFieldsWithHttpInfo(String tableLike) throws ApiException {
        okhttp3.Call localVarCall = getFieldsValidateBeforeCall(tableLike, null);
        Type localVarReturnType = new TypeToken<String>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    private okhttp3.Call getFieldsAsync(String tableLike, final ApiCallback<String> _callback) throws ApiException {

        okhttp3.Call localVarCall = getFieldsValidateBeforeCall(tableLike, _callback);
        Type localVarReturnType = new TypeToken<String>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    public class APIgetFieldsRequest {
        private String tableLike;

        private APIgetFieldsRequest() {
        }

        /**
         * Set tableLike
         * @param tableLike  (optional, default to %)
         * @return APIgetFieldsRequest
         */
        public APIgetFieldsRequest tableLike(String tableLike) {
            this.tableLike = tableLike;
            return this;
        }

        /**
         * Build call for getFields
         * @param _callback ApiCallback API callback
         * @return Call to execute
         * @throws ApiException If fail to serialize the request body object
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call buildCall(final ApiCallback _callback) throws ApiException {
            return getFieldsCall(tableLike, _callback);
        }

        /**
         * Execute getFields request
         * @return String
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
         </table>
         */
        public String execute() throws ApiException {
            ApiResponse<String> localVarResp = getFieldsWithHttpInfo(tableLike);
            return localVarResp.getData();
        }

        /**
         * Execute getFields request with HTTP info returned
         * @return ApiResponse&lt;String&gt;
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
         </table>
         */
        public ApiResponse<String> executeWithHttpInfo() throws ApiException {
            return getFieldsWithHttpInfo(tableLike);
        }

        /**
         * Execute getFields request (asynchronously)
         * @param _callback The callback to be executed when the API call finishes
         * @return The request call
         * @throws ApiException If fail to process the API call, e.g. serializing the request body object
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call executeAsync(final ApiCallback<String> _callback) throws ApiException {
            return getFieldsAsync(tableLike, _callback);
        }
    }

    /**
     * GetFields: Shows Table level information on Providers that are currently running that you have access to (in Json format)
     *  Returns the User&#39;s full version of the catalog but only the field/parameter-level information  (as well as the TableName they refer to, of course) for tables matching the &#x60;tableLike&#x60; (manually include wildcards if desired).  The following error codes are to be anticipated with standard Problem Detail reports: - 401 Unauthorized - 403 Forbidden 
     * @return APIgetFieldsRequest
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
     </table>
     */
    public APIgetFieldsRequest getFields() {
        return new APIgetFieldsRequest();
    }
    private okhttp3.Call getProvidersCall(String freeTextSearch, Boolean useCache, final ApiCallback _callback) throws ApiException {
        String basePath = null;
        // Operation Servers
        String[] localBasePaths = new String[] {  };

        // Determine Base Path to Use
        if (localCustomBaseUrl != null){
            basePath = localCustomBaseUrl;
        } else if ( localBasePaths.length > 0 ) {
            basePath = localBasePaths[localHostIndex];
        } else {
            basePath = null;
        }

        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/api/Catalog/providers";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (freeTextSearch != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("freeTextSearch", freeTextSearch));
        }

        if (useCache != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("useCache", useCache));
        }

        final String[] localVarAccepts = {
            "text/plain",
            "application/json",
            "text/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] { "oauth2" };
        return localVarApiClient.buildCall(basePath, localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call getProvidersValidateBeforeCall(String freeTextSearch, Boolean useCache, final ApiCallback _callback) throws ApiException {
        return getProvidersCall(freeTextSearch, useCache, _callback);

    }


    private ApiResponse<String> getProvidersWithHttpInfo(String freeTextSearch, Boolean useCache) throws ApiException {
        okhttp3.Call localVarCall = getProvidersValidateBeforeCall(freeTextSearch, useCache, null);
        Type localVarReturnType = new TypeToken<String>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    private okhttp3.Call getProvidersAsync(String freeTextSearch, Boolean useCache, final ApiCallback<String> _callback) throws ApiException {

        okhttp3.Call localVarCall = getProvidersValidateBeforeCall(freeTextSearch, useCache, _callback);
        Type localVarReturnType = new TypeToken<String>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    public class APIgetProvidersRequest {
        private String freeTextSearch;
        private Boolean useCache;

        private APIgetProvidersRequest() {
        }

        /**
         * Set freeTextSearch
         * @param freeTextSearch Limit the catalog to only things in some way dealing with the passed in text string (optional)
         * @return APIgetProvidersRequest
         */
        public APIgetProvidersRequest freeTextSearch(String freeTextSearch) {
            this.freeTextSearch = freeTextSearch;
            return this;
        }

        /**
         * Set useCache
         * @param useCache Should the available cache be used? false is effectively to pick up a change in the catalog (optional, default to true)
         * @return APIgetProvidersRequest
         */
        public APIgetProvidersRequest useCache(Boolean useCache) {
            this.useCache = useCache;
            return this;
        }

        /**
         * Build call for getProviders
         * @param _callback ApiCallback API callback
         * @return Call to execute
         * @throws ApiException If fail to serialize the request body object
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call buildCall(final ApiCallback _callback) throws ApiException {
            return getProvidersCall(freeTextSearch, useCache, _callback);
        }

        /**
         * Execute getProviders request
         * @return String
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
         </table>
         */
        public String execute() throws ApiException {
            ApiResponse<String> localVarResp = getProvidersWithHttpInfo(freeTextSearch, useCache);
            return localVarResp.getData();
        }

        /**
         * Execute getProviders request with HTTP info returned
         * @return ApiResponse&lt;String&gt;
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
         </table>
         */
        public ApiResponse<String> executeWithHttpInfo() throws ApiException {
            return getProvidersWithHttpInfo(freeTextSearch, useCache);
        }

        /**
         * Execute getProviders request (asynchronously)
         * @param _callback The callback to be executed when the API call finishes
         * @return The request call
         * @throws ApiException If fail to process the API call, e.g. serializing the request body object
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call executeAsync(final ApiCallback<String> _callback) throws ApiException {
            return getProvidersAsync(freeTextSearch, useCache, _callback);
        }
    }

    /**
     * GetProviders: Shows Table level information on Providers that are currently running that you have access to (in Json format)
     *  Returns the User&#39;s full version of the catalog but only the table/provider-level information  The following error codes are to be anticipated with standard Problem Detail reports: - 401 Unauthorized - 403 Forbidden 
     * @return APIgetProvidersRequest
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
     </table>
     */
    public APIgetProvidersRequest getProviders() {
        return new APIgetProvidersRequest();
    }
}
