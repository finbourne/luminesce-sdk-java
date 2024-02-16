# HistoricallyExecutedQueriesApi

All URIs are relative to *https://fbn-prd.lusid.com/honeycomb*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**cancelHistory**](HistoricallyExecutedQueriesApi.md#cancelHistory) | **DELETE** /api/History/{executionId} | CancelHistory: Cancels (if running) or clears the data from (if completed) a previously started History query |
| [**fetchHistoryResultHistogram**](HistoricallyExecutedQueriesApi.md#fetchHistoryResultHistogram) | **GET** /api/History/{executionId}/histogram | FetchHistoryResultHistogram: Fetches the result from a previously started query, converts it to a histogram (counts in buckets). |
| [**fetchHistoryResultJson**](HistoricallyExecutedQueriesApi.md#fetchHistoryResultJson) | **GET** /api/History/{executionId}/json | FetchHistoryResultJson: Fetches the result from a previously started query, in JSON format. |
| [**getHistory**](HistoricallyExecutedQueriesApi.md#getHistory) | **GET** /api/History | GetHistory: Shows queries executed in a given historical time window (in Json format). |
| [**getProgressOfHistory**](HistoricallyExecutedQueriesApi.md#getProgressOfHistory) | **GET** /api/History/{executionId} | GetProgressOfHistory: View progress information (up until this point) of a history query |


<a id="cancelHistory"></a>
# **cancelHistory**
> BackgroundQueryCancelResponse cancelHistory(executionId).execute();

CancelHistory: Cancels (if running) or clears the data from (if completed) a previously started History query

Cancel the query (if still running) / clear the data (if already returned) The following error codes are to be anticipated with standard Problem Detail reports: - 401 Unauthorized - 404 Not Found : The requested query result doesn&#39;t exist and is not running. 

### Example
```java
// Import classes:
import com.finbourne.luminesce.ApiClient;
import com.finbourne.luminesce.ApiException;
import com.finbourne.luminesce.Configuration;
import com.finbourne.luminesce.auth.*;
import com.finbourne.luminesce.models.*;
import com.finbourne.luminesce.api.HistoricallyExecutedQueriesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://fbn-prd.lusid.com/honeycomb");
    
    // Configure OAuth2 access token for authorization: oauth2
    OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
    oauth2.setAccessToken("YOUR ACCESS TOKEN");

    HistoricallyExecutedQueriesApi apiInstance = new HistoricallyExecutedQueriesApi(defaultClient);
    String executionId = "executionId_example"; // String | ExecutionId returned when starting the query
    try {
      BackgroundQueryCancelResponse result = apiInstance.cancelHistory(executionId)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling HistoricallyExecutedQueriesApi#cancelHistory");
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
| **executionId** | **String**| ExecutionId returned when starting the query | |

### Return type

[**BackgroundQueryCancelResponse**](BackgroundQueryCancelResponse.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a id="fetchHistoryResultHistogram"></a>
# **fetchHistoryResultHistogram**
> String fetchHistoryResultHistogram(executionId).bucketSize(bucketSize).filter(filter).jsonProper(jsonProper).execute();

FetchHistoryResultHistogram: Fetches the result from a previously started query, converts it to a histogram (counts in buckets).

Fetch the histogram in Json format (if available, or if not simply being informed it is not yet ready) The following error codes are to be anticipated with standard Problem Detail reports: - 401 Unauthorized - 404 Not Found : The requested query result doesn&#39;t (yet) exist. - 429 Too Many Requests : Please try your request again soon  1. The query has been executed successfully in the past yet the server-instance receiving this request (e.g. from a load balancer) doesn&#39;t yet have this data available.  1. By virtue of the request you have just placed this will have started to load from the persisted cache and will soon be available.  1. It is also the case that the original server-instance to process the original query is likely to already be able to service this request.

### Example
```java
// Import classes:
import com.finbourne.luminesce.ApiClient;
import com.finbourne.luminesce.ApiException;
import com.finbourne.luminesce.Configuration;
import com.finbourne.luminesce.auth.*;
import com.finbourne.luminesce.models.*;
import com.finbourne.luminesce.api.HistoricallyExecutedQueriesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://fbn-prd.lusid.com/honeycomb");
    
    // Configure OAuth2 access token for authorization: oauth2
    OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
    oauth2.setAccessToken("YOUR ACCESS TOKEN");

    HistoricallyExecutedQueriesApi apiInstance = new HistoricallyExecutedQueriesApi(defaultClient);
    String executionId = "executionId_example"; // String | ExecutionId returned when starting the query
    String bucketSize = "bucketSize_example"; // String | Optional histogram bucket width. If not provided a set number of buckets between start/end range will be generated.
    String filter = "filter_example"; // String | An ODATA filter per Finbourne.Filtering syntax.
    Boolean jsonProper = false; // Boolean | Should this be text/json (not json-encoded-as-a-string)
    try {
      String result = apiInstance.fetchHistoryResultHistogram(executionId)
            .bucketSize(bucketSize)
            .filter(filter)
            .jsonProper(jsonProper)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling HistoricallyExecutedQueriesApi#fetchHistoryResultHistogram");
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
| **executionId** | **String**| ExecutionId returned when starting the query | |
| **bucketSize** | **String**| Optional histogram bucket width. If not provided a set number of buckets between start/end range will be generated. | [optional] |
| **filter** | **String**| An ODATA filter per Finbourne.Filtering syntax. | [optional] |
| **jsonProper** | **Boolean**| Should this be text/json (not json-encoded-as-a-string) | [optional] [default to false] |

### Return type

**String**

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **400** | Bad Request |  -  |

<a id="fetchHistoryResultJson"></a>
# **fetchHistoryResultJson**
> String fetchHistoryResultJson(executionId).sortBy(sortBy).filter(filter).select(select).groupBy(groupBy).limit(limit).page(page).jsonProper(jsonProper).execute();

FetchHistoryResultJson: Fetches the result from a previously started query, in JSON format.

Fetch the data in Json format (if available, or if not simply being informed it is not yet ready) The following error codes are to be anticipated with standard Problem Detail reports: - 401 Unauthorized - 404 Not Found : The requested query result doesn&#39;t (yet) exist. - 429 Too Many Requests : Please try your request again soon  1. The query has been executed successfully in the past yet the server-instance receiving this request (e.g. from a load balancer) doesn&#39;t yet have this data available.  1. By virtue of the request you have just placed this will have started to load from the persisted cache and will soon be available.  1. It is also the case that the original server-instance to process the original query is likely to already be able to service this request.

### Example
```java
// Import classes:
import com.finbourne.luminesce.ApiClient;
import com.finbourne.luminesce.ApiException;
import com.finbourne.luminesce.Configuration;
import com.finbourne.luminesce.auth.*;
import com.finbourne.luminesce.models.*;
import com.finbourne.luminesce.api.HistoricallyExecutedQueriesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://fbn-prd.lusid.com/honeycomb");
    
    // Configure OAuth2 access token for authorization: oauth2
    OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
    oauth2.setAccessToken("YOUR ACCESS TOKEN");

    HistoricallyExecutedQueriesApi apiInstance = new HistoricallyExecutedQueriesApi(defaultClient);
    String executionId = "executionId_example"; // String | ExecutionId returned when starting the query
    String sortBy = "sortBy_example"; // String | Order the results by these fields.   Use the `-` sign to denote descending order, e.g. `-MyFieldName`. Numeric indexes may be used also, e.g. `2,-3`.   Multiple fields can be denoted by a comma e.g. `-MyFieldName,AnotherFieldName,-AFurtherFieldName`.   Default is null, the sort order specified in the query itself.
    String filter = "filter_example"; // String | An ODATA filter per Finbourne.Filtering syntax.
    String select = "select_example"; // String | Default is null (meaning return all columns in the original query itself).  The values are in terms of the result column name from the original data set and are comma delimited.  The power of this comes in that you may aggregate the data if you wish  (that is the main reason for allowing this, in fact).  e.g.:  - `MyField`  - `Max(x) FILTER (WHERE y > 12) as ABC` (max of a field, if another field lets it qualify, with a nice column name)  - `count(*)` (count the rows for the given group, that would produce a rather ugly column name, but it works)  - `count(distinct x) as numOfXs`  If there was an illegal character in a field you are selecting from, you are responsible for bracketing it with [ ].   e.g.  - `some_field, count(*) as a, max(x) as b, min([column with space in name]) as nice_name`   where you would likely want to pass `1` as the `groupBy` also.
    String groupBy = "groupBy_example"; // String | Groups by the specified fields.   A comma delimited list of: 1 based numeric indexes (cleaner), or repeats of the select expressions (a bit verbose and must match exactly).   e.g. `2,3`, `myColumn`.   Default is null (meaning no grouping will be performed on the selected columns).   This applies only over the result set being requested here, meaning indexes into the \"select\" parameter fields.   Only specify this if you are selecting aggregations in the \"select\" parameter.
    Integer limit = 0; // Integer | When paginating, only return this number of records, page should also be specified.
    Integer page = 0; // Integer | 0-N based on chunk sized determined by the limit, ignored if limit < 1.
    Boolean jsonProper = false; // Boolean | Should this be text/json (not json-encoded-as-a-string)
    try {
      String result = apiInstance.fetchHistoryResultJson(executionId)
            .sortBy(sortBy)
            .filter(filter)
            .select(select)
            .groupBy(groupBy)
            .limit(limit)
            .page(page)
            .jsonProper(jsonProper)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling HistoricallyExecutedQueriesApi#fetchHistoryResultJson");
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
| **executionId** | **String**| ExecutionId returned when starting the query | |
| **sortBy** | **String**| Order the results by these fields.   Use the &#x60;-&#x60; sign to denote descending order, e.g. &#x60;-MyFieldName&#x60;. Numeric indexes may be used also, e.g. &#x60;2,-3&#x60;.   Multiple fields can be denoted by a comma e.g. &#x60;-MyFieldName,AnotherFieldName,-AFurtherFieldName&#x60;.   Default is null, the sort order specified in the query itself. | [optional] |
| **filter** | **String**| An ODATA filter per Finbourne.Filtering syntax. | [optional] |
| **select** | **String**| Default is null (meaning return all columns in the original query itself).  The values are in terms of the result column name from the original data set and are comma delimited.  The power of this comes in that you may aggregate the data if you wish  (that is the main reason for allowing this, in fact).  e.g.:  - &#x60;MyField&#x60;  - &#x60;Max(x) FILTER (WHERE y &gt; 12) as ABC&#x60; (max of a field, if another field lets it qualify, with a nice column name)  - &#x60;count(*)&#x60; (count the rows for the given group, that would produce a rather ugly column name, but it works)  - &#x60;count(distinct x) as numOfXs&#x60;  If there was an illegal character in a field you are selecting from, you are responsible for bracketing it with [ ].   e.g.  - &#x60;some_field, count(*) as a, max(x) as b, min([column with space in name]) as nice_name&#x60;   where you would likely want to pass &#x60;1&#x60; as the &#x60;groupBy&#x60; also. | [optional] |
| **groupBy** | **String**| Groups by the specified fields.   A comma delimited list of: 1 based numeric indexes (cleaner), or repeats of the select expressions (a bit verbose and must match exactly).   e.g. &#x60;2,3&#x60;, &#x60;myColumn&#x60;.   Default is null (meaning no grouping will be performed on the selected columns).   This applies only over the result set being requested here, meaning indexes into the \&quot;select\&quot; parameter fields.   Only specify this if you are selecting aggregations in the \&quot;select\&quot; parameter. | [optional] |
| **limit** | **Integer**| When paginating, only return this number of records, page should also be specified. | [optional] [default to 0] |
| **page** | **Integer**| 0-N based on chunk sized determined by the limit, ignored if limit &lt; 1. | [optional] [default to 0] |
| **jsonProper** | **Boolean**| Should this be text/json (not json-encoded-as-a-string) | [optional] [default to false] |

### Return type

**String**

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **400** | Bad Request |  -  |

<a id="getHistory"></a>
# **getHistory**
> BackgroundQueryResponse getHistory().startAt(startAt).endAt(endAt).freeTextSearch(freeTextSearch).showAll(showAll).mayUseNativeStore(mayUseNativeStore).execute();

GetHistory: Shows queries executed in a given historical time window (in Json format).

 Starts to load the historical query logs for a certain time range, search criteria, etc.  The following error codes are to be anticipated with standard Problem Detail reports: - 401 Unauthorized 

### Example
```java
// Import classes:
import com.finbourne.luminesce.ApiClient;
import com.finbourne.luminesce.ApiException;
import com.finbourne.luminesce.Configuration;
import com.finbourne.luminesce.auth.*;
import com.finbourne.luminesce.models.*;
import com.finbourne.luminesce.api.HistoricallyExecutedQueriesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://fbn-prd.lusid.com/honeycomb");
    
    // Configure OAuth2 access token for authorization: oauth2
    OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
    oauth2.setAccessToken("YOUR ACCESS TOKEN");

    HistoricallyExecutedQueriesApi apiInstance = new HistoricallyExecutedQueriesApi(defaultClient);
    OffsetDateTime startAt = OffsetDateTime.now(); // OffsetDateTime | Date time to start the search from. Will default to Now - 1 Day
    OffsetDateTime endAt = OffsetDateTime.now(); // OffsetDateTime | Date time to end the search at. Defaults to now.
    String freeTextSearch = "freeTextSearch_example"; // String | Some test that must be in at least one field returned.
    Boolean showAll = false; // Boolean | For users with extra permissions, they may optionally see other users' queries.
    Boolean mayUseNativeStore = true; // Boolean | Should a native data store (e.g. Athena or Fabric) be used over Elastic Search if available?
    try {
      BackgroundQueryResponse result = apiInstance.getHistory()
            .startAt(startAt)
            .endAt(endAt)
            .freeTextSearch(freeTextSearch)
            .showAll(showAll)
            .mayUseNativeStore(mayUseNativeStore)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling HistoricallyExecutedQueriesApi#getHistory");
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
| **startAt** | **OffsetDateTime**| Date time to start the search from. Will default to Now - 1 Day | [optional] |
| **endAt** | **OffsetDateTime**| Date time to end the search at. Defaults to now. | [optional] |
| **freeTextSearch** | **String**| Some test that must be in at least one field returned. | [optional] |
| **showAll** | **Boolean**| For users with extra permissions, they may optionally see other users&#39; queries. | [optional] [default to false] |
| **mayUseNativeStore** | **Boolean**| Should a native data store (e.g. Athena or Fabric) be used over Elastic Search if available? | [optional] [default to true] |

### Return type

[**BackgroundQueryResponse**](BackgroundQueryResponse.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **202** | Accepted |  -  |

<a id="getProgressOfHistory"></a>
# **getProgressOfHistory**
> BackgroundQueryProgressResponse getProgressOfHistory(executionId).execute();

GetProgressOfHistory: View progress information (up until this point) of a history query

View progress information (up until this point) of previously started History query The following error codes are to be anticipated with standard Problem Detail reports: - 401 Unauthorized - 404 Not Found : The requested query result doesn&#39;t exist and is not running. - 429 Too Many Requests : Please try your request again soon  1. The query has been executed successfully in the past yet the server-instance receiving this request (e.g. from a load balancer) doesn&#39;t yet have this data available.  1. By virtue of the request you have just placed this will have started to load from the persisted cache and will soon be available.  1. It is also the case that the original server-instance to process the original query is likely to already be able to service this request.

### Example
```java
// Import classes:
import com.finbourne.luminesce.ApiClient;
import com.finbourne.luminesce.ApiException;
import com.finbourne.luminesce.Configuration;
import com.finbourne.luminesce.auth.*;
import com.finbourne.luminesce.models.*;
import com.finbourne.luminesce.api.HistoricallyExecutedQueriesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://fbn-prd.lusid.com/honeycomb");
    
    // Configure OAuth2 access token for authorization: oauth2
    OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
    oauth2.setAccessToken("YOUR ACCESS TOKEN");

    HistoricallyExecutedQueriesApi apiInstance = new HistoricallyExecutedQueriesApi(defaultClient);
    String executionId = "executionId_example"; // String | ExecutionId returned when starting the query
    try {
      BackgroundQueryProgressResponse result = apiInstance.getProgressOfHistory(executionId)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling HistoricallyExecutedQueriesApi#getProgressOfHistory");
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
| **executionId** | **String**| ExecutionId returned when starting the query | |

### Return type

[**BackgroundQueryProgressResponse**](BackgroundQueryProgressResponse.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

