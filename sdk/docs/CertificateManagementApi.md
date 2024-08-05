# CertificateManagementApi

All URIs are relative to *https://fbn-prd.lusid.com/honeycomb*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**downloadCertificate**](CertificateManagementApi.md#downloadCertificate) | **GET** /api/Certificate/certificate | [EXPERIMENTAL] DownloadCertificate: Downloads your latest Domain or User certificate&#39;s public or private key - if any |
| [**listCertificates**](CertificateManagementApi.md#listCertificates) | **GET** /api/Certificate/certificates | [EXPERIMENTAL] ListCertificates: Lists all the certificates previously minted to which you have access |
| [**manageCertificate**](CertificateManagementApi.md#manageCertificate) | **PUT** /api/Certificate/manage | [EXPERIMENTAL] ManageCertificate: Manages a new certificate (Create / Renew / Revoke) |



## downloadCertificate

> File downloadCertificate(type, fileType, mayAutoCreate)

[EXPERIMENTAL] DownloadCertificate: Downloads your latest Domain or User certificate&#39;s public or private key - if any

 Downloads your latest Domain or User certificate&#39;s public or private key - if any.  The following error codes are to be anticipated with standard Problem Detail reports: - 400 BadRequest - certificate is not available for some reason - 401 Unauthorized - 403 Forbidden 

### Example

```java
import com.finbourne.luminesce.model.*;
import com.finbourne.luminesce.api.CertificateManagementApi;
import com.finbourne.luminesce.extensions.ApiConfigurationException;
import com.finbourne.luminesce.extensions.ApiFactoryBuilder;
import com.finbourne.luminesce.extensions.auth.FinbourneTokenException;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class CertificateManagementApiExample {

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

        CertificateManagementApi apiInstance = ApiFactoryBuilder.build(fileName).build(CertificateManagementApi.class);
        CertificateType type = CertificateType.fromValue("Domain"); // CertificateType | User or Domain level cert (Domain level requires additional entitlements)
        CertificateFileType fileType = CertificateFileType.fromValue("Public"); // CertificateFileType | Should the public key or private key be downloaded? (both must be in place to run providers)
        Boolean mayAutoCreate = false; // Boolean | If no matching cert is available, should an attempt be made to Create/Renew it with default options?
        try {
            File result = apiInstance.downloadCertificate(type, fileType, mayAutoCreate).execute();
            System.out.println(result.toJson());
        } catch (ApiException e) {
            System.err.println("Exception when calling CertificateManagementApi#downloadCertificate");
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
| **type** | [**CertificateType**](.md)| User or Domain level cert (Domain level requires additional entitlements) | [optional] [enum: Domain, User] |
| **fileType** | [**CertificateFileType**](.md)| Should the public key or private key be downloaded? (both must be in place to run providers) | [optional] [enum: Public, Private] |
| **mayAutoCreate** | **Boolean**| If no matching cert is available, should an attempt be made to Create/Renew it with default options? | [optional] [default to false] |

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


## listCertificates

> List&lt;CertificateState&gt; listCertificates()

[EXPERIMENTAL] ListCertificates: Lists all the certificates previously minted to which you have access

 Lists all the certificates previously minted to which you have access.  The following error codes are to be anticipated with standard Problem Detail reports: - 401 Unauthorized - 403 Forbidden 

### Example

```java
import com.finbourne.luminesce.model.*;
import com.finbourne.luminesce.api.CertificateManagementApi;
import com.finbourne.luminesce.extensions.ApiConfigurationException;
import com.finbourne.luminesce.extensions.ApiFactoryBuilder;
import com.finbourne.luminesce.extensions.auth.FinbourneTokenException;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class CertificateManagementApiExample {

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

        CertificateManagementApi apiInstance = ApiFactoryBuilder.build(fileName).build(CertificateManagementApi.class);
        try {
            List<CertificateState> result = apiInstance.listCertificates().execute();
            System.out.println(result.toJson());
        } catch (ApiException e) {
            System.err.println("Exception when calling CertificateManagementApi#listCertificates");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            e.printStackTrace();
        }
    }
}
```

### Parameters

This endpoint does not need any parameter.

### Return type

[**List&lt;CertificateState&gt;**](CertificateState.md)

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


## manageCertificate

> CertificateState manageCertificate(action, type, version, validityStart, validityEnd, dryRun)

[EXPERIMENTAL] ManageCertificate: Manages a new certificate (Create / Renew / Revoke)

 Manages a certificate. This could be creating a new one, renewing an old one or revoking one explicitly.  The following error codes are to be anticipated with standard Problem Detail reports: - 400 BadRequest - something about the request cannot be processed - 401 Unauthorized - 403 Forbidden 

### Example

```java
import com.finbourne.luminesce.model.*;
import com.finbourne.luminesce.api.CertificateManagementApi;
import com.finbourne.luminesce.extensions.ApiConfigurationException;
import com.finbourne.luminesce.extensions.ApiFactoryBuilder;
import com.finbourne.luminesce.extensions.auth.FinbourneTokenException;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class CertificateManagementApiExample {

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

        CertificateManagementApi apiInstance = ApiFactoryBuilder.build(fileName).build(CertificateManagementApi.class);
        CertificateAction action = CertificateAction.fromValue("Create"); // CertificateAction | The Action to perform, e.g. Create / Renew / Revoke
        CertificateType type = CertificateType.fromValue("Domain"); // CertificateType | User or Domain level cert (Domain level requires additional entitlements)
        Integer version = 1; // Integer | Version number of the cert, the request will fail to validate if incorrect
        OffsetDateTime validityStart = OffsetDateTime.now(); // OffsetDateTime | When should the cert first be valid (defaults to the current time in UTC)
        OffsetDateTime validityEnd = OffsetDateTime.now(); // OffsetDateTime | When should the cert no longer be valid (defaults to 13 months from now)
        Boolean dryRun = true; // Boolean | True will just validate the request, but perform no changes to any system
        try {
            CertificateState result = apiInstance.manageCertificate(action, type, version, validityStart, validityEnd, dryRun).execute();
            System.out.println(result.toJson());
        } catch (ApiException e) {
            System.err.println("Exception when calling CertificateManagementApi#manageCertificate");
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
| **action** | [**CertificateAction**](.md)| The Action to perform, e.g. Create / Renew / Revoke | [optional] [enum: Create, CreateAndAllowMultipleWhichAreValid, Renew, Revoke] |
| **type** | [**CertificateType**](.md)| User or Domain level cert (Domain level requires additional entitlements) | [optional] [enum: Domain, User] |
| **version** | **Integer**| Version number of the cert, the request will fail to validate if incorrect | [optional] [default to 1] |
| **validityStart** | **OffsetDateTime**| When should the cert first be valid (defaults to the current time in UTC) | [optional] |
| **validityEnd** | **OffsetDateTime**| When should the cert no longer be valid (defaults to 13 months from now) | [optional] |
| **dryRun** | **Boolean**| True will just validate the request, but perform no changes to any system | [optional] [default to true] |

### Return type

[**CertificateState**](CertificateState.md)

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

