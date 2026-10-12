# MultiQueryExecutionApi

All URIs are relative to *https://fbn-prd.lusid.com/honeycomb*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**cancelMultiQuery**](MultiQueryExecutionApi.md#cancelMultiQuery) | **DELETE** /api/MultiQueryBackground/{executionId} | CancelMultiQuery: Cancel / Clear a previously started query-set |
| [**downloadMultiQueryResults**](MultiQueryExecutionApi.md#downloadMultiQueryResults) | **GET** /api/MultiQueryBackground/{executionId}/download | [EXPERIMENTAL] DownloadMultiQueryResults: Downloads the results of a custom query-set as one file |
| [**getProgressOfMultiQuery**](MultiQueryExecutionApi.md#getProgressOfMultiQuery) | **GET** /api/MultiQueryBackground/{executionId} | GetProgressOfMultiQuery: View progress of the entire query-set load |
| [**listCustomQueries**](MultiQueryExecutionApi.md#listCustomQueries) | **GET** /api/MultiQueryBackground | [EXPERIMENTAL] ListCustomQueries: List the custom query-sets available to the calling user |
| [**saveMultiQueryResultsToDrive**](MultiQueryExecutionApi.md#saveMultiQueryResultsToDrive) | **GET** /api/MultiQueryBackground/{executionId}/drive | [EXPERIMENTAL] SaveMultiQueryResultsToDrive: Saves the results of a custom query-set directly to Drive, as one file |
| [**startCustomQueries**](MultiQueryExecutionApi.md#startCustomQueries) | **PUT** /api/MultiQueryBackground/custom | [EXPERIMENTAL] StartCustomQueries: Run a caller-supplied set of Sql queries in the background |
| [**startQueries**](MultiQueryExecutionApi.md#startQueries) | **PUT** /api/MultiQueryBackground | StartQueries: Run a given set of Sql queries in the background |



## cancelMultiQuery

> BackgroundQueryCancelResponse cancelMultiQuery(executionId)

CancelMultiQuery: Cancel / Clear a previously started query-set

Cancel the query-set (if still running) / clear the data (if already returned) The following error codes are to be anticipated with standard Problem Detail reports: - 401 Unauthorized - 403 Forbidden - 404 Not Found : The requested query result doesn&#39;t exist and is not running. 

### Example

```java
import com.finbourne.luminesce.model.*;
import com.finbourne.luminesce.api.MultiQueryExecutionApi;
import com.finbourne.luminesce.extensions.ApiConfigurationException;
import com.finbourne.luminesce.extensions.ApiFactoryBuilder;
import com.finbourne.luminesce.extensions.auth.FinbourneTokenException;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class MultiQueryExecutionApiExample {

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
        // MultiQueryExecutionApi apiInstance = apiFactory.build(MultiQueryExecutionApi.class);

        MultiQueryExecutionApi apiInstance = ApiFactoryBuilder.build(fileName).build(MultiQueryExecutionApi.class);
        String executionId = "executionId_example"; // String | ExecutionId returned when starting the query
        try {
            // uncomment the below to set overrides at the request level
            // BackgroundQueryCancelResponse result = apiInstance.cancelMultiQuery(executionId).execute(opts);

            BackgroundQueryCancelResponse result = apiInstance.cancelMultiQuery(executionId).execute();
            System.out.println(result.toJson());
        } catch (ApiException e) {
            System.err.println("Exception when calling MultiQueryExecutionApi#cancelMultiQuery");
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
| **executionId** | **String**| ExecutionId returned when starting the query | |

### Return type

[**BackgroundQueryCancelResponse**](BackgroundQueryCancelResponse.md)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: text/plain, application/json, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

[Back to top](#) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to Model list](../README.md#documentation-for-models) &#8226; [Back to README](../README.md)


## downloadMultiQueryResults

> File downloadMultiQueryResults(executionId, format, fileName, dateTimeFormat, loadWaitMilliseconds)

[EXPERIMENTAL] DownloadMultiQueryResults: Downloads the results of a custom query-set as one file

Exports the results of all the queries of a custom query-set (other than those which are not external results) as one file. Queries that failed, or were skipped as a query they depend on failed, are left out - though if none succeeded there is nothing to export.  The following error codes are to be anticipated most with standard Problem Detail reports: - 400 BadRequest : no query succeeded, or a placeholder or Drive parameter was incorrect in some way - 401 Unauthorized - 403 Forbidden - 404 Not Found : The requested query-set doesn&#39;t exist, isn&#39;t a custom one, or the calling user did not run it. - 429 Too Many Requests : Please try your request again soon  1. The query has been executed successfully in the past yet the server-instance receiving this request (e.g. from a load balancer) doesn&#39;t yet have this data available.  1. By virtue of the request you have just placed this will have started to load from the persisted cache and will soon be available.  1. It is also the case that the original server-instance to process the original query is likely to already be able to service this request.

### Example

```java
import com.finbourne.luminesce.model.*;
import com.finbourne.luminesce.api.MultiQueryExecutionApi;
import com.finbourne.luminesce.extensions.ApiConfigurationException;
import com.finbourne.luminesce.extensions.ApiFactoryBuilder;
import com.finbourne.luminesce.extensions.auth.FinbourneTokenException;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class MultiQueryExecutionApiExample {

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
        // MultiQueryExecutionApi apiInstance = apiFactory.build(MultiQueryExecutionApi.class);

        MultiQueryExecutionApi apiInstance = ApiFactoryBuilder.build(fileName).build(MultiQueryExecutionApi.class);
        String executionId = "executionId_example"; // String | ExecutionId returned when starting the query-set
        ExportType format = ExportType.fromValue("csv"); // ExportType | Format to download in. Several results are one worksheet each for Excel, one table each for Sqlite, and otherwise one file each within a zip.
        String fileName = "fileName_example"; // String | Name of the file (without extension). Defaults to `{executionId}`. May contain the placeholders `{executionId}`, `{date:format}` (when the queries started, UTC, e.g. `{date:yyyyMMdd}`) and `{param:name}` (the value of a scalar parameter).
        String dateTimeFormat = "dateTimeFormat_example"; // String | Format to apply for DateTime data, leaving blank gives the Luminesce Exporter default, currently `yyyy-MM-dd HH:mm:ss.fff`
        Integer loadWaitMilliseconds = 0; // Integer | Optional maximum additional wait period for post execution platform processing.
        try {
            // uncomment the below to set overrides at the request level
            // File result = apiInstance.downloadMultiQueryResults(executionId, format, fileName, dateTimeFormat, loadWaitMilliseconds).execute(opts);

            File result = apiInstance.downloadMultiQueryResults(executionId, format, fileName, dateTimeFormat, loadWaitMilliseconds).execute();
            System.out.println(result.toJson());
        } catch (ApiException e) {
            System.err.println("Exception when calling MultiQueryExecutionApi#downloadMultiQueryResults");
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
| **executionId** | **String**| ExecutionId returned when starting the query-set | |
| **format** | [**ExportType**](.md)| Format to download in. Several results are one worksheet each for Excel, one table each for Sqlite, and otherwise one file each within a zip. | [optional] [enum: csv, pipe, excel, json, jsonProper, xml, parquet, sqlite, TableInternal, jsonProperWithLineage, pdf] |
| **fileName** | **String**| Name of the file (without extension). Defaults to &#x60;{executionId}&#x60;. May contain the placeholders &#x60;{executionId}&#x60;, &#x60;{date:format}&#x60; (when the queries started, UTC, e.g. &#x60;{date:yyyyMMdd}&#x60;) and &#x60;{param:name}&#x60; (the value of a scalar parameter). | [optional] |
| **dateTimeFormat** | **String**| Format to apply for DateTime data, leaving blank gives the Luminesce Exporter default, currently &#x60;yyyy-MM-dd HH:mm:ss.fff&#x60; | [optional] |
| **loadWaitMilliseconds** | **Integer**| Optional maximum additional wait period for post execution platform processing. | [optional] [default to 0] |

### Return type

[**File**](File.md)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: text/plain, application/json, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | Bad Request |  -  |
| **403** | Forbidden |  -  |

[Back to top](#) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to Model list](../README.md#documentation-for-models) &#8226; [Back to README](../README.md)


## getProgressOfMultiQuery

> BackgroundMultiQueryProgressResponse getProgressOfMultiQuery(executionId)

GetProgressOfMultiQuery: View progress of the entire query-set load

View progress information (up until this point) for the entire query-set The following error codes are to be anticipated with standard Problem Detail reports: - 401 Unauthorized - 403 Forbidden - 404 Not Found : The requested query result doesn&#39;t exist and is not running. - 429 Too Many Requests : Please try your request again soon  1. The query has been executed successfully in the past yet the server-instance receiving this request (e.g. from a load balancer) doesn&#39;t yet have this data available.  1. By virtue of the request you have just placed this will have started to load from the persisted cache and will soon be available.  1. It is also the case that the original server-instance to process the original query is likely to already be able to service this request.

### Example

```java
import com.finbourne.luminesce.model.*;
import com.finbourne.luminesce.api.MultiQueryExecutionApi;
import com.finbourne.luminesce.extensions.ApiConfigurationException;
import com.finbourne.luminesce.extensions.ApiFactoryBuilder;
import com.finbourne.luminesce.extensions.auth.FinbourneTokenException;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class MultiQueryExecutionApiExample {

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
        // MultiQueryExecutionApi apiInstance = apiFactory.build(MultiQueryExecutionApi.class);

        MultiQueryExecutionApi apiInstance = ApiFactoryBuilder.build(fileName).build(MultiQueryExecutionApi.class);
        String executionId = "executionId_example"; // String | ExecutionId returned when starting the query
        try {
            // uncomment the below to set overrides at the request level
            // BackgroundMultiQueryProgressResponse result = apiInstance.getProgressOfMultiQuery(executionId).execute(opts);

            BackgroundMultiQueryProgressResponse result = apiInstance.getProgressOfMultiQuery(executionId).execute();
            System.out.println(result.toJson());
        } catch (ApiException e) {
            System.err.println("Exception when calling MultiQueryExecutionApi#getProgressOfMultiQuery");
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
| **executionId** | **String**| ExecutionId returned when starting the query | |

### Return type

[**BackgroundMultiQueryProgressResponse**](BackgroundMultiQueryProgressResponse.md)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: text/plain, application/json, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

[Back to top](#) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to Model list](../README.md#documentation-for-models) &#8226; [Back to README](../README.md)


## listCustomQueries

> List&lt;CustomMultiQueryListItem&gt; listCustomQueries(sqlLike)

[EXPERIMENTAL] ListCustomQueries: List the custom query-sets available to the calling user

Lists the custom query-sets (started by the calling user via &#x60;custom&#x60;) that have finished with at least one result which may be fetched,  and which have not yet passed their &#x60;keepForSeconds&#x60; time, most recent first. Each lists its queries that are external results, and which of those have results. Those that errored are included, as some of their queries may still have succeeded.  The following error codes are to be anticipated most with standard Problem Detail reports: - 401 Unauthorized

### Example

```java
import com.finbourne.luminesce.model.*;
import com.finbourne.luminesce.api.MultiQueryExecutionApi;
import com.finbourne.luminesce.extensions.ApiConfigurationException;
import com.finbourne.luminesce.extensions.ApiFactoryBuilder;
import com.finbourne.luminesce.extensions.auth.FinbourneTokenException;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class MultiQueryExecutionApiExample {

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
        // MultiQueryExecutionApi apiInstance = apiFactory.build(MultiQueryExecutionApi.class);

        MultiQueryExecutionApi apiInstance = ApiFactoryBuilder.build(fileName).build(MultiQueryExecutionApi.class);
        String sqlLike = "sqlLike_example"; // String | An optional SQL-LIKE style filter on the LuminesceSql of the queries (manually include wildcards if desired), a query-set matching should any of its queries.
        try {
            // uncomment the below to set overrides at the request level
            // List<CustomMultiQueryListItem> result = apiInstance.listCustomQueries(sqlLike).execute(opts);

            List<CustomMultiQueryListItem> result = apiInstance.listCustomQueries(sqlLike).execute();
            System.out.println(result.toJson());
        } catch (ApiException e) {
            System.err.println("Exception when calling MultiQueryExecutionApi#listCustomQueries");
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
| **sqlLike** | **String**| An optional SQL-LIKE style filter on the LuminesceSql of the queries (manually include wildcards if desired), a query-set matching should any of its queries. | [optional] |

### Return type

[**List&lt;CustomMultiQueryListItem&gt;**](CustomMultiQueryListItem.md)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: text/plain, application/json, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

[Back to top](#) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to Model list](../README.md#documentation-for-models) &#8226; [Back to README](../README.md)


## saveMultiQueryResultsToDrive

> String saveMultiQueryResultsToDrive(executionId, driveLocationAndFileName, mayOverwrite, format, driveTemplateLocation, dateTimeFormat, loadWaitMilliseconds)

[EXPERIMENTAL] SaveMultiQueryResultsToDrive: Saves the results of a custom query-set directly to Drive, as one file

Exports the results of all the queries of a custom query-set (other than those which are not external results) as one file. Queries that failed, or were skipped as a query they depend on failed, are left out - though if none succeeded there is nothing to export.  The following error codes are to be anticipated most with standard Problem Detail reports: - 400 BadRequest : no query succeeded, or a placeholder or Drive parameter was incorrect in some way - 401 Unauthorized - 403 Forbidden - 404 Not Found : The requested query-set doesn&#39;t exist, isn&#39;t a custom one, or the calling user did not run it. - 429 Too Many Requests : Please try your request again soon  1. The query has been executed successfully in the past yet the server-instance receiving this request (e.g. from a load balancer) doesn&#39;t yet have this data available.  1. By virtue of the request you have just placed this will have started to load from the persisted cache and will soon be available.  1. It is also the case that the original server-instance to process the original query is likely to already be able to service this request.

### Example

```java
import com.finbourne.luminesce.model.*;
import com.finbourne.luminesce.api.MultiQueryExecutionApi;
import com.finbourne.luminesce.extensions.ApiConfigurationException;
import com.finbourne.luminesce.extensions.ApiFactoryBuilder;
import com.finbourne.luminesce.extensions.auth.FinbourneTokenException;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class MultiQueryExecutionApiExample {

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
        // MultiQueryExecutionApi apiInstance = apiFactory.build(MultiQueryExecutionApi.class);

        MultiQueryExecutionApi apiInstance = ApiFactoryBuilder.build(fileName).build(MultiQueryExecutionApi.class);
        String executionId = "executionId_example"; // String | ExecutionId returned when starting the query-set
        String driveLocationAndFileName = "driveLocationAndFileName_example"; // String | Location and file name within drive where this should be saved to. Missing paths will be created, and extension (if given) will be ignored and inferred from the chosen format (zip where several results are zipped). May contain the placeholders `{executionId}`, `{date:format}` (when the queries started, UTC, e.g. `{date:yyyyMMdd}`) and `{param:name}` (the value of a scalar parameter).
        Boolean mayOverwrite = false; // Boolean | If there is an existing file at the requested location with the same name should this be overridden, or an error returned?
        ExportType format = ExportType.fromValue("csv"); // ExportType | Format to save in. Several results are one worksheet each for Excel, one table each for Sqlite, and otherwise one file each within a zip.
        String driveTemplateLocation = "driveTemplateLocation_example"; // String | Drive path and full file name including extension to be used for the export. Only some export types support templates, such as Excel and Pdf, and this will need to match the format type, if given.
        String dateTimeFormat = "dateTimeFormat_example"; // String | Format to apply for DateTime data, leaving blank gives the Luminesce Exporter default, currently `yyyy-MM-dd HH:mm:ss.fff`
        Integer loadWaitMilliseconds = 0; // Integer | Optional maximum additional wait period for post execution platform processing.
        try {
            // uncomment the below to set overrides at the request level
            // String result = apiInstance.saveMultiQueryResultsToDrive(executionId, driveLocationAndFileName, mayOverwrite, format, driveTemplateLocation, dateTimeFormat, loadWaitMilliseconds).execute(opts);

            String result = apiInstance.saveMultiQueryResultsToDrive(executionId, driveLocationAndFileName, mayOverwrite, format, driveTemplateLocation, dateTimeFormat, loadWaitMilliseconds).execute();
            System.out.println(result.toJson());
        } catch (ApiException e) {
            System.err.println("Exception when calling MultiQueryExecutionApi#saveMultiQueryResultsToDrive");
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
| **executionId** | **String**| ExecutionId returned when starting the query-set | |
| **driveLocationAndFileName** | **String**| Location and file name within drive where this should be saved to. Missing paths will be created, and extension (if given) will be ignored and inferred from the chosen format (zip where several results are zipped). May contain the placeholders &#x60;{executionId}&#x60;, &#x60;{date:format}&#x60; (when the queries started, UTC, e.g. &#x60;{date:yyyyMMdd}&#x60;) and &#x60;{param:name}&#x60; (the value of a scalar parameter). | |
| **mayOverwrite** | **Boolean**| If there is an existing file at the requested location with the same name should this be overridden, or an error returned? | [optional] [default to false] |
| **format** | [**ExportType**](.md)| Format to save in. Several results are one worksheet each for Excel, one table each for Sqlite, and otherwise one file each within a zip. | [optional] [enum: csv, pipe, excel, json, jsonProper, xml, parquet, sqlite, TableInternal, jsonProperWithLineage, pdf] |
| **driveTemplateLocation** | **String**| Drive path and full file name including extension to be used for the export. Only some export types support templates, such as Excel and Pdf, and this will need to match the format type, if given. | [optional] |
| **dateTimeFormat** | **String**| Format to apply for DateTime data, leaving blank gives the Luminesce Exporter default, currently &#x60;yyyy-MM-dd HH:mm:ss.fff&#x60; | [optional] |
| **loadWaitMilliseconds** | **Integer**| Optional maximum additional wait period for post execution platform processing. | [optional] [default to 0] |

### Return type

**String**

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: text/plain, application/json, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | Bad Request |  -  |
| **403** | Forbidden |  -  |

[Back to top](#) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to Model list](../README.md#documentation-for-models) &#8226; [Back to README](../README.md)


## startCustomQueries

> BackgroundMultiQueryResponse startCustomQueries(customMultiQueryRequest)

[EXPERIMENTAL] StartCustomQueries: Run a caller-supplied set of Sql queries in the background

 Starts a caller-supplied set of named queries in the background, getting back an immediate response with how to - fetch the data of each (external) query in various formats, view progress information and cancel / clear them, as for any multi-query - download, or save to Drive, the results of all the (external) queries that succeeded as one file  The queries are started in the order given, at most &#x60;maxInParallel&#x60; at a time (1 by default, null for as many as possible). A query may use the results of an earlier one as a table variable of its name, e.g. &#x60;select docker-compose.yml Dockerfile Dockerfile.cicd docs generate justfile LICENSE.md publish README.md resources test_sdk from @Holdings&#x60;, and is then only started once that has succeeded (and is skipped if it does not). The scalar parameters are given to every query.  The multi-query as a whole is reported as failed if any of its queries fails or is skipped.  The following error codes are to be anticipated with standard Problem Detail reports: - 400 BadRequest - the request was invalid, a Saved Query could not be loaded, or there was something wrong with the syntax of a query - 401 Unauthorized - 403 Forbidden 

### Example

```java
import com.finbourne.luminesce.model.*;
import com.finbourne.luminesce.api.MultiQueryExecutionApi;
import com.finbourne.luminesce.extensions.ApiConfigurationException;
import com.finbourne.luminesce.extensions.ApiFactoryBuilder;
import com.finbourne.luminesce.extensions.auth.FinbourneTokenException;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class MultiQueryExecutionApiExample {

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
        // MultiQueryExecutionApi apiInstance = apiFactory.build(MultiQueryExecutionApi.class);

        MultiQueryExecutionApi apiInstance = ApiFactoryBuilder.build(fileName).build(MultiQueryExecutionApi.class);
        CustomMultiQueryRequest customMultiQueryRequest = new CustomMultiQueryRequest(); // CustomMultiQueryRequest | The queries to run (as LuminesceSql or Saved Query references), the scalar parameters for them all, etc.
        try {
            // uncomment the below to set overrides at the request level
            // BackgroundMultiQueryResponse result = apiInstance.startCustomQueries(customMultiQueryRequest).execute(opts);

            BackgroundMultiQueryResponse result = apiInstance.startCustomQueries(customMultiQueryRequest).execute();
            System.out.println(result.toJson());
        } catch (ApiException e) {
            System.err.println("Exception when calling MultiQueryExecutionApi#startCustomQueries");
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
| **customMultiQueryRequest** | [**CustomMultiQueryRequest**](CustomMultiQueryRequest.md)| The queries to run (as LuminesceSql or Saved Query references), the scalar parameters for them all, etc. | |

### Return type

[**BackgroundMultiQueryResponse**](BackgroundMultiQueryResponse.md)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: text/plain, application/json, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **202** | Accepted |  -  |
| **400** | Bad Request |  -  |
| **403** | Forbidden |  -  |

[Back to top](#) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to Model list](../README.md#documentation-for-models) &#8226; [Back to README](../README.md)


## startQueries

> BackgroundMultiQueryResponse startQueries(type, body, asAt, effectiveAt, limit1, limit2, input1, input2, input3, timeoutSeconds, keepForSeconds)

StartQueries: Run a given set of Sql queries in the background

 Allow for starting a potentially long running query and getting back an immediate response with how to  - fetch the data in various formats (if available, or if not simply being informed it is not yet ready), on a per result basis - view progress information (up until this point), for all results in one go - cancel the queries (if still running) / clear the data (if already returned)  The following error codes are to be anticipated with standard Problem Detail reports: - 400 BadRequest - there was something wrong with your query syntax (the issue was detected at parse-time) - 401 Unauthorized - 403 Forbidden 

### Example

```java
import com.finbourne.luminesce.model.*;
import com.finbourne.luminesce.api.MultiQueryExecutionApi;
import com.finbourne.luminesce.extensions.ApiConfigurationException;
import com.finbourne.luminesce.extensions.ApiFactoryBuilder;
import com.finbourne.luminesce.extensions.auth.FinbourneTokenException;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class MultiQueryExecutionApiExample {

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
        // MultiQueryExecutionApi apiInstance = apiFactory.build(MultiQueryExecutionApi.class);

        MultiQueryExecutionApi apiInstance = ApiFactoryBuilder.build(fileName).build(MultiQueryExecutionApi.class);
        MultiQueryDefinitionType type = MultiQueryDefinitionType.fromValue("Instrument"); // MultiQueryDefinitionType | An enum value defining the set of statements being executed
        String body = Apple; // String | A \"search\" value (e.g. 'Apple' on an instrument search, a `Finbourne.Filtering` expression of Insights, etc.) In the cases where \"Nothing\" is valid for a `Finbourne.Filtering` expression, pass `True`.
        OffsetDateTime asAt = OffsetDateTime.now(); // OffsetDateTime | The AsAt time used by any bitemporal provider in the queries.
        OffsetDateTime effectiveAt = OffsetDateTime.now(); // OffsetDateTime | The EffectiveAt time used by any bitemporal provider in the queries.
        Integer limit1 = 56; // Integer | A limit that is applied to first-level queries (e.g. Instruments themselves)
        Integer limit2 = 56; // Integer | A limit that is applied to second-level queries (e.g. Holdings based on the set of Instruments found)
        String input1 = "input1_example"; // String | A value available to queries, these vary by 'type' and are only used by some types at all. e.g. a start-date of some sort
        String input2 = "input2_example"; // String | A second value available to queries, these vary by 'type' and are only used by some types at all.
        String input3 = "input3_example"; // String | A third value available to queries, these vary by 'type' and are only used by some types at all.
        Integer timeoutSeconds = 0; // Integer | Maximum time the query may run for, in seconds: <0 → ∞, 0 → 1200s (20m)
        Integer keepForSeconds = 0; // Integer | Maximum time the result may be kept for, in seconds: <0 → 1200 (20m), 0 → 28800 (8h), max = 2,678,400 (31d)
        try {
            // uncomment the below to set overrides at the request level
            // BackgroundMultiQueryResponse result = apiInstance.startQueries(type, body, asAt, effectiveAt, limit1, limit2, input1, input2, input3, timeoutSeconds, keepForSeconds).execute(opts);

            BackgroundMultiQueryResponse result = apiInstance.startQueries(type, body, asAt, effectiveAt, limit1, limit2, input1, input2, input3, timeoutSeconds, keepForSeconds).execute();
            System.out.println(result.toJson());
        } catch (ApiException e) {
            System.err.println("Exception when calling MultiQueryExecutionApi#startQueries");
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
| **type** | [**MultiQueryDefinitionType**](.md)| An enum value defining the set of statements being executed | [enum: Instrument, Expiry, CorporateActions, EdiInstrument, EdiInstrumentWriter, Testing, MarketplaceClientLoadHistory, InsightsMetricsEntitlement, InstrumentDiscovery, InstrumentUpsert, InsightsApplicationRequestLogs, InsightsVendorLogs, CandelaTraceLogs, CandelaTraceEventLogs, Custom] |
| **body** | **String**| A \&quot;search\&quot; value (e.g. &#39;Apple&#39; on an instrument search, a &#x60;Finbourne.Filtering&#x60; expression of Insights, etc.) In the cases where \&quot;Nothing\&quot; is valid for a &#x60;Finbourne.Filtering&#x60; expression, pass &#x60;True&#x60;. | |
| **asAt** | **OffsetDateTime**| The AsAt time used by any bitemporal provider in the queries. | [optional] |
| **effectiveAt** | **OffsetDateTime**| The EffectiveAt time used by any bitemporal provider in the queries. | [optional] |
| **limit1** | **Integer**| A limit that is applied to first-level queries (e.g. Instruments themselves) | [optional] |
| **limit2** | **Integer**| A limit that is applied to second-level queries (e.g. Holdings based on the set of Instruments found) | [optional] |
| **input1** | **String**| A value available to queries, these vary by &#39;type&#39; and are only used by some types at all. e.g. a start-date of some sort | [optional] |
| **input2** | **String**| A second value available to queries, these vary by &#39;type&#39; and are only used by some types at all. | [optional] |
| **input3** | **String**| A third value available to queries, these vary by &#39;type&#39; and are only used by some types at all. | [optional] |
| **timeoutSeconds** | **Integer**| Maximum time the query may run for, in seconds: &lt;0 → ∞, 0 → 1200s (20m) | [optional] [default to 0] |
| **keepForSeconds** | **Integer**| Maximum time the result may be kept for, in seconds: &lt;0 → 1200 (20m), 0 → 28800 (8h), max &#x3D; 2,678,400 (31d) | [optional] [default to 0] |

### Return type

[**BackgroundMultiQueryResponse**](BackgroundMultiQueryResponse.md)

### HTTP request headers

- **Content-Type**: text/plain
- **Accept**: text/plain, application/json, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **202** | Accepted |  -  |
| **400** | Bad Request |  -  |
| **403** | Forbidden |  -  |

[Back to top](#) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to Model list](../README.md#documentation-for-models) &#8226; [Back to README](../README.md)

