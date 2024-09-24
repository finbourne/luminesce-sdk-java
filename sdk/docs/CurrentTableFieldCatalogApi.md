# CurrentTableFieldCatalogApi

All URIs are relative to *https://fbn-prd.lusid.com/honeycomb*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getCatalog**](CurrentTableFieldCatalogApi.md#getCatalog) | **GET** /api/Catalog | GetCatalog: Flattened Table/Faield Catalog |
| [**getFields**](CurrentTableFieldCatalogApi.md#getFields) | **GET** /api/Catalog/fields | GetFields: Lists field/parameter information for providers |
| [**getProviders**](CurrentTableFieldCatalogApi.md#getProviders) | **GET** /api/Catalog/providers | GetProviders: Lists providers available |



## getCatalog

> String getCatalog(freeTextSearch, jsonProper, useCache)

GetCatalog: Flattened Table/Faield Catalog

 Returns the User&#39;s full version of the catalog (Providers, their fields and associated information) that are currently running that you have access to (in Json format).  This is the entire catalog flattened, which is often quite large and always a bit repetitive.  The internal results are cached for several minutes.  Consider using &#x60;api/Catalog/providers&#x60; and &#x60;api/Catalog/fields&#x60; for a more granular and incremental loading flow.  The following error codes are to be anticipated with standard Problem Detail reports: - 401 Unauthorized - 403 Forbidden 

### Example

```java
import com.finbourne.luminesce.model.*;
import com.finbourne.luminesce.api.CurrentTableFieldCatalogApi;
import com.finbourne.luminesce.extensions.ApiConfigurationException;
import com.finbourne.luminesce.extensions.ApiFactoryBuilder;
import com.finbourne.luminesce.extensions.auth.FinbourneTokenException;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class CurrentTableFieldCatalogApiExample {

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
        // CurrentTableFieldCatalogApi apiInstance = apiFactory.build(CurrentTableFieldCatalogApi.class);

        CurrentTableFieldCatalogApi apiInstance = ApiFactoryBuilder.build(fileName).build(CurrentTableFieldCatalogApi.class);
        String freeTextSearch = "freeTextSearch_example"; // String | Limit the catalog to only things in some way dealing with the passed in text string
        Boolean jsonProper = false; // Boolean | Should this be text/json (not json-encoded-as-a-string)
        Boolean useCache = false; // Boolean | Should the available cache be used? false is effectively to pick up a change in the catalog
        try {
            // uncomment the below to set overrides at the request level
            // String result = apiInstance.getCatalog(freeTextSearch, jsonProper, useCache).execute(opts);

            String result = apiInstance.getCatalog(freeTextSearch, jsonProper, useCache).execute();
            System.out.println(result.toJson());
        } catch (ApiException e) {
            System.err.println("Exception when calling CurrentTableFieldCatalogApi#getCatalog");
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
| **freeTextSearch** | **String**| Limit the catalog to only things in some way dealing with the passed in text string | [optional] |
| **jsonProper** | **Boolean**| Should this be text/json (not json-encoded-as-a-string) | [optional] [default to false] |
| **useCache** | **Boolean**| Should the available cache be used? false is effectively to pick up a change in the catalog | [optional] [default to false] |

### Return type

**String**

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: text/plain, application/json, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

[Back to top](#) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to Model list](../README.md#documentation-for-models) &#8226; [Back to README](../README.md)


## getFields

> String getFields(tableLike)

GetFields: Lists field/parameter information for providers

 Returns the User&#39;s full version of the catalog but only the field/parameter-level information  (as well as the TableName they refer to, of course) for tables matching the &#x60;tableLike&#x60; (manually include wildcards if desired).  The internal results are cached for several minutes.  The following error codes are to be anticipated with standard Problem Detail reports: - 401 Unauthorized - 403 Forbidden 

### Example

```java
import com.finbourne.luminesce.model.*;
import com.finbourne.luminesce.api.CurrentTableFieldCatalogApi;
import com.finbourne.luminesce.extensions.ApiConfigurationException;
import com.finbourne.luminesce.extensions.ApiFactoryBuilder;
import com.finbourne.luminesce.extensions.auth.FinbourneTokenException;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class CurrentTableFieldCatalogApiExample {

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
        // CurrentTableFieldCatalogApi apiInstance = apiFactory.build(CurrentTableFieldCatalogApi.class);

        CurrentTableFieldCatalogApi apiInstance = ApiFactoryBuilder.build(fileName).build(CurrentTableFieldCatalogApi.class);
        String tableLike = "%"; // String | 
        try {
            // uncomment the below to set overrides at the request level
            // String result = apiInstance.getFields(tableLike).execute(opts);

            String result = apiInstance.getFields(tableLike).execute();
            System.out.println(result.toJson());
        } catch (ApiException e) {
            System.err.println("Exception when calling CurrentTableFieldCatalogApi#getFields");
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
| **tableLike** | **String**|  | [optional] [default to %] |

### Return type

**String**

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: text/plain, application/json, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

[Back to top](#) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to Model list](../README.md#documentation-for-models) &#8226; [Back to README](../README.md)


## getProviders

> String getProviders(freeTextSearch, useCache)

GetProviders: Lists providers available

 Returns the User&#39;s full version of the catalog but only the table/provider-level information they have access to.  The internal results are cached for several minutes.  The following error codes are to be anticipated with standard Problem Detail reports: - 401 Unauthorized - 403 Forbidden 

### Example

```java
import com.finbourne.luminesce.model.*;
import com.finbourne.luminesce.api.CurrentTableFieldCatalogApi;
import com.finbourne.luminesce.extensions.ApiConfigurationException;
import com.finbourne.luminesce.extensions.ApiFactoryBuilder;
import com.finbourne.luminesce.extensions.auth.FinbourneTokenException;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class CurrentTableFieldCatalogApiExample {

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
        // CurrentTableFieldCatalogApi apiInstance = apiFactory.build(CurrentTableFieldCatalogApi.class);

        CurrentTableFieldCatalogApi apiInstance = ApiFactoryBuilder.build(fileName).build(CurrentTableFieldCatalogApi.class);
        String freeTextSearch = "freeTextSearch_example"; // String | Limit the catalog to only things in some way dealing with the passed in text string
        Boolean useCache = true; // Boolean | Should the available cache be used? false is effectively to pick up a change in the catalog
        try {
            // uncomment the below to set overrides at the request level
            // String result = apiInstance.getProviders(freeTextSearch, useCache).execute(opts);

            String result = apiInstance.getProviders(freeTextSearch, useCache).execute();
            System.out.println(result.toJson());
        } catch (ApiException e) {
            System.err.println("Exception when calling CurrentTableFieldCatalogApi#getProviders");
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
| **freeTextSearch** | **String**| Limit the catalog to only things in some way dealing with the passed in text string | [optional] |
| **useCache** | **Boolean**| Should the available cache be used? false is effectively to pick up a change in the catalog | [optional] [default to true] |

### Return type

**String**

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: text/plain, application/json, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

[Back to top](#) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to Model list](../README.md#documentation-for-models) &#8226; [Back to README](../README.md)

