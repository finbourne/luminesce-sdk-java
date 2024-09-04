# BinaryDownloadingApi

All URIs are relative to *https://fbn-prd.lusid.com/honeycomb*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**downloadBinary**](BinaryDownloadingApi.md#downloadBinary) | **GET** /api/Download/download | [EXPERIMENTAL] DownloadBinary: Downloads the latest version (or specific if needs be) of the specified Luminesce Binary, given the required entitlements. |
| [**getBinaryVersions**](BinaryDownloadingApi.md#getBinaryVersions) | **GET** /api/Download/versions | [EXPERIMENTAL] GetBinaryVersions: Gets the list of available versions of a user-downloadable binary from Nexus |



## downloadBinary

> File downloadBinary(type, version)

[EXPERIMENTAL] DownloadBinary: Downloads the latest version (or specific if needs be) of the specified Luminesce Binary, given the required entitlements.

 Downloads the latest version (or specific if needs be) of the specified Luminesce Binary, given the required entitlements.  *NOTE:* This endpoint is an alternative to time-consuming manual distribution via Drive or Email. &gt; it relies on as underlying datastore that is not quite as \&quot;Highly Available\&quot; to the degree  &gt; that FINBOURNE services generally are.  &gt; Thus it is not subject to the same SLAs as other API endpoints are. &gt; *If you perceive an outage, please try again later.*  Once a file has been downloaded the following steps can be used to install it (for the dotnet tools at least):  1. Open a terminal and cd to the directory you downloaded it to 2. Install / extract files from that package via: &#x60;&#x60;&#x60; dotnet tool install NameOfFileWithoutVersionNumberOrExtension -g --add-source \&quot;.\&quot; &#x60;&#x60;&#x60; e.g. &#x60;&#x60;&#x60; dotnet tool install Finbourne.Luminesce.DbProviders.Oracle_Snowflake -g --add-source \&quot;.\&quot; &#x60;&#x60;&#x60; 3. Execute them (see documentation for specific binary)...  The installed binaries can then be found in - Windows - &#x60;%USERPROFILE%\\.dotnet\\tools\\.store\\&#x60; - Linux/macOS - &#x60;$HOME/.dotnet/tools/.store/&#x60;  The following error codes are to be anticipated with standard Problem Detail reports: - 400 BadRequest - binary file is not available for some reason (e.g. permissions or invalid version) - 401 Unauthorized - 403 Forbidden 

### Example

```java
import com.finbourne.luminesce.model.*;
import com.finbourne.luminesce.api.BinaryDownloadingApi;
import com.finbourne.luminesce.extensions.ApiConfigurationException;
import com.finbourne.luminesce.extensions.ApiFactoryBuilder;
import com.finbourne.luminesce.extensions.auth.FinbourneTokenException;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class BinaryDownloadingApiExample {

    public static void main(String[] args) throws FileNotFoundException, UnsupportedEncodingException, ApiConfigurationException, FinbourneTokenException {
        String fileName = "secrets.json";
        try(PrintWriter writer = new PrintWriter(fileName, "UTF-8")) {
          writer.write("{" +
            "\"api\": {" +
            "    \"tokenUrl\": \"<your-token-url>\"," +
            "    \"luminesceUrl\": \"https://<your-domain>.lusid.com/honeycomb\"," +
            "    \"username\": \"<your-username>\"," +
            "    \"password\": \"<your-password>\"," +
            "    \"clientId\": \"<your-client-id>\"," +
            "    \"clientSecret\": \"<your-client-secret>\"" +
            "  }" +
            "}");
        }

        // uncomment the below to use configuration overrides
        // ConfigurationOptions opts = new ConfigurationOptions();
        // opts.setTotalTimeoutMs(2000);
        
        // uncomment the below to use an api factory with overrides
        // ApiFactory apiFactory = ApiFactoryBuilder.build(fileName, opts);
        // BinaryDownloadingApi apiInstance = apiFactory.build(BinaryDownloadingApi.class);

        BinaryDownloadingApi apiInstance = ApiFactoryBuilder.build(fileName).build(BinaryDownloadingApi.class);
        LuminesceBinaryType type = LuminesceBinaryType.fromValue("CommandLineTool"); // LuminesceBinaryType | Type of binary to download (each requires separate licenses and entitlements)
        String version = "version_example"; // String | An explicit version of the binary. Leave blank to get the latest version (recommended)
        try {
            // uncomment the below to set overrides at the request level
            // File result = apiInstance.downloadBinary(type, version).execute(opts);

            File result = apiInstance.downloadBinary(type, version).execute();
            System.out.println(result.toJson());
        } catch (ApiException e) {
            System.err.println("Exception when calling BinaryDownloadingApi#downloadBinary");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **type** | [**LuminesceBinaryType**](.md)| Type of binary to download (each requires separate licenses and entitlements) | [optional] [enum: CommandLineTool, LocalFileSystem_Providers, Email_Providers, Python_Providers, AwsS3_Providers, Azure_Providers, SqlDb_Providers_Db2Linux, SqlDb_Providers_MySql, SqlDb_Providers_Oracle, SqlDb_Providers_Oracle_Snowflake, SqlDb_Providers_Postgresql, SqlDb_Providers_Snowflake, SqlDb_Providers_SqlServer, SqlDb_Providers_SybaseAse, SqlDb_Providers_SqLite, SqlDb_Providers_DuckDb, SqlDb_Providers_AwsDynamoDb, SqlDb_Providers_SqlServer_Oracle, Jdbc_Driver, PowerBi_Connector, Odbc_Win64_Driver] |
| **version** | **String**| An explicit version of the binary. Leave blank to get the latest version (recommended) | [optional] |

### Return type

[**File**](File.md)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/octet-stream, text/plain, application/json, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The .nupkg or .msi file of the requested binary |  -  |
| **400** | Bad Request |  -  |
| **403** | Forbidden |  -  |

[Back to top](#) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to Model list](../README.md#documentation-for-models) &#8226; [Back to README](../README.md)


## getBinaryVersions

> List&lt;String&gt; getBinaryVersions(type)

[EXPERIMENTAL] GetBinaryVersions: Gets the list of available versions of a user-downloadable binary from Nexus

 Gets all available versions of a given binary type (from newest to oldest) This does not mean you are entitled to download them.

### Example

```java
import com.finbourne.luminesce.model.*;
import com.finbourne.luminesce.api.BinaryDownloadingApi;
import com.finbourne.luminesce.extensions.ApiConfigurationException;
import com.finbourne.luminesce.extensions.ApiFactoryBuilder;
import com.finbourne.luminesce.extensions.auth.FinbourneTokenException;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class BinaryDownloadingApiExample {

    public static void main(String[] args) throws FileNotFoundException, UnsupportedEncodingException, ApiConfigurationException, FinbourneTokenException {
        String fileName = "secrets.json";
        try(PrintWriter writer = new PrintWriter(fileName, "UTF-8")) {
          writer.write("{" +
            "\"api\": {" +
            "    \"tokenUrl\": \"<your-token-url>\"," +
            "    \"luminesceUrl\": \"https://<your-domain>.lusid.com/honeycomb\"," +
            "    \"username\": \"<your-username>\"," +
            "    \"password\": \"<your-password>\"," +
            "    \"clientId\": \"<your-client-id>\"," +
            "    \"clientSecret\": \"<your-client-secret>\"" +
            "  }" +
            "}");
        }

        // uncomment the below to use configuration overrides
        // ConfigurationOptions opts = new ConfigurationOptions();
        // opts.setTotalTimeoutMs(2000);
        
        // uncomment the below to use an api factory with overrides
        // ApiFactory apiFactory = ApiFactoryBuilder.build(fileName, opts);
        // BinaryDownloadingApi apiInstance = apiFactory.build(BinaryDownloadingApi.class);

        BinaryDownloadingApi apiInstance = ApiFactoryBuilder.build(fileName).build(BinaryDownloadingApi.class);
        LuminesceBinaryType type = LuminesceBinaryType.fromValue("CommandLineTool"); // LuminesceBinaryType | Type of binary to fetch available versions of
        try {
            // uncomment the below to set overrides at the request level
            // List<String> result = apiInstance.getBinaryVersions(type).execute(opts);

            List<String> result = apiInstance.getBinaryVersions(type).execute();
            System.out.println(result.toJson());
        } catch (ApiException e) {
            System.err.println("Exception when calling BinaryDownloadingApi#getBinaryVersions");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **type** | [**LuminesceBinaryType**](.md)| Type of binary to fetch available versions of | [optional] [enum: CommandLineTool, LocalFileSystem_Providers, Email_Providers, Python_Providers, AwsS3_Providers, Azure_Providers, SqlDb_Providers_Db2Linux, SqlDb_Providers_MySql, SqlDb_Providers_Oracle, SqlDb_Providers_Oracle_Snowflake, SqlDb_Providers_Postgresql, SqlDb_Providers_Snowflake, SqlDb_Providers_SqlServer, SqlDb_Providers_SybaseAse, SqlDb_Providers_SqLite, SqlDb_Providers_DuckDb, SqlDb_Providers_AwsDynamoDb, SqlDb_Providers_SqlServer_Oracle, Jdbc_Driver, PowerBi_Connector, Odbc_Win64_Driver] |

### Return type

**List&lt;String&gt;**

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: text/plain, application/json, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **400** | Bad Request |  -  |
| **403** | Forbidden |  -  |

[Back to top](#) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to Model list](../README.md#documentation-for-models) &#8226; [Back to README](../README.md)

