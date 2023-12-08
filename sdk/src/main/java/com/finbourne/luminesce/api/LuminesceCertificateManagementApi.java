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


import com.finbourne.luminesce.model.CertificateAction;
import com.finbourne.luminesce.model.CertificateState;
import com.finbourne.luminesce.model.CertificateType;
import java.time.OffsetDateTime;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LuminesceCertificateManagementApi {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public LuminesceCertificateManagementApi() {
        this(Configuration.getDefaultApiClient());
    }

    public LuminesceCertificateManagementApi(ApiClient apiClient) {
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

    private okhttp3.Call getCertificatesCall(final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/api/Certificate/certificates";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

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
    private okhttp3.Call getCertificatesValidateBeforeCall(final ApiCallback _callback) throws ApiException {
        return getCertificatesCall(_callback);

    }


    private ApiResponse<List<CertificateState>> getCertificatesWithHttpInfo() throws ApiException {
        okhttp3.Call localVarCall = getCertificatesValidateBeforeCall(null);
        Type localVarReturnType = new TypeToken<List<CertificateState>>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    private okhttp3.Call getCertificatesAsync(final ApiCallback<List<CertificateState>> _callback) throws ApiException {

        okhttp3.Call localVarCall = getCertificatesValidateBeforeCall(_callback);
        Type localVarReturnType = new TypeToken<List<CertificateState>>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    public class APIgetCertificatesRequest {

        private APIgetCertificatesRequest() {
        }

        /**
         * Build call for getCertificates
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
            return getCertificatesCall(_callback);
        }

        /**
         * Execute getCertificates request
         * @return List&lt;CertificateState&gt;
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
         </table>
         */
        public List<CertificateState> execute() throws ApiException {
            ApiResponse<List<CertificateState>> localVarResp = getCertificatesWithHttpInfo();
            return localVarResp.getData();
        }

        /**
         * Execute getCertificates request with HTTP info returned
         * @return ApiResponse&lt;List&lt;CertificateState&gt;&gt;
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
         </table>
         */
        public ApiResponse<List<CertificateState>> executeWithHttpInfo() throws ApiException {
            return getCertificatesWithHttpInfo();
        }

        /**
         * Execute getCertificates request (asynchronously)
         * @param _callback The callback to be executed when the API call finishes
         * @return The request call
         * @throws ApiException If fail to process the API call, e.g. serializing the request body object
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call executeAsync(final ApiCallback<List<CertificateState>> _callback) throws ApiException {
            return getCertificatesAsync(_callback);
        }
    }

    /**
     * [EXPERIMENTAL] GetCertificates: Shows Table and Field level information on Providers that are currently running that you have access to (in Json format)
     *  Lists all the certificates previously minted to which you have access.  The following error codes are to be anticipated with standard Problem Detail reports: - 401 Unauthorized 
     * @return APIgetCertificatesRequest
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
     </table>
     */
    public APIgetCertificatesRequest getCertificates() {
        return new APIgetCertificatesRequest();
    }
    private okhttp3.Call manageCertificateCall(CertificateAction action, CertificateType type, Integer version, OffsetDateTime validityStart, OffsetDateTime validityEnd, Boolean dryRun, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/api/Certificate/manage";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (action != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("action", action));
        }

        if (type != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("type", type));
        }

        if (version != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("version", version));
        }

        if (validityStart != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("validityStart", validityStart));
        }

        if (validityEnd != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("validityEnd", validityEnd));
        }

        if (dryRun != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("dryRun", dryRun));
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
        return localVarApiClient.buildCall(basePath, localVarPath, "PUT", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call manageCertificateValidateBeforeCall(CertificateAction action, CertificateType type, Integer version, OffsetDateTime validityStart, OffsetDateTime validityEnd, Boolean dryRun, final ApiCallback _callback) throws ApiException {
        return manageCertificateCall(action, type, version, validityStart, validityEnd, dryRun, _callback);

    }


    private ApiResponse<CertificateState> manageCertificateWithHttpInfo(CertificateAction action, CertificateType type, Integer version, OffsetDateTime validityStart, OffsetDateTime validityEnd, Boolean dryRun) throws ApiException {
        okhttp3.Call localVarCall = manageCertificateValidateBeforeCall(action, type, version, validityStart, validityEnd, dryRun, null);
        Type localVarReturnType = new TypeToken<CertificateState>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    private okhttp3.Call manageCertificateAsync(CertificateAction action, CertificateType type, Integer version, OffsetDateTime validityStart, OffsetDateTime validityEnd, Boolean dryRun, final ApiCallback<CertificateState> _callback) throws ApiException {

        okhttp3.Call localVarCall = manageCertificateValidateBeforeCall(action, type, version, validityStart, validityEnd, dryRun, _callback);
        Type localVarReturnType = new TypeToken<CertificateState>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    public class APImanageCertificateRequest {
        private CertificateAction action;
        private CertificateType type;
        private Integer version;
        private OffsetDateTime validityStart;
        private OffsetDateTime validityEnd;
        private Boolean dryRun;

        private APImanageCertificateRequest() {
        }

        /**
         * Set action
         * @param action The Action to perform, e.g. Create / Renew / Revoke (optional)
         * @return APImanageCertificateRequest
         */
        public APImanageCertificateRequest action(CertificateAction action) {
            this.action = action;
            return this;
        }

        /**
         * Set type
         * @param type User or Domain level cert (Domain level requires additional entitlements) (optional)
         * @return APImanageCertificateRequest
         */
        public APImanageCertificateRequest type(CertificateType type) {
            this.type = type;
            return this;
        }

        /**
         * Set version
         * @param version Version number of the cert, the request will fail to validate if incorrect (optional, default to 1)
         * @return APImanageCertificateRequest
         */
        public APImanageCertificateRequest version(Integer version) {
            this.version = version;
            return this;
        }

        /**
         * Set validityStart
         * @param validityStart When should the cert first be valid (defaults to the current time in UTC) (optional)
         * @return APImanageCertificateRequest
         */
        public APImanageCertificateRequest validityStart(OffsetDateTime validityStart) {
            this.validityStart = validityStart;
            return this;
        }

        /**
         * Set validityEnd
         * @param validityEnd When should the cert no longer be valid (defaults to 13 months from now) (optional)
         * @return APImanageCertificateRequest
         */
        public APImanageCertificateRequest validityEnd(OffsetDateTime validityEnd) {
            this.validityEnd = validityEnd;
            return this;
        }

        /**
         * Set dryRun
         * @param dryRun True will just validate the request, but perform no changes to any system (optional, default to true)
         * @return APImanageCertificateRequest
         */
        public APImanageCertificateRequest dryRun(Boolean dryRun) {
            this.dryRun = dryRun;
            return this;
        }

        /**
         * Build call for manageCertificate
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
            return manageCertificateCall(action, type, version, validityStart, validityEnd, dryRun, _callback);
        }

        /**
         * Execute manageCertificate request
         * @return CertificateState
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
         </table>
         */
        public CertificateState execute() throws ApiException {
            ApiResponse<CertificateState> localVarResp = manageCertificateWithHttpInfo(action, type, version, validityStart, validityEnd, dryRun);
            return localVarResp.getData();
        }

        /**
         * Execute manageCertificate request with HTTP info returned
         * @return ApiResponse&lt;CertificateState&gt;
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
         </table>
         */
        public ApiResponse<CertificateState> executeWithHttpInfo() throws ApiException {
            return manageCertificateWithHttpInfo(action, type, version, validityStart, validityEnd, dryRun);
        }

        /**
         * Execute manageCertificate request (asynchronously)
         * @param _callback The callback to be executed when the API call finishes
         * @return The request call
         * @throws ApiException If fail to process the API call, e.g. serializing the request body object
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call executeAsync(final ApiCallback<CertificateState> _callback) throws ApiException {
            return manageCertificateAsync(action, type, version, validityStart, validityEnd, dryRun, _callback);
        }
    }

    /**
     * [EXPERIMENTAL] ManageCertificate: Manages a new certificate (Create / Renew / Revoke)
     *  Manages a certificate. This could be creating a new one, renewing an old one or revoking one explicitly.  The following error codes are to be anticipated with standard Problem Detail reports: - 400 BadRequest - something about the request cannot be processed - 401 Unauthorized 
     * @return APImanageCertificateRequest
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
     </table>
     */
    public APImanageCertificateRequest manageCertificate() {
        return new APImanageCertificateRequest();
    }
}
