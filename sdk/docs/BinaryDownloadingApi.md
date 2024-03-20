# BinaryDownloadingApi

All URIs are relative to *https://fbn-prd.lusid.com/honeycomb*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**downloadBinary**](BinaryDownloadingApi.md#downloadBinary) | **GET** /api/Download/download | [EXPERIMENTAL] DownloadBinary: Downloads the latest version (or specific if needs be) of the specified Luminesce Binary, given the required entitlements. |


<a id="downloadBinary"></a>
# **downloadBinary**
> File downloadBinary().type(type).version(version).execute();

[EXPERIMENTAL] DownloadBinary: Downloads the latest version (or specific if needs be) of the specified Luminesce Binary, given the required entitlements.

 Downloads the latest version (or specific if needs be) of the specified Luminesce Binary, given the required entitlements.  *NOTE:* This endpoint is an alternative to time-consuming manual distribution via Drive or Email. &gt; it relies on as underlying datastore that is not quite as \&quot;Highly Available\&quot; to the degree  &gt; that FINBOURNE services generally are.  &gt; Thus it is not subject to the same SLAs as other API endpoints are. &gt; *If you perceive an outage, please try again later.*  Once a file has been downloaded the following steps can be used to install it (for the dotnet tools at least):  1. Open a terminal and cd to the directory you downloaded it to 2. Install / extract files from that package via: &#x60;&#x60;&#x60; dotnet tool install NameOfFileWithoutVersionNumberOrExtension -g --add-source \&quot;.\&quot; &#x60;&#x60;&#x60; e.g. &#x60;&#x60;&#x60; dotnet tool install Finbourne.Luminesce.DbProviders.Oracle_Snowflake -g --add-source \&quot;.\&quot; &#x60;&#x60;&#x60; 3. Execute them (see documentation for specific binary)...  The installed binaries can then be found in - Windows - &#x60;%USERPROFILE%\\.dotnet\\tools\\.store\\&#x60; - Linux/macOS - &#x60;$HOME/.dotnet/tools/.store/&#x60;  The following error codes are to be anticipated with standard Problem Detail reports: - 400 BadRequest - binary file is not available for some reason (e.g. permissions or invalid version) - 401 Unauthorized 

### Example
```java
// Import classes:
import com.finbourne.luminesce.ApiClient;
import com.finbourne.luminesce.ApiException;
import com.finbourne.luminesce.Configuration;
import com.finbourne.luminesce.auth.*;
import com.finbourne.luminesce.models.*;
import com.finbourne.luminesce.api.BinaryDownloadingApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://fbn-prd.lusid.com/honeycomb");
    
    // Configure OAuth2 access token for authorization: oauth2
    OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
    oauth2.setAccessToken("YOUR ACCESS TOKEN");

    BinaryDownloadingApi apiInstance = new BinaryDownloadingApi(defaultClient);
    LuminesceBinaryType type = LuminesceBinaryType.fromValue("CommandLineTool"); // LuminesceBinaryType | Type of binary to download (each requires separate licenses and entitlements)
    String version = "version_example"; // String | An explicit version of the binary. Leave blank to get the latest version (recommended)
    try {
      File result = apiInstance.downloadBinary()
            .type(type)
            .version(version)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BinaryDownloadingApi#downloadBinary");
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
| **type** | [**LuminesceBinaryType**](.md)| Type of binary to download (each requires separate licenses and entitlements) | [optional] [enum: CommandLineTool, LocalFileSystem_Providers, Email_Providers, Python_Providers, AwsS3_Providers, Azure_Providers, SqlDb_Providers_Db2Linux, SqlDb_Providers_MySql, SqlDb_Providers_Oracle, SqlDb_Providers_Oracle_Snowflake, SqlDb_Providers_Postgresql, SqlDb_Providers_Snowflake, SqlDb_Providers_SqlServer, SqlDb_Providers_SybaseAse, SqlDb_Providers_SqLite, SqlDb_Providers_DuckDb, Jdbc_Driver, PowerBi_Connector, Odbc_Win64_Driver] |
| **version** | **String**| An explicit version of the binary. Leave blank to get the latest version (recommended) | [optional] |

### Return type

[**File**](File.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/octet-stream, text/plain, application/json, text/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The .nupkg file of the requested binary |  -  |
| **400** | Bad Request |  -  |

