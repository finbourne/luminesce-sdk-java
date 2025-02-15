# HealthCheckingEndpointApi

All URIs are relative to *https://fbn-prd.lusid.com/honeycomb*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**fakeNodeReclaim**](HealthCheckingEndpointApi.md#fakeNodeReclaim) | **GET** /fakeNodeReclaim | [INTERNAL] FakeNodeReclaim: Helps testing of AWS node reclaim behaviour |



## fakeNodeReclaim

> Object fakeNodeReclaim(secondsUntilReclaim)

[INTERNAL] FakeNodeReclaim: Helps testing of AWS node reclaim behaviour

 An internal Method used to mark the next SIGTERM as though an Aws Node reclaim were about to take place. Simulates having received an AWS node reclaim warning, or similar.

### Example

```java
import com.finbourne.luminesce.model.*;
import com.finbourne.luminesce.api.HealthCheckingEndpointApi;
import com.finbourne.luminesce.extensions.ApiConfigurationException;
import com.finbourne.luminesce.extensions.ApiFactoryBuilder;
import com.finbourne.luminesce.extensions.auth.FinbourneTokenException;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class HealthCheckingEndpointApiExample {

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
        // HealthCheckingEndpointApi apiInstance = apiFactory.build(HealthCheckingEndpointApi.class);

        HealthCheckingEndpointApi apiInstance = ApiFactoryBuilder.build(fileName).build(HealthCheckingEndpointApi.class);
        Integer secondsUntilReclaim = 119; // Integer | the number of seconds from which to assume node termination
        try {
            // uncomment the below to set overrides at the request level
            // Object result = apiInstance.fakeNodeReclaim(secondsUntilReclaim).execute(opts);

            Object result = apiInstance.fakeNodeReclaim(secondsUntilReclaim).execute();
            System.out.println(result.toJson());
        } catch (ApiException e) {
            System.err.println("Exception when calling HealthCheckingEndpointApi#fakeNodeReclaim");
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
| **secondsUntilReclaim** | **Integer**| the number of seconds from which to assume node termination | [optional] [default to 119] |

### Return type

**Object**

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: text/plain, application/json, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

[Back to top](#) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to Model list](../README.md#documentation-for-models) &#8226; [Back to README](../README.md)

