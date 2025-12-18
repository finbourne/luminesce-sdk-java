# HistoricallyExecutedQueriesApi

All URIs are relative to *https://fbn-prd.lusid.com/honeycomb*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**cancelHistory**](HistoricallyExecutedQueriesApi.md#cancelHistory) | **DELETE** /api/History/{executionId} | CancelHistory: Cancel / Clear data from a history search |
| [**fetchHistoryResultHistogram**](HistoricallyExecutedQueriesApi.md#fetchHistoryResultHistogram) | **GET** /api/History/{executionId}/histogram | FetchHistoryResultHistogram: Make a histogram of results of a history search |
| [**fetchHistoryResultJson**](HistoricallyExecutedQueriesApi.md#fetchHistoryResultJson) | **GET** /api/History/{executionId}/json | FetchHistoryResultJson: Fetch JSON results from a query history search |
| [**getHistory**](HistoricallyExecutedQueriesApi.md#getHistory) | **GET** /api/History | GetHistory: Start a background history search |
| [**getProgressOfHistory**](HistoricallyExecutedQueriesApi.md#getProgressOfHistory) | **GET** /api/History/{executionId} | GetProgressOfHistory: View progress of a history search |



## cancelHistory

> BackgroundQueryCancelResponse cancelHistory(executionId)

CancelHistory: Cancel / Clear data from a history search

Cancel the query (if still running) / clear the data (if already returned) The following error codes are to be anticipated with standard Problem Detail reports: - 401 Unauthorized - 403 Forbidden - 404 Not Found : The requested query result doesn&#39;t exist and is not running. 

### Example

```java
import com.finbourne.luminesce.model.*;
import com.finbourne.luminesce.api.HistoricallyExecutedQueriesApi;
import com.finbourne.luminesce.extensions.ApiConfigurationException;
import com.finbourne.luminesce.extensions.ApiFactoryBuilder;
import com.finbourne.luminesce.extensions.auth.FinbourneTokenException;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class HistoricallyExecutedQueriesApiExample {

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
        // HistoricallyExecutedQueriesApi apiInstance = apiFactory.build(HistoricallyExecutedQueriesApi.class);

        HistoricallyExecutedQueriesApi apiInstance = ApiFactoryBuilder.build(fileName).build(HistoricallyExecutedQueriesApi.class);
        String executionId = "executionId_example"; // String | ExecutionId returned when starting the query
        try {
            // uncomment the below to set overrides at the request level
            // BackgroundQueryCancelResponse result = apiInstance.cancelHistory(executionId).execute(opts);

            BackgroundQueryCancelResponse result = apiInstance.cancelHistory(executionId).execute();
            System.out.println(result.toJson());
        } catch (ApiException e) {
            System.err.println("Exception when calling HistoricallyExecutedQueriesApi#cancelHistory");
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


## fetchHistoryResultHistogram

> String fetchHistoryResultHistogram(executionId, bucketSize, filter, jsonProper)

FetchHistoryResultHistogram: Make a histogram of results of a history search

Fetch the histogram in Json format (if available, or if not simply being informed it is not yet ready) The following error codes are to be anticipated with standard Problem Detail reports: - 401 Unauthorized - 403 Forbidden - 404 Not Found : The requested query result doesn&#39;t (yet) exist. - 429 Too Many Requests : Please try your request again soon  1. The query has been executed successfully in the past yet the server-instance receiving this request (e.g. from a load balancer) doesn&#39;t yet have this data available.  1. By virtue of the request you have just placed this will have started to load from the persisted cache and will soon be available.  1. It is also the case that the original server-instance to process the original query is likely to already be able to service this request.

### Example

```java
import com.finbourne.luminesce.model.*;
import com.finbourne.luminesce.api.HistoricallyExecutedQueriesApi;
import com.finbourne.luminesce.extensions.ApiConfigurationException;
import com.finbourne.luminesce.extensions.ApiFactoryBuilder;
import com.finbourne.luminesce.extensions.auth.FinbourneTokenException;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class HistoricallyExecutedQueriesApiExample {

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
        // HistoricallyExecutedQueriesApi apiInstance = apiFactory.build(HistoricallyExecutedQueriesApi.class);

        HistoricallyExecutedQueriesApi apiInstance = ApiFactoryBuilder.build(fileName).build(HistoricallyExecutedQueriesApi.class);
        String executionId = "executionId_example"; // String | ExecutionId returned when starting the query
        String bucketSize = "bucketSize_example"; // String | Optional histogram bucket width. If not provided a set number of buckets between start/end range will be generated.
        String filter = "filter_example"; // String | An ODATA filter per Finbourne.Filtering syntax.
        Boolean jsonProper = false; // Boolean | Should this be text/json (not json-encoded-as-a-string)
        try {
            // uncomment the below to set overrides at the request level
            // String result = apiInstance.fetchHistoryResultHistogram(executionId, bucketSize, filter, jsonProper).execute(opts);

            String result = apiInstance.fetchHistoryResultHistogram(executionId, bucketSize, filter, jsonProper).execute();
            System.out.println(result.toJson());
        } catch (ApiException e) {
            System.err.println("Exception when calling HistoricallyExecutedQueriesApi#fetchHistoryResultHistogram");
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
| **200** | OK |  -  |
| **400** | Bad Request |  -  |
| **403** | Forbidden |  -  |

[Back to top](#) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to Model list](../README.md#documentation-for-models) &#8226; [Back to README](../README.md)


## fetchHistoryResultJson

> String fetchHistoryResultJson(executionId, sortBy, filter, select, groupBy, limit, page, jsonProper)

FetchHistoryResultJson: Fetch JSON results from a query history search

Fetch the data in Json format (if available, or if not simply being informed it is not yet ready) The following error codes are to be anticipated with standard Problem Detail reports: - 401 Unauthorized - 403 Forbidden - 404 Not Found : The requested query result doesn&#39;t (yet) exist. - 429 Too Many Requests : Please try your request again soon  1. The query has been executed successfully in the past yet the server-instance receiving this request (e.g. from a load balancer) doesn&#39;t yet have this data available.  1. By virtue of the request you have just placed this will have started to load from the persisted cache and will soon be available.  1. It is also the case that the original server-instance to process the original query is likely to already be able to service this request.

### Example

```java
import com.finbourne.luminesce.model.*;
import com.finbourne.luminesce.api.HistoricallyExecutedQueriesApi;
import com.finbourne.luminesce.extensions.ApiConfigurationException;
import com.finbourne.luminesce.extensions.ApiFactoryBuilder;
import com.finbourne.luminesce.extensions.auth.FinbourneTokenException;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class HistoricallyExecutedQueriesApiExample {

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
        // HistoricallyExecutedQueriesApi apiInstance = apiFactory.build(HistoricallyExecutedQueriesApi.class);

        HistoricallyExecutedQueriesApi apiInstance = ApiFactoryBuilder.build(fileName).build(HistoricallyExecutedQueriesApi.class);
        String executionId = "executionId_example"; // String | ExecutionId returned when starting the query
        String sortBy = "sortBy_example"; // String | Order the results by these fields.  Use the `-` sign to denote descending order, e.g. `-MyFieldName`. Numeric indexes may be used also, e.g. `2,-3`.  Multiple fields can be denoted by a comma e.g. `-MyFieldName,AnotherFieldName,-AFurtherFieldName`.  Default is null, the sort order specified in the query itself.
        String filter = "filter_example"; // String | An ODATA filter per Finbourne.Filtering syntax.
        String select = "select_example"; // String | Default is null (meaning return all columns in the original query itself). The values are in terms of the result column name from the original data set and are comma delimited. The power of this comes in that you may aggregate the data if you wish (that is the main reason for allowing this, in fact). e.g.: - `MyField` - `Max(x) FILTER (WHERE y > 12) as ABC` (max of a field, if another field lets it qualify, with a nice column name) - `count(*)` (count the rows for the given group, that would produce a rather ugly column name, but it works) - `count(distinct x) as numOfXs` If there was an illegal character in a field you are selecting from, you are responsible for bracketing it with [ ].  e.g. - `some_field, count(*) as a, max(x) as b, min([column with space in name]) as nice_name`  where you would likely want to pass `1` as the `groupBy` also.
        String groupBy = "groupBy_example"; // String | Groups by the specified fields.  A comma delimited list of: 1 based numeric indexes (cleaner), or repeats of the select expressions (a bit verbose and must match exactly).  e.g. `2,3`, `myColumn`.  Default is null (meaning no grouping will be performed on the selected columns).  This applies only over the result set being requested here, meaning indexes into the \"select\" parameter fields.  Only specify this if you are selecting aggregations in the \"select\" parameter.
        Integer limit = 0; // Integer | When paginating, only return this number of records, page should also be specified.
        Integer page = 0; // Integer | 0-N based on chunk sized determined by the limit, ignored if limit < 1.
        Boolean jsonProper = false; // Boolean | Should this be text/json (not json-encoded-as-a-string)
        try {
            // uncomment the below to set overrides at the request level
            // String result = apiInstance.fetchHistoryResultJson(executionId, sortBy, filter, select, groupBy, limit, page, jsonProper).execute(opts);

            String result = apiInstance.fetchHistoryResultJson(executionId, sortBy, filter, select, groupBy, limit, page, jsonProper).execute();
            System.out.println(result.toJson());
        } catch (ApiException e) {
            System.err.println("Exception when calling HistoricallyExecutedQueriesApi#fetchHistoryResultJson");
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
| **sortBy** | **String**| Order the results by these fields.  Use the &#x60;-&#x60; sign to denote descending order, e.g. &#x60;-MyFieldName&#x60;. Numeric indexes may be used also, e.g. &#x60;2,-3&#x60;.  Multiple fields can be denoted by a comma e.g. &#x60;-MyFieldName,AnotherFieldName,-AFurtherFieldName&#x60;.  Default is null, the sort order specified in the query itself. | [optional] |
| **filter** | **String**| An ODATA filter per Finbourne.Filtering syntax. | [optional] |
| **select** | **String**| Default is null (meaning return all columns in the original query itself). The values are in terms of the result column name from the original data set and are comma delimited. The power of this comes in that you may aggregate the data if you wish (that is the main reason for allowing this, in fact). e.g.: - &#x60;MyField&#x60; - &#x60;Max(x) FILTER (WHERE y &gt; 12) as ABC&#x60; (max of a field, if another field lets it qualify, with a nice column name) - &#x60;count(*)&#x60; (count the rows for the given group, that would produce a rather ugly column name, but it works) - &#x60;count(distinct x) as numOfXs&#x60; If there was an illegal character in a field you are selecting from, you are responsible for bracketing it with [ ].  e.g. - &#x60;some_field, count(*) as a, max(x) as b, min([column with space in name]) as nice_name&#x60;  where you would likely want to pass &#x60;1&#x60; as the &#x60;groupBy&#x60; also. | [optional] |
| **groupBy** | **String**| Groups by the specified fields.  A comma delimited list of: 1 based numeric indexes (cleaner), or repeats of the select expressions (a bit verbose and must match exactly).  e.g. &#x60;2,3&#x60;, &#x60;myColumn&#x60;.  Default is null (meaning no grouping will be performed on the selected columns).  This applies only over the result set being requested here, meaning indexes into the \&quot;select\&quot; parameter fields.  Only specify this if you are selecting aggregations in the \&quot;select\&quot; parameter. | [optional] |
| **limit** | **Integer**| When paginating, only return this number of records, page should also be specified. | [optional] [default to 0] |
| **page** | **Integer**| 0-N based on chunk sized determined by the limit, ignored if limit &lt; 1. | [optional] [default to 0] |
| **jsonProper** | **Boolean**| Should this be text/json (not json-encoded-as-a-string) | [optional] [default to false] |

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


## getHistory

> BackgroundQueryResponse getHistory(startAt, endAt, freeTextSearch, showAll)

GetHistory: Start a background history search

 Starts to load the historical query logs for a certain time range, search criteria, etc.  The following error codes are to be anticipated with standard Problem Detail reports: - 401 Unauthorized - 403 Forbidden 

### Example

```java
import com.finbourne.luminesce.model.*;
import com.finbourne.luminesce.api.HistoricallyExecutedQueriesApi;
import com.finbourne.luminesce.extensions.ApiConfigurationException;
import com.finbourne.luminesce.extensions.ApiFactoryBuilder;
import com.finbourne.luminesce.extensions.auth.FinbourneTokenException;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class HistoricallyExecutedQueriesApiExample {

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
        // HistoricallyExecutedQueriesApi apiInstance = apiFactory.build(HistoricallyExecutedQueriesApi.class);

        HistoricallyExecutedQueriesApi apiInstance = ApiFactoryBuilder.build(fileName).build(HistoricallyExecutedQueriesApi.class);
        OffsetDateTime startAt = OffsetDateTime.now(); // OffsetDateTime | Date time to start the search from. Will default to Now - 1 Day
        OffsetDateTime endAt = OffsetDateTime.now(); // OffsetDateTime | Date time to end the search at. Defaults to now.
        String freeTextSearch = "freeTextSearch_example"; // String | Some test that must be in at least one field returned.
        Boolean showAll = false; // Boolean | For users with extra permissions, they may optionally see other users' queries.
        try {
            // uncomment the below to set overrides at the request level
            // BackgroundQueryResponse result = apiInstance.getHistory(startAt, endAt, freeTextSearch, showAll).execute(opts);

            BackgroundQueryResponse result = apiInstance.getHistory(startAt, endAt, freeTextSearch, showAll).execute();
            System.out.println(result.toJson());
        } catch (ApiException e) {
            System.err.println("Exception when calling HistoricallyExecutedQueriesApi#getHistory");
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
| **startAt** | **OffsetDateTime**| Date time to start the search from. Will default to Now - 1 Day | [optional] |
| **endAt** | **OffsetDateTime**| Date time to end the search at. Defaults to now. | [optional] |
| **freeTextSearch** | **String**| Some test that must be in at least one field returned. | [optional] |
| **showAll** | **Boolean**| For users with extra permissions, they may optionally see other users&#39; queries. | [optional] [default to false] |

### Return type

[**BackgroundQueryResponse**](BackgroundQueryResponse.md)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: text/plain, application/json, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **202** | Accepted |  -  |

[Back to top](#) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to Model list](../README.md#documentation-for-models) &#8226; [Back to README](../README.md)


## getProgressOfHistory

> BackgroundQueryProgressResponse getProgressOfHistory(executionId)

GetProgressOfHistory: View progress of a history search

View progress information (up until this point) of previously started History query The following error codes are to be anticipated with standard Problem Detail reports: - 401 Unauthorized - 403 Forbidden - 404 Not Found : The requested query result doesn&#39;t exist and is not running. - 429 Too Many Requests : Please try your request again soon  1. The query has been executed successfully in the past yet the server-instance receiving this request (e.g. from a load balancer) doesn&#39;t yet have this data available.  1. By virtue of the request you have just placed this will have started to load from the persisted cache and will soon be available.  1. It is also the case that the original server-instance to process the original query is likely to already be able to service this request.

### Example

```java
import com.finbourne.luminesce.model.*;
import com.finbourne.luminesce.api.HistoricallyExecutedQueriesApi;
import com.finbourne.luminesce.extensions.ApiConfigurationException;
import com.finbourne.luminesce.extensions.ApiFactoryBuilder;
import com.finbourne.luminesce.extensions.auth.FinbourneTokenException;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class HistoricallyExecutedQueriesApiExample {

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
        // HistoricallyExecutedQueriesApi apiInstance = apiFactory.build(HistoricallyExecutedQueriesApi.class);

        HistoricallyExecutedQueriesApi apiInstance = ApiFactoryBuilder.build(fileName).build(HistoricallyExecutedQueriesApi.class);
        String executionId = "executionId_example"; // String | ExecutionId returned when starting the query
        try {
            // uncomment the below to set overrides at the request level
            // BackgroundQueryProgressResponse result = apiInstance.getProgressOfHistory(executionId).execute(opts);

            BackgroundQueryProgressResponse result = apiInstance.getProgressOfHistory(executionId).execute();
            System.out.println(result.toJson());
        } catch (ApiException e) {
            System.err.println("Exception when calling HistoricallyExecutedQueriesApi#getProgressOfHistory");
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

[**BackgroundQueryProgressResponse**](BackgroundQueryProgressResponse.md)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: text/plain, application/json, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

[Back to top](#) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to Model list](../README.md#documentation-for-models) &#8226; [Back to README](../README.md)

