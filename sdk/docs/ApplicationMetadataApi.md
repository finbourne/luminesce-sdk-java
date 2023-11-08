# ApplicationMetadataApi

All URIs are relative to *https://fbn-prd.lusid.com/honeycomb*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getServicesAsAccessControlledResources**](ApplicationMetadataApi.md#getServicesAsAccessControlledResources) | **GET** /api/metadata/access/resources | GetServicesAsAccessControlledResources: Get resources available for access control |


<a id="getServicesAsAccessControlledResources"></a>
# **getServicesAsAccessControlledResources**
> ResourceListOfAccessControlledResource getServicesAsAccessControlledResources().execute();

GetServicesAsAccessControlledResources: Get resources available for access control

 Get the comprehensive set of resources that are available for access control.  The following LuminesceSql is executed to return this information,  which is then packaged up as AccessControlledResource:  &#x60;&#x60;&#x60;sql select  Name,  min(coalesce(Description, Name) || &#39; (&#39; || Type || &#39;)&#39;) as Description from  Sys.Registration where  Type in (&#39;DirectProvider&#39;, &#39;DataProvider&#39;)  and  ShowAll &#x3D; true group by 1 order by 1   &#x60;&#x60;&#x60;  The following error codes are to be anticipated with standard Problem Detail reports: - 401 Unauthorized 

### Example
```java
// Import classes:
import com.finbourne.luminesce.ApiClient;
import com.finbourne.luminesce.ApiException;
import com.finbourne.luminesce.Configuration;
import com.finbourne.luminesce.auth.*;
import com.finbourne.luminesce.models.*;
import com.finbourne.luminesce.api.ApplicationMetadataApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://fbn-prd.lusid.com/honeycomb");
    
    // Configure OAuth2 access token for authorization: oauth2
    OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
    oauth2.setAccessToken("YOUR ACCESS TOKEN");

    ApplicationMetadataApi apiInstance = new ApplicationMetadataApi(defaultClient);
    try {
      ResourceListOfAccessControlledResource result = apiInstance.getServicesAsAccessControlledResources()
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ApplicationMetadataApi#getServicesAsAccessControlledResources");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**ResourceListOfAccessControlledResource**](ResourceListOfAccessControlledResource.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

