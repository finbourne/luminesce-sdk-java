# SqlExecutionApi

All URIs are relative to *https://fbn-prd.lusid.com/honeycomb*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getByQueryCsv**](SqlExecutionApi.md#getByQueryCsv) | **GET** /api/Sql/csv/{query} | GetByQueryCsv: Execute Sql from the url returning CSV |
| [**getByQueryExcel**](SqlExecutionApi.md#getByQueryExcel) | **GET** /api/Sql/excel/{query} | GetByQueryExcel: Execute Sql from the url returning an Excel file |
| [**getByQueryJson**](SqlExecutionApi.md#getByQueryJson) | **GET** /api/Sql/json/{query} | GetByQueryJson: Execute Sql from the url returning JSON |
| [**getByQueryParquet**](SqlExecutionApi.md#getByQueryParquet) | **GET** /api/Sql/parquet/{query} | GetByQueryParquet: Execute Sql from the url returning a Parquet file |
| [**getByQueryPipe**](SqlExecutionApi.md#getByQueryPipe) | **GET** /api/Sql/pipe/{query} | GetByQueryPipe: Execute Sql from the url returning pipe-delimited |
| [**getByQuerySqlite**](SqlExecutionApi.md#getByQuerySqlite) | **GET** /api/Sql/sqlite/{query} | GetByQuerySqlite: Execute Sql from the url returning SqLite DB |
| [**getByQueryXml**](SqlExecutionApi.md#getByQueryXml) | **GET** /api/Sql/xml/{query} | GetByQueryXml: Execute Sql from the url returning XML |
| [**putByQueryCsv**](SqlExecutionApi.md#putByQueryCsv) | **PUT** /api/Sql/csv | PutByQueryCsv: Execute Sql from the body returning CSV |
| [**putByQueryExcel**](SqlExecutionApi.md#putByQueryExcel) | **PUT** /api/Sql/excel | PutByQueryExcel: Execute Sql from the body making an Excel file |
| [**putByQueryJson**](SqlExecutionApi.md#putByQueryJson) | **PUT** /api/Sql/json | PutByQueryJson: Execute Sql from the body returning JSON |
| [**putByQueryParquet**](SqlExecutionApi.md#putByQueryParquet) | **PUT** /api/Sql/parquet | PutByQueryParquet: Execute Sql from the body making a Parquet file |
| [**putByQueryPipe**](SqlExecutionApi.md#putByQueryPipe) | **PUT** /api/Sql/pipe | PutByQueryPipe: Execute Sql from the body making pipe-delimited |
| [**putByQuerySqlite**](SqlExecutionApi.md#putByQuerySqlite) | **PUT** /api/Sql/sqlite | PutByQuerySqlite: Execute Sql from the body returning SqLite DB |
| [**putByQueryXml**](SqlExecutionApi.md#putByQueryXml) | **PUT** /api/Sql/xml | PutByQueryXml: Execute Sql from the body returning XML |



## getByQueryCsv

> String getByQueryCsv(query, scalarParameters, queryName, download, timeout, delimiter, escape, dateTimeFormat)

GetByQueryCsv: Execute Sql from the url returning CSV

 Returns data from a simple single-line query execution which is specified on the url. e.g. &#x60;select ^ from Sys.Field order by 1, 2&#x60;, returned in the format of the method name.  The following error codes are to be anticipated with standard Problem Detail reports: - 400 BadRequest - something failed with the execution or parsing of your query - 401 Unauthorized - 403 Forbidden 

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

        // uncomment the below to use configuration overrides
        // ConfigurationOptions opts = new ConfigurationOptions();
        // opts.setTotalTimeoutMs(2000);
        
        // uncomment the below to use an api factory with overrides
        // ApiFactory apiFactory = ApiFactoryBuilder.build(fileName, opts);
        // SqlExecutionApi apiInstance = apiFactory.build(SqlExecutionApi.class);

        SqlExecutionApi apiInstance = ApiFactoryBuilder.build(fileName).build(SqlExecutionApi.class);
        String query = "select ^ from Sys.Field order by 1, 2"; // String | LuminesceSql to Execute (must be one line only)
        Map<String, String> scalarParameters = new HashMap(); // Map<String, String> | Json encoded dictionary of key-value pairs for scalar parameter values to use in the sql execution.
        String queryName = "Get tables/fields"; // String | Name to apply to the query in logs and `Sys.Logs.HcQueryStart`
        Boolean download = false; // Boolean | Makes this a file-download request (as opposed to returning the data in the response-body)
        Integer timeout = 0; // Integer | In seconds: <0 or > 175 → 175s (Maximum allowed), 0 → 120s
        String delimiter = "delimiter_example"; // String | Delimiter string to override the default
        String escape = "escape_example"; // String | Escape character to override the default
        String dateTimeFormat = "dateTimeFormat_example"; // String | Format to apply for DateTime data, leaving blank gives the Luminesce Exporter default, currently `yyyy-MM-dd HH:mm:ss.fff`
        try {
            // uncomment the below to set overrides at the request level
            // String result = apiInstance.getByQueryCsv(query, scalarParameters, queryName, download, timeout, delimiter, escape, dateTimeFormat).execute(opts);

            String result = apiInstance.getByQueryCsv(query, scalarParameters, queryName, download, timeout, delimiter, escape, dateTimeFormat).execute();
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
| **timeout** | **Integer**| In seconds: &lt;0 or &gt; 175 → 175s (Maximum allowed), 0 → 120s | [optional] [default to 0] |
| **delimiter** | **String**| Delimiter string to override the default | [optional] |
| **escape** | **String**| Escape character to override the default | [optional] |
| **dateTimeFormat** | **String**| Format to apply for DateTime data, leaving blank gives the Luminesce Exporter default, currently &#x60;yyyy-MM-dd HH:mm:ss.fff&#x60; | [optional] |

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


## getByQueryExcel

> File getByQueryExcel(query, scalarParameters, queryName, dateTimeFormat, timeout)

GetByQueryExcel: Execute Sql from the url returning an Excel file

 Returns data from a simple single-line query execution which is specified on the url. e.g. &#x60;select ^ from Sys.Field order by 1, 2&#x60;, returned in the format of the method name.  The following error codes are to be anticipated with standard Problem Detail reports: - 400 BadRequest - something failed with the execution or parsing of your query - 401 Unauthorized - 403 Forbidden 

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

        // uncomment the below to use configuration overrides
        // ConfigurationOptions opts = new ConfigurationOptions();
        // opts.setTotalTimeoutMs(2000);
        
        // uncomment the below to use an api factory with overrides
        // ApiFactory apiFactory = ApiFactoryBuilder.build(fileName, opts);
        // SqlExecutionApi apiInstance = apiFactory.build(SqlExecutionApi.class);

        SqlExecutionApi apiInstance = ApiFactoryBuilder.build(fileName).build(SqlExecutionApi.class);
        String query = "select ^ from Sys.Field order by 1, 2"; // String | LuminesceSql to Execute (must be one line only)
        Map<String, String> scalarParameters = new HashMap(); // Map<String, String> | Json encoded dictionary of key-value pairs for scalar parameter values to use in the sql execution.
        String queryName = "Get tables/fields"; // String | Name to apply to the query in logs and `Sys.Logs.HcQueryStart`
        String dateTimeFormat = "dateTimeFormat_example"; // String | Format to apply for DateTime data, leaving blank gives the Luminesce Exporter default, currently `yyyy-MM-dd HH:mm:ss.000` (Excel support for this is limited)
        Integer timeout = 0; // Integer | In seconds: <0 or > 175 → 175s (Maximum allowed), 0 → 120s
        try {
            // uncomment the below to set overrides at the request level
            // File result = apiInstance.getByQueryExcel(query, scalarParameters, queryName, dateTimeFormat, timeout).execute(opts);

            File result = apiInstance.getByQueryExcel(query, scalarParameters, queryName, dateTimeFormat, timeout).execute();
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
| **dateTimeFormat** | **String**| Format to apply for DateTime data, leaving blank gives the Luminesce Exporter default, currently &#x60;yyyy-MM-dd HH:mm:ss.000&#x60; (Excel support for this is limited) | [optional] |
| **timeout** | **Integer**| In seconds: &lt;0 or &gt; 175 → 175s (Maximum allowed), 0 → 120s | [optional] [default to 0] |

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


## getByQueryJson

> String getByQueryJson(query, scalarParameters, queryName, timeout, jsonProper)

GetByQueryJson: Execute Sql from the url returning JSON

 Returns data from a simple single-line query execution which is specified on the url. e.g. &#x60;select ^ from Sys.Field order by 1, 2&#x60;, returned in the format of the method name.  The following error codes are to be anticipated with standard Problem Detail reports: - 400 BadRequest - something failed with the execution or parsing of your query - 401 Unauthorized - 403 Forbidden 

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

        // uncomment the below to use configuration overrides
        // ConfigurationOptions opts = new ConfigurationOptions();
        // opts.setTotalTimeoutMs(2000);
        
        // uncomment the below to use an api factory with overrides
        // ApiFactory apiFactory = ApiFactoryBuilder.build(fileName, opts);
        // SqlExecutionApi apiInstance = apiFactory.build(SqlExecutionApi.class);

        SqlExecutionApi apiInstance = ApiFactoryBuilder.build(fileName).build(SqlExecutionApi.class);
        String query = "select ^ from Sys.Field order by 1, 2"; // String | LuminesceSql to Execute (must be one line only)
        Map<String, String> scalarParameters = new HashMap(); // Map<String, String> | Json encoded dictionary of key-value pairs for scalar parameter values to use in the sql execution.
        String queryName = "Get tables/fields"; // String | Name to apply to the query in logs and `Sys.Logs.HcQueryStart`
        Integer timeout = 0; // Integer | In seconds: <0 or > 175 → 175s (Maximum allowed), 0 → 120s
        Boolean jsonProper = false; // Boolean | Should this be text/json (not json-encoded-as-a-string)
        try {
            // uncomment the below to set overrides at the request level
            // String result = apiInstance.getByQueryJson(query, scalarParameters, queryName, timeout, jsonProper).execute(opts);

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
| **timeout** | **Integer**| In seconds: &lt;0 or &gt; 175 → 175s (Maximum allowed), 0 → 120s | [optional] [default to 0] |
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


## getByQueryParquet

> File getByQueryParquet(query, scalarParameters, queryName, timeout)

GetByQueryParquet: Execute Sql from the url returning a Parquet file

 Returns data from a simple single-line query execution which is specified on the url. e.g. &#x60;select ^ from Sys.Field order by 1, 2&#x60;, returned in the format of the method name.  The following error codes are to be anticipated with standard Problem Detail reports: - 400 BadRequest - something failed with the execution or parsing of your query - 401 Unauthorized - 403 Forbidden 

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

        // uncomment the below to use configuration overrides
        // ConfigurationOptions opts = new ConfigurationOptions();
        // opts.setTotalTimeoutMs(2000);
        
        // uncomment the below to use an api factory with overrides
        // ApiFactory apiFactory = ApiFactoryBuilder.build(fileName, opts);
        // SqlExecutionApi apiInstance = apiFactory.build(SqlExecutionApi.class);

        SqlExecutionApi apiInstance = ApiFactoryBuilder.build(fileName).build(SqlExecutionApi.class);
        String query = "select ^ from Sys.Field order by 1, 2"; // String | LuminesceSql to Execute (must be one line only)
        Map<String, String> scalarParameters = new HashMap(); // Map<String, String> | Json encoded dictionary of key-value pairs for scalar parameter values to use in the sql execution.
        String queryName = "Get tables/fields"; // String | Name to apply to the query in logs and `Sys.Logs.HcQueryStart`
        Integer timeout = 0; // Integer | In seconds: <0 or > 175 → 175s (Maximum allowed), 0 → 120s
        try {
            // uncomment the below to set overrides at the request level
            // File result = apiInstance.getByQueryParquet(query, scalarParameters, queryName, timeout).execute(opts);

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
| **timeout** | **Integer**| In seconds: &lt;0 or &gt; 175 → 175s (Maximum allowed), 0 → 120s | [optional] [default to 0] |

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


## getByQueryPipe

> String getByQueryPipe(query, scalarParameters, queryName, download, dateTimeFormat, timeout)

GetByQueryPipe: Execute Sql from the url returning pipe-delimited

 Returns data from a simple single-line query execution which is specified on the url. e.g. &#x60;select ^ from Sys.Field order by 1, 2&#x60;, returned in the format of the method name.  The following error codes are to be anticipated with standard Problem Detail reports: - 400 BadRequest - something failed with the execution or parsing of your query - 401 Unauthorized - 403 Forbidden 

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

        // uncomment the below to use configuration overrides
        // ConfigurationOptions opts = new ConfigurationOptions();
        // opts.setTotalTimeoutMs(2000);
        
        // uncomment the below to use an api factory with overrides
        // ApiFactory apiFactory = ApiFactoryBuilder.build(fileName, opts);
        // SqlExecutionApi apiInstance = apiFactory.build(SqlExecutionApi.class);

        SqlExecutionApi apiInstance = ApiFactoryBuilder.build(fileName).build(SqlExecutionApi.class);
        String query = "select ^ from Sys.Field order by 1, 2"; // String | LuminesceSql to Execute (must be one line only)
        Map<String, String> scalarParameters = new HashMap(); // Map<String, String> | Json encoded dictionary of key-value pairs for scalar parameter values to use in the sql execution.
        String queryName = "Get tables/fields"; // String | Name to apply to the query in logs and `Sys.Logs.HcQueryStart`
        Boolean download = false; // Boolean | Makes this a file-download request (as opposed to returning the data in the response-body)
        String dateTimeFormat = "dateTimeFormat_example"; // String | Format to apply for DateTime data, leaving blank gives the Luminesce Exporter default, currently `yyyy-MM-dd HH:mm:ss.fff`
        Integer timeout = 0; // Integer | In seconds: <0 or > 175 → 175s (Maximum allowed), 0 → 120s
        try {
            // uncomment the below to set overrides at the request level
            // String result = apiInstance.getByQueryPipe(query, scalarParameters, queryName, download, dateTimeFormat, timeout).execute(opts);

            String result = apiInstance.getByQueryPipe(query, scalarParameters, queryName, download, dateTimeFormat, timeout).execute();
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
| **dateTimeFormat** | **String**| Format to apply for DateTime data, leaving blank gives the Luminesce Exporter default, currently &#x60;yyyy-MM-dd HH:mm:ss.fff&#x60; | [optional] |
| **timeout** | **Integer**| In seconds: &lt;0 or &gt; 175 → 175s (Maximum allowed), 0 → 120s | [optional] [default to 0] |

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


## getByQuerySqlite

> File getByQuerySqlite(query, scalarParameters, queryName, timeout)

GetByQuerySqlite: Execute Sql from the url returning SqLite DB

 Returns data from a simple single-line query execution which is specified on the url. e.g. &#x60;select ^ from Sys.Field order by 1, 2&#x60;, returned in the format of the method name.  The following error codes are to be anticipated with standard Problem Detail reports: - 400 BadRequest - something failed with the execution or parsing of your query - 401 Unauthorized - 403 Forbidden 

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

        // uncomment the below to use configuration overrides
        // ConfigurationOptions opts = new ConfigurationOptions();
        // opts.setTotalTimeoutMs(2000);
        
        // uncomment the below to use an api factory with overrides
        // ApiFactory apiFactory = ApiFactoryBuilder.build(fileName, opts);
        // SqlExecutionApi apiInstance = apiFactory.build(SqlExecutionApi.class);

        SqlExecutionApi apiInstance = ApiFactoryBuilder.build(fileName).build(SqlExecutionApi.class);
        String query = "select ^ from Sys.Field order by 1, 2"; // String | LuminesceSql to Execute (must be one line only)
        Map<String, String> scalarParameters = new HashMap(); // Map<String, String> | Json encoded dictionary of key-value pairs for scalar parameter values to use in the sql execution.
        String queryName = "Get tables/fields"; // String | Name to apply to the query in logs and `Sys.Logs.HcQueryStart`
        Integer timeout = 0; // Integer | In seconds: <0 or > 175 → 175s (Maximum allowed), 0 → 120s
        try {
            // uncomment the below to set overrides at the request level
            // File result = apiInstance.getByQuerySqlite(query, scalarParameters, queryName, timeout).execute(opts);

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
| **timeout** | **Integer**| In seconds: &lt;0 or &gt; 175 → 175s (Maximum allowed), 0 → 120s | [optional] [default to 0] |

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


## getByQueryXml

> String getByQueryXml(query, scalarParameters, queryName, download, timeout)

GetByQueryXml: Execute Sql from the url returning XML

 Returns data from a simple single-line query execution which is specified on the url. e.g. &#x60;select ^ from Sys.Field order by 1, 2&#x60;, returned in the format of the method name.  The following error codes are to be anticipated with standard Problem Detail reports: - 400 BadRequest - something failed with the execution or parsing of your query - 401 Unauthorized - 403 Forbidden 

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

        // uncomment the below to use configuration overrides
        // ConfigurationOptions opts = new ConfigurationOptions();
        // opts.setTotalTimeoutMs(2000);
        
        // uncomment the below to use an api factory with overrides
        // ApiFactory apiFactory = ApiFactoryBuilder.build(fileName, opts);
        // SqlExecutionApi apiInstance = apiFactory.build(SqlExecutionApi.class);

        SqlExecutionApi apiInstance = ApiFactoryBuilder.build(fileName).build(SqlExecutionApi.class);
        String query = "select ^ from Sys.Field order by 1, 2"; // String | LuminesceSql to Execute (must be one line only)
        Map<String, String> scalarParameters = new HashMap(); // Map<String, String> | Json encoded dictionary of key-value pairs for scalar parameter values to use in the sql execution.
        String queryName = "Get tables/fields"; // String | Name to apply to the query in logs and `Sys.Logs.HcQueryStart`
        Boolean download = false; // Boolean | Makes this a file-download request (as opposed to returning the data in the response-body)
        Integer timeout = 0; // Integer | In seconds: <0 or > 175 → 175s (Maximum allowed), 0 → 120s
        try {
            // uncomment the below to set overrides at the request level
            // String result = apiInstance.getByQueryXml(query, scalarParameters, queryName, download, timeout).execute(opts);

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
| **timeout** | **Integer**| In seconds: &lt;0 or &gt; 175 → 175s (Maximum allowed), 0 → 120s | [optional] [default to 0] |

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


## putByQueryCsv

> String putByQueryCsv(body, scalarParameters, queryName, download, timeoutSeconds, delimiter, escape, dateTimeFormat)

PutByQueryCsv: Execute Sql from the body returning CSV

 For more complex LuminesceSql a PUT will allow for longer and line break delimited Sql, whic will be returned in the format of the method name. e.g.: &#x60;&#x60;&#x60;sql @@cutoff &#x3D; select #2020-02-01#; @issues &#x3D; select Id, SortId, Summary, Created, Updated from Dev.Jira.Issue where Project&#x3D;&#39;HC&#39; and Created &lt; @@cutoff and Updated &gt; @@cutoff;  select i.Id, i.SortId, i.Summary, LinkText, LinkedIssueId, LinkedIssueSortId, LinkedIssueSummary from @issues i inner join Dev.Jira.Issue.Link li  on i.Id &#x3D; li.IssueId &#x60;&#x60;&#x60;  The following error codes are to be anticipated with standard Problem Detail reports: - 400 BadRequest - something failed with the execution or parsing of your query - 401 Unauthorized - 403 Forbidden 

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

        // uncomment the below to use configuration overrides
        // ConfigurationOptions opts = new ConfigurationOptions();
        // opts.setTotalTimeoutMs(2000);
        
        // uncomment the below to use an api factory with overrides
        // ApiFactory apiFactory = ApiFactoryBuilder.build(fileName, opts);
        // SqlExecutionApi apiInstance = apiFactory.build(SqlExecutionApi.class);

        SqlExecutionApi apiInstance = ApiFactoryBuilder.build(fileName).build(SqlExecutionApi.class);
        String body = select docker-compose.yml Dockerfile Dockerfile.cicd docs generate justfile LICENSE.md publish README.md resources test_sdk from sys.field; // String | LuminesceSql to Execute (may be multi-line)
        Map<String, String> scalarParameters = new HashMap(); // Map<String, String> | Json encoded dictionary of key-value pairs for scalar parameter values to use in the sql execution.
        String queryName = "Get tables/fields"; // String | Name to apply to the query in logs and `Sys.Logs.HcQueryStart`
        Boolean download = false; // Boolean | Makes this a file-download request (as opposed to returning the data in the response-body)
        Integer timeoutSeconds = 0; // Integer | In seconds: <0 or > 175 → 175s (Maximum allowed), 0 → 120s
        String delimiter = "delimiter_example"; // String | Delimiter string to override the default
        String escape = "escape_example"; // String | Escape character to override the default
        String dateTimeFormat = "dateTimeFormat_example"; // String | Format to apply for DateTime data, leaving blank gives the Luminesce Exporter default, currently `yyyy-MM-dd HH:mm:ss.fff`
        try {
            // uncomment the below to set overrides at the request level
            // String result = apiInstance.putByQueryCsv(body, scalarParameters, queryName, download, timeoutSeconds, delimiter, escape, dateTimeFormat).execute(opts);

            String result = apiInstance.putByQueryCsv(body, scalarParameters, queryName, download, timeoutSeconds, delimiter, escape, dateTimeFormat).execute();
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
| **timeoutSeconds** | **Integer**| In seconds: &lt;0 or &gt; 175 → 175s (Maximum allowed), 0 → 120s | [optional] [default to 0] |
| **delimiter** | **String**| Delimiter string to override the default | [optional] |
| **escape** | **String**| Escape character to override the default | [optional] |
| **dateTimeFormat** | **String**| Format to apply for DateTime data, leaving blank gives the Luminesce Exporter default, currently &#x60;yyyy-MM-dd HH:mm:ss.fff&#x60; | [optional] |

### Return type

**String**

### HTTP request headers

- **Content-Type**: text/plain
- **Accept**: text/plain, application/json, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | Bad Request |  -  |
| **403** | Forbidden |  -  |

[Back to top](#) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to Model list](../README.md#documentation-for-models) &#8226; [Back to README](../README.md)


## putByQueryExcel

> File putByQueryExcel(body, scalarParameters, queryName, dateTimeFormat, timeoutSeconds)

PutByQueryExcel: Execute Sql from the body making an Excel file

 For more complex LuminesceSql a PUT will allow for longer and line break delimited Sql, whic will be returned in the format of the method name. e.g.: &#x60;&#x60;&#x60;sql @@cutoff &#x3D; select #2020-02-01#; @issues &#x3D; select Id, SortId, Summary, Created, Updated from Dev.Jira.Issue where Project&#x3D;&#39;HC&#39; and Created &lt; @@cutoff and Updated &gt; @@cutoff;  select i.Id, i.SortId, i.Summary, LinkText, LinkedIssueId, LinkedIssueSortId, LinkedIssueSummary from @issues i inner join Dev.Jira.Issue.Link li  on i.Id &#x3D; li.IssueId &#x60;&#x60;&#x60;  The following error codes are to be anticipated with standard Problem Detail reports: - 400 BadRequest - something failed with the execution or parsing of your query - 401 Unauthorized - 403 Forbidden 

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

        // uncomment the below to use configuration overrides
        // ConfigurationOptions opts = new ConfigurationOptions();
        // opts.setTotalTimeoutMs(2000);
        
        // uncomment the below to use an api factory with overrides
        // ApiFactory apiFactory = ApiFactoryBuilder.build(fileName, opts);
        // SqlExecutionApi apiInstance = apiFactory.build(SqlExecutionApi.class);

        SqlExecutionApi apiInstance = ApiFactoryBuilder.build(fileName).build(SqlExecutionApi.class);
        String body = select docker-compose.yml Dockerfile Dockerfile.cicd docs generate justfile LICENSE.md publish README.md resources test_sdk from sys.field; // String | LuminesceSql to Execute (may be multi-line)
        Map<String, String> scalarParameters = new HashMap(); // Map<String, String> | Json encoded dictionary of key-value pairs for scalar parameter values to use in the sql execution.
        String queryName = "Get tables/fields"; // String | Name to apply to the query in logs and `Sys.Logs.HcQueryStart`
        String dateTimeFormat = "dateTimeFormat_example"; // String | Format to apply for DateTime data, leaving blank gives the Luminesce Exporter default, currently `yyyy-MM-dd HH:mm:ss.000` (Excel support for this is limited)
        Integer timeoutSeconds = 0; // Integer | In seconds: <0 or > 175 → 175s (Maximum allowed), 0 → 120s
        try {
            // uncomment the below to set overrides at the request level
            // File result = apiInstance.putByQueryExcel(body, scalarParameters, queryName, dateTimeFormat, timeoutSeconds).execute(opts);

            File result = apiInstance.putByQueryExcel(body, scalarParameters, queryName, dateTimeFormat, timeoutSeconds).execute();
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
| **dateTimeFormat** | **String**| Format to apply for DateTime data, leaving blank gives the Luminesce Exporter default, currently &#x60;yyyy-MM-dd HH:mm:ss.000&#x60; (Excel support for this is limited) | [optional] |
| **timeoutSeconds** | **Integer**| In seconds: &lt;0 or &gt; 175 → 175s (Maximum allowed), 0 → 120s | [optional] [default to 0] |

### Return type

[**File**](File.md)

### HTTP request headers

- **Content-Type**: text/plain
- **Accept**: text/plain, application/json, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | Bad Request |  -  |
| **403** | Forbidden |  -  |

[Back to top](#) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to Model list](../README.md#documentation-for-models) &#8226; [Back to README](../README.md)


## putByQueryJson

> String putByQueryJson(body, scalarParameters, queryName, timeoutSeconds, jsonProper)

PutByQueryJson: Execute Sql from the body returning JSON

 For more complex LuminesceSql a PUT will allow for longer and line break delimited Sql, whic will be returned in the format of the method name. e.g.: &#x60;&#x60;&#x60;sql @@cutoff &#x3D; select #2020-02-01#; @issues &#x3D; select Id, SortId, Summary, Created, Updated from Dev.Jira.Issue where Project&#x3D;&#39;HC&#39; and Created &lt; @@cutoff and Updated &gt; @@cutoff;  select i.Id, i.SortId, i.Summary, LinkText, LinkedIssueId, LinkedIssueSortId, LinkedIssueSummary from @issues i inner join Dev.Jira.Issue.Link li  on i.Id &#x3D; li.IssueId &#x60;&#x60;&#x60;  The following error codes are to be anticipated with standard Problem Detail reports: - 400 BadRequest - something failed with the execution or parsing of your query - 401 Unauthorized - 403 Forbidden 

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

        // uncomment the below to use configuration overrides
        // ConfigurationOptions opts = new ConfigurationOptions();
        // opts.setTotalTimeoutMs(2000);
        
        // uncomment the below to use an api factory with overrides
        // ApiFactory apiFactory = ApiFactoryBuilder.build(fileName, opts);
        // SqlExecutionApi apiInstance = apiFactory.build(SqlExecutionApi.class);

        SqlExecutionApi apiInstance = ApiFactoryBuilder.build(fileName).build(SqlExecutionApi.class);
        String body = select docker-compose.yml Dockerfile Dockerfile.cicd docs generate justfile LICENSE.md publish README.md resources test_sdk from sys.field; // String | LuminesceSql to Execute (may be multi-line)
        Map<String, String> scalarParameters = new HashMap(); // Map<String, String> | Json encoded dictionary of key-value pairs for scalar parameter values to use in the sql execution.
        String queryName = "Get tables/fields"; // String | Name to apply to the query in logs and `Sys.Logs.HcQueryStart`
        Integer timeoutSeconds = 0; // Integer | In seconds: <0 or > 175 → 175s (Maximum allowed), 0 → 120s
        Boolean jsonProper = false; // Boolean | Should this be text/json (not json-encoded-as-a-string)
        try {
            // uncomment the below to set overrides at the request level
            // String result = apiInstance.putByQueryJson(body, scalarParameters, queryName, timeoutSeconds, jsonProper).execute(opts);

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
| **timeoutSeconds** | **Integer**| In seconds: &lt;0 or &gt; 175 → 175s (Maximum allowed), 0 → 120s | [optional] [default to 0] |
| **jsonProper** | **Boolean**| Should this be text/json (not json-encoded-as-a-string) | [optional] [default to false] |

### Return type

**String**

### HTTP request headers

- **Content-Type**: text/plain
- **Accept**: text/plain, application/json, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | Bad Request |  -  |
| **403** | Forbidden |  -  |

[Back to top](#) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to Model list](../README.md#documentation-for-models) &#8226; [Back to README](../README.md)


## putByQueryParquet

> File putByQueryParquet(body, scalarParameters, queryName, timeoutSeconds)

PutByQueryParquet: Execute Sql from the body making a Parquet file

 For more complex LuminesceSql a PUT will allow for longer and line break delimited Sql, whic will be returned in the format of the method name. e.g.: &#x60;&#x60;&#x60;sql @@cutoff &#x3D; select #2020-02-01#; @issues &#x3D; select Id, SortId, Summary, Created, Updated from Dev.Jira.Issue where Project&#x3D;&#39;HC&#39; and Created &lt; @@cutoff and Updated &gt; @@cutoff;  select i.Id, i.SortId, i.Summary, LinkText, LinkedIssueId, LinkedIssueSortId, LinkedIssueSummary from @issues i inner join Dev.Jira.Issue.Link li  on i.Id &#x3D; li.IssueId &#x60;&#x60;&#x60;  The following error codes are to be anticipated with standard Problem Detail reports: - 400 BadRequest - something failed with the execution or parsing of your query - 401 Unauthorized - 403 Forbidden 

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

        // uncomment the below to use configuration overrides
        // ConfigurationOptions opts = new ConfigurationOptions();
        // opts.setTotalTimeoutMs(2000);
        
        // uncomment the below to use an api factory with overrides
        // ApiFactory apiFactory = ApiFactoryBuilder.build(fileName, opts);
        // SqlExecutionApi apiInstance = apiFactory.build(SqlExecutionApi.class);

        SqlExecutionApi apiInstance = ApiFactoryBuilder.build(fileName).build(SqlExecutionApi.class);
        String body = select docker-compose.yml Dockerfile Dockerfile.cicd docs generate justfile LICENSE.md publish README.md resources test_sdk from sys.field; // String | LuminesceSql to Execute (may be multi-line)
        Map<String, String> scalarParameters = new HashMap(); // Map<String, String> | Json encoded dictionary of key-value pairs for scalar parameter values to use in the sql execution.
        String queryName = "Get tables/fields"; // String | Name to apply to the query in logs and `Sys.Logs.HcQueryStart`
        Integer timeoutSeconds = 0; // Integer | In seconds: <0 or > 175 → 175s (Maximum allowed), 0 → 120s
        try {
            // uncomment the below to set overrides at the request level
            // File result = apiInstance.putByQueryParquet(body, scalarParameters, queryName, timeoutSeconds).execute(opts);

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
| **timeoutSeconds** | **Integer**| In seconds: &lt;0 or &gt; 175 → 175s (Maximum allowed), 0 → 120s | [optional] [default to 0] |

### Return type

[**File**](File.md)

### HTTP request headers

- **Content-Type**: text/plain
- **Accept**: text/plain, application/json, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | Bad Request |  -  |
| **403** | Forbidden |  -  |

[Back to top](#) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to Model list](../README.md#documentation-for-models) &#8226; [Back to README](../README.md)


## putByQueryPipe

> String putByQueryPipe(body, scalarParameters, queryName, download, dateTimeFormat, timeoutSeconds)

PutByQueryPipe: Execute Sql from the body making pipe-delimited

 For more complex LuminesceSql a PUT will allow for longer and line break delimited Sql, whic will be returned in the format of the method name. e.g.: &#x60;&#x60;&#x60;sql @@cutoff &#x3D; select #2020-02-01#; @issues &#x3D; select Id, SortId, Summary, Created, Updated from Dev.Jira.Issue where Project&#x3D;&#39;HC&#39; and Created &lt; @@cutoff and Updated &gt; @@cutoff;  select i.Id, i.SortId, i.Summary, LinkText, LinkedIssueId, LinkedIssueSortId, LinkedIssueSummary from @issues i inner join Dev.Jira.Issue.Link li  on i.Id &#x3D; li.IssueId &#x60;&#x60;&#x60;  The following error codes are to be anticipated with standard Problem Detail reports: - 400 BadRequest - something failed with the execution or parsing of your query - 401 Unauthorized - 403 Forbidden 

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

        // uncomment the below to use configuration overrides
        // ConfigurationOptions opts = new ConfigurationOptions();
        // opts.setTotalTimeoutMs(2000);
        
        // uncomment the below to use an api factory with overrides
        // ApiFactory apiFactory = ApiFactoryBuilder.build(fileName, opts);
        // SqlExecutionApi apiInstance = apiFactory.build(SqlExecutionApi.class);

        SqlExecutionApi apiInstance = ApiFactoryBuilder.build(fileName).build(SqlExecutionApi.class);
        String body = select docker-compose.yml Dockerfile Dockerfile.cicd docs generate justfile LICENSE.md publish README.md resources test_sdk from sys.field; // String | LuminesceSql to Execute (may be multi-line)
        Map<String, String> scalarParameters = new HashMap(); // Map<String, String> | Json encoded dictionary of key-value pairs for scalar parameter values to use in the sql execution.
        String queryName = "Get tables/fields"; // String | Name to apply to the query in logs and `Sys.Logs.HcQueryStart`
        Boolean download = false; // Boolean | Makes this a file-download request (as opposed to returning the data in the response-body)
        String dateTimeFormat = "dateTimeFormat_example"; // String | Format to apply for DateTime data, leaving blank gives the Luminesce Exporter default, currently `yyyy-MM-dd HH:mm:ss.fff`
        Integer timeoutSeconds = 0; // Integer | In seconds: <0 or > 175 → 175s (Maximum allowed), 0 → 120s
        try {
            // uncomment the below to set overrides at the request level
            // String result = apiInstance.putByQueryPipe(body, scalarParameters, queryName, download, dateTimeFormat, timeoutSeconds).execute(opts);

            String result = apiInstance.putByQueryPipe(body, scalarParameters, queryName, download, dateTimeFormat, timeoutSeconds).execute();
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
| **dateTimeFormat** | **String**| Format to apply for DateTime data, leaving blank gives the Luminesce Exporter default, currently &#x60;yyyy-MM-dd HH:mm:ss.fff&#x60; | [optional] |
| **timeoutSeconds** | **Integer**| In seconds: &lt;0 or &gt; 175 → 175s (Maximum allowed), 0 → 120s | [optional] [default to 0] |

### Return type

**String**

### HTTP request headers

- **Content-Type**: text/plain
- **Accept**: text/plain, application/json, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | Bad Request |  -  |
| **403** | Forbidden |  -  |

[Back to top](#) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to Model list](../README.md#documentation-for-models) &#8226; [Back to README](../README.md)


## putByQuerySqlite

> File putByQuerySqlite(body, scalarParameters, queryName, timeoutSeconds)

PutByQuerySqlite: Execute Sql from the body returning SqLite DB

 For more complex LuminesceSql a PUT will allow for longer and line break delimited Sql, whic will be returned in the format of the method name. e.g.: &#x60;&#x60;&#x60;sql @@cutoff &#x3D; select #2020-02-01#; @issues &#x3D; select Id, SortId, Summary, Created, Updated from Dev.Jira.Issue where Project&#x3D;&#39;HC&#39; and Created &lt; @@cutoff and Updated &gt; @@cutoff;  select i.Id, i.SortId, i.Summary, LinkText, LinkedIssueId, LinkedIssueSortId, LinkedIssueSummary from @issues i inner join Dev.Jira.Issue.Link li  on i.Id &#x3D; li.IssueId &#x60;&#x60;&#x60;  The following error codes are to be anticipated with standard Problem Detail reports: - 400 BadRequest - something failed with the execution or parsing of your query - 401 Unauthorized - 403 Forbidden 

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

        // uncomment the below to use configuration overrides
        // ConfigurationOptions opts = new ConfigurationOptions();
        // opts.setTotalTimeoutMs(2000);
        
        // uncomment the below to use an api factory with overrides
        // ApiFactory apiFactory = ApiFactoryBuilder.build(fileName, opts);
        // SqlExecutionApi apiInstance = apiFactory.build(SqlExecutionApi.class);

        SqlExecutionApi apiInstance = ApiFactoryBuilder.build(fileName).build(SqlExecutionApi.class);
        String body = select docker-compose.yml Dockerfile Dockerfile.cicd docs generate justfile LICENSE.md publish README.md resources test_sdk from sys.field; // String | LuminesceSql to Execute (may be multi-line)
        Map<String, String> scalarParameters = new HashMap(); // Map<String, String> | Json encoded dictionary of key-value pairs for scalar parameter values to use in the sql execution.
        String queryName = "Get tables/fields"; // String | Name to apply to the query in logs and `Sys.Logs.HcQueryStart`
        Integer timeoutSeconds = 0; // Integer | In seconds: <0 or > 175 → 175s (Maximum allowed), 0 → 120s
        try {
            // uncomment the below to set overrides at the request level
            // File result = apiInstance.putByQuerySqlite(body, scalarParameters, queryName, timeoutSeconds).execute(opts);

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
| **timeoutSeconds** | **Integer**| In seconds: &lt;0 or &gt; 175 → 175s (Maximum allowed), 0 → 120s | [optional] [default to 0] |

### Return type

[**File**](File.md)

### HTTP request headers

- **Content-Type**: text/plain
- **Accept**: text/plain, application/json, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | Bad Request |  -  |
| **403** | Forbidden |  -  |

[Back to top](#) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to Model list](../README.md#documentation-for-models) &#8226; [Back to README](../README.md)


## putByQueryXml

> String putByQueryXml(body, scalarParameters, queryName, download, timeoutSeconds)

PutByQueryXml: Execute Sql from the body returning XML

 For more complex LuminesceSql a PUT will allow for longer and line break delimited Sql, whic will be returned in the format of the method name. e.g.: &#x60;&#x60;&#x60;sql @@cutoff &#x3D; select #2020-02-01#; @issues &#x3D; select Id, SortId, Summary, Created, Updated from Dev.Jira.Issue where Project&#x3D;&#39;HC&#39; and Created &lt; @@cutoff and Updated &gt; @@cutoff;  select i.Id, i.SortId, i.Summary, LinkText, LinkedIssueId, LinkedIssueSortId, LinkedIssueSummary from @issues i inner join Dev.Jira.Issue.Link li  on i.Id &#x3D; li.IssueId &#x60;&#x60;&#x60;  The following error codes are to be anticipated with standard Problem Detail reports: - 400 BadRequest - something failed with the execution or parsing of your query - 401 Unauthorized - 403 Forbidden 

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

        // uncomment the below to use configuration overrides
        // ConfigurationOptions opts = new ConfigurationOptions();
        // opts.setTotalTimeoutMs(2000);
        
        // uncomment the below to use an api factory with overrides
        // ApiFactory apiFactory = ApiFactoryBuilder.build(fileName, opts);
        // SqlExecutionApi apiInstance = apiFactory.build(SqlExecutionApi.class);

        SqlExecutionApi apiInstance = ApiFactoryBuilder.build(fileName).build(SqlExecutionApi.class);
        String body = select docker-compose.yml Dockerfile Dockerfile.cicd docs generate justfile LICENSE.md publish README.md resources test_sdk from sys.field; // String | LuminesceSql to Execute (may be multi-line)
        Map<String, String> scalarParameters = new HashMap(); // Map<String, String> | Json encoded dictionary of key-value pairs for scalar parameter values to use in the sql execution.
        String queryName = "Get tables/fields"; // String | Name to apply to the query in logs and `Sys.Logs.HcQueryStart`
        Boolean download = false; // Boolean | Makes this a file-download request (as opposed to returning the data in the response-body)
        Integer timeoutSeconds = 0; // Integer | In seconds: <0 or > 175 → 175s (Maximum allowed), 0 → 120s
        try {
            // uncomment the below to set overrides at the request level
            // String result = apiInstance.putByQueryXml(body, scalarParameters, queryName, download, timeoutSeconds).execute(opts);

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
| **timeoutSeconds** | **Integer**| In seconds: &lt;0 or &gt; 175 → 175s (Maximum allowed), 0 → 120s | [optional] [default to 0] |

### Return type

**String**

### HTTP request headers

- **Content-Type**: text/plain
- **Accept**: text/plain, application/json, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | Bad Request |  -  |
| **403** | Forbidden |  -  |

[Back to top](#) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to Model list](../README.md#documentation-for-models) &#8226; [Back to README](../README.md)

