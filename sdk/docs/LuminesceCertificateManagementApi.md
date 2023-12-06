# LuminesceCertificateManagementApi

All URIs are relative to *https://fbn-prd.lusid.com/honeycomb*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getCertificates**](LuminesceCertificateManagementApi.md#getCertificates) | **GET** /api/Certificate/certificates | [EXPERIMENTAL] GetCertificates: Shows Table and Field level information on Providers that are currently running that you have access to (in Json format) |
| [**manageCertificate**](LuminesceCertificateManagementApi.md#manageCertificate) | **PUT** /api/Certificate/manage | [EXPERIMENTAL] ManageCertificate: Manages a new certificate (Create / Renew / Revoke) |


<a id="getCertificates"></a>
# **getCertificates**
> List&lt;CertificateState&gt; getCertificates().execute();

[EXPERIMENTAL] GetCertificates: Shows Table and Field level information on Providers that are currently running that you have access to (in Json format)

 Lists all the certificates previously minted to which you have access.  The following error codes are to be anticipated with standard Problem Detail reports: - 401 Unauthorized 

### Example
```java
// Import classes:
import com.finbourne.luminesce.ApiClient;
import com.finbourne.luminesce.ApiException;
import com.finbourne.luminesce.Configuration;
import com.finbourne.luminesce.auth.*;
import com.finbourne.luminesce.models.*;
import com.finbourne.luminesce.api.LuminesceCertificateManagementApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://fbn-prd.lusid.com/honeycomb");
    
    // Configure OAuth2 access token for authorization: oauth2
    OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
    oauth2.setAccessToken("YOUR ACCESS TOKEN");

    LuminesceCertificateManagementApi apiInstance = new LuminesceCertificateManagementApi(defaultClient);
    try {
      List<CertificateState> result = apiInstance.getCertificates()
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling LuminesceCertificateManagementApi#getCertificates");
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

<a id="manageCertificate"></a>
# **manageCertificate**
> CertificateState manageCertificate().action(action).type(type).version(version).validityStart(validityStart).validityEnd(validityEnd).dryRun(dryRun).skipSystems(skipSystems).execute();

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
import com.finbourne.luminesce.api.LuminesceCertificateManagementApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://fbn-prd.lusid.com/honeycomb");
    
    // Configure OAuth2 access token for authorization: oauth2
    OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
    oauth2.setAccessToken("YOUR ACCESS TOKEN");

    LuminesceCertificateManagementApi apiInstance = new LuminesceCertificateManagementApi(defaultClient);
    CertificateAction action = CertificateAction.fromValue("Create"); // CertificateAction | The Action to perform, e.g. Create / Renew / Revoke
    CertificateType type = CertificateType.fromValue("Domain"); // CertificateType | User or Domain level cert (Domain level requires additional entitlements)
    Integer version = 1; // Integer | Version number of the cert, the request will fail to validate if incorrect
    OffsetDateTime validityStart = OffsetDateTime.now(); // OffsetDateTime | When should the cert first be valid (defaults to the current time in UTC)
    OffsetDateTime validityEnd = OffsetDateTime.now(); // OffsetDateTime | When should the cert no longer be valid (defaults to 13 months from now)
    Boolean dryRun = true; // Boolean | True will just validate the request, but perform no changes to any system
    CertificateStatus skipSystems = CertificateStatus.fromValue("None"); // CertificateStatus | Any systems that should be skipped  (if any are the certificate will not function, but can be useful for certain forms of validation)
    try {
      CertificateState result = apiInstance.manageCertificate()
            .action(action)
            .type(type)
            .version(version)
            .validityStart(validityStart)
            .validityEnd(validityEnd)
            .dryRun(dryRun)
            .skipSystems(skipSystems)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling LuminesceCertificateManagementApi#manageCertificate");
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
| **skipSystems** | [**CertificateStatus**](.md)| Any systems that should be skipped  (if any are the certificate will not function, but can be useful for certain forms of validation) | [optional] [enum: None, WebApiPersistence, Vault, Rabbit, ConfigStore, AllSystems] |

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

