# SqlBackgroundExecutionApi

All URIs are relative to *https://fbn-prd.lusid.com/honeycomb*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**cancelQuery**](SqlBackgroundExecutionApi.md#cancelQuery) | **DELETE** /api/SqlBackground/{executionId} | CancelQuery: Cancels (if running) or clears the data from (if completed) a previously started query |
| [**fetchQueryResultCsv**](SqlBackgroundExecutionApi.md#fetchQueryResultCsv) | **GET** /api/SqlBackground/{executionId}/csv | FetchQueryResultCsv: Fetches the result from a previously started query, in CSV format. |
| [**fetchQueryResultExcel**](SqlBackgroundExecutionApi.md#fetchQueryResultExcel) | **GET** /api/SqlBackground/{executionId}/excel | FetchQueryResultExcel: Fetches the result from a previously started query, in Excel format. |
| [**fetchQueryResultHistogram**](SqlBackgroundExecutionApi.md#fetchQueryResultHistogram) | **GET** /api/SqlBackground/{executionId}/histogram | FetchQueryResultHistogram: Fetches the result from a previously started query, converts it to a histogram (counts in buckets). |
| [**fetchQueryResultJson**](SqlBackgroundExecutionApi.md#fetchQueryResultJson) | **GET** /api/SqlBackground/{executionId}/json | FetchQueryResultJson: Fetches the result from a previously started query, in JSON string format.  Please move to &#39;/jsonProper&#39; instead. This may be marked as Deprecated in the future. |
| [**fetchQueryResultJsonProper**](SqlBackgroundExecutionApi.md#fetchQueryResultJsonProper) | **GET** /api/SqlBackground/{executionId}/jsonProper | FetchQueryResultJsonProper: Fetches the result from a previously started query, in JSON format. |
| [**fetchQueryResultParquet**](SqlBackgroundExecutionApi.md#fetchQueryResultParquet) | **GET** /api/SqlBackground/{executionId}/parquet | FetchQueryResultParquet: Fetches the result from a previously started query, in Parquet format. |
| [**fetchQueryResultPipe**](SqlBackgroundExecutionApi.md#fetchQueryResultPipe) | **GET** /api/SqlBackground/{executionId}/pipe | FetchQueryResultPipe: Fetches the result from a previously started query, in pipe-delimited format. |
| [**fetchQueryResultSqlite**](SqlBackgroundExecutionApi.md#fetchQueryResultSqlite) | **GET** /api/SqlBackground/{executionId}/sqlite | FetchQueryResultSqlite: Fetches the result from a previously started query, in SqLite format. |
| [**fetchQueryResultXml**](SqlBackgroundExecutionApi.md#fetchQueryResultXml) | **GET** /api/SqlBackground/{executionId}/xml | FetchQueryResultXml: Fetches the result from a previously started query, in Xml format. |
| [**getProgressOf**](SqlBackgroundExecutionApi.md#getProgressOf) | **GET** /api/SqlBackground/{executionId} | GetProgressOf: View progress information (up until this point) |
| [**startQuery**](SqlBackgroundExecutionApi.md#startQuery) | **PUT** /api/SqlBackground | StartQuery: Starts to Execute LuminesceSql in the background. |



## cancelQuery

> BackgroundQueryCancelResponse cancelQuery(executionId)

CancelQuery: Cancels (if running) or clears the data from (if completed) a previously started query

Cancel the query (if still running) / clear the data (if already returned) The following error codes are to be anticipated with standard Problem Detail reports: - 401 Unauthorized - 403 Forbidden - 404 Not Found : The requested query result doesn&#39;t exist and is not running. 

### Example

```java
import com.finbourne.luminesce.model.*;
import com.finbourne.luminesce.api.SqlBackgroundExecutionApi;
import com.finbourne.luminesce.extensions.ApiConfigurationException;
import com.finbourne.luminesce.extensions.ApiFactoryBuilder;
import com.finbourne.luminesce.extensions.auth.FinbourneTokenException;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class SqlBackgroundExecutionApiExample {

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

        SqlBackgroundExecutionApi apiInstance = ApiFactoryBuilder.build(fileName).build(SqlBackgroundExecutionApi.class);
        String executionId = "executionId_example"; // String | ExecutionId returned when starting the query
        try {
            BackgroundQueryCancelResponse result = apiInstance.cancelQuery(executionId).execute();
            System.out.println(result.toJson());
        } catch (ApiException e) {
            System.err.println("Exception when calling SqlBackgroundExecutionApi#cancelQuery");
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
| **200** | Success |  -  |

[Back to top](#) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to Model list](../README.md#documentation-for-models) &#8226; [Back to README](../README.md)


## fetchQueryResultCsv

> String fetchQueryResultCsv(executionId, download, sortBy, filter, select, groupBy, limit, page, delimiter, escape)

FetchQueryResultCsv: Fetches the result from a previously started query, in CSV format.

Fetch the data in various formats (if available, or if not simply being informed it is not yet ready) The following error codes are to be anticipated most with standard Problem Detail reports: - 400 BadRequest : Something failed with the execution of your query - 401 Unauthorized - 403 Forbidden - 404 Not Found : The requested query result doesn&#39;t (yet) exist. - 429 Too Many Requests : Please try your request again soon  1. The query has been executed successfully in the past yet the server-instance receiving this request (e.g. from a load balancer) doesn&#39;t yet have this data available.  1. By virtue of the request you have just placed this will have started to load from the persisted cache and will soon be available.  1. It is also the case that the original server-instance to process the original query is likely to already be able to service this request.

### Example

```java
import com.finbourne.luminesce.model.*;
import com.finbourne.luminesce.api.SqlBackgroundExecutionApi;
import com.finbourne.luminesce.extensions.ApiConfigurationException;
import com.finbourne.luminesce.extensions.ApiFactoryBuilder;
import com.finbourne.luminesce.extensions.auth.FinbourneTokenException;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class SqlBackgroundExecutionApiExample {

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

        SqlBackgroundExecutionApi apiInstance = ApiFactoryBuilder.build(fileName).build(SqlBackgroundExecutionApi.class);
        String executionId = "executionId_example"; // String | ExecutionId returned when starting the query
        Boolean download = false; // Boolean | Makes this a file-download request (as opposed to returning the data in the response-body)
        String sortBy = "sortBy_example"; // String | Order the results by these fields.   Use the `-` sign to denote descending order, e.g. `-MyFieldName`. Numeric indexes may be used also, e.g. `2,-3`.   Multiple fields can be denoted by a comma e.g. `-MyFieldName,AnotherFieldName,-AFurtherFieldName`.   Default is null, the sort order specified in the query itself.
        String filter = "filter_example"; // String | An ODATA filter per Finbourne.Filtering syntax.
        String select = "select_example"; // String | Default is null (meaning return all columns in the original query itself).  The values are in terms of the result column name from the original data set and are comma delimited.  The power of this comes in that you may aggregate the data if you wish  (that is the main reason for allowing this, in fact).  e.g.:  - `MyField`  - `Max(x) FILTER (WHERE y > 12) as ABC` (max of a field, if another field lets it qualify, with a nice column name)  - `count(*)` (count the rows for the given group, that would produce a rather ugly column name, but it works)  - `count(distinct x) as numOfXs`  If there was an illegal character in a field you are selecting from, you are responsible for bracketing it with [ ].   e.g.  - `some_field, count(*) as a, max(x) as b, min([column with space in name]) as nice_name`   where you would likely want to pass `1` as the `groupBy` also.
        String groupBy = "groupBy_example"; // String | Groups by the specified fields.   A comma delimited list of: 1 based numeric indexes (cleaner), or repeats of the select expressions (a bit verbose and must match exactly).   e.g. `2,3`, `myColumn`.   Default is null (meaning no grouping will be performed on the selected columns).   This applies only over the result set being requested here, meaning indexes into the \"select\" parameter fields.   Only specify this if you are selecting aggregations in the \"select\" parameter.
        Integer limit = 0; // Integer | When paginating, only return this number of records, page should also be specified.
        Integer page = 0; // Integer | 0-N based on chunk sized determined by the limit, ignored if limit < 1.
        String delimiter = "delimiter_example"; // String | Delimiter string to override the default
        String escape = "escape_example"; // String | Escape character to override the default
        try {
            String result = apiInstance.fetchQueryResultCsv(executionId, download, sortBy, filter, select, groupBy, limit, page, delimiter, escape).execute();
            System.out.println(result.toJson());
        } catch (ApiException e) {
            System.err.println("Exception when calling SqlBackgroundExecutionApi#fetchQueryResultCsv");
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
| **download** | **Boolean**| Makes this a file-download request (as opposed to returning the data in the response-body) | [optional] [default to false] |
| **sortBy** | **String**| Order the results by these fields.   Use the &#x60;-&#x60; sign to denote descending order, e.g. &#x60;-MyFieldName&#x60;. Numeric indexes may be used also, e.g. &#x60;2,-3&#x60;.   Multiple fields can be denoted by a comma e.g. &#x60;-MyFieldName,AnotherFieldName,-AFurtherFieldName&#x60;.   Default is null, the sort order specified in the query itself. | [optional] |
| **filter** | **String**| An ODATA filter per Finbourne.Filtering syntax. | [optional] |
| **select** | **String**| Default is null (meaning return all columns in the original query itself).  The values are in terms of the result column name from the original data set and are comma delimited.  The power of this comes in that you may aggregate the data if you wish  (that is the main reason for allowing this, in fact).  e.g.:  - &#x60;MyField&#x60;  - &#x60;Max(x) FILTER (WHERE y &gt; 12) as ABC&#x60; (max of a field, if another field lets it qualify, with a nice column name)  - &#x60;count(*)&#x60; (count the rows for the given group, that would produce a rather ugly column name, but it works)  - &#x60;count(distinct x) as numOfXs&#x60;  If there was an illegal character in a field you are selecting from, you are responsible for bracketing it with [ ].   e.g.  - &#x60;some_field, count(*) as a, max(x) as b, min([column with space in name]) as nice_name&#x60;   where you would likely want to pass &#x60;1&#x60; as the &#x60;groupBy&#x60; also. | [optional] |
| **groupBy** | **String**| Groups by the specified fields.   A comma delimited list of: 1 based numeric indexes (cleaner), or repeats of the select expressions (a bit verbose and must match exactly).   e.g. &#x60;2,3&#x60;, &#x60;myColumn&#x60;.   Default is null (meaning no grouping will be performed on the selected columns).   This applies only over the result set being requested here, meaning indexes into the \&quot;select\&quot; parameter fields.   Only specify this if you are selecting aggregations in the \&quot;select\&quot; parameter. | [optional] |
| **limit** | **Integer**| When paginating, only return this number of records, page should also be specified. | [optional] [default to 0] |
| **page** | **Integer**| 0-N based on chunk sized determined by the limit, ignored if limit &lt; 1. | [optional] [default to 0] |
| **delimiter** | **String**| Delimiter string to override the default | [optional] |
| **escape** | **String**| Escape character to override the default | [optional] |

### Return type

**String**

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


## fetchQueryResultExcel

> File fetchQueryResultExcel(executionId, sortBy, filter, select, groupBy)

FetchQueryResultExcel: Fetches the result from a previously started query, in Excel format.

Fetch the data in various formats (if available, or if not simply being informed it is not yet ready) The following error codes are to be anticipated most with standard Problem Detail reports: - 400 BadRequest : Something failed with the execution of your query - 401 Unauthorized - 403 Forbidden - 404 Not Found : The requested query result doesn&#39;t (yet) exist. - 429 Too Many Requests : Please try your request again soon  1. The query has been executed successfully in the past yet the server-instance receiving this request (e.g. from a load balancer) doesn&#39;t yet have this data available.  1. By virtue of the request you have just placed this will have started to load from the persisted cache and will soon be available.  1. It is also the case that the original server-instance to process the original query is likely to already be able to service this request.

### Example

```java
import com.finbourne.luminesce.model.*;
import com.finbourne.luminesce.api.SqlBackgroundExecutionApi;
import com.finbourne.luminesce.extensions.ApiConfigurationException;
import com.finbourne.luminesce.extensions.ApiFactoryBuilder;
import com.finbourne.luminesce.extensions.auth.FinbourneTokenException;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class SqlBackgroundExecutionApiExample {

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

        SqlBackgroundExecutionApi apiInstance = ApiFactoryBuilder.build(fileName).build(SqlBackgroundExecutionApi.class);
        String executionId = "executionId_example"; // String | ExecutionId returned when starting the query
        String sortBy = "sortBy_example"; // String | Order the results by these fields.   Use the `-` sign to denote descending order, e.g. `-MyFieldName`. Numeric indexes may be used also, e.g. `2,-3`.   Multiple fields can be denoted by a comma e.g. `-MyFieldName,AnotherFieldName,-AFurtherFieldName`.   Default is null, the sort order specified in the query itself.
        String filter = "filter_example"; // String | An ODATA filter per Finbourne.Filtering syntax.
        String select = "select_example"; // String | Default is null (meaning return all columns in the original query itself).  The values are in terms of the result column name from the original data set and are comma delimited.  The power of this comes in that you may aggregate the data if you wish  (that is the main reason for allowing this, in fact).  e.g.:  - `MyField`  - `Max(x) FILTER (WHERE y > 12) as ABC` (max of a field, if another field lets it qualify, with a nice column name)  - `count(*)` (count the rows for the given group, that would produce a rather ugly column name, but it works)  - `count(distinct x) as numOfXs`  If there was an illegal character in a field you are selecting from, you are responsible for bracketing it with [ ].   e.g.  - `some_field, count(*) as a, max(x) as b, min([column with space in name]) as nice_name`   where you would likely want to pass `1` as the `groupBy` also.
        String groupBy = "groupBy_example"; // String | Groups by the specified fields.   A comma delimited list of: 1 based numeric indexes (cleaner), or repeats of the select expressions (a bit verbose and must match exactly).   e.g. `2,3`, `myColumn`.   Default is null (meaning no grouping will be performed on the selected columns).   This applies only over the result set being requested here, meaning indexes into the \"select\" parameter fields.   Only specify this if you are selecting aggregations in the \"select\" parameter.
        try {
            File result = apiInstance.fetchQueryResultExcel(executionId, sortBy, filter, select, groupBy).execute();
            System.out.println(result.toJson());
        } catch (ApiException e) {
            System.err.println("Exception when calling SqlBackgroundExecutionApi#fetchQueryResultExcel");
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
| **sortBy** | **String**| Order the results by these fields.   Use the &#x60;-&#x60; sign to denote descending order, e.g. &#x60;-MyFieldName&#x60;. Numeric indexes may be used also, e.g. &#x60;2,-3&#x60;.   Multiple fields can be denoted by a comma e.g. &#x60;-MyFieldName,AnotherFieldName,-AFurtherFieldName&#x60;.   Default is null, the sort order specified in the query itself. | [optional] |
| **filter** | **String**| An ODATA filter per Finbourne.Filtering syntax. | [optional] |
| **select** | **String**| Default is null (meaning return all columns in the original query itself).  The values are in terms of the result column name from the original data set and are comma delimited.  The power of this comes in that you may aggregate the data if you wish  (that is the main reason for allowing this, in fact).  e.g.:  - &#x60;MyField&#x60;  - &#x60;Max(x) FILTER (WHERE y &gt; 12) as ABC&#x60; (max of a field, if another field lets it qualify, with a nice column name)  - &#x60;count(*)&#x60; (count the rows for the given group, that would produce a rather ugly column name, but it works)  - &#x60;count(distinct x) as numOfXs&#x60;  If there was an illegal character in a field you are selecting from, you are responsible for bracketing it with [ ].   e.g.  - &#x60;some_field, count(*) as a, max(x) as b, min([column with space in name]) as nice_name&#x60;   where you would likely want to pass &#x60;1&#x60; as the &#x60;groupBy&#x60; also. | [optional] |
| **groupBy** | **String**| Groups by the specified fields.   A comma delimited list of: 1 based numeric indexes (cleaner), or repeats of the select expressions (a bit verbose and must match exactly).   e.g. &#x60;2,3&#x60;, &#x60;myColumn&#x60;.   Default is null (meaning no grouping will be performed on the selected columns).   This applies only over the result set being requested here, meaning indexes into the \&quot;select\&quot; parameter fields.   Only specify this if you are selecting aggregations in the \&quot;select\&quot; parameter. | [optional] |

### Return type

[**File**](File.md)

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


## fetchQueryResultHistogram

> String fetchQueryResultHistogram(executionId, timestampFieldName, startAt, endAt, bucketSize, filter, jsonProper)

FetchQueryResultHistogram: Fetches the result from a previously started query, converts it to a histogram (counts in buckets).

Fetch the histogram in Json format (if available, or if not simply being informed it is not yet ready) The following error codes are to be anticipated with standard Problem Detail reports: - 401 Unauthorized - 403 Forbidden - 404 Not Found : The requested query result doesn&#39;t (yet) exist. - 429 Too Many Requests : Please try your request again soon  1. The query has been executed successfully in the past yet the server-instance receiving this request (e.g. from a load balancer) doesn&#39;t yet have this data available.  1. By virtue of the request you have just placed this will have started to load from the persisted cache and will soon be available.  1. It is also the case that the original server-instance to process the original query is likely to already be able to service this request.

### Example

```java
import com.finbourne.luminesce.model.*;
import com.finbourne.luminesce.api.SqlBackgroundExecutionApi;
import com.finbourne.luminesce.extensions.ApiConfigurationException;
import com.finbourne.luminesce.extensions.ApiFactoryBuilder;
import com.finbourne.luminesce.extensions.auth.FinbourneTokenException;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class SqlBackgroundExecutionApiExample {

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

        SqlBackgroundExecutionApi apiInstance = ApiFactoryBuilder.build(fileName).build(SqlBackgroundExecutionApi.class);
        String executionId = "executionId_example"; // String | ExecutionId returned when starting the query
        String timestampFieldName = "timestampFieldName_example"; // String | Name of the timestamp field used in building the histogram
        OffsetDateTime startAt = OffsetDateTime.now(); // OffsetDateTime | Start point (of the timestampFieldName field) for the histogram
        OffsetDateTime endAt = OffsetDateTime.now(); // OffsetDateTime | End point (of the timestampFieldName field) for the histogram
        String bucketSize = "bucketSize_example"; // String | Optional histogram bucket width. If not provided a set number of buckets between start/end range will be generated.
        String filter = "filter_example"; // String | An ODATA filter per Finbourne.Filtering syntax.
        Boolean jsonProper = false; // Boolean | Should this be text/json (not json-encoded-as-a-string)
        try {
            String result = apiInstance.fetchQueryResultHistogram(executionId, timestampFieldName, startAt, endAt, bucketSize, filter, jsonProper).execute();
            System.out.println(result.toJson());
        } catch (ApiException e) {
            System.err.println("Exception when calling SqlBackgroundExecutionApi#fetchQueryResultHistogram");
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
| **timestampFieldName** | **String**| Name of the timestamp field used in building the histogram | |
| **startAt** | **OffsetDateTime**| Start point (of the timestampFieldName field) for the histogram | [optional] |
| **endAt** | **OffsetDateTime**| End point (of the timestampFieldName field) for the histogram | [optional] |
| **bucketSize** | **String**| Optional histogram bucket width. If not provided a set number of buckets between start/end range will be generated. | [optional] |
| **filter** | **String**| An ODATA filter per Finbourne.Filtering syntax. | [optional] |
| **jsonProper** | **Boolean**| Should this be text/json (not json-encoded-as-a-string) | [optional] [default to false] |

### Return type

**String**

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


## fetchQueryResultJson

> String fetchQueryResultJson(executionId, sortBy, filter, select, groupBy, limit, page)

FetchQueryResultJson: Fetches the result from a previously started query, in JSON string format.  Please move to &#39;/jsonProper&#39; instead. This may be marked as Deprecated in the future.

Fetch the data in various formats (if available, or if not simply being informed it is not yet ready) The following error codes are to be anticipated most with standard Problem Detail reports: - 400 BadRequest : Something failed with the execution of your query - 401 Unauthorized - 403 Forbidden - 404 Not Found : The requested query result doesn&#39;t (yet) exist. - 429 Too Many Requests : Please try your request again soon  1. The query has been executed successfully in the past yet the server-instance receiving this request (e.g. from a load balancer) doesn&#39;t yet have this data available.  1. By virtue of the request you have just placed this will have started to load from the persisted cache and will soon be available.  1. It is also the case that the original server-instance to process the original query is likely to already be able to service this request.

### Example

```java
import com.finbourne.luminesce.model.*;
import com.finbourne.luminesce.api.SqlBackgroundExecutionApi;
import com.finbourne.luminesce.extensions.ApiConfigurationException;
import com.finbourne.luminesce.extensions.ApiFactoryBuilder;
import com.finbourne.luminesce.extensions.auth.FinbourneTokenException;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class SqlBackgroundExecutionApiExample {

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

        SqlBackgroundExecutionApi apiInstance = ApiFactoryBuilder.build(fileName).build(SqlBackgroundExecutionApi.class);
        String executionId = "executionId_example"; // String | ExecutionId returned when starting the query
        String sortBy = "sortBy_example"; // String | Order the results by these fields.   Use the `-` sign to denote descending order, e.g. `-MyFieldName`. Numeric indexes may be used also, e.g. `2,-3`.   Multiple fields can be denoted by a comma e.g. `-MyFieldName,AnotherFieldName,-AFurtherFieldName`.   Default is null, the sort order specified in the query itself.
        String filter = "filter_example"; // String | An ODATA filter per Finbourne.Filtering syntax.
        String select = "select_example"; // String | Default is null (meaning return all columns in the original query itself).  The values are in terms of the result column name from the original data set and are comma delimited.  The power of this comes in that you may aggregate the data if you wish  (that is the main reason for allowing this, in fact).  e.g.:  - `MyField`  - `Max(x) FILTER (WHERE y > 12) as ABC` (max of a field, if another field lets it qualify, with a nice column name)  - `count(*)` (count the rows for the given group, that would produce a rather ugly column name, but it works)  - `count(distinct x) as numOfXs`  If there was an illegal character in a field you are selecting from, you are responsible for bracketing it with [ ].   e.g.  - `some_field, count(*) as a, max(x) as b, min([column with space in name]) as nice_name`   where you would likely want to pass `1` as the `groupBy` also.
        String groupBy = "groupBy_example"; // String | Groups by the specified fields.   A comma delimited list of: 1 based numeric indexes (cleaner), or repeats of the select expressions (a bit verbose and must match exactly).   e.g. `2,3`, `myColumn`.   Default is null (meaning no grouping will be performed on the selected columns).   This applies only over the result set being requested here, meaning indexes into the \"select\" parameter fields.   Only specify this if you are selecting aggregations in the \"select\" parameter.
        Integer limit = 0; // Integer | When paginating, only return this number of records, page should also be specified.
        Integer page = 0; // Integer | 0-N based on chunk sized determined by the limit, ignored if limit < 1.
        try {
            String result = apiInstance.fetchQueryResultJson(executionId, sortBy, filter, select, groupBy, limit, page).execute();
            System.out.println(result.toJson());
        } catch (ApiException e) {
            System.err.println("Exception when calling SqlBackgroundExecutionApi#fetchQueryResultJson");
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
| **sortBy** | **String**| Order the results by these fields.   Use the &#x60;-&#x60; sign to denote descending order, e.g. &#x60;-MyFieldName&#x60;. Numeric indexes may be used also, e.g. &#x60;2,-3&#x60;.   Multiple fields can be denoted by a comma e.g. &#x60;-MyFieldName,AnotherFieldName,-AFurtherFieldName&#x60;.   Default is null, the sort order specified in the query itself. | [optional] |
| **filter** | **String**| An ODATA filter per Finbourne.Filtering syntax. | [optional] |
| **select** | **String**| Default is null (meaning return all columns in the original query itself).  The values are in terms of the result column name from the original data set and are comma delimited.  The power of this comes in that you may aggregate the data if you wish  (that is the main reason for allowing this, in fact).  e.g.:  - &#x60;MyField&#x60;  - &#x60;Max(x) FILTER (WHERE y &gt; 12) as ABC&#x60; (max of a field, if another field lets it qualify, with a nice column name)  - &#x60;count(*)&#x60; (count the rows for the given group, that would produce a rather ugly column name, but it works)  - &#x60;count(distinct x) as numOfXs&#x60;  If there was an illegal character in a field you are selecting from, you are responsible for bracketing it with [ ].   e.g.  - &#x60;some_field, count(*) as a, max(x) as b, min([column with space in name]) as nice_name&#x60;   where you would likely want to pass &#x60;1&#x60; as the &#x60;groupBy&#x60; also. | [optional] |
| **groupBy** | **String**| Groups by the specified fields.   A comma delimited list of: 1 based numeric indexes (cleaner), or repeats of the select expressions (a bit verbose and must match exactly).   e.g. &#x60;2,3&#x60;, &#x60;myColumn&#x60;.   Default is null (meaning no grouping will be performed on the selected columns).   This applies only over the result set being requested here, meaning indexes into the \&quot;select\&quot; parameter fields.   Only specify this if you are selecting aggregations in the \&quot;select\&quot; parameter. | [optional] |
| **limit** | **Integer**| When paginating, only return this number of records, page should also be specified. | [optional] [default to 0] |
| **page** | **Integer**| 0-N based on chunk sized determined by the limit, ignored if limit &lt; 1. | [optional] [default to 0] |

### Return type

**String**

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


## fetchQueryResultJsonProper

> String fetchQueryResultJsonProper(executionId, download, sortBy, filter, select, groupBy, limit, page)

FetchQueryResultJsonProper: Fetches the result from a previously started query, in JSON format.

Fetch the data in various formats (if available, or if not simply being informed it is not yet ready) The following error codes are to be anticipated most with standard Problem Detail reports: - 400 BadRequest : Something failed with the execution of your query - 401 Unauthorized - 403 Forbidden - 404 Not Found : The requested query result doesn&#39;t (yet) exist. - 429 Too Many Requests : Please try your request again soon  1. The query has been executed successfully in the past yet the server-instance receiving this request (e.g. from a load balancer) doesn&#39;t yet have this data available.  1. By virtue of the request you have just placed this will have started to load from the persisted cache and will soon be available.  1. It is also the case that the original server-instance to process the original query is likely to already be able to service this request.

### Example

```java
import com.finbourne.luminesce.model.*;
import com.finbourne.luminesce.api.SqlBackgroundExecutionApi;
import com.finbourne.luminesce.extensions.ApiConfigurationException;
import com.finbourne.luminesce.extensions.ApiFactoryBuilder;
import com.finbourne.luminesce.extensions.auth.FinbourneTokenException;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class SqlBackgroundExecutionApiExample {

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

        SqlBackgroundExecutionApi apiInstance = ApiFactoryBuilder.build(fileName).build(SqlBackgroundExecutionApi.class);
        String executionId = "executionId_example"; // String | ExecutionId returned when starting the query
        Boolean download = false; // Boolean | Makes this a file-download request (as opposed to returning the data in the response-body)
        String sortBy = "sortBy_example"; // String | Order the results by these fields.   Use the `-` sign to denote descending order, e.g. `-MyFieldName`. Numeric indexes may be used also, e.g. `2,-3`.   Multiple fields can be denoted by a comma e.g. `-MyFieldName,AnotherFieldName,-AFurtherFieldName`.   Default is null, the sort order specified in the query itself.
        String filter = "filter_example"; // String | An ODATA filter per Finbourne.Filtering syntax.
        String select = "select_example"; // String | Default is null (meaning return all columns in the original query itself).  The values are in terms of the result column name from the original data set and are comma delimited.  The power of this comes in that you may aggregate the data if you wish  (that is the main reason for allowing this, in fact).  e.g.:  - `MyField`  - `Max(x) FILTER (WHERE y > 12) as ABC` (max of a field, if another field lets it qualify, with a nice column name)  - `count(*)` (count the rows for the given group, that would produce a rather ugly column name, but it works)  - `count(distinct x) as numOfXs`  If there was an illegal character in a field you are selecting from, you are responsible for bracketing it with [ ].   e.g.  - `some_field, count(*) as a, max(x) as b, min([column with space in name]) as nice_name`   where you would likely want to pass `1` as the `groupBy` also.
        String groupBy = "groupBy_example"; // String | Groups by the specified fields.   A comma delimited list of: 1 based numeric indexes (cleaner), or repeats of the select expressions (a bit verbose and must match exactly).   e.g. `2,3`, `myColumn`.   Default is null (meaning no grouping will be performed on the selected columns).   This applies only over the result set being requested here, meaning indexes into the \"select\" parameter fields.   Only specify this if you are selecting aggregations in the \"select\" parameter.
        Integer limit = 0; // Integer | When paginating, only return this number of records, page should also be specified.
        Integer page = 0; // Integer | 0-N based on chunk sized determined by the limit, ignored if limit < 1.
        try {
            String result = apiInstance.fetchQueryResultJsonProper(executionId, download, sortBy, filter, select, groupBy, limit, page).execute();
            System.out.println(result.toJson());
        } catch (ApiException e) {
            System.err.println("Exception when calling SqlBackgroundExecutionApi#fetchQueryResultJsonProper");
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
| **download** | **Boolean**| Makes this a file-download request (as opposed to returning the data in the response-body) | [optional] [default to false] |
| **sortBy** | **String**| Order the results by these fields.   Use the &#x60;-&#x60; sign to denote descending order, e.g. &#x60;-MyFieldName&#x60;. Numeric indexes may be used also, e.g. &#x60;2,-3&#x60;.   Multiple fields can be denoted by a comma e.g. &#x60;-MyFieldName,AnotherFieldName,-AFurtherFieldName&#x60;.   Default is null, the sort order specified in the query itself. | [optional] |
| **filter** | **String**| An ODATA filter per Finbourne.Filtering syntax. | [optional] |
| **select** | **String**| Default is null (meaning return all columns in the original query itself).  The values are in terms of the result column name from the original data set and are comma delimited.  The power of this comes in that you may aggregate the data if you wish  (that is the main reason for allowing this, in fact).  e.g.:  - &#x60;MyField&#x60;  - &#x60;Max(x) FILTER (WHERE y &gt; 12) as ABC&#x60; (max of a field, if another field lets it qualify, with a nice column name)  - &#x60;count(*)&#x60; (count the rows for the given group, that would produce a rather ugly column name, but it works)  - &#x60;count(distinct x) as numOfXs&#x60;  If there was an illegal character in a field you are selecting from, you are responsible for bracketing it with [ ].   e.g.  - &#x60;some_field, count(*) as a, max(x) as b, min([column with space in name]) as nice_name&#x60;   where you would likely want to pass &#x60;1&#x60; as the &#x60;groupBy&#x60; also. | [optional] |
| **groupBy** | **String**| Groups by the specified fields.   A comma delimited list of: 1 based numeric indexes (cleaner), or repeats of the select expressions (a bit verbose and must match exactly).   e.g. &#x60;2,3&#x60;, &#x60;myColumn&#x60;.   Default is null (meaning no grouping will be performed on the selected columns).   This applies only over the result set being requested here, meaning indexes into the \&quot;select\&quot; parameter fields.   Only specify this if you are selecting aggregations in the \&quot;select\&quot; parameter. | [optional] |
| **limit** | **Integer**| When paginating, only return this number of records, page should also be specified. | [optional] [default to 0] |
| **page** | **Integer**| 0-N based on chunk sized determined by the limit, ignored if limit &lt; 1. | [optional] [default to 0] |

### Return type

**String**

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


## fetchQueryResultParquet

> File fetchQueryResultParquet(executionId, sortBy, filter, select, groupBy)

FetchQueryResultParquet: Fetches the result from a previously started query, in Parquet format.

Fetch the data in various formats (if available, or if not simply being informed it is not yet ready) The following error codes are to be anticipated most with standard Problem Detail reports: - 400 BadRequest : Something failed with the execution of your query - 401 Unauthorized - 403 Forbidden - 404 Not Found : The requested query result doesn&#39;t (yet) exist. - 429 Too Many Requests : Please try your request again soon  1. The query has been executed successfully in the past yet the server-instance receiving this request (e.g. from a load balancer) doesn&#39;t yet have this data available.  1. By virtue of the request you have just placed this will have started to load from the persisted cache and will soon be available.  1. It is also the case that the original server-instance to process the original query is likely to already be able to service this request.

### Example

```java
import com.finbourne.luminesce.model.*;
import com.finbourne.luminesce.api.SqlBackgroundExecutionApi;
import com.finbourne.luminesce.extensions.ApiConfigurationException;
import com.finbourne.luminesce.extensions.ApiFactoryBuilder;
import com.finbourne.luminesce.extensions.auth.FinbourneTokenException;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class SqlBackgroundExecutionApiExample {

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

        SqlBackgroundExecutionApi apiInstance = ApiFactoryBuilder.build(fileName).build(SqlBackgroundExecutionApi.class);
        String executionId = "executionId_example"; // String | ExecutionId returned when starting the query
        String sortBy = "sortBy_example"; // String | Order the results by these fields.   Use the `-` sign to denote descending order, e.g. `-MyFieldName`. Numeric indexes may be used also, e.g. `2,-3`.   Multiple fields can be denoted by a comma e.g. `-MyFieldName,AnotherFieldName,-AFurtherFieldName`.   Default is null, the sort order specified in the query itself.
        String filter = "filter_example"; // String | An ODATA filter per Finbourne.Filtering syntax.
        String select = "select_example"; // String | Default is null (meaning return all columns in the original query itself).  The values are in terms of the result column name from the original data set and are comma delimited.  The power of this comes in that you may aggregate the data if you wish  (that is the main reason for allowing this, in fact).  e.g.:  - `MyField`  - `Max(x) FILTER (WHERE y > 12) as ABC` (max of a field, if another field lets it qualify, with a nice column name)  - `count(*)` (count the rows for the given group, that would produce a rather ugly column name, but it works)  - `count(distinct x) as numOfXs`  If there was an illegal character in a field you are selecting from, you are responsible for bracketing it with [ ].   e.g.  - `some_field, count(*) as a, max(x) as b, min([column with space in name]) as nice_name`   where you would likely want to pass `1` as the `groupBy` also.
        String groupBy = "groupBy_example"; // String | Groups by the specified fields.   A comma delimited list of: 1 based numeric indexes (cleaner), or repeats of the select expressions (a bit verbose and must match exactly).   e.g. `2,3`, `myColumn`.   Default is null (meaning no grouping will be performed on the selected columns).   This applies only over the result set being requested here, meaning indexes into the \"select\" parameter fields.   Only specify this if you are selecting aggregations in the \"select\" parameter.
        try {
            File result = apiInstance.fetchQueryResultParquet(executionId, sortBy, filter, select, groupBy).execute();
            System.out.println(result.toJson());
        } catch (ApiException e) {
            System.err.println("Exception when calling SqlBackgroundExecutionApi#fetchQueryResultParquet");
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
| **sortBy** | **String**| Order the results by these fields.   Use the &#x60;-&#x60; sign to denote descending order, e.g. &#x60;-MyFieldName&#x60;. Numeric indexes may be used also, e.g. &#x60;2,-3&#x60;.   Multiple fields can be denoted by a comma e.g. &#x60;-MyFieldName,AnotherFieldName,-AFurtherFieldName&#x60;.   Default is null, the sort order specified in the query itself. | [optional] |
| **filter** | **String**| An ODATA filter per Finbourne.Filtering syntax. | [optional] |
| **select** | **String**| Default is null (meaning return all columns in the original query itself).  The values are in terms of the result column name from the original data set and are comma delimited.  The power of this comes in that you may aggregate the data if you wish  (that is the main reason for allowing this, in fact).  e.g.:  - &#x60;MyField&#x60;  - &#x60;Max(x) FILTER (WHERE y &gt; 12) as ABC&#x60; (max of a field, if another field lets it qualify, with a nice column name)  - &#x60;count(*)&#x60; (count the rows for the given group, that would produce a rather ugly column name, but it works)  - &#x60;count(distinct x) as numOfXs&#x60;  If there was an illegal character in a field you are selecting from, you are responsible for bracketing it with [ ].   e.g.  - &#x60;some_field, count(*) as a, max(x) as b, min([column with space in name]) as nice_name&#x60;   where you would likely want to pass &#x60;1&#x60; as the &#x60;groupBy&#x60; also. | [optional] |
| **groupBy** | **String**| Groups by the specified fields.   A comma delimited list of: 1 based numeric indexes (cleaner), or repeats of the select expressions (a bit verbose and must match exactly).   e.g. &#x60;2,3&#x60;, &#x60;myColumn&#x60;.   Default is null (meaning no grouping will be performed on the selected columns).   This applies only over the result set being requested here, meaning indexes into the \&quot;select\&quot; parameter fields.   Only specify this if you are selecting aggregations in the \&quot;select\&quot; parameter. | [optional] |

### Return type

[**File**](File.md)

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


## fetchQueryResultPipe

> String fetchQueryResultPipe(executionId, download, sortBy, filter, select, groupBy, limit, page)

FetchQueryResultPipe: Fetches the result from a previously started query, in pipe-delimited format.

Fetch the data in various formats (if available, or if not simply being informed it is not yet ready) The following error codes are to be anticipated most with standard Problem Detail reports: - 400 BadRequest : Something failed with the execution of your query - 401 Unauthorized - 403 Forbidden - 404 Not Found : The requested query result doesn&#39;t (yet) exist. - 429 Too Many Requests : Please try your request again soon  1. The query has been executed successfully in the past yet the server-instance receiving this request (e.g. from a load balancer) doesn&#39;t yet have this data available.  1. By virtue of the request you have just placed this will have started to load from the persisted cache and will soon be available.  1. It is also the case that the original server-instance to process the original query is likely to already be able to service this request.

### Example

```java
import com.finbourne.luminesce.model.*;
import com.finbourne.luminesce.api.SqlBackgroundExecutionApi;
import com.finbourne.luminesce.extensions.ApiConfigurationException;
import com.finbourne.luminesce.extensions.ApiFactoryBuilder;
import com.finbourne.luminesce.extensions.auth.FinbourneTokenException;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class SqlBackgroundExecutionApiExample {

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

        SqlBackgroundExecutionApi apiInstance = ApiFactoryBuilder.build(fileName).build(SqlBackgroundExecutionApi.class);
        String executionId = "executionId_example"; // String | ExecutionId returned when starting the query
        Boolean download = false; // Boolean | Makes this a file-download request (as opposed to returning the data in the response-body)
        String sortBy = "sortBy_example"; // String | Order the results by these fields.   Use the `-` sign to denote descending order, e.g. `-MyFieldName`. Numeric indexes may be used also, e.g. `2,-3`.   Multiple fields can be denoted by a comma e.g. `-MyFieldName,AnotherFieldName,-AFurtherFieldName`.   Default is null, the sort order specified in the query itself.
        String filter = "filter_example"; // String | An ODATA filter per Finbourne.Filtering syntax.
        String select = "select_example"; // String | Default is null (meaning return all columns in the original query itself).  The values are in terms of the result column name from the original data set and are comma delimited.  The power of this comes in that you may aggregate the data if you wish  (that is the main reason for allowing this, in fact).  e.g.:  - `MyField`  - `Max(x) FILTER (WHERE y > 12) as ABC` (max of a field, if another field lets it qualify, with a nice column name)  - `count(*)` (count the rows for the given group, that would produce a rather ugly column name, but it works)  - `count(distinct x) as numOfXs`  If there was an illegal character in a field you are selecting from, you are responsible for bracketing it with [ ].   e.g.  - `some_field, count(*) as a, max(x) as b, min([column with space in name]) as nice_name`   where you would likely want to pass `1` as the `groupBy` also.
        String groupBy = "groupBy_example"; // String | Groups by the specified fields.   A comma delimited list of: 1 based numeric indexes (cleaner), or repeats of the select expressions (a bit verbose and must match exactly).   e.g. `2,3`, `myColumn`.   Default is null (meaning no grouping will be performed on the selected columns).   This applies only over the result set being requested here, meaning indexes into the \"select\" parameter fields.   Only specify this if you are selecting aggregations in the \"select\" parameter.
        Integer limit = 0; // Integer | When paginating, only return this number of records, page should also be specified.
        Integer page = 0; // Integer | 0-N based on chunk sized determined by the limit, ignored if limit < 1.
        try {
            String result = apiInstance.fetchQueryResultPipe(executionId, download, sortBy, filter, select, groupBy, limit, page).execute();
            System.out.println(result.toJson());
        } catch (ApiException e) {
            System.err.println("Exception when calling SqlBackgroundExecutionApi#fetchQueryResultPipe");
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
| **download** | **Boolean**| Makes this a file-download request (as opposed to returning the data in the response-body) | [optional] [default to false] |
| **sortBy** | **String**| Order the results by these fields.   Use the &#x60;-&#x60; sign to denote descending order, e.g. &#x60;-MyFieldName&#x60;. Numeric indexes may be used also, e.g. &#x60;2,-3&#x60;.   Multiple fields can be denoted by a comma e.g. &#x60;-MyFieldName,AnotherFieldName,-AFurtherFieldName&#x60;.   Default is null, the sort order specified in the query itself. | [optional] |
| **filter** | **String**| An ODATA filter per Finbourne.Filtering syntax. | [optional] |
| **select** | **String**| Default is null (meaning return all columns in the original query itself).  The values are in terms of the result column name from the original data set and are comma delimited.  The power of this comes in that you may aggregate the data if you wish  (that is the main reason for allowing this, in fact).  e.g.:  - &#x60;MyField&#x60;  - &#x60;Max(x) FILTER (WHERE y &gt; 12) as ABC&#x60; (max of a field, if another field lets it qualify, with a nice column name)  - &#x60;count(*)&#x60; (count the rows for the given group, that would produce a rather ugly column name, but it works)  - &#x60;count(distinct x) as numOfXs&#x60;  If there was an illegal character in a field you are selecting from, you are responsible for bracketing it with [ ].   e.g.  - &#x60;some_field, count(*) as a, max(x) as b, min([column with space in name]) as nice_name&#x60;   where you would likely want to pass &#x60;1&#x60; as the &#x60;groupBy&#x60; also. | [optional] |
| **groupBy** | **String**| Groups by the specified fields.   A comma delimited list of: 1 based numeric indexes (cleaner), or repeats of the select expressions (a bit verbose and must match exactly).   e.g. &#x60;2,3&#x60;, &#x60;myColumn&#x60;.   Default is null (meaning no grouping will be performed on the selected columns).   This applies only over the result set being requested here, meaning indexes into the \&quot;select\&quot; parameter fields.   Only specify this if you are selecting aggregations in the \&quot;select\&quot; parameter. | [optional] |
| **limit** | **Integer**| When paginating, only return this number of records, page should also be specified. | [optional] [default to 0] |
| **page** | **Integer**| 0-N based on chunk sized determined by the limit, ignored if limit &lt; 1. | [optional] [default to 0] |

### Return type

**String**

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


## fetchQueryResultSqlite

> File fetchQueryResultSqlite(executionId, sortBy, filter, select, groupBy)

FetchQueryResultSqlite: Fetches the result from a previously started query, in SqLite format.

Fetch the data in various formats (if available, or if not simply being informed it is not yet ready) The following error codes are to be anticipated most with standard Problem Detail reports: - 400 BadRequest : Something failed with the execution of your query - 401 Unauthorized - 403 Forbidden - 404 Not Found : The requested query result doesn&#39;t (yet) exist. - 429 Too Many Requests : Please try your request again soon  1. The query has been executed successfully in the past yet the server-instance receiving this request (e.g. from a load balancer) doesn&#39;t yet have this data available.  1. By virtue of the request you have just placed this will have started to load from the persisted cache and will soon be available.  1. It is also the case that the original server-instance to process the original query is likely to already be able to service this request.

### Example

```java
import com.finbourne.luminesce.model.*;
import com.finbourne.luminesce.api.SqlBackgroundExecutionApi;
import com.finbourne.luminesce.extensions.ApiConfigurationException;
import com.finbourne.luminesce.extensions.ApiFactoryBuilder;
import com.finbourne.luminesce.extensions.auth.FinbourneTokenException;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class SqlBackgroundExecutionApiExample {

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

        SqlBackgroundExecutionApi apiInstance = ApiFactoryBuilder.build(fileName).build(SqlBackgroundExecutionApi.class);
        String executionId = "executionId_example"; // String | ExecutionId returned when starting the query
        String sortBy = "sortBy_example"; // String | Order the results by these fields.   Use the `-` sign to denote descending order, e.g. `-MyFieldName`. Numeric indexes may be used also, e.g. `2,-3`.   Multiple fields can be denoted by a comma e.g. `-MyFieldName,AnotherFieldName,-AFurtherFieldName`.   Default is null, the sort order specified in the query itself.
        String filter = "filter_example"; // String | An ODATA filter per Finbourne.Filtering syntax.
        String select = "select_example"; // String | Default is null (meaning return all columns in the original query itself).  The values are in terms of the result column name from the original data set and are comma delimited.  The power of this comes in that you may aggregate the data if you wish  (that is the main reason for allowing this, in fact).  e.g.:  - `MyField`  - `Max(x) FILTER (WHERE y > 12) as ABC` (max of a field, if another field lets it qualify, with a nice column name)  - `count(*)` (count the rows for the given group, that would produce a rather ugly column name, but it works)  - `count(distinct x) as numOfXs`  If there was an illegal character in a field you are selecting from, you are responsible for bracketing it with [ ].   e.g.  - `some_field, count(*) as a, max(x) as b, min([column with space in name]) as nice_name`   where you would likely want to pass `1` as the `groupBy` also.
        String groupBy = "groupBy_example"; // String | Groups by the specified fields.   A comma delimited list of: 1 based numeric indexes (cleaner), or repeats of the select expressions (a bit verbose and must match exactly).   e.g. `2,3`, `myColumn`.   Default is null (meaning no grouping will be performed on the selected columns).   This applies only over the result set being requested here, meaning indexes into the \"select\" parameter fields.   Only specify this if you are selecting aggregations in the \"select\" parameter.
        try {
            File result = apiInstance.fetchQueryResultSqlite(executionId, sortBy, filter, select, groupBy).execute();
            System.out.println(result.toJson());
        } catch (ApiException e) {
            System.err.println("Exception when calling SqlBackgroundExecutionApi#fetchQueryResultSqlite");
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
| **sortBy** | **String**| Order the results by these fields.   Use the &#x60;-&#x60; sign to denote descending order, e.g. &#x60;-MyFieldName&#x60;. Numeric indexes may be used also, e.g. &#x60;2,-3&#x60;.   Multiple fields can be denoted by a comma e.g. &#x60;-MyFieldName,AnotherFieldName,-AFurtherFieldName&#x60;.   Default is null, the sort order specified in the query itself. | [optional] |
| **filter** | **String**| An ODATA filter per Finbourne.Filtering syntax. | [optional] |
| **select** | **String**| Default is null (meaning return all columns in the original query itself).  The values are in terms of the result column name from the original data set and are comma delimited.  The power of this comes in that you may aggregate the data if you wish  (that is the main reason for allowing this, in fact).  e.g.:  - &#x60;MyField&#x60;  - &#x60;Max(x) FILTER (WHERE y &gt; 12) as ABC&#x60; (max of a field, if another field lets it qualify, with a nice column name)  - &#x60;count(*)&#x60; (count the rows for the given group, that would produce a rather ugly column name, but it works)  - &#x60;count(distinct x) as numOfXs&#x60;  If there was an illegal character in a field you are selecting from, you are responsible for bracketing it with [ ].   e.g.  - &#x60;some_field, count(*) as a, max(x) as b, min([column with space in name]) as nice_name&#x60;   where you would likely want to pass &#x60;1&#x60; as the &#x60;groupBy&#x60; also. | [optional] |
| **groupBy** | **String**| Groups by the specified fields.   A comma delimited list of: 1 based numeric indexes (cleaner), or repeats of the select expressions (a bit verbose and must match exactly).   e.g. &#x60;2,3&#x60;, &#x60;myColumn&#x60;.   Default is null (meaning no grouping will be performed on the selected columns).   This applies only over the result set being requested here, meaning indexes into the \&quot;select\&quot; parameter fields.   Only specify this if you are selecting aggregations in the \&quot;select\&quot; parameter. | [optional] |

### Return type

[**File**](File.md)

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


## fetchQueryResultXml

> String fetchQueryResultXml(executionId, download, sortBy, filter, select, groupBy, limit, page)

FetchQueryResultXml: Fetches the result from a previously started query, in Xml format.

Fetch the data in various formats (if available, or if not simply being informed it is not yet ready) The following error codes are to be anticipated most with standard Problem Detail reports: - 400 BadRequest : Something failed with the execution of your query - 401 Unauthorized - 403 Forbidden - 404 Not Found : The requested query result doesn&#39;t (yet) exist. - 429 Too Many Requests : Please try your request again soon  1. The query has been executed successfully in the past yet the server-instance receiving this request (e.g. from a load balancer) doesn&#39;t yet have this data available.  1. By virtue of the request you have just placed this will have started to load from the persisted cache and will soon be available.  1. It is also the case that the original server-instance to process the original query is likely to already be able to service this request.

### Example

```java
import com.finbourne.luminesce.model.*;
import com.finbourne.luminesce.api.SqlBackgroundExecutionApi;
import com.finbourne.luminesce.extensions.ApiConfigurationException;
import com.finbourne.luminesce.extensions.ApiFactoryBuilder;
import com.finbourne.luminesce.extensions.auth.FinbourneTokenException;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class SqlBackgroundExecutionApiExample {

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

        SqlBackgroundExecutionApi apiInstance = ApiFactoryBuilder.build(fileName).build(SqlBackgroundExecutionApi.class);
        String executionId = "executionId_example"; // String | ExecutionId returned when starting the query
        Boolean download = false; // Boolean | Makes this a file-download request (as opposed to returning the data in the response-body)
        String sortBy = "sortBy_example"; // String | Order the results by these fields.   Use the `-` sign to denote descending order, e.g. `-MyFieldName`. Numeric indexes may be used also, e.g. `2,-3`.   Multiple fields can be denoted by a comma e.g. `-MyFieldName,AnotherFieldName,-AFurtherFieldName`.   Default is null, the sort order specified in the query itself.
        String filter = "filter_example"; // String | An ODATA filter per Finbourne.Filtering syntax.
        String select = "select_example"; // String | Default is null (meaning return all columns in the original query itself).  The values are in terms of the result column name from the original data set and are comma delimited.  The power of this comes in that you may aggregate the data if you wish  (that is the main reason for allowing this, in fact).  e.g.:  - `MyField`  - `Max(x) FILTER (WHERE y > 12) as ABC` (max of a field, if another field lets it qualify, with a nice column name)  - `count(*)` (count the rows for the given group, that would produce a rather ugly column name, but it works)  - `count(distinct x) as numOfXs`  If there was an illegal character in a field you are selecting from, you are responsible for bracketing it with [ ].   e.g.  - `some_field, count(*) as a, max(x) as b, min([column with space in name]) as nice_name`   where you would likely want to pass `1` as the `groupBy` also.
        String groupBy = "groupBy_example"; // String | Groups by the specified fields.   A comma delimited list of: 1 based numeric indexes (cleaner), or repeats of the select expressions (a bit verbose and must match exactly).   e.g. `2,3`, `myColumn`.   Default is null (meaning no grouping will be performed on the selected columns).   This applies only over the result set being requested here, meaning indexes into the \"select\" parameter fields.   Only specify this if you are selecting aggregations in the \"select\" parameter.
        Integer limit = 0; // Integer | When paginating, only return this number of records, page should also be specified.
        Integer page = 0; // Integer | 0-N based on chunk sized determined by the limit, ignored if limit < 1.
        try {
            String result = apiInstance.fetchQueryResultXml(executionId, download, sortBy, filter, select, groupBy, limit, page).execute();
            System.out.println(result.toJson());
        } catch (ApiException e) {
            System.err.println("Exception when calling SqlBackgroundExecutionApi#fetchQueryResultXml");
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
| **download** | **Boolean**| Makes this a file-download request (as opposed to returning the data in the response-body) | [optional] [default to false] |
| **sortBy** | **String**| Order the results by these fields.   Use the &#x60;-&#x60; sign to denote descending order, e.g. &#x60;-MyFieldName&#x60;. Numeric indexes may be used also, e.g. &#x60;2,-3&#x60;.   Multiple fields can be denoted by a comma e.g. &#x60;-MyFieldName,AnotherFieldName,-AFurtherFieldName&#x60;.   Default is null, the sort order specified in the query itself. | [optional] |
| **filter** | **String**| An ODATA filter per Finbourne.Filtering syntax. | [optional] |
| **select** | **String**| Default is null (meaning return all columns in the original query itself).  The values are in terms of the result column name from the original data set and are comma delimited.  The power of this comes in that you may aggregate the data if you wish  (that is the main reason for allowing this, in fact).  e.g.:  - &#x60;MyField&#x60;  - &#x60;Max(x) FILTER (WHERE y &gt; 12) as ABC&#x60; (max of a field, if another field lets it qualify, with a nice column name)  - &#x60;count(*)&#x60; (count the rows for the given group, that would produce a rather ugly column name, but it works)  - &#x60;count(distinct x) as numOfXs&#x60;  If there was an illegal character in a field you are selecting from, you are responsible for bracketing it with [ ].   e.g.  - &#x60;some_field, count(*) as a, max(x) as b, min([column with space in name]) as nice_name&#x60;   where you would likely want to pass &#x60;1&#x60; as the &#x60;groupBy&#x60; also. | [optional] |
| **groupBy** | **String**| Groups by the specified fields.   A comma delimited list of: 1 based numeric indexes (cleaner), or repeats of the select expressions (a bit verbose and must match exactly).   e.g. &#x60;2,3&#x60;, &#x60;myColumn&#x60;.   Default is null (meaning no grouping will be performed on the selected columns).   This applies only over the result set being requested here, meaning indexes into the \&quot;select\&quot; parameter fields.   Only specify this if you are selecting aggregations in the \&quot;select\&quot; parameter. | [optional] |
| **limit** | **Integer**| When paginating, only return this number of records, page should also be specified. | [optional] [default to 0] |
| **page** | **Integer**| 0-N based on chunk sized determined by the limit, ignored if limit &lt; 1. | [optional] [default to 0] |

### Return type

**String**

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


## getProgressOf

> BackgroundQueryProgressResponse getProgressOf(executionId, buildFromLogs)

GetProgressOf: View progress information (up until this point)

View progress information (up until this point) The following error codes are to be anticipated most with standard Problem Detail reports: - 401 Unauthorized - 403 Forbidden - 404 Not Found : The requested query result doesn&#39;t exist and is not running. - 429 Too Many Requests : Please try your request again soon  1. The query has been executed successfully in the past yet the server-instance receiving this request (e.g. from a load balancer) doesn&#39;t yet have this data available.  1. By virtue of the request you have just placed this will have started to load from the persisted cache and will soon be available.  1. It is also the case that the original server-instance to process the original query is likely to already be able to service this request.

### Example

```java
import com.finbourne.luminesce.model.*;
import com.finbourne.luminesce.api.SqlBackgroundExecutionApi;
import com.finbourne.luminesce.extensions.ApiConfigurationException;
import com.finbourne.luminesce.extensions.ApiFactoryBuilder;
import com.finbourne.luminesce.extensions.auth.FinbourneTokenException;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class SqlBackgroundExecutionApiExample {

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

        SqlBackgroundExecutionApi apiInstance = ApiFactoryBuilder.build(fileName).build(SqlBackgroundExecutionApi.class);
        String executionId = "executionId_example"; // String | ExecutionId returned when starting the query
        Boolean buildFromLogs = true; // Boolean | Should the response state be build from query logs if missing from the shared-db-state?  False will mean `404 Not Found` in cases where it was a real query but has passed its `keepForSeconds`  since the query completed (as well as 'this was not a query at all' of course)
        try {
            BackgroundQueryProgressResponse result = apiInstance.getProgressOf(executionId, buildFromLogs).execute();
            System.out.println(result.toJson());
        } catch (ApiException e) {
            System.err.println("Exception when calling SqlBackgroundExecutionApi#getProgressOf");
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
| **buildFromLogs** | **Boolean**| Should the response state be build from query logs if missing from the shared-db-state?  False will mean &#x60;404 Not Found&#x60; in cases where it was a real query but has passed its &#x60;keepForSeconds&#x60;  since the query completed (as well as &#39;this was not a query at all&#39; of course) | [default to true] |

### Return type

[**BackgroundQueryProgressResponse**](BackgroundQueryProgressResponse.md)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: text/plain, application/json, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

[Back to top](#) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to Model list](../README.md#documentation-for-models) &#8226; [Back to README](../README.md)


## startQuery

> BackgroundQueryResponse startQuery(body, scalarParameters, queryName, timeoutSeconds, keepForSeconds)

StartQuery: Starts to Execute LuminesceSql in the background.

 Allow for starting a potentially long running query and getting back an immediate response with how to  - fetch the data in various formats (if available, or if not simply being informed it is not yet ready) - view progress information (up until this point) - cancel the query (if still running) / clear the data (if already returned)  This can still error on things like an outright syntax error, but more runtime errors (e.g. from providers) will not cause this to error (that will happen when attempting to fetch data)  Here is an example that intentionally takes one minute to run:  &#x60;&#x60;&#x60;sql select Str, Takes500Ms from Testing1K where UseLinq &#x3D; true and [Int] &lt;&#x3D; 120 &#x60;&#x60;&#x60;  This is the only place in the Luminesce WebAPI where the following is supported. This will allow for the same user running a character-identical query not kick off a new query but simply be returned a reference  to the already running one for up to &#x60;N&#x60; seconds (where &#x60;N&#x60; should be &#x60;&lt;&#x3D;&#x60; &#x60;keepForSeconds&#x60;).  The following error codes are to be anticipated with standard Problem Detail reports: - 400 BadRequest - there was something wrong with your query syntax (the issue was detected at parse-time) - 401 Unauthorized - 403 Forbidden 

### Example

```java
import com.finbourne.luminesce.model.*;
import com.finbourne.luminesce.api.SqlBackgroundExecutionApi;
import com.finbourne.luminesce.extensions.ApiConfigurationException;
import com.finbourne.luminesce.extensions.ApiFactoryBuilder;
import com.finbourne.luminesce.extensions.auth.FinbourneTokenException;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class SqlBackgroundExecutionApiExample {

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

        SqlBackgroundExecutionApi apiInstance = ApiFactoryBuilder.build(fileName).build(SqlBackgroundExecutionApi.class);
        String body = select Str, Takes500Ms from Testing1K where UseLinq = true and [Int] <= 120; // String | The LuminesceSql query to kick off.
        Map<String, String> scalarParameters = new HashMap(); // Map<String, String> | Json encoded dictionary of key-value pairs for scalar parameter values to use in the sql execution.
        String queryName = "Intentionally slow test query"; // String | A name for this query. This goes into logs and is available in `Sys.Logs.HcQueryStart`.
        Integer timeoutSeconds = 0; // Integer | Maximum time the query may run for, in seconds: <0 → ∞, 0 → 7200 (2h)
        Integer keepForSeconds = 0; // Integer | Maximum time the result may be kept for, in seconds: <0 → 1200 (20m), 0 → 28800 (8h), max = 2,678,400 (31d)
        try {
            BackgroundQueryResponse result = apiInstance.startQuery(body, scalarParameters, queryName, timeoutSeconds, keepForSeconds).execute();
            System.out.println(result.toJson());
        } catch (ApiException e) {
            System.err.println("Exception when calling SqlBackgroundExecutionApi#startQuery");
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
| **body** | **String**| The LuminesceSql query to kick off. | |
| **scalarParameters** | [**Map&lt;String, String&gt;**](String.md)| Json encoded dictionary of key-value pairs for scalar parameter values to use in the sql execution. | [optional] |
| **queryName** | **String**| A name for this query. This goes into logs and is available in &#x60;Sys.Logs.HcQueryStart&#x60;. | [optional] |
| **timeoutSeconds** | **Integer**| Maximum time the query may run for, in seconds: &lt;0 → ∞, 0 → 7200 (2h) | [optional] [default to 0] |
| **keepForSeconds** | **Integer**| Maximum time the result may be kept for, in seconds: &lt;0 → 1200 (20m), 0 → 28800 (8h), max &#x3D; 2,678,400 (31d) | [optional] [default to 0] |

### Return type

[**BackgroundQueryResponse**](BackgroundQueryResponse.md)

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

