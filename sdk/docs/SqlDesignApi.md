# SqlDesignApi

All URIs are relative to *https://fbn-prd.lusid.com/honeycomb*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getProviderTemplateForExport**](SqlDesignApi.md#getProviderTemplateForExport) | **GET** /api/Sql/providertemplateforexport | GetProviderTemplateForExport: Makes a fields template for file importing via a writer |
| [**putCaseStatementDesignSqlToDesign**](SqlDesignApi.md#putCaseStatementDesignSqlToDesign) | **PUT** /api/Sql/tocasestatementdesign | PutCaseStatementDesignSqlToDesign: Convert SQL to a case statement design object |
| [**putCaseStatementDesignToSql**](SqlDesignApi.md#putCaseStatementDesignToSql) | **PUT** /api/Sql/fromcasestatementdesign | PutCaseStatementDesignToSql: Convert a case statement design object to SQL |
| [**putFileReadDesignToSql**](SqlDesignApi.md#putFileReadDesignToSql) | **PUT** /api/Sql/fromfilereaddesign | PutFileReadDesignToSql: Make file read SQL from a design object |
| [**putInlinedPropertiesDesignSqlToDesign**](SqlDesignApi.md#putInlinedPropertiesDesignSqlToDesign) | **PUT** /api/Sql/toinlinedpropertiesdesign | PutInlinedPropertiesDesignSqlToDesign: Make an inlined properties design from SQL |
| [**putInlinedPropertiesDesignToSql**](SqlDesignApi.md#putInlinedPropertiesDesignToSql) | **PUT** /api/Sql/frominlinedpropertiesdesign | PutInlinedPropertiesDesignToSql: Make inlined properties SQL from a design object |
| [**putIntellisense**](SqlDesignApi.md#putIntellisense) | **PUT** /api/Sql/intellisense | PutIntellisense: Make intellisense prompts given an SQL snip-it |
| [**putIntellisenseError**](SqlDesignApi.md#putIntellisenseError) | **PUT** /api/Sql/intellisenseError | PutIntellisenseError: Get error ranges from SQL |
| [**putLusidGridToQuery**](SqlDesignApi.md#putLusidGridToQuery) | **PUT** /api/Sql/fromlusidgrid | [EXPERIMENTAL] PutLusidGridToQuery: Generates SQL from a dashboard view |
| [**putQueryDesignToSql**](SqlDesignApi.md#putQueryDesignToSql) | **PUT** /api/Sql/fromdesign | PutQueryDesignToSql: Make SQL from a structured query design |
| [**putQueryToFormat**](SqlDesignApi.md#putQueryToFormat) | **PUT** /api/Sql/pretty | PutQueryToFormat: Format SQL into a more readable form |
| [**putSqlToExtractScalarParameters**](SqlDesignApi.md#putSqlToExtractScalarParameters) | **PUT** /api/Sql/extractscalarparameters | PutSqlToExtractScalarParameters: Extract scalar parameter information from SQL |
| [**putSqlToFileReadDesign**](SqlDesignApi.md#putSqlToFileReadDesign) | **PUT** /api/Sql/tofilereaddesign | PutSqlToFileReadDesign: Make a design object from file-read SQL |
| [**putSqlToQueryDesign**](SqlDesignApi.md#putSqlToQueryDesign) | **PUT** /api/Sql/todesign | PutSqlToQueryDesign: Make a SQL-design object from SQL if possible |
| [**putSqlToViewDesign**](SqlDesignApi.md#putSqlToViewDesign) | **PUT** /api/Sql/toviewdesign | PutSqlToViewDesign: Make a view-design from view creation SQL |
| [**putSqlToWriterDesign**](SqlDesignApi.md#putSqlToWriterDesign) | **PUT** /api/Sql/towriterdesign | PutSqlToWriterDesign: Make a SQL-writer-design object from SQL |
| [**putViewDesignToSql**](SqlDesignApi.md#putViewDesignToSql) | **PUT** /api/Sql/fromviewdesign | PutViewDesignToSql: Make view creation sql from a view-design |
| [**putWriterDesignToSql**](SqlDesignApi.md#putWriterDesignToSql) | **PUT** /api/Sql/fromwriterdesign | PutWriterDesignToSql: Make writer SQL from a writer-design object |



## getProviderTemplateForExport

> File getProviderTemplateForExport(provider, contentType)

GetProviderTemplateForExport: Makes a fields template for file importing via a writer

Generates a template file for all the writable fields for a given provider returned in CSV or Excel (xlsx) format (as a file to be downloaded)

### Example

```java
import com.finbourne.luminesce.model.*;
import com.finbourne.luminesce.api.SqlDesignApi;
import com.finbourne.luminesce.extensions.ApiConfigurationException;
import com.finbourne.luminesce.extensions.ApiFactoryBuilder;
import com.finbourne.luminesce.extensions.auth.FinbourneTokenException;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class SqlDesignApiExample {

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
        // SqlDesignApi apiInstance = apiFactory.build(SqlDesignApi.class);

        SqlDesignApi apiInstance = ApiFactoryBuilder.build(fileName).build(SqlDesignApi.class);
        String provider = "provider_example"; // String | Name of the provider for which this template is for
        String contentType = "contentType_example"; // String | File content type for the Template. csv or excel
        try {
            // uncomment the below to set overrides at the request level
            // File result = apiInstance.getProviderTemplateForExport(provider, contentType).execute(opts);

            File result = apiInstance.getProviderTemplateForExport(provider, contentType).execute();
            System.out.println(result.toJson());
        } catch (ApiException e) {
            System.err.println("Exception when calling SqlDesignApi#getProviderTemplateForExport");
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
| **provider** | **String**| Name of the provider for which this template is for | |
| **contentType** | **String**| File content type for the Template. csv or excel | |

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


## putCaseStatementDesignSqlToDesign

> CaseStatementDesign putCaseStatementDesignSqlToDesign(body)

PutCaseStatementDesignSqlToDesign: Convert SQL to a case statement design object

Converts a SQL query to a CaseStatementDesign object  &gt; This method is generally only intended for IDE generation purposes.  &gt; It is largely internal to the Finbourne web user interfaces and subject to change without notice. 

### Example

```java
import com.finbourne.luminesce.model.*;
import com.finbourne.luminesce.api.SqlDesignApi;
import com.finbourne.luminesce.extensions.ApiConfigurationException;
import com.finbourne.luminesce.extensions.ApiFactoryBuilder;
import com.finbourne.luminesce.extensions.auth.FinbourneTokenException;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class SqlDesignApiExample {

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
        // SqlDesignApi apiInstance = apiFactory.build(SqlDesignApi.class);

        SqlDesignApi apiInstance = ApiFactoryBuilder.build(fileName).build(SqlDesignApi.class);
        String body = CASE \n WHEN [currency] = 'US' THEN 'USD' \n WHEN [currency] = 'Gb' THEN 'GBP' \n ELSE [currency] \n END; // String | SQL to attempt to create an case statement Design object from
        try {
            // uncomment the below to set overrides at the request level
            // CaseStatementDesign result = apiInstance.putCaseStatementDesignSqlToDesign(body).execute(opts);

            CaseStatementDesign result = apiInstance.putCaseStatementDesignSqlToDesign(body).execute();
            System.out.println(result.toJson());
        } catch (ApiException e) {
            System.err.println("Exception when calling SqlDesignApi#putCaseStatementDesignSqlToDesign");
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
| **body** | **String**| SQL to attempt to create an case statement Design object from | [optional] |

### Return type

[**CaseStatementDesign**](CaseStatementDesign.md)

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


## putCaseStatementDesignToSql

> String putCaseStatementDesignToSql(caseStatementDesign)

PutCaseStatementDesignToSql: Convert a case statement design object to SQL

Generates a SQL case statement query from a structured CaseStatementDesign object  &gt; This method is generally only intended for IDE generation purposes.  &gt; It is largely internal to the Finbourne web user interfaces and subject to change without notice. 

### Example

```java
import com.finbourne.luminesce.model.*;
import com.finbourne.luminesce.api.SqlDesignApi;
import com.finbourne.luminesce.extensions.ApiConfigurationException;
import com.finbourne.luminesce.extensions.ApiFactoryBuilder;
import com.finbourne.luminesce.extensions.auth.FinbourneTokenException;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class SqlDesignApiExample {

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
        // SqlDesignApi apiInstance = apiFactory.build(SqlDesignApi.class);

        SqlDesignApi apiInstance = ApiFactoryBuilder.build(fileName).build(SqlDesignApi.class);
        CaseStatementDesign caseStatementDesign = new CaseStatementDesign(); // CaseStatementDesign | CaseStatementDesign object to try and create a SQL query from
        try {
            // uncomment the below to set overrides at the request level
            // String result = apiInstance.putCaseStatementDesignToSql(caseStatementDesign).execute(opts);

            String result = apiInstance.putCaseStatementDesignToSql(caseStatementDesign).execute();
            System.out.println(result.toJson());
        } catch (ApiException e) {
            System.err.println("Exception when calling SqlDesignApi#putCaseStatementDesignToSql");
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
| **caseStatementDesign** | [**CaseStatementDesign**](CaseStatementDesign.md)| CaseStatementDesign object to try and create a SQL query from | |

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


## putFileReadDesignToSql

> FileReaderBuilderResponse putFileReadDesignToSql(fileReaderBuilderDef, executeQuery)

PutFileReadDesignToSql: Make file read SQL from a design object

Generates SQL from a FileReaderBuilderDef object  &gt; This method is generally only intended for IDE generation purposes.  &gt; It is largely internal to the Finbourne web user interfaces and subject to change without notice. 

### Example

```java
import com.finbourne.luminesce.model.*;
import com.finbourne.luminesce.api.SqlDesignApi;
import com.finbourne.luminesce.extensions.ApiConfigurationException;
import com.finbourne.luminesce.extensions.ApiFactoryBuilder;
import com.finbourne.luminesce.extensions.auth.FinbourneTokenException;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class SqlDesignApiExample {

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
        // SqlDesignApi apiInstance = apiFactory.build(SqlDesignApi.class);

        SqlDesignApi apiInstance = ApiFactoryBuilder.build(fileName).build(SqlDesignApi.class);
        FileReaderBuilderDef fileReaderBuilderDef = new FileReaderBuilderDef(); // FileReaderBuilderDef | Structured file read design object to generate SQL from
        Boolean executeQuery = true; // Boolean | Should the generated query be executed to build preview data or determine errors.>
        try {
            // uncomment the below to set overrides at the request level
            // FileReaderBuilderResponse result = apiInstance.putFileReadDesignToSql(fileReaderBuilderDef, executeQuery).execute(opts);

            FileReaderBuilderResponse result = apiInstance.putFileReadDesignToSql(fileReaderBuilderDef, executeQuery).execute();
            System.out.println(result.toJson());
        } catch (ApiException e) {
            System.err.println("Exception when calling SqlDesignApi#putFileReadDesignToSql");
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
| **fileReaderBuilderDef** | [**FileReaderBuilderDef**](FileReaderBuilderDef.md)| Structured file read design object to generate SQL from | |
| **executeQuery** | **Boolean**| Should the generated query be executed to build preview data or determine errors.&gt; | [optional] [default to true] |

### Return type

[**FileReaderBuilderResponse**](FileReaderBuilderResponse.md)

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


## putInlinedPropertiesDesignSqlToDesign

> InlinedPropertyDesign putInlinedPropertiesDesignSqlToDesign(body)

PutInlinedPropertiesDesignSqlToDesign: Make an inlined properties design from SQL

Generates a SQL-inlined-properties-design object from SQL string, if possible.  &gt; This method is generally only intended for IDE generation purposes.  &gt; It is largely internal to the Finbourne web user interfaces and subject to change without notice. 

### Example

```java
import com.finbourne.luminesce.model.*;
import com.finbourne.luminesce.api.SqlDesignApi;
import com.finbourne.luminesce.extensions.ApiConfigurationException;
import com.finbourne.luminesce.extensions.ApiFactoryBuilder;
import com.finbourne.luminesce.extensions.auth.FinbourneTokenException;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class SqlDesignApiExample {

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
        // SqlDesignApi apiInstance = apiFactory.build(SqlDesignApi.class);

        SqlDesignApi apiInstance = ApiFactoryBuilder.build(fileName).build(SqlDesignApi.class);
        String body = @keysToCatalog = values('Portfolio/3897-78d4-e91c-26/location', 'PortfolioLocation', false, '');\n @config = select column1 as [Key], column2 as Name, column3 as IsMain, column4 as Description from @keysToCatalog; \n select Dockerfile Dockerfile.cicd LICENSE.md README.md docker-compose.yml docs generate justfile publish resources test_sdk from Sys.Admin.Lusid.Provider.Configure where Provider = 'Lusid.Portfolio' and Configuration = @config;; // String | SQL query to attempt to generate the inlined properties design object from
        try {
            // uncomment the below to set overrides at the request level
            // InlinedPropertyDesign result = apiInstance.putInlinedPropertiesDesignSqlToDesign(body).execute(opts);

            InlinedPropertyDesign result = apiInstance.putInlinedPropertiesDesignSqlToDesign(body).execute();
            System.out.println(result.toJson());
        } catch (ApiException e) {
            System.err.println("Exception when calling SqlDesignApi#putInlinedPropertiesDesignSqlToDesign");
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
| **body** | **String**| SQL query to attempt to generate the inlined properties design object from | [optional] |

### Return type

[**InlinedPropertyDesign**](InlinedPropertyDesign.md)

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


## putInlinedPropertiesDesignToSql

> String putInlinedPropertiesDesignToSql(inlinedPropertyDesign)

PutInlinedPropertiesDesignToSql: Make inlined properties SQL from a design object

Generates inlined properties SQL from a structured design  &gt; This method is generally only intended for IDE generation purposes.  &gt; It is largely internal to the Finbourne web user interfaces and subject to change without notice. 

### Example

```java
import com.finbourne.luminesce.model.*;
import com.finbourne.luminesce.api.SqlDesignApi;
import com.finbourne.luminesce.extensions.ApiConfigurationException;
import com.finbourne.luminesce.extensions.ApiFactoryBuilder;
import com.finbourne.luminesce.extensions.auth.FinbourneTokenException;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class SqlDesignApiExample {

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
        // SqlDesignApi apiInstance = apiFactory.build(SqlDesignApi.class);

        SqlDesignApi apiInstance = ApiFactoryBuilder.build(fileName).build(SqlDesignApi.class);
        InlinedPropertyDesign inlinedPropertyDesign = new InlinedPropertyDesign(); // InlinedPropertyDesign | Inlined properties Designer specification to generate SQL from
        try {
            // uncomment the below to set overrides at the request level
            // String result = apiInstance.putInlinedPropertiesDesignToSql(inlinedPropertyDesign).execute(opts);

            String result = apiInstance.putInlinedPropertiesDesignToSql(inlinedPropertyDesign).execute();
            System.out.println(result.toJson());
        } catch (ApiException e) {
            System.err.println("Exception when calling SqlDesignApi#putInlinedPropertiesDesignToSql");
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
| **inlinedPropertyDesign** | [**InlinedPropertyDesign**](InlinedPropertyDesign.md)| Inlined properties Designer specification to generate SQL from | |

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


## putIntellisense

> IntellisenseResponse putIntellisense(intellisenseRequest)

PutIntellisense: Make intellisense prompts given an SQL snip-it

Generate a set of possible intellisense prompts given a SQL snip-it (in need not yet be valid SQL) and cursor location  &gt; This method is generally only intended for IDE generation purposes.  &gt; It is largely internal to the Finbourne web user interfaces and subject to change without notice. 

### Example

```java
import com.finbourne.luminesce.model.*;
import com.finbourne.luminesce.api.SqlDesignApi;
import com.finbourne.luminesce.extensions.ApiConfigurationException;
import com.finbourne.luminesce.extensions.ApiFactoryBuilder;
import com.finbourne.luminesce.extensions.auth.FinbourneTokenException;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class SqlDesignApiExample {

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
        // SqlDesignApi apiInstance = apiFactory.build(SqlDesignApi.class);

        SqlDesignApi apiInstance = ApiFactoryBuilder.build(fileName).build(SqlDesignApi.class);
        IntellisenseRequest intellisenseRequest = new IntellisenseRequest(); // IntellisenseRequest | SQL and a row/colum position within it from which to determine intellisense options for the user to potentially choose from.
        try {
            // uncomment the below to set overrides at the request level
            // IntellisenseResponse result = apiInstance.putIntellisense(intellisenseRequest).execute(opts);

            IntellisenseResponse result = apiInstance.putIntellisense(intellisenseRequest).execute();
            System.out.println(result.toJson());
        } catch (ApiException e) {
            System.err.println("Exception when calling SqlDesignApi#putIntellisense");
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
| **intellisenseRequest** | [**IntellisenseRequest**](IntellisenseRequest.md)| SQL and a row/colum position within it from which to determine intellisense options for the user to potentially choose from. | |

### Return type

[**IntellisenseResponse**](IntellisenseResponse.md)

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


## putIntellisenseError

> ErrorHighlightResponse putIntellisenseError(errorHighlightRequest)

PutIntellisenseError: Get error ranges from SQL

Generate a set of error ranges, if any, in the given SQL (expressed as Lines)  &gt; This method is generally only intended for IDE generation purposes.  &gt; It is largely internal to the Finbourne web user interfaces and subject to change without notice. 

### Example

```java
import com.finbourne.luminesce.model.*;
import com.finbourne.luminesce.api.SqlDesignApi;
import com.finbourne.luminesce.extensions.ApiConfigurationException;
import com.finbourne.luminesce.extensions.ApiFactoryBuilder;
import com.finbourne.luminesce.extensions.auth.FinbourneTokenException;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class SqlDesignApiExample {

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
        // SqlDesignApi apiInstance = apiFactory.build(SqlDesignApi.class);

        SqlDesignApi apiInstance = ApiFactoryBuilder.build(fileName).build(SqlDesignApi.class);
        ErrorHighlightRequest errorHighlightRequest = new ErrorHighlightRequest(); // ErrorHighlightRequest | SQL (by line) to syntax check and return error ranges from within, if any.
        try {
            // uncomment the below to set overrides at the request level
            // ErrorHighlightResponse result = apiInstance.putIntellisenseError(errorHighlightRequest).execute(opts);

            ErrorHighlightResponse result = apiInstance.putIntellisenseError(errorHighlightRequest).execute();
            System.out.println(result.toJson());
        } catch (ApiException e) {
            System.err.println("Exception when calling SqlDesignApi#putIntellisenseError");
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
| **errorHighlightRequest** | [**ErrorHighlightRequest**](ErrorHighlightRequest.md)| SQL (by line) to syntax check and return error ranges from within, if any. | |

### Return type

[**ErrorHighlightResponse**](ErrorHighlightResponse.md)

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


## putLusidGridToQuery

> String putLusidGridToQuery(lusidGridData)

[EXPERIMENTAL] PutLusidGridToQuery: Generates SQL from a dashboard view

Used to convert dashboard views in LUSID to SQL that can be run in Lumi

### Example

```java
import com.finbourne.luminesce.model.*;
import com.finbourne.luminesce.api.SqlDesignApi;
import com.finbourne.luminesce.extensions.ApiConfigurationException;
import com.finbourne.luminesce.extensions.ApiFactoryBuilder;
import com.finbourne.luminesce.extensions.auth.FinbourneTokenException;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class SqlDesignApiExample {

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
        // SqlDesignApi apiInstance = apiFactory.build(SqlDesignApi.class);

        SqlDesignApi apiInstance = ApiFactoryBuilder.build(fileName).build(SqlDesignApi.class);
        LusidGridData lusidGridData = new LusidGridData(); // LusidGridData | 
        try {
            // uncomment the below to set overrides at the request level
            // String result = apiInstance.putLusidGridToQuery(lusidGridData).execute(opts);

            String result = apiInstance.putLusidGridToQuery(lusidGridData).execute();
            System.out.println(result.toJson());
        } catch (ApiException e) {
            System.err.println("Exception when calling SqlDesignApi#putLusidGridToQuery");
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
| **lusidGridData** | [**LusidGridData**](LusidGridData.md)|  | |

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


## putQueryDesignToSql

> String putQueryDesignToSql(queryDesign)

PutQueryDesignToSql: Make SQL from a structured query design

Generates SQL from a QueryDesign object  &gt; This method is generally only intended for IDE generation purposes.  &gt; It is largely internal to the Finbourne web user interfaces and subject to change without notice. 

### Example

```java
import com.finbourne.luminesce.model.*;
import com.finbourne.luminesce.api.SqlDesignApi;
import com.finbourne.luminesce.extensions.ApiConfigurationException;
import com.finbourne.luminesce.extensions.ApiFactoryBuilder;
import com.finbourne.luminesce.extensions.auth.FinbourneTokenException;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class SqlDesignApiExample {

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
        // SqlDesignApi apiInstance = apiFactory.build(SqlDesignApi.class);

        SqlDesignApi apiInstance = ApiFactoryBuilder.build(fileName).build(SqlDesignApi.class);
        QueryDesign queryDesign = new QueryDesign(); // QueryDesign | Structured Query design object to generate SQL from
        try {
            // uncomment the below to set overrides at the request level
            // String result = apiInstance.putQueryDesignToSql(queryDesign).execute(opts);

            String result = apiInstance.putQueryDesignToSql(queryDesign).execute();
            System.out.println(result.toJson());
        } catch (ApiException e) {
            System.err.println("Exception when calling SqlDesignApi#putQueryDesignToSql");
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
| **queryDesign** | [**QueryDesign**](QueryDesign.md)| Structured Query design object to generate SQL from | |

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


## putQueryToFormat

> String putQueryToFormat(body, trailingCommas, uppercaseKeywords, breakJoinOnSections, spaceAfterExpandedComma, keywordStandardization, expandCommaLists, expandInLists, expandBooleanExpressions, expandBetweenConditions, expandCaseStatements, maxLineWidth, spaceBeforeTrailingSingleLineComments, multilineCommentExtraLineBreak)

PutQueryToFormat: Format SQL into a more readable form

 This formats SQL (given a set of options as to how to do so), a.k.a. Pretty-Print the SQL. It takes some SQL (or a fragment thereof, it need not fully parse as yet and certainly need not execute correctly) and returns the reformatted version. e.g. &#x60;&#x60;&#x60;sql select x,y,z from a inner join b on a.x&#x3D;b.x where x&gt;y or y!&#x3D;z &#x60;&#x60;&#x60; becomes &#x60;&#x60;&#x60;sql select x, y, z from a inner join b  on a.x &#x3D; b.x where x &gt; y  or y !&#x3D; z &#x60;&#x60;&#x60; 

### Example

```java
import com.finbourne.luminesce.model.*;
import com.finbourne.luminesce.api.SqlDesignApi;
import com.finbourne.luminesce.extensions.ApiConfigurationException;
import com.finbourne.luminesce.extensions.ApiFactoryBuilder;
import com.finbourne.luminesce.extensions.auth.FinbourneTokenException;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class SqlDesignApiExample {

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
        // SqlDesignApi apiInstance = apiFactory.build(SqlDesignApi.class);

        SqlDesignApi apiInstance = ApiFactoryBuilder.build(fileName).build(SqlDesignApi.class);
        String body = select Dockerfile Dockerfile.cicd LICENSE.md README.md docker-compose.yml docs generate justfile publish resources test_sdk from sys.field; // String | LuminesceSql to Pretty-Print. Even if it doesn't parse an attempt will be made to format it
        Boolean trailingCommas = true; // Boolean | Should commas be after an expression (as opposed to before)
        Boolean uppercaseKeywords = false; // Boolean | Should key words be capitalized
        Boolean breakJoinOnSections = true; // Boolean | Should clauses on joins be given line breaks?
        Boolean spaceAfterExpandedComma = true; // Boolean | Should comma-lists have spaces after the commas?
        Boolean keywordStandardization = true; // Boolean | Should the \"nicest\" key words be used? (e.g. JOIN -> INNER JOIN)
        Boolean expandCommaLists = false; // Boolean | Should comma-lists (e.g. select a,b,c) have line breaks added?
        Boolean expandInLists = false; // Boolean | Should IN-lists have line breaks added?
        Boolean expandBooleanExpressions = true; // Boolean | Should boolean expressions have line breaks added?
        Boolean expandBetweenConditions = true; // Boolean | Should between conditions have line breaks added?
        Boolean expandCaseStatements = true; // Boolean | Should case-statements have line breaks added?
        Integer maxLineWidth = 120; // Integer | Maximum number of characters to allow on one line (if possible)
        Boolean spaceBeforeTrailingSingleLineComments = true; // Boolean | Should the be a space before trailing single line comments?
        Boolean multilineCommentExtraLineBreak = false; // Boolean | Should an additional line break be added after multi-line comments?
        try {
            // uncomment the below to set overrides at the request level
            // String result = apiInstance.putQueryToFormat(body, trailingCommas, uppercaseKeywords, breakJoinOnSections, spaceAfterExpandedComma, keywordStandardization, expandCommaLists, expandInLists, expandBooleanExpressions, expandBetweenConditions, expandCaseStatements, maxLineWidth, spaceBeforeTrailingSingleLineComments, multilineCommentExtraLineBreak).execute(opts);

            String result = apiInstance.putQueryToFormat(body, trailingCommas, uppercaseKeywords, breakJoinOnSections, spaceAfterExpandedComma, keywordStandardization, expandCommaLists, expandInLists, expandBooleanExpressions, expandBetweenConditions, expandCaseStatements, maxLineWidth, spaceBeforeTrailingSingleLineComments, multilineCommentExtraLineBreak).execute();
            System.out.println(result.toJson());
        } catch (ApiException e) {
            System.err.println("Exception when calling SqlDesignApi#putQueryToFormat");
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
| **body** | **String**| LuminesceSql to Pretty-Print. Even if it doesn&#39;t parse an attempt will be made to format it | |
| **trailingCommas** | **Boolean**| Should commas be after an expression (as opposed to before) | [optional] [default to true] |
| **uppercaseKeywords** | **Boolean**| Should key words be capitalized | [optional] [default to false] |
| **breakJoinOnSections** | **Boolean**| Should clauses on joins be given line breaks? | [optional] [default to true] |
| **spaceAfterExpandedComma** | **Boolean**| Should comma-lists have spaces after the commas? | [optional] [default to true] |
| **keywordStandardization** | **Boolean**| Should the \&quot;nicest\&quot; key words be used? (e.g. JOIN -&gt; INNER JOIN) | [optional] [default to true] |
| **expandCommaLists** | **Boolean**| Should comma-lists (e.g. select a,b,c) have line breaks added? | [optional] [default to false] |
| **expandInLists** | **Boolean**| Should IN-lists have line breaks added? | [optional] [default to false] |
| **expandBooleanExpressions** | **Boolean**| Should boolean expressions have line breaks added? | [optional] [default to true] |
| **expandBetweenConditions** | **Boolean**| Should between conditions have line breaks added? | [optional] [default to true] |
| **expandCaseStatements** | **Boolean**| Should case-statements have line breaks added? | [optional] [default to true] |
| **maxLineWidth** | **Integer**| Maximum number of characters to allow on one line (if possible) | [optional] [default to 120] |
| **spaceBeforeTrailingSingleLineComments** | **Boolean**| Should the be a space before trailing single line comments? | [optional] [default to true] |
| **multilineCommentExtraLineBreak** | **Boolean**| Should an additional line break be added after multi-line comments? | [optional] [default to false] |

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


## putSqlToExtractScalarParameters

> List&lt;ScalarParameter&gt; putSqlToExtractScalarParameters(body)

PutSqlToExtractScalarParameters: Extract scalar parameter information from SQL

Extracts information about all the scalar parameters defined in the given SQL statement  &gt; This method is generally only intended for IDE generation purposes.  &gt; It is largely internal to the Finbourne web user interfaces and subject to change without notice. 

### Example

```java
import com.finbourne.luminesce.model.*;
import com.finbourne.luminesce.api.SqlDesignApi;
import com.finbourne.luminesce.extensions.ApiConfigurationException;
import com.finbourne.luminesce.extensions.ApiFactoryBuilder;
import com.finbourne.luminesce.extensions.auth.FinbourneTokenException;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class SqlDesignApiExample {

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
        // SqlDesignApi apiInstance = apiFactory.build(SqlDesignApi.class);

        SqlDesignApi apiInstance = ApiFactoryBuilder.build(fileName).build(SqlDesignApi.class);
        String body = select abc, :p1:'this' as c1 from xxx where abc = :abcP:123 or xyz in (:p2:, 'zzz'); // String | SQL query to generate the design object from
        try {
            // uncomment the below to set overrides at the request level
            // List<ScalarParameter> result = apiInstance.putSqlToExtractScalarParameters(body).execute(opts);

            List<ScalarParameter> result = apiInstance.putSqlToExtractScalarParameters(body).execute();
            System.out.println(result.toJson());
        } catch (ApiException e) {
            System.err.println("Exception when calling SqlDesignApi#putSqlToExtractScalarParameters");
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
| **body** | **String**| SQL query to generate the design object from | |

### Return type

[**List&lt;ScalarParameter&gt;**](ScalarParameter.md)

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


## putSqlToFileReadDesign

> FileReaderBuilderDef putSqlToFileReadDesign(determineAvailableSources, body)

PutSqlToFileReadDesign: Make a design object from file-read SQL

Generates a SQL-file-read-design object from SQL string, if possible.  &gt; This method is generally only intended for IDE generation purposes.  &gt; It is largely internal to the Finbourne web user interfaces and subject to change without notice. 

### Example

```java
import com.finbourne.luminesce.model.*;
import com.finbourne.luminesce.api.SqlDesignApi;
import com.finbourne.luminesce.extensions.ApiConfigurationException;
import com.finbourne.luminesce.extensions.ApiFactoryBuilder;
import com.finbourne.luminesce.extensions.auth.FinbourneTokenException;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class SqlDesignApiExample {

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
        // SqlDesignApi apiInstance = apiFactory.build(SqlDesignApi.class);

        SqlDesignApi apiInstance = ApiFactoryBuilder.build(fileName).build(SqlDesignApi.class);
        Boolean determineAvailableSources = true; // Boolean | Should the available sources be determined from `Sys.Registration`
        String body = @x = \nuse Drive.Csv\n --file=/some/folder/somefile.csv\nenduse;\n\nselect Dockerfile Dockerfile.cicd LICENSE.md README.md docker-compose.yml docs generate justfile publish resources test_sdk from @x;; // String | SQL query to generate the file read design object from
        try {
            // uncomment the below to set overrides at the request level
            // FileReaderBuilderDef result = apiInstance.putSqlToFileReadDesign(determineAvailableSources, body).execute(opts);

            FileReaderBuilderDef result = apiInstance.putSqlToFileReadDesign(determineAvailableSources, body).execute();
            System.out.println(result.toJson());
        } catch (ApiException e) {
            System.err.println("Exception when calling SqlDesignApi#putSqlToFileReadDesign");
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
| **determineAvailableSources** | **Boolean**| Should the available sources be determined from &#x60;Sys.Registration&#x60; | [optional] [default to true] |
| **body** | **String**| SQL query to generate the file read design object from | [optional] |

### Return type

[**FileReaderBuilderDef**](FileReaderBuilderDef.md)

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


## putSqlToQueryDesign

> QueryDesign putSqlToQueryDesign(body, validateWithMetadata)

PutSqlToQueryDesign: Make a SQL-design object from SQL if possible

Generates a QueryDesign object from simple SQL if possible  &gt; This method is generally only intended for IDE generation purposes.  &gt; It is largely internal to the Finbourne web user interfaces and subject to change without notice. 

### Example

```java
import com.finbourne.luminesce.model.*;
import com.finbourne.luminesce.api.SqlDesignApi;
import com.finbourne.luminesce.extensions.ApiConfigurationException;
import com.finbourne.luminesce.extensions.ApiFactoryBuilder;
import com.finbourne.luminesce.extensions.auth.FinbourneTokenException;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class SqlDesignApiExample {

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
        // SqlDesignApi apiInstance = apiFactory.build(SqlDesignApi.class);

        SqlDesignApi apiInstance = ApiFactoryBuilder.build(fileName).build(SqlDesignApi.class);
        String body = SELECT [TableName], Count(distinct [FieldName]) as [NumberOfFields], case [FieldType] when 'Column' then 'col' else [FieldType] end as FieldType2 FROM [Sys.Field] WHERE ([TableName] = 'Sys.Registration') GROUP BY [TableName], [FieldType2] ORDER BY [DataType] LIMIT 42; // String | SQL query to generate the design object from
        Boolean validateWithMetadata = true; // Boolean | Should the table be validated against the users' view of Sys.Field to fill in DataTypes, etc.?
        try {
            // uncomment the below to set overrides at the request level
            // QueryDesign result = apiInstance.putSqlToQueryDesign(body, validateWithMetadata).execute(opts);

            QueryDesign result = apiInstance.putSqlToQueryDesign(body, validateWithMetadata).execute();
            System.out.println(result.toJson());
        } catch (ApiException e) {
            System.err.println("Exception when calling SqlDesignApi#putSqlToQueryDesign");
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
| **body** | **String**| SQL query to generate the design object from | |
| **validateWithMetadata** | **Boolean**| Should the table be validated against the users&#39; view of Sys.Field to fill in DataTypes, etc.? | [optional] [default to true] |

### Return type

[**QueryDesign**](QueryDesign.md)

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


## putSqlToViewDesign

> ConvertToViewData putSqlToViewDesign(body)

PutSqlToViewDesign: Make a view-design from view creation SQL

Converts SQL which creates a view into a structured ConvertToViewData object  &gt; This method is generally only intended for IDE generation purposes.  &gt; It is largely internal to the Finbourne web user interfaces and subject to change without notice. 

### Example

```java
import com.finbourne.luminesce.model.*;
import com.finbourne.luminesce.api.SqlDesignApi;
import com.finbourne.luminesce.extensions.ApiConfigurationException;
import com.finbourne.luminesce.extensions.ApiFactoryBuilder;
import com.finbourne.luminesce.extensions.auth.FinbourneTokenException;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class SqlDesignApiExample {

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
        // SqlDesignApi apiInstance = apiFactory.build(SqlDesignApi.class);

        SqlDesignApi apiInstance = ApiFactoryBuilder.build(fileName).build(SqlDesignApi.class);
        String body = @x = \nuse Sys.Admin.SetupView\n --provider=YourView\n----\nselect Dockerfile Dockerfile.cicd LICENSE.md README.md docker-compose.yml docs generate justfile publish resources test_sdk from Lusid.Instrument\nenduse;\n\nselect Dockerfile Dockerfile.cicd LICENSE.md README.md docker-compose.yml docs generate justfile publish resources test_sdk from @x;; // String | SQL Query to generate the ConvertToViewData object from
        try {
            // uncomment the below to set overrides at the request level
            // ConvertToViewData result = apiInstance.putSqlToViewDesign(body).execute(opts);

            ConvertToViewData result = apiInstance.putSqlToViewDesign(body).execute();
            System.out.println(result.toJson());
        } catch (ApiException e) {
            System.err.println("Exception when calling SqlDesignApi#putSqlToViewDesign");
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
| **body** | **String**| SQL Query to generate the ConvertToViewData object from | |

### Return type

[**ConvertToViewData**](ConvertToViewData.md)

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


## putSqlToWriterDesign

> WriterDesign putSqlToWriterDesign(body, mergeAdditionalMappingFields)

PutSqlToWriterDesign: Make a SQL-writer-design object from SQL

Generates a SQL-writer-design object (WriterDesign) from a SQL query, if possible  &gt; This method is generally only intended for IDE generation purposes.  &gt; It is largely internal to the Finbourne web user interfaces and subject to change without notice. 

### Example

```java
import com.finbourne.luminesce.model.*;
import com.finbourne.luminesce.api.SqlDesignApi;
import com.finbourne.luminesce.extensions.ApiConfigurationException;
import com.finbourne.luminesce.extensions.ApiFactoryBuilder;
import com.finbourne.luminesce.extensions.auth.FinbourneTokenException;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class SqlDesignApiExample {

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
        // SqlDesignApi apiInstance = apiFactory.build(SqlDesignApi.class);

        SqlDesignApi apiInstance = ApiFactoryBuilder.build(fileName).build(SqlDesignApi.class);
        String body = Select abc from xyz; // String | SQL query to generate the writer design object from
        Boolean mergeAdditionalMappingFields = false; // Boolean | Should `Sys.Field` be used to find additional potential fields to map from? (not always possible)
        try {
            // uncomment the below to set overrides at the request level
            // WriterDesign result = apiInstance.putSqlToWriterDesign(body, mergeAdditionalMappingFields).execute(opts);

            WriterDesign result = apiInstance.putSqlToWriterDesign(body, mergeAdditionalMappingFields).execute();
            System.out.println(result.toJson());
        } catch (ApiException e) {
            System.err.println("Exception when calling SqlDesignApi#putSqlToWriterDesign");
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
| **body** | **String**| SQL query to generate the writer design object from | |
| **mergeAdditionalMappingFields** | **Boolean**| Should &#x60;Sys.Field&#x60; be used to find additional potential fields to map from? (not always possible) | [optional] [default to false] |

### Return type

[**WriterDesign**](WriterDesign.md)

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


## putViewDesignToSql

> String putViewDesignToSql(convertToViewData)

PutViewDesignToSql: Make view creation sql from a view-design

Converts a ConvertToView specification into SQL that creates a view  &gt; This method is generally only intended for IDE generation purposes.  &gt; It is largely internal to the Finbourne web user interfaces and subject to change without notice. 

### Example

```java
import com.finbourne.luminesce.model.*;
import com.finbourne.luminesce.api.SqlDesignApi;
import com.finbourne.luminesce.extensions.ApiConfigurationException;
import com.finbourne.luminesce.extensions.ApiFactoryBuilder;
import com.finbourne.luminesce.extensions.auth.FinbourneTokenException;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class SqlDesignApiExample {

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
        // SqlDesignApi apiInstance = apiFactory.build(SqlDesignApi.class);

        SqlDesignApi apiInstance = ApiFactoryBuilder.build(fileName).build(SqlDesignApi.class);
        ConvertToViewData convertToViewData = new ConvertToViewData(); // ConvertToViewData | Structured Query design object to generate SQL from
        try {
            // uncomment the below to set overrides at the request level
            // String result = apiInstance.putViewDesignToSql(convertToViewData).execute(opts);

            String result = apiInstance.putViewDesignToSql(convertToViewData).execute();
            System.out.println(result.toJson());
        } catch (ApiException e) {
            System.err.println("Exception when calling SqlDesignApi#putViewDesignToSql");
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
| **convertToViewData** | [**ConvertToViewData**](ConvertToViewData.md)| Structured Query design object to generate SQL from | |

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


## putWriterDesignToSql

> String putWriterDesignToSql(writerDesign)

PutWriterDesignToSql: Make writer SQL from a writer-design object

Generates writer SQL from a valid WriterDesign structure  &gt; This method is generally only intended for IDE generation purposes.  &gt; It is largely internal to the Finbourne web user interfaces and subject to change without notice. 

### Example

```java
import com.finbourne.luminesce.model.*;
import com.finbourne.luminesce.api.SqlDesignApi;
import com.finbourne.luminesce.extensions.ApiConfigurationException;
import com.finbourne.luminesce.extensions.ApiFactoryBuilder;
import com.finbourne.luminesce.extensions.auth.FinbourneTokenException;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class SqlDesignApiExample {

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
        // SqlDesignApi apiInstance = apiFactory.build(SqlDesignApi.class);

        SqlDesignApi apiInstance = ApiFactoryBuilder.build(fileName).build(SqlDesignApi.class);
        WriterDesign writerDesign = new WriterDesign(); // WriterDesign | Structured Writer Design design object to generate Writer SQL from
        try {
            // uncomment the below to set overrides at the request level
            // String result = apiInstance.putWriterDesignToSql(writerDesign).execute(opts);

            String result = apiInstance.putWriterDesignToSql(writerDesign).execute();
            System.out.println(result.toJson());
        } catch (ApiException e) {
            System.err.println("Exception when calling SqlDesignApi#putWriterDesignToSql");
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
| **writerDesign** | [**WriterDesign**](WriterDesign.md)| Structured Writer Design design object to generate Writer SQL from | |

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

