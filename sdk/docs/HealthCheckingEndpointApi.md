# HealthCheckingEndpointApi

All URIs are relative to *https://fbn-prd.lusid.com/honeycomb*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**fakeNodeReclaim**](HealthCheckingEndpointApi.md#fakeNodeReclaim) | **GET** /fakeNodeReclaim | [INTERNAL] FakeNodeReclaim: An internal Method used to mark the next SIGTERM as though an Aws Node reclaim were about to take place. |


<a id="fakeNodeReclaim"></a>
# **fakeNodeReclaim**
> Object fakeNodeReclaim().secondsUntilReclaim(secondsUntilReclaim).execute();

[INTERNAL] FakeNodeReclaim: An internal Method used to mark the next SIGTERM as though an Aws Node reclaim were about to take place.

Internal testing controller to simulate having received an AWS node reclaim warning, or similar.

### Example
```java
// Import classes:
import com.finbourne.luminesce.ApiClient;
import com.finbourne.luminesce.ApiException;
import com.finbourne.luminesce.Configuration;
import com.finbourne.luminesce.auth.*;
import com.finbourne.luminesce.models.*;
import com.finbourne.luminesce.api.HealthCheckingEndpointApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://fbn-prd.lusid.com/honeycomb");
    
    // Configure OAuth2 access token for authorization: oauth2
    OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
    oauth2.setAccessToken("YOUR ACCESS TOKEN");

    HealthCheckingEndpointApi apiInstance = new HealthCheckingEndpointApi(defaultClient);
    Integer secondsUntilReclaim = 119; // Integer | the number of seconds from which to assume node termination
    try {
      Object result = apiInstance.fakeNodeReclaim()
            .secondsUntilReclaim(secondsUntilReclaim)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling HealthCheckingEndpointApi#fakeNodeReclaim");
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
| **secondsUntilReclaim** | **Integer**| the number of seconds from which to assume node termination | [optional] [default to 119] |

### Return type

**Object**

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

