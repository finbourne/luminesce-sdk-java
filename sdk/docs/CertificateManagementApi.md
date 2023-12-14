# CertificateManagementApi

All URIs are relative to *https://fbn-prd.lusid.com/honeycomb*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**downloadCertificate**](CertificateManagementApi.md#downloadCertificate) | **GET** /api/Certificate/certificate | [EXPERIMENTAL] DownloadCertificate: Downloads your latest Domain or User certificate&#39;s public or private key - if any. |
| [**listCertificates**](CertificateManagementApi.md#listCertificates) | **GET** /api/Certificate/certificates | [EXPERIMENTAL] ListCertificates: Shows Table and Field level information on Providers that are currently running that you have access to (in Json format) |
| [**manageCertificate**](CertificateManagementApi.md#manageCertificate) | **PUT** /api/Certificate/manage | [EXPERIMENTAL] ManageCertificate: Manages a new certificate (Create / Renew / Revoke) |


<a id="downloadCertificate"></a>
# **downloadCertificate**
> File downloadCertificate().type(type).fileType(fileType).mayAutoCreate(mayAutoCreate).execute();

[EXPERIMENTAL] DownloadCertificate: Downloads your latest Domain or User certificate&#39;s public or private key - if any.

 Downloads your latest Domain or User certificate&#39;s public or private key - if any.  The following error codes are to be anticipated with standard Problem Detail reports: - 400 BadRequest - certificate is not available for some reason - 401 Unauthorized 

### Example
```java
// Import classes:
import com.finbourne.luminesce.ApiClient;
import com.finbourne.luminesce.ApiException;
import com.finbourne.luminesce.Configuration;
import com.finbourne.luminesce.auth.*;
import com.finbourne.luminesce.models.*;
import com.finbourne.luminesce.api.CertificateManagementApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://fbn-prd.lusid.com/honeycomb");
    
    // Configure OAuth2 access token for authorization: oauth2
    OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
    oauth2.setAccessToken("YOUR ACCESS TOKEN");

    CertificateManagementApi apiInstance = new CertificateManagementApi(defaultClient);
    CertificateType type = CertificateType.fromValue("Domain"); // CertificateType | User or Domain level cert (Domain level requires additional entitlements)
    CertificateFileType fileType = CertificateFileType.fromValue("Public"); // CertificateFileType | Should the public key or private key be downloaded? (both must be in place to run providers)
    Boolean mayAutoCreate = false; // Boolean | If no matching cert is available, should an attempt be made to Create/Renew it with default options?
    try {
      File result = apiInstance.downloadCertificate()
            .type(type)
            .fileType(fileType)
            .mayAutoCreate(mayAutoCreate)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CertificateManagementApi#downloadCertificate");
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
| **type** | [**CertificateType**](.md)| User or Domain level cert (Domain level requires additional entitlements) | [optional] [enum: Domain, User] |
| **fileType** | [**CertificateFileType**](.md)| Should the public key or private key be downloaded? (both must be in place to run providers) | [optional] [enum: Public, Private] |
| **mayAutoCreate** | **Boolean**| If no matching cert is available, should an attempt be made to Create/Renew it with default options? | [optional] [default to false] |

### Return type

[**File**](File.md)

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

<a id="listCertificates"></a>
# **listCertificates**
> List&lt;CertificateState&gt; listCertificates().execute();

[EXPERIMENTAL] ListCertificates: Shows Table and Field level information on Providers that are currently running that you have access to (in Json format)

 Lists all the certificates previously minted to which you have access.  The following error codes are to be anticipated with standard Problem Detail reports: - 401 Unauthorized 

### Example
```java
// Import classes:
import com.finbourne.luminesce.ApiClient;
import com.finbourne.luminesce.ApiException;
import com.finbourne.luminesce.Configuration;
import com.finbourne.luminesce.auth.*;
import com.finbourne.luminesce.models.*;
import com.finbourne.luminesce.api.CertificateManagementApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://fbn-prd.lusid.com/honeycomb");
    
    // Configure OAuth2 access token for authorization: oauth2
    OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
    oauth2.setAccessToken("YOUR ACCESS TOKEN");

    CertificateManagementApi apiInstance = new CertificateManagementApi(defaultClient);
    try {
      List<CertificateState> result = apiInstance.listCertificates()
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CertificateManagementApi#listCertificates");
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

[**List&lt;CertificateState&gt;**](CertificateState.md)

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

<a id="manageCertificate"></a>
# **manageCertificate**
> CertificateState manageCertificate().action(action).type(type).version(version).validityStart(validityStart).validityEnd(validityEnd).dryRun(dryRun).execute();

[EXPERIMENTAL] ManageCertificate: Manages a new certificate (Create / Renew / Revoke)

 Manages a certificate. This could be creating a new one, renewing an old one or revoking one explicitly.  The following error codes are to be anticipated with standard Problem Detail reports: - 400 BadRequest - something about the request cannot be processed - 401 Unauthorized 

### Example
```java
// Import classes:
import com.finbourne.luminesce.ApiClient;
import com.finbourne.luminesce.ApiException;
import com.finbourne.luminesce.Configuration;
import com.finbourne.luminesce.auth.*;
import com.finbourne.luminesce.models.*;
import com.finbourne.luminesce.api.CertificateManagementApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://fbn-prd.lusid.com/honeycomb");
    
    // Configure OAuth2 access token for authorization: oauth2
    OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
    oauth2.setAccessToken("YOUR ACCESS TOKEN");

    CertificateManagementApi apiInstance = new CertificateManagementApi(defaultClient);
    CertificateAction action = CertificateAction.fromValue("Create"); // CertificateAction | The Action to perform, e.g. Create / Renew / Revoke
    CertificateType type = CertificateType.fromValue("Domain"); // CertificateType | User or Domain level cert (Domain level requires additional entitlements)
    Integer version = 1; // Integer | Version number of the cert, the request will fail to validate if incorrect
    OffsetDateTime validityStart = OffsetDateTime.now(); // OffsetDateTime | When should the cert first be valid (defaults to the current time in UTC)
    OffsetDateTime validityEnd = OffsetDateTime.now(); // OffsetDateTime | When should the cert no longer be valid (defaults to 13 months from now)
    Boolean dryRun = true; // Boolean | True will just validate the request, but perform no changes to any system
    try {
      CertificateState result = apiInstance.manageCertificate()
            .action(action)
            .type(type)
            .version(version)
            .validityStart(validityStart)
            .validityEnd(validityEnd)
            .dryRun(dryRun)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CertificateManagementApi#manageCertificate");
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
| **action** | [**CertificateAction**](.md)| The Action to perform, e.g. Create / Renew / Revoke | [optional] [enum: Create, CreateAndAllowMultipleWhichAreValid, Renew, Revoke] |
| **type** | [**CertificateType**](.md)| User or Domain level cert (Domain level requires additional entitlements) | [optional] [enum: Domain, User] |
| **version** | **Integer**| Version number of the cert, the request will fail to validate if incorrect | [optional] [default to 1] |
| **validityStart** | **OffsetDateTime**| When should the cert first be valid (defaults to the current time in UTC) | [optional] |
| **validityEnd** | **OffsetDateTime**| When should the cert no longer be valid (defaults to 13 months from now) | [optional] |
| **dryRun** | **Boolean**| True will just validate the request, but perform no changes to any system | [optional] [default to true] |

### Return type

[**CertificateState**](CertificateState.md)

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

