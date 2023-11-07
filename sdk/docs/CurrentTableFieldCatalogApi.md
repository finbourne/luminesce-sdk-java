# CurrentTableFieldCatalogApi

All URIs are relative to *https://fbn-ci.lusid.com/honeycomb*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getCatalog**](CurrentTableFieldCatalogApi.md#getCatalog) | **GET** /api/Catalog | GetCatalog: Shows Table and Field level information on Providers that are currently running that you have access to (in Json format) |


<a id="getCatalog"></a>
# **getCatalog**
> String getCatalog().freeTextSearch(freeTextSearch).jsonProper(jsonProper).execute();

GetCatalog: Shows Table and Field level information on Providers that are currently running that you have access to (in Json format)

 The following LuminesceSql is executed to return this information:  &#x60;&#x60;&#x60;sql @reg &#x3D; select  Name,  min(Description) as Description,  min(DocumentationLink) as DocumentationLink,  iif(Category &#x3D; &#39;View&#39; and Client is not null, true, false) as IsView from  Sys.Registration where  Type in (&#39;DirectProvider&#39;, &#39;DataProvider&#39;)  and   ShowAll &#x3D; false group by  1  ;  @fld &#x3D; select  TableName,  FieldName,  DataType,  FieldType,  IsPrimaryKey,  IsMain,  Description,  ParamDefaultValue,  TableParamColumns from  Sys.Field  ;  @x &#x3D; select  coalesce(f.TableName, r.Name) as TableName,  coalesce(f.FieldName, &#39;N/A&#39;) as FieldName,  f.DataType,  f.FieldType,  f.IsPrimaryKey,  f.IsMain,  case   when f.TableName is not null then  f.Description  else  r.Name || &#39; returns a different set of columns depending on use.&#39;  end as Description,  f.ParamDefaultValue,  f.TableParamColumns,  r.Description as ProviderDescription,  r.DocumentationLink,  r.IsView from  @reg r  left outer join @fld f  on r.Name &#x3D; f.TableName order by  1, 5 desc, 6 desc, 2  ;   &#x60;&#x60;&#x60;  The following error codes are to be anticipated with standard Problem Detail reports: - 401 Unauthorized 

### Example
```java
// Import classes:
import com.finbourne.luminesce.ApiClient;
import com.finbourne.luminesce.ApiException;
import com.finbourne.luminesce.Configuration;
import com.finbourne.luminesce.auth.*;
import com.finbourne.luminesce.models.*;
import com.finbourne.luminesce.api.CurrentTableFieldCatalogApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://fbn-ci.lusid.com/honeycomb");
    
    // Configure OAuth2 access token for authorization: oauth2
    OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
    oauth2.setAccessToken("YOUR ACCESS TOKEN");

    CurrentTableFieldCatalogApi apiInstance = new CurrentTableFieldCatalogApi(defaultClient);
    String freeTextSearch = "freeTextSearch_example"; // String | Limit the catalog to only things in some way dealing with the passed in text string
    Boolean jsonProper = false; // Boolean | Should this be text/json (not json-encoded-as-a-string)
    try {
      String result = apiInstance.getCatalog()
            .freeTextSearch(freeTextSearch)
            .jsonProper(jsonProper)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CurrentTableFieldCatalogApi#getCatalog");
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
| **freeTextSearch** | **String**| Limit the catalog to only things in some way dealing with the passed in text string | [optional] |
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

