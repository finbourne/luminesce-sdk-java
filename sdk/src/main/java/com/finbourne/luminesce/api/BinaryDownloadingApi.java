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


import java.io.File;
import com.finbourne.luminesce.model.LuminesceBinaryType;
import com.finbourne.luminesce.model.LusidProblemDetails;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BinaryDownloadingApi {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public BinaryDownloadingApi() {
        this(Configuration.getDefaultApiClient());
    }

    public BinaryDownloadingApi(ApiClient apiClient) {
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

    private okhttp3.Call downloadBinaryCall(LuminesceBinaryType type, String version, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/api/Download/download";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (type != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("type", type));
        }

        if (version != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("version", version));
        }

        final String[] localVarAccepts = {
            "application/octet-stream",
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
    private okhttp3.Call downloadBinaryValidateBeforeCall(LuminesceBinaryType type, String version, final ApiCallback _callback) throws ApiException {
        return downloadBinaryCall(type, version, _callback);

    }


    private ApiResponse<File> downloadBinaryWithHttpInfo(LuminesceBinaryType type, String version) throws ApiException {
        okhttp3.Call localVarCall = downloadBinaryValidateBeforeCall(type, version, null);
        Type localVarReturnType = new TypeToken<File>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    private okhttp3.Call downloadBinaryAsync(LuminesceBinaryType type, String version, final ApiCallback<File> _callback) throws ApiException {

        okhttp3.Call localVarCall = downloadBinaryValidateBeforeCall(type, version, _callback);
        Type localVarReturnType = new TypeToken<File>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    public class APIdownloadBinaryRequest {
        private LuminesceBinaryType type;
        private String version;

        private APIdownloadBinaryRequest() {
        }

        /**
         * Set type
         * @param type Type of binary to download (each requires separate licenses and entitlements) (optional)
         * @return APIdownloadBinaryRequest
         */
        public APIdownloadBinaryRequest type(LuminesceBinaryType type) {
            this.type = type;
            return this;
        }

        /**
         * Set version
         * @param version An explicit version of the binary. Leave blank to get the latest version (recommended) (optional)
         * @return APIdownloadBinaryRequest
         */
        public APIdownloadBinaryRequest version(String version) {
            this.version = version;
            return this;
        }

        /**
         * Build call for downloadBinary
         * @param _callback ApiCallback API callback
         * @return Call to execute
         * @throws ApiException If fail to serialize the request body object
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> The .nupkg file of the requested binary </td><td>  -  </td></tr>
            <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call buildCall(final ApiCallback _callback) throws ApiException {
            return downloadBinaryCall(type, version, _callback);
        }

        /**
         * Execute downloadBinary request
         * @return File
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> The .nupkg file of the requested binary </td><td>  -  </td></tr>
            <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
         </table>
         */
        public File execute() throws ApiException {
            ApiResponse<File> localVarResp = downloadBinaryWithHttpInfo(type, version);
            return localVarResp.getData();
        }

        /**
         * Execute downloadBinary request with HTTP info returned
         * @return ApiResponse&lt;File&gt;
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> The .nupkg file of the requested binary </td><td>  -  </td></tr>
            <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
         </table>
         */
        public ApiResponse<File> executeWithHttpInfo() throws ApiException {
            return downloadBinaryWithHttpInfo(type, version);
        }

        /**
         * Execute downloadBinary request (asynchronously)
         * @param _callback The callback to be executed when the API call finishes
         * @return The request call
         * @throws ApiException If fail to process the API call, e.g. serializing the request body object
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> The .nupkg file of the requested binary </td><td>  -  </td></tr>
            <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call executeAsync(final ApiCallback<File> _callback) throws ApiException {
            return downloadBinaryAsync(type, version, _callback);
        }
    }

    /**
     * [EXPERIMENTAL] DownloadBinary: Downloads the latest version (or specific if needs be) of the specified Luminesce Binary, given the required entitlements.
     *  Downloads the latest version (or specific if needs be) of the specified Luminesce Binary, given the required entitlements.  *NOTE:* This endpoint is an alternative to time-consuming manual distribution via Drive or Email. &gt; it relies on as underlying datastore that is not quite as \&quot;Highly Available\&quot; to the degree  &gt; that FINBOURNE services generally are.  &gt; Thus it is not subject to the same SLAs as other API endpoints are. &gt; *If you perceive an outage, please try again later.*  Once a file has been downloaded the following steps can be used to install it (for the dotnet tools at least):  1. Open a terminal and cd to the directory you downloaded it to 2. Install / extract files from that package via: &#x60;&#x60;&#x60; dotnet tool install NameOfFileWithoutVersionNumberOrExtension -g --add-source \&quot;.\&quot; &#x60;&#x60;&#x60; e.g. &#x60;&#x60;&#x60; dotnet tool install Finbourne.Luminesce.DbProviders.Oracle_Snowflake -g --add-source \&quot;.\&quot; &#x60;&#x60;&#x60; 3. Execute them (see documentation for specific binary)...  The installed binaries can then be found in - Windows - &#x60;%USERPROFILE%\\.dotnet\\tools\\.store\\&#x60; - Linux/macOS - &#x60;$HOME/.dotnet/tools/.store/&#x60;  The following error codes are to be anticipated with standard Problem Detail reports: - 400 BadRequest - binary file is not available for some reason (e.g. permissions or invalid version) - 401 Unauthorized 
     * @return APIdownloadBinaryRequest
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> The .nupkg file of the requested binary </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
     </table>
     */
    public APIdownloadBinaryRequest downloadBinary() {
        return new APIdownloadBinaryRequest();
    }
}
