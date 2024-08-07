# SqlExecutionApi

All URIs are relative to *https://fbn-prd.lusid.com/honeycomb*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getByQueryCsv**](SqlExecutionApi.md#getByQueryCsv) | **GET** /api/Sql/csv/{query} | GetByQueryCsv: Executes Sql, returned in CSV format, where the sql is simply in the url. |
| [**getByQueryExcel**](SqlExecutionApi.md#getByQueryExcel) | **GET** /api/Sql/excel/{query} | GetByQueryExcel: Executes Sql, returned in Excel (xlsx) format (as a file to be downloaded) format, where the sql is simply in the url. |
| [**getByQueryJson**](SqlExecutionApi.md#getByQueryJson) | **GET** /api/Sql/json/{query} | GetByQueryJson: Executes Sql, returned in JSON format, where the sql is simply in the url. |
| [**getByQueryParquet**](SqlExecutionApi.md#getByQueryParquet) | **GET** /api/Sql/parquet/{query} | GetByQueryParquet: Executes Sql, returned in Parquet (.parquet) format (as a file to be downloaded) format, where the sql is simply in the url. |
| [**getByQueryPipe**](SqlExecutionApi.md#getByQueryPipe) | **GET** /api/Sql/pipe/{query} | GetByQueryPipe: Executes Sql, returned in pipe-delimited format, where the sql is simply in the url. |
| [**getByQuerySqlite**](SqlExecutionApi.md#getByQuerySqlite) | **GET** /api/Sql/sqlite/{query} | GetByQuerySqlite: Executes Sql, returned in SqLite DB (sqlite3) format (as a file to be downloaded) format, where the sql is simply in the url. |
| [**getByQueryXml**](SqlExecutionApi.md#getByQueryXml) | **GET** /api/Sql/xml/{query} | GetByQueryXml: Executes Sql, returned in Xml format, where the sql is simply in the url. |
| [**putByQueryCsv**](SqlExecutionApi.md#putByQueryCsv) | **PUT** /api/Sql/csv | PutByQueryCsv: Executes Sql, returned in CSV format, where the sql is the post-body url. |
| [**putByQueryExcel**](SqlExecutionApi.md#putByQueryExcel) | **PUT** /api/Sql/excel | PutByQueryExcel: Executes Sql, returned in Excel (xlsx) format (as a file to be downloaded), where the sql is the post-body url. |
| [**putByQueryJson**](SqlExecutionApi.md#putByQueryJson) | **PUT** /api/Sql/json | PutByQueryJson: Executes Sql, returned in JSON format, where the sql is the post-body url. |
| [**putByQueryParquet**](SqlExecutionApi.md#putByQueryParquet) | **PUT** /api/Sql/parquet | PutByQueryParquet: Executes Sql, returned in Parquet format, where the sql is the post-body url. |
| [**putByQueryPipe**](SqlExecutionApi.md#putByQueryPipe) | **PUT** /api/Sql/pipe | PutByQueryPipe: Executes Sql, returned in pipe-delimited format, where the sql is the post-body url. |
| [**putByQuerySqlite**](SqlExecutionApi.md#putByQuerySqlite) | **PUT** /api/Sql/sqlite | PutByQuerySqlite: Executes Sql, returned in SqLite DB (sqlite3) format (as a file to be downloaded), where the sql is the post-body url. |
| [**putByQueryXml**](SqlExecutionApi.md#putByQueryXml) | **PUT** /api/Sql/xml | PutByQueryXml: Executes Sql, returned in Xml format, where the sql is the post-body url. |



## getByQueryCsv

> String getByQueryCsv(query, scalarParameters, queryName, download, timeout, delimiter, escape)

GetByQueryCsv: Executes Sql, returned in CSV format, where the sql is simply in the url.

 For simple single-line query execution via the url. e.g. &#x60;select ^ from Sys.Field order by 1, 2&#x60;  The following error codes are to be anticipated with standard Problem Detail reports: - 400 BadRequest - something failed with the execution or parsing of your query - 401 Unauthorized - 403 Forbidden 

### Example

```java
import com.finbourne.luminesce.model.*;
import com.finbourne.luminesce.api.SqlExecutionApi;
import com.finbourne.luminesce.extensions.ApiConfigurationException;
import com.finbourne.luminesce.extensions.ApiFactoryBuilder;
import com.finbourne.luminesce.extensions.auth.FinbourneTokenException;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class SqlExecutionApiExample {

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

        SqlExecutionApi apiInstance = ApiFactoryBuilder.build(fileName).build(SqlExecutionApi.class);
        String query = "select ^ from Sys.Field order by 1, 2"; // String | LuminesceSql to Execute (must be one line only)
        Map<String, String> scalarParameters = new HashMap(); // Map<String, String> | Json encoded dictionary of key-value pairs for scalar parameter values to use in the sql execution.
        String queryName = "Get tables/fields"; // String | Name to apply to the query in logs and `Sys.Logs.HcQueryStart`
        Boolean download = false; // Boolean | Makes this a file-download request (as opposed to returning the data in the response-body)
        Integer timeout = 0; // Integer | In seconds: <0 → ∞, 0 → 120s
        String delimiter = "delimiter_example"; // String | Delimiter string to override the default
        String escape = "escape_example"; // String | Escape character to override the default
        try {
            String result = apiInstance.getByQueryCsv(query, scalarParameters, queryName, download, timeout, delimiter, escape).execute();
            System.out.println(result.toJson());
        } catch (ApiException e) {
            System.err.println("Exception when calling SqlExecutionApi#getByQueryCsv");
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
| **query** | **String**| LuminesceSql to Execute (must be one line only) | |
| **scalarParameters** | [**Map&lt;String, String&gt;**](String.md)| Json encoded dictionary of key-value pairs for scalar parameter values to use in the sql execution. | [optional] |
| **queryName** | **String**| Name to apply to the query in logs and &#x60;Sys.Logs.HcQueryStart&#x60; | [optional] |
| **download** | **Boolean**| Makes this a file-download request (as opposed to returning the data in the response-body) | [optional] [default to false] |
| **timeout** | **Integer**| In seconds: &lt;0 → ∞, 0 → 120s | [optional] [default to 0] |
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


## getByQueryExcel

> File getByQueryExcel(query, scalarParameters, queryName, timeout)

GetByQueryExcel: Executes Sql, returned in Excel (xlsx) format (as a file to be downloaded) format, where the sql is simply in the url.

 For simple single-line query execution via the url. e.g. &#x60;select ^ from Sys.Field order by 1, 2&#x60;  The following error codes are to be anticipated with standard Problem Detail reports: - 400 BadRequest - something failed with the execution or parsing of your query - 401 Unauthorized - 403 Forbidden 

### Example

```java
import com.finbourne.luminesce.model.*;
import com.finbourne.luminesce.api.SqlExecutionApi;
import com.finbourne.luminesce.extensions.ApiConfigurationException;
import com.finbourne.luminesce.extensions.ApiFactoryBuilder;
import com.finbourne.luminesce.extensions.auth.FinbourneTokenException;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class SqlExecutionApiExample {

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

        SqlExecutionApi apiInstance = ApiFactoryBuilder.build(fileName).build(SqlExecutionApi.class);
        String query = "select ^ from Sys.Field order by 1, 2"; // String | LuminesceSql to Execute (must be one line only)
        Map<String, String> scalarParameters = new HashMap(); // Map<String, String> | Json encoded dictionary of key-value pairs for scalar parameter values to use in the sql execution.
        String queryName = "Get tables/fields"; // String | Name to apply to the query in logs and `Sys.Logs.HcQueryStart`
        Integer timeout = 0; // Integer | In seconds: <0 → ∞, 0 → 120s
        try {
            File result = apiInstance.getByQueryExcel(query, scalarParameters, queryName, timeout).execute();
            System.out.println(result.toJson());
        } catch (ApiException e) {
            System.err.println("Exception when calling SqlExecutionApi#getByQueryExcel");
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
| **query** | **String**| LuminesceSql to Execute (must be one line only) | |
| **scalarParameters** | [**Map&lt;String, String&gt;**](String.md)| Json encoded dictionary of key-value pairs for scalar parameter values to use in the sql execution. | [optional] |
| **queryName** | **String**| Name to apply to the query in logs and &#x60;Sys.Logs.HcQueryStart&#x60; | [optional] |
| **timeout** | **Integer**| In seconds: &lt;0 → ∞, 0 → 120s | [optional] [default to 0] |

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


## getByQueryJson

> String getByQueryJson(query, scalarParameters, queryName, timeout, jsonProper)

GetByQueryJson: Executes Sql, returned in JSON format, where the sql is simply in the url.

 For simple single-line query execution via the url. e.g. &#x60;select ^ from Sys.Field order by 1, 2&#x60;  The following error codes are to be anticipated with standard Problem Detail reports: - 400 BadRequest - something failed with the execution or parsing of your query - 401 Unauthorized - 403 Forbidden 

### Example

```java
import com.finbourne.luminesce.model.*;
import com.finbourne.luminesce.api.SqlExecutionApi;
import com.finbourne.luminesce.extensions.ApiConfigurationException;
import com.finbourne.luminesce.extensions.ApiFactoryBuilder;
import com.finbourne.luminesce.extensions.auth.FinbourneTokenException;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class SqlExecutionApiExample {

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

        SqlExecutionApi apiInstance = ApiFactoryBuilder.build(fileName).build(SqlExecutionApi.class);
        String query = "select ^ from Sys.Field order by 1, 2"; // String | LuminesceSql to Execute (must be one line only)
        Map<String, String> scalarParameters = new HashMap(); // Map<String, String> | Json encoded dictionary of key-value pairs for scalar parameter values to use in the sql execution.
        String queryName = "Get tables/fields"; // String | Name to apply to the query in logs and `Sys.Logs.HcQueryStart`
        Integer timeout = 0; // Integer | In seconds: <0 → ∞, 0 → 120s
        Boolean jsonProper = false; // Boolean | Should this be text/json (not json-encoded-as-a-string)
        try {
            String result = apiInstance.getByQueryJson(query, scalarParameters, queryName, timeout, jsonProper).execute();
            System.out.println(result.toJson());
        } catch (ApiException e) {
            System.err.println("Exception when calling SqlExecutionApi#getByQueryJson");
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
| **query** | **String**| LuminesceSql to Execute (must be one line only) | |
| **scalarParameters** | [**Map&lt;String, String&gt;**](String.md)| Json encoded dictionary of key-value pairs for scalar parameter values to use in the sql execution. | [optional] |
| **queryName** | **String**| Name to apply to the query in logs and &#x60;Sys.Logs.HcQueryStart&#x60; | [optional] |
| **timeout** | **Integer**| In seconds: &lt;0 → ∞, 0 → 120s | [optional] [default to 0] |
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


## getByQueryParquet

> File getByQueryParquet(query, scalarParameters, queryName, timeout)

GetByQueryParquet: Executes Sql, returned in Parquet (.parquet) format (as a file to be downloaded) format, where the sql is simply in the url.

 For simple single-line query execution via the url. e.g. &#x60;select ^ from Sys.Field order by 1, 2&#x60;  The following error codes are to be anticipated with standard Problem Detail reports: - 400 BadRequest - something failed with the execution or parsing of your query - 401 Unauthorized - 403 Forbidden 

### Example

```java
import com.finbourne.luminesce.model.*;
import com.finbourne.luminesce.api.SqlExecutionApi;
import com.finbourne.luminesce.extensions.ApiConfigurationException;
import com.finbourne.luminesce.extensions.ApiFactoryBuilder;
import com.finbourne.luminesce.extensions.auth.FinbourneTokenException;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class SqlExecutionApiExample {

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

        SqlExecutionApi apiInstance = ApiFactoryBuilder.build(fileName).build(SqlExecutionApi.class);
        String query = "select ^ from Sys.Field order by 1, 2"; // String | LuminesceSql to Execute (must be one line only)
        Map<String, String> scalarParameters = new HashMap(); // Map<String, String> | Json encoded dictionary of key-value pairs for scalar parameter values to use in the sql execution.
        String queryName = "Get tables/fields"; // String | Name to apply to the query in logs and `Sys.Logs.HcQueryStart`
        Integer timeout = 0; // Integer | In seconds: <0 → ∞, 0 → 120s
        try {
            File result = apiInstance.getByQueryParquet(query, scalarParameters, queryName, timeout).execute();
            System.out.println(result.toJson());
        } catch (ApiException e) {
            System.err.println("Exception when calling SqlExecutionApi#getByQueryParquet");
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
| **query** | **String**| LuminesceSql to Execute (must be one line only) | |
| **scalarParameters** | [**Map&lt;String, String&gt;**](String.md)| Json encoded dictionary of key-value pairs for scalar parameter values to use in the sql execution. | [optional] |
| **queryName** | **String**| Name to apply to the query in logs and &#x60;Sys.Logs.HcQueryStart&#x60; | [optional] |
| **timeout** | **Integer**| In seconds: &lt;0 → ∞, 0 → 120s | [optional] [default to 0] |

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


## getByQueryPipe

> String getByQueryPipe(query, scalarParameters, queryName, download, timeout)

GetByQueryPipe: Executes Sql, returned in pipe-delimited format, where the sql is simply in the url.

 For simple single-line query execution via the url. e.g. &#x60;select ^ from Sys.Field order by 1, 2&#x60;  The following error codes are to be anticipated with standard Problem Detail reports: - 400 BadRequest - something failed with the execution or parsing of your query - 401 Unauthorized - 403 Forbidden 

### Example

```java
import com.finbourne.luminesce.model.*;
import com.finbourne.luminesce.api.SqlExecutionApi;
import com.finbourne.luminesce.extensions.ApiConfigurationException;
import com.finbourne.luminesce.extensions.ApiFactoryBuilder;
import com.finbourne.luminesce.extensions.auth.FinbourneTokenException;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class SqlExecutionApiExample {

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

        SqlExecutionApi apiInstance = ApiFactoryBuilder.build(fileName).build(SqlExecutionApi.class);
        String query = "select ^ from Sys.Field order by 1, 2"; // String | LuminesceSql to Execute (must be one line only)
        Map<String, String> scalarParameters = new HashMap(); // Map<String, String> | Json encoded dictionary of key-value pairs for scalar parameter values to use in the sql execution.
        String queryName = "Get tables/fields"; // String | Name to apply to the query in logs and `Sys.Logs.HcQueryStart`
        Boolean download = false; // Boolean | Makes this a file-download request (as opposed to returning the data in the response-body)
        Integer timeout = 0; // Integer | In seconds: <0 → ∞, 0 → 120s
        try {
            String result = apiInstance.getByQueryPipe(query, scalarParameters, queryName, download, timeout).execute();
            System.out.println(result.toJson());
        } catch (ApiException e) {
            System.err.println("Exception when calling SqlExecutionApi#getByQueryPipe");
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
| **query** | **String**| LuminesceSql to Execute (must be one line only) | |
| **scalarParameters** | [**Map&lt;String, String&gt;**](String.md)| Json encoded dictionary of key-value pairs for scalar parameter values to use in the sql execution. | [optional] |
| **queryName** | **String**| Name to apply to the query in logs and &#x60;Sys.Logs.HcQueryStart&#x60; | [optional] |
| **download** | **Boolean**| Makes this a file-download request (as opposed to returning the data in the response-body) | [optional] [default to false] |
| **timeout** | **Integer**| In seconds: &lt;0 → ∞, 0 → 120s | [optional] [default to 0] |

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


## getByQuerySqlite

> File getByQuerySqlite(query, scalarParameters, queryName, timeout)

GetByQuerySqlite: Executes Sql, returned in SqLite DB (sqlite3) format (as a file to be downloaded) format, where the sql is simply in the url.

 For simple single-line query execution via the url. e.g. &#x60;select ^ from Sys.Field order by 1, 2&#x60;  The following error codes are to be anticipated with standard Problem Detail reports: - 400 BadRequest - something failed with the execution or parsing of your query - 401 Unauthorized - 403 Forbidden 

### Example

```java
import com.finbourne.luminesce.model.*;
import com.finbourne.luminesce.api.SqlExecutionApi;
import com.finbourne.luminesce.extensions.ApiConfigurationException;
import com.finbourne.luminesce.extensions.ApiFactoryBuilder;
import com.finbourne.luminesce.extensions.auth.FinbourneTokenException;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class SqlExecutionApiExample {

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

        SqlExecutionApi apiInstance = ApiFactoryBuilder.build(fileName).build(SqlExecutionApi.class);
        String query = "select ^ from Sys.Field order by 1, 2"; // String | LuminesceSql to Execute (must be one line only)
        Map<String, String> scalarParameters = new HashMap(); // Map<String, String> | Json encoded dictionary of key-value pairs for scalar parameter values to use in the sql execution.
        String queryName = "Get tables/fields"; // String | Name to apply to the query in logs and `Sys.Logs.HcQueryStart`
        Integer timeout = 0; // Integer | In seconds: <0 → ∞, 0 → 120s
        try {
            File result = apiInstance.getByQuerySqlite(query, scalarParameters, queryName, timeout).execute();
            System.out.println(result.toJson());
        } catch (ApiException e) {
            System.err.println("Exception when calling SqlExecutionApi#getByQuerySqlite");
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
| **query** | **String**| LuminesceSql to Execute (must be one line only) | |
| **scalarParameters** | [**Map&lt;String, String&gt;**](String.md)| Json encoded dictionary of key-value pairs for scalar parameter values to use in the sql execution. | [optional] |
| **queryName** | **String**| Name to apply to the query in logs and &#x60;Sys.Logs.HcQueryStart&#x60; | [optional] |
| **timeout** | **Integer**| In seconds: &lt;0 → ∞, 0 → 120s | [optional] [default to 0] |

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


## getByQueryXml

> String getByQueryXml(query, scalarParameters, queryName, download, timeout)

GetByQueryXml: Executes Sql, returned in Xml format, where the sql is simply in the url.

 For simple single-line query execution via the url. e.g. &#x60;select ^ from Sys.Field order by 1, 2&#x60;  The following error codes are to be anticipated with standard Problem Detail reports: - 400 BadRequest - something failed with the execution or parsing of your query - 401 Unauthorized - 403 Forbidden 

### Example

```java
import com.finbourne.luminesce.model.*;
import com.finbourne.luminesce.api.SqlExecutionApi;
import com.finbourne.luminesce.extensions.ApiConfigurationException;
import com.finbourne.luminesce.extensions.ApiFactoryBuilder;
import com.finbourne.luminesce.extensions.auth.FinbourneTokenException;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class SqlExecutionApiExample {

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

        SqlExecutionApi apiInstance = ApiFactoryBuilder.build(fileName).build(SqlExecutionApi.class);
        String query = "select ^ from Sys.Field order by 1, 2"; // String | LuminesceSql to Execute (must be one line only)
        Map<String, String> scalarParameters = new HashMap(); // Map<String, String> | Json encoded dictionary of key-value pairs for scalar parameter values to use in the sql execution.
        String queryName = "Get tables/fields"; // String | Name to apply to the query in logs and `Sys.Logs.HcQueryStart`
        Boolean download = false; // Boolean | Makes this a file-download request (as opposed to returning the data in the response-body)
        Integer timeout = 0; // Integer | In seconds: <0 → ∞, 0 → 120s
        try {
            String result = apiInstance.getByQueryXml(query, scalarParameters, queryName, download, timeout).execute();
            System.out.println(result.toJson());
        } catch (ApiException e) {
            System.err.println("Exception when calling SqlExecutionApi#getByQueryXml");
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
| **query** | **String**| LuminesceSql to Execute (must be one line only) | |
| **scalarParameters** | [**Map&lt;String, String&gt;**](String.md)| Json encoded dictionary of key-value pairs for scalar parameter values to use in the sql execution. | [optional] |
| **queryName** | **String**| Name to apply to the query in logs and &#x60;Sys.Logs.HcQueryStart&#x60; | [optional] |
| **download** | **Boolean**| Makes this a file-download request (as opposed to returning the data in the response-body) | [optional] [default to false] |
| **timeout** | **Integer**| In seconds: &lt;0 → ∞, 0 → 120s | [optional] [default to 0] |

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


## putByQueryCsv

> String putByQueryCsv(body, scalarParameters, queryName, download, timeoutSeconds, delimiter, escape)

PutByQueryCsv: Executes Sql, returned in CSV format, where the sql is the post-body url.

 For more complex LuminesceSql a PUT will allow for longer Sql. e.g.: &#x60;&#x60;&#x60;sql @@cutoff &#x3D; select #2020-02-01#; @issues &#x3D; select Id, SortId, Summary, Created, Updated from Dev.Jira.Issue where Project&#x3D;&#39;HC&#39; and Created &lt; @@cutoff and Updated &gt; @@cutoff;  select i.Id, i.SortId, i.Summary, LinkText, LinkedIssueId, LinkedIssueSortId, LinkedIssueSummary from @issues i inner join Dev.Jira.Issue.Link li  on i.Id &#x3D; li.IssueId &#x60;&#x60;&#x60;  The following error codes are to be anticipated with standard Problem Detail reports: - 400 BadRequest - something failed with the execution or parsing of your query - 401 Unauthorized - 403 Forbidden 

### Example

```java
import com.finbourne.luminesce.model.*;
import com.finbourne.luminesce.api.SqlExecutionApi;
import com.finbourne.luminesce.extensions.ApiConfigurationException;
import com.finbourne.luminesce.extensions.ApiFactoryBuilder;
import com.finbourne.luminesce.extensions.auth.FinbourneTokenException;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class SqlExecutionApiExample {

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

        SqlExecutionApi apiInstance = ApiFactoryBuilder.build(fileName).build(SqlExecutionApi.class);
        String body = select Dockerfile Dockerfile.cicd LICENSE.md README.md docker-compose.yml docs generate justfile publish resources test_sdk from sys.field; // String | LuminesceSql to Execute (may be multi-line)
        Map<String, String> scalarParameters = new HashMap(); // Map<String, String> | Json encoded dictionary of key-value pairs for scalar parameter values to use in the sql execution.
        String queryName = "Get tables/fields"; // String | Name to apply to the query in logs and `Sys.Logs.HcQueryStart`
        Boolean download = false; // Boolean | Makes this a file-download request (as opposed to returning the data in the response-body)
        Integer timeoutSeconds = 0; // Integer | In seconds: <0 → ∞, 0 → 120s
        String delimiter = "delimiter_example"; // String | Delimiter string to override the default
        String escape = "escape_example"; // String | Escape character to override the default
        try {
            String result = apiInstance.putByQueryCsv(body, scalarParameters, queryName, download, timeoutSeconds, delimiter, escape).execute();
            System.out.println(result.toJson());
        } catch (ApiException e) {
            System.err.println("Exception when calling SqlExecutionApi#putByQueryCsv");
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
| **body** | **String**| LuminesceSql to Execute (may be multi-line) | |
| **scalarParameters** | [**Map&lt;String, String&gt;**](String.md)| Json encoded dictionary of key-value pairs for scalar parameter values to use in the sql execution. | [optional] |
| **queryName** | **String**| Name to apply to the query in logs and &#x60;Sys.Logs.HcQueryStart&#x60; | [optional] |
| **download** | **Boolean**| Makes this a file-download request (as opposed to returning the data in the response-body) | [optional] [default to false] |
| **timeoutSeconds** | **Integer**| In seconds: &lt;0 → ∞, 0 → 120s | [optional] [default to 0] |
| **delimiter** | **String**| Delimiter string to override the default | [optional] |
| **escape** | **String**| Escape character to override the default | [optional] |

### Return type

**String**

### HTTP request headers

- **Content-Type**: text/plain
- **Accept**: text/plain, application/json, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **400** | Bad Request |  -  |
| **403** | Forbidden |  -  |

[Back to top](#) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to Model list](../README.md#documentation-for-models) &#8226; [Back to README](../README.md)


## putByQueryExcel

> File putByQueryExcel(body, scalarParameters, queryName, timeoutSeconds)

PutByQueryExcel: Executes Sql, returned in Excel (xlsx) format (as a file to be downloaded), where the sql is the post-body url.

 For more complex LuminesceSql a PUT will allow for longer Sql. e.g.: &#x60;&#x60;&#x60;sql @@cutoff &#x3D; select #2020-02-01#; @issues &#x3D; select Id, SortId, Summary, Created, Updated from Dev.Jira.Issue where Project&#x3D;&#39;HC&#39; and Created &lt; @@cutoff and Updated &gt; @@cutoff;  select i.Id, i.SortId, i.Summary, LinkText, LinkedIssueId, LinkedIssueSortId, LinkedIssueSummary from @issues i inner join Dev.Jira.Issue.Link li  on i.Id &#x3D; li.IssueId &#x60;&#x60;&#x60;  The following error codes are to be anticipated with standard Problem Detail reports: - 400 BadRequest - something failed with the execution or parsing of your query - 401 Unauthorized - 403 Forbidden 

### Example

```java
import com.finbourne.luminesce.model.*;
import com.finbourne.luminesce.api.SqlExecutionApi;
import com.finbourne.luminesce.extensions.ApiConfigurationException;
import com.finbourne.luminesce.extensions.ApiFactoryBuilder;
import com.finbourne.luminesce.extensions.auth.FinbourneTokenException;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class SqlExecutionApiExample {

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

        SqlExecutionApi apiInstance = ApiFactoryBuilder.build(fileName).build(SqlExecutionApi.class);
        String body = select Dockerfile Dockerfile.cicd LICENSE.md README.md docker-compose.yml docs generate justfile publish resources test_sdk from sys.field; // String | LuminesceSql to Execute (may be multi-line)
        Map<String, String> scalarParameters = new HashMap(); // Map<String, String> | Json encoded dictionary of key-value pairs for scalar parameter values to use in the sql execution.
        String queryName = "Get tables/fields"; // String | Name to apply to the query in logs and `Sys.Logs.HcQueryStart`
        Integer timeoutSeconds = 0; // Integer | In seconds: <0 → ∞, 0 → 120s
        try {
            File result = apiInstance.putByQueryExcel(body, scalarParameters, queryName, timeoutSeconds).execute();
            System.out.println(result.toJson());
        } catch (ApiException e) {
            System.err.println("Exception when calling SqlExecutionApi#putByQueryExcel");
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
| **body** | **String**| LuminesceSql to Execute (may be multi-line) | |
| **scalarParameters** | [**Map&lt;String, String&gt;**](String.md)| Json encoded dictionary of key-value pairs for scalar parameter values to use in the sql execution. | [optional] |
| **queryName** | **String**| Name to apply to the query in logs and &#x60;Sys.Logs.HcQueryStart&#x60; | [optional] |
| **timeoutSeconds** | **Integer**| In seconds: &lt;0 → ∞, 0 → 120s | [optional] [default to 0] |

### Return type

[**File**](File.md)

### HTTP request headers

- **Content-Type**: text/plain
- **Accept**: text/plain, application/json, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **400** | Bad Request |  -  |
| **403** | Forbidden |  -  |

[Back to top](#) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to Model list](../README.md#documentation-for-models) &#8226; [Back to README](../README.md)


## putByQueryJson

> String putByQueryJson(body, scalarParameters, queryName, timeoutSeconds, jsonProper)

PutByQueryJson: Executes Sql, returned in JSON format, where the sql is the post-body url.

 For more complex LuminesceSql a PUT will allow for longer Sql. e.g.: &#x60;&#x60;&#x60;sql @@cutoff &#x3D; select #2020-02-01#; @issues &#x3D; select Id, SortId, Summary, Created, Updated from Dev.Jira.Issue where Project&#x3D;&#39;HC&#39; and Created &lt; @@cutoff and Updated &gt; @@cutoff;  select i.Id, i.SortId, i.Summary, LinkText, LinkedIssueId, LinkedIssueSortId, LinkedIssueSummary from @issues i inner join Dev.Jira.Issue.Link li  on i.Id &#x3D; li.IssueId &#x60;&#x60;&#x60;  The following error codes are to be anticipated with standard Problem Detail reports: - 400 BadRequest - something failed with the execution or parsing of your query - 401 Unauthorized - 403 Forbidden 

### Example

```java
import com.finbourne.luminesce.model.*;
import com.finbourne.luminesce.api.SqlExecutionApi;
import com.finbourne.luminesce.extensions.ApiConfigurationException;
import com.finbourne.luminesce.extensions.ApiFactoryBuilder;
import com.finbourne.luminesce.extensions.auth.FinbourneTokenException;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class SqlExecutionApiExample {

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

        SqlExecutionApi apiInstance = ApiFactoryBuilder.build(fileName).build(SqlExecutionApi.class);
        String body = select Dockerfile Dockerfile.cicd LICENSE.md README.md docker-compose.yml docs generate justfile publish resources test_sdk from sys.field; // String | LuminesceSql to Execute (may be multi-line)
        Map<String, String> scalarParameters = new HashMap(); // Map<String, String> | Json encoded dictionary of key-value pairs for scalar parameter values to use in the sql execution.
        String queryName = "Get tables/fields"; // String | Name to apply to the query in logs and `Sys.Logs.HcQueryStart`
        Integer timeoutSeconds = 0; // Integer | In seconds: <0 → ∞, 0 → 120s
        Boolean jsonProper = false; // Boolean | Should this be text/json (not json-encoded-as-a-string)
        try {
            String result = apiInstance.putByQueryJson(body, scalarParameters, queryName, timeoutSeconds, jsonProper).execute();
            System.out.println(result.toJson());
        } catch (ApiException e) {
            System.err.println("Exception when calling SqlExecutionApi#putByQueryJson");
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
| **body** | **String**| LuminesceSql to Execute (may be multi-line) | |
| **scalarParameters** | [**Map&lt;String, String&gt;**](String.md)| Json encoded dictionary of key-value pairs for scalar parameter values to use in the sql execution. | [optional] |
| **queryName** | **String**| Name to apply to the query in logs and &#x60;Sys.Logs.HcQueryStart&#x60; | [optional] |
| **timeoutSeconds** | **Integer**| In seconds: &lt;0 → ∞, 0 → 120s | [optional] [default to 0] |
| **jsonProper** | **Boolean**| Should this be text/json (not json-encoded-as-a-string) | [optional] [default to false] |

### Return type

**String**

### HTTP request headers

- **Content-Type**: text/plain
- **Accept**: text/plain, application/json, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **400** | Bad Request |  -  |
| **403** | Forbidden |  -  |

[Back to top](#) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to Model list](../README.md#documentation-for-models) &#8226; [Back to README](../README.md)


## putByQueryParquet

> File putByQueryParquet(body, scalarParameters, queryName, timeoutSeconds)

PutByQueryParquet: Executes Sql, returned in Parquet format, where the sql is the post-body url.

 For more complex LuminesceSql a PUT will allow for longer Sql. e.g.: &#x60;&#x60;&#x60;sql @@cutoff &#x3D; select #2020-02-01#; @issues &#x3D; select Id, SortId, Summary, Created, Updated from Dev.Jira.Issue where Project&#x3D;&#39;HC&#39; and Created &lt; @@cutoff and Updated &gt; @@cutoff;  select i.Id, i.SortId, i.Summary, LinkText, LinkedIssueId, LinkedIssueSortId, LinkedIssueSummary from @issues i inner join Dev.Jira.Issue.Link li  on i.Id &#x3D; li.IssueId &#x60;&#x60;&#x60;  The following error codes are to be anticipated with standard Problem Detail reports: - 400 BadRequest - something failed with the execution or parsing of your query - 401 Unauthorized - 403 Forbidden 

### Example

```java
import com.finbourne.luminesce.model.*;
import com.finbourne.luminesce.api.SqlExecutionApi;
import com.finbourne.luminesce.extensions.ApiConfigurationException;
import com.finbourne.luminesce.extensions.ApiFactoryBuilder;
import com.finbourne.luminesce.extensions.auth.FinbourneTokenException;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class SqlExecutionApiExample {

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

        SqlExecutionApi apiInstance = ApiFactoryBuilder.build(fileName).build(SqlExecutionApi.class);
        String body = select Dockerfile Dockerfile.cicd LICENSE.md README.md docker-compose.yml docs generate justfile publish resources test_sdk from sys.field; // String | LuminesceSql to Execute (may be multi-line)
        Map<String, String> scalarParameters = new HashMap(); // Map<String, String> | Json encoded dictionary of key-value pairs for scalar parameter values to use in the sql execution.
        String queryName = "Get tables/fields"; // String | Name to apply to the query in logs and `Sys.Logs.HcQueryStart`
        Integer timeoutSeconds = 0; // Integer | In seconds: <0 → ∞, 0 → 120s
        try {
            File result = apiInstance.putByQueryParquet(body, scalarParameters, queryName, timeoutSeconds).execute();
            System.out.println(result.toJson());
        } catch (ApiException e) {
            System.err.println("Exception when calling SqlExecutionApi#putByQueryParquet");
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
| **body** | **String**| LuminesceSql to Execute (may be multi-line) | |
| **scalarParameters** | [**Map&lt;String, String&gt;**](String.md)| Json encoded dictionary of key-value pairs for scalar parameter values to use in the sql execution. | [optional] |
| **queryName** | **String**| Name to apply to the query in logs and &#x60;Sys.Logs.HcQueryStart&#x60; | [optional] |
| **timeoutSeconds** | **Integer**| In seconds: &lt;0 → ∞, 0 → 120s | [optional] [default to 0] |

### Return type

[**File**](File.md)

### HTTP request headers

- **Content-Type**: text/plain
- **Accept**: text/plain, application/json, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **400** | Bad Request |  -  |
| **403** | Forbidden |  -  |

[Back to top](#) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to Model list](../README.md#documentation-for-models) &#8226; [Back to README](../README.md)


## putByQueryPipe

> String putByQueryPipe(body, scalarParameters, queryName, download, timeoutSeconds)

PutByQueryPipe: Executes Sql, returned in pipe-delimited format, where the sql is the post-body url.

 For more complex LuminesceSql a PUT will allow for longer Sql. e.g.: &#x60;&#x60;&#x60;sql @@cutoff &#x3D; select #2020-02-01#; @issues &#x3D; select Id, SortId, Summary, Created, Updated from Dev.Jira.Issue where Project&#x3D;&#39;HC&#39; and Created &lt; @@cutoff and Updated &gt; @@cutoff;  select i.Id, i.SortId, i.Summary, LinkText, LinkedIssueId, LinkedIssueSortId, LinkedIssueSummary from @issues i inner join Dev.Jira.Issue.Link li  on i.Id &#x3D; li.IssueId &#x60;&#x60;&#x60;  The following error codes are to be anticipated with standard Problem Detail reports: - 400 BadRequest - something failed with the execution or parsing of your query - 401 Unauthorized - 403 Forbidden 

### Example

```java
import com.finbourne.luminesce.model.*;
import com.finbourne.luminesce.api.SqlExecutionApi;
import com.finbourne.luminesce.extensions.ApiConfigurationException;
import com.finbourne.luminesce.extensions.ApiFactoryBuilder;
import com.finbourne.luminesce.extensions.auth.FinbourneTokenException;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class SqlExecutionApiExample {

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

        SqlExecutionApi apiInstance = ApiFactoryBuilder.build(fileName).build(SqlExecutionApi.class);
        String body = select Dockerfile Dockerfile.cicd LICENSE.md README.md docker-compose.yml docs generate justfile publish resources test_sdk from sys.field; // String | LuminesceSql to Execute (may be multi-line)
        Map<String, String> scalarParameters = new HashMap(); // Map<String, String> | Json encoded dictionary of key-value pairs for scalar parameter values to use in the sql execution.
        String queryName = "Get tables/fields"; // String | Name to apply to the query in logs and `Sys.Logs.HcQueryStart`
        Boolean download = false; // Boolean | Makes this a file-download request (as opposed to returning the data in the response-body)
        Integer timeoutSeconds = 0; // Integer | In seconds: <0 → ∞, 0 → 120s
        try {
            String result = apiInstance.putByQueryPipe(body, scalarParameters, queryName, download, timeoutSeconds).execute();
            System.out.println(result.toJson());
        } catch (ApiException e) {
            System.err.println("Exception when calling SqlExecutionApi#putByQueryPipe");
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
| **body** | **String**| LuminesceSql to Execute (may be multi-line) | |
| **scalarParameters** | [**Map&lt;String, String&gt;**](String.md)| Json encoded dictionary of key-value pairs for scalar parameter values to use in the sql execution. | [optional] |
| **queryName** | **String**| Name to apply to the query in logs and &#x60;Sys.Logs.HcQueryStart&#x60; | [optional] |
| **download** | **Boolean**| Makes this a file-download request (as opposed to returning the data in the response-body) | [optional] [default to false] |
| **timeoutSeconds** | **Integer**| In seconds: &lt;0 → ∞, 0 → 120s | [optional] [default to 0] |

### Return type

**String**

### HTTP request headers

- **Content-Type**: text/plain
- **Accept**: text/plain, application/json, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **400** | Bad Request |  -  |
| **403** | Forbidden |  -  |

[Back to top](#) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to Model list](../README.md#documentation-for-models) &#8226; [Back to README](../README.md)


## putByQuerySqlite

> File putByQuerySqlite(body, scalarParameters, queryName, timeoutSeconds)

PutByQuerySqlite: Executes Sql, returned in SqLite DB (sqlite3) format (as a file to be downloaded), where the sql is the post-body url.

 For more complex LuminesceSql a PUT will allow for longer Sql. e.g.: &#x60;&#x60;&#x60;sql @@cutoff &#x3D; select #2020-02-01#; @issues &#x3D; select Id, SortId, Summary, Created, Updated from Dev.Jira.Issue where Project&#x3D;&#39;HC&#39; and Created &lt; @@cutoff and Updated &gt; @@cutoff;  select i.Id, i.SortId, i.Summary, LinkText, LinkedIssueId, LinkedIssueSortId, LinkedIssueSummary from @issues i inner join Dev.Jira.Issue.Link li  on i.Id &#x3D; li.IssueId &#x60;&#x60;&#x60;  The following error codes are to be anticipated with standard Problem Detail reports: - 400 BadRequest - something failed with the execution or parsing of your query - 401 Unauthorized - 403 Forbidden 

### Example

```java
import com.finbourne.luminesce.model.*;
import com.finbourne.luminesce.api.SqlExecutionApi;
import com.finbourne.luminesce.extensions.ApiConfigurationException;
import com.finbourne.luminesce.extensions.ApiFactoryBuilder;
import com.finbourne.luminesce.extensions.auth.FinbourneTokenException;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class SqlExecutionApiExample {

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

        SqlExecutionApi apiInstance = ApiFactoryBuilder.build(fileName).build(SqlExecutionApi.class);
        String body = select Dockerfile Dockerfile.cicd LICENSE.md README.md docker-compose.yml docs generate justfile publish resources test_sdk from sys.field; // String | LuminesceSql to Execute (may be multi-line)
        Map<String, String> scalarParameters = new HashMap(); // Map<String, String> | Json encoded dictionary of key-value pairs for scalar parameter values to use in the sql execution.
        String queryName = "Get tables/fields"; // String | Name to apply to the query in logs and `Sys.Logs.HcQueryStart`
        Integer timeoutSeconds = 0; // Integer | In seconds: <0 → ∞, 0 → 120s
        try {
            File result = apiInstance.putByQuerySqlite(body, scalarParameters, queryName, timeoutSeconds).execute();
            System.out.println(result.toJson());
        } catch (ApiException e) {
            System.err.println("Exception when calling SqlExecutionApi#putByQuerySqlite");
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
| **body** | **String**| LuminesceSql to Execute (may be multi-line) | |
| **scalarParameters** | [**Map&lt;String, String&gt;**](String.md)| Json encoded dictionary of key-value pairs for scalar parameter values to use in the sql execution. | [optional] |
| **queryName** | **String**| Name to apply to the query in logs and &#x60;Sys.Logs.HcQueryStart&#x60; | [optional] |
| **timeoutSeconds** | **Integer**| In seconds: &lt;0 → ∞, 0 → 120s | [optional] [default to 0] |

### Return type

[**File**](File.md)

### HTTP request headers

- **Content-Type**: text/plain
- **Accept**: text/plain, application/json, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **400** | Bad Request |  -  |
| **403** | Forbidden |  -  |

[Back to top](#) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to Model list](../README.md#documentation-for-models) &#8226; [Back to README](../README.md)


## putByQueryXml

> String putByQueryXml(body, scalarParameters, queryName, download, timeoutSeconds)

PutByQueryXml: Executes Sql, returned in Xml format, where the sql is the post-body url.

 For more complex LuminesceSql a PUT will allow for longer Sql. e.g.: &#x60;&#x60;&#x60;sql @@cutoff &#x3D; select #2020-02-01#; @issues &#x3D; select Id, SortId, Summary, Created, Updated from Dev.Jira.Issue where Project&#x3D;&#39;HC&#39; and Created &lt; @@cutoff and Updated &gt; @@cutoff;  select i.Id, i.SortId, i.Summary, LinkText, LinkedIssueId, LinkedIssueSortId, LinkedIssueSummary from @issues i inner join Dev.Jira.Issue.Link li  on i.Id &#x3D; li.IssueId &#x60;&#x60;&#x60;  The following error codes are to be anticipated with standard Problem Detail reports: - 400 BadRequest - something failed with the execution or parsing of your query - 401 Unauthorized - 403 Forbidden 

### Example

```java
import com.finbourne.luminesce.model.*;
import com.finbourne.luminesce.api.SqlExecutionApi;
import com.finbourne.luminesce.extensions.ApiConfigurationException;
import com.finbourne.luminesce.extensions.ApiFactoryBuilder;
import com.finbourne.luminesce.extensions.auth.FinbourneTokenException;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class SqlExecutionApiExample {

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

        SqlExecutionApi apiInstance = ApiFactoryBuilder.build(fileName).build(SqlExecutionApi.class);
        String body = select Dockerfile Dockerfile.cicd LICENSE.md README.md docker-compose.yml docs generate justfile publish resources test_sdk from sys.field; // String | LuminesceSql to Execute (may be multi-line)
        Map<String, String> scalarParameters = new HashMap(); // Map<String, String> | Json encoded dictionary of key-value pairs for scalar parameter values to use in the sql execution.
        String queryName = "Get tables/fields"; // String | Name to apply to the query in logs and `Sys.Logs.HcQueryStart`
        Boolean download = false; // Boolean | Makes this a file-download request (as opposed to returning the data in the response-body)
        Integer timeoutSeconds = 0; // Integer | In seconds: <0 → ∞, 0 → 120s
        try {
            String result = apiInstance.putByQueryXml(body, scalarParameters, queryName, download, timeoutSeconds).execute();
            System.out.println(result.toJson());
        } catch (ApiException e) {
            System.err.println("Exception when calling SqlExecutionApi#putByQueryXml");
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
| **body** | **String**| LuminesceSql to Execute (may be multi-line) | |
| **scalarParameters** | [**Map&lt;String, String&gt;**](String.md)| Json encoded dictionary of key-value pairs for scalar parameter values to use in the sql execution. | [optional] |
| **queryName** | **String**| Name to apply to the query in logs and &#x60;Sys.Logs.HcQueryStart&#x60; | [optional] |
| **download** | **Boolean**| Makes this a file-download request (as opposed to returning the data in the response-body) | [optional] [default to false] |
| **timeoutSeconds** | **Integer**| In seconds: &lt;0 → ∞, 0 → 120s | [optional] [default to 0] |

### Return type

**String**

### HTTP request headers

- **Content-Type**: text/plain
- **Accept**: text/plain, application/json, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **400** | Bad Request |  -  |
| **403** | Forbidden |  -  |

[Back to top](#) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to Model list](../README.md#documentation-for-models) &#8226; [Back to README](../README.md)

