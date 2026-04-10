# ViewManagementApi

All URIs are relative to *https://fbn-prd.lusid.com/honeycomb*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getViewCreationSql**](ViewManagementApi.md#getViewCreationSql) | **PUT** /api/View/sql | [EXPERIMENTAL] GetViewCreationSql: Gets the original source Sql for a view (if available) |
| [**listViews**](ViewManagementApi.md#listViews) | **GET** /api/View/list | [EXPERIMENTAL] ListViews: List views which are visible to the current user |



## getViewCreationSql

> String getViewCreationSql(viewItem)

[EXPERIMENTAL] GetViewCreationSql: Gets the original source Sql for a view (if available)

 Gets the original source Sql for a view (if available, 404 if not found in the logs)  The following error codes are to be anticipated with standard Problem Detail reports: - 401 Unauthorized - 403 Forbidden 

### Example

```java
import com.finbourne.luminesce.model.*;
import com.finbourne.luminesce.api.ViewManagementApi;
import com.finbourne.luminesce.extensions.ApiConfigurationException;
import com.finbourne.luminesce.extensions.ApiFactoryBuilder;
import com.finbourne.luminesce.extensions.auth.FinbourneTokenException;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class ViewManagementApiExample {

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
        // ViewManagementApi apiInstance = apiFactory.build(ViewManagementApi.class);

        ViewManagementApi apiInstance = ApiFactoryBuilder.build(fileName).build(ViewManagementApi.class);
        ViewItem viewItem = new ViewItem(); // ViewItem | View to fetch the create SQL for. Only the LastUpdatedAt and LastUpdatedExecutionId properties are required.
        try {
            // uncomment the below to set overrides at the request level
            // String result = apiInstance.getViewCreationSql(viewItem).execute(opts);

            String result = apiInstance.getViewCreationSql(viewItem).execute();
            System.out.println(result.toJson());
        } catch (ApiException e) {
            System.err.println("Exception when calling ViewManagementApi#getViewCreationSql");
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
| **viewItem** | [**ViewItem**](ViewItem.md)| View to fetch the create SQL for. Only the LastUpdatedAt and LastUpdatedExecutionId properties are required. | [optional] |

### Return type

**String**

### HTTP request headers

- **Content-Type**: application/json-patch+json, application/json, text/json, application/*+json
- **Accept**: text/plain, application/json, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | Bad Request |  -  |
| **403** | Forbidden |  -  |

[Back to top](#) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to Model list](../README.md#documentation-for-models) &#8226; [Back to README](../README.md)


## listViews

> List&lt;ViewItem&gt; listViews(showAll, regExFilter, nameLikeFilter)

[EXPERIMENTAL] ListViews: List views which are visible to the current user

 Lists all the views which you have access to see. These come from directly from persisted files in the file system. Some limited filtering is available.  The following error codes are to be anticipated with standard Problem Detail reports: - 401 Unauthorized - 403 Forbidden 

### Example

```java
import com.finbourne.luminesce.model.*;
import com.finbourne.luminesce.api.ViewManagementApi;
import com.finbourne.luminesce.extensions.ApiConfigurationException;
import com.finbourne.luminesce.extensions.ApiFactoryBuilder;
import com.finbourne.luminesce.extensions.auth.FinbourneTokenException;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class ViewManagementApiExample {

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
        // ViewManagementApi apiInstance = apiFactory.build(ViewManagementApi.class);

        ViewManagementApi apiInstance = ApiFactoryBuilder.build(fileName).build(ViewManagementApi.class);
        Boolean showAll = false; // Boolean | Show additional views if permissions allow
        String regExFilter = "regExFilter_example"; // String | Regular Expression filter to reduce the number of views returned, it is applied to the view *content* (this filter is applied withing the Filesystem itself.)
        String nameLikeFilter = "nameLikeFilter_example"; // String | SQL Like-style filter on the view name, to reduce the number of views returned (this filter is applied to the Filesystem-returned view list.)
        try {
            // uncomment the below to set overrides at the request level
            // List<ViewItem> result = apiInstance.listViews(showAll, regExFilter, nameLikeFilter).execute(opts);

            List<ViewItem> result = apiInstance.listViews(showAll, regExFilter, nameLikeFilter).execute();
            System.out.println(result.toJson());
        } catch (ApiException e) {
            System.err.println("Exception when calling ViewManagementApi#listViews");
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
| **showAll** | **Boolean**| Show additional views if permissions allow | [optional] [default to false] |
| **regExFilter** | **String**| Regular Expression filter to reduce the number of views returned, it is applied to the view *content* (this filter is applied withing the Filesystem itself.) | [optional] |
| **nameLikeFilter** | **String**| SQL Like-style filter on the view name, to reduce the number of views returned (this filter is applied to the Filesystem-returned view list.) | [optional] |

### Return type

[**List&lt;ViewItem&gt;**](ViewItem.md)

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

