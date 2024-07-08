# SqlDesignApi

All URIs are relative to *https://fbn-prd.lusid.com/honeycomb*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**putFileReadDesignToSql**](SqlDesignApi.md#putFileReadDesignToSql) | **PUT** /api/Sql/fromfilereaddesign | [EXPERIMENTAL] PutFileReadDesignToSql: Generates file read SQL from a structured query design |
| [**putInlinedPropertiesDesignSqlToDesign**](SqlDesignApi.md#putInlinedPropertiesDesignSqlToDesign) | **PUT** /api/Sql/toinlinedpropertiesdesign | [EXPERIMENTAL] PutInlinedPropertiesDesignSqlToDesign: Generates a SQL-inlined-properties-design object from SQL string, if possible. |
| [**putInlinedPropertiesDesignToSql**](SqlDesignApi.md#putInlinedPropertiesDesignToSql) | **PUT** /api/Sql/frominlinedpropertiesdesign | [EXPERIMENTAL] PutInlinedPropertiesDesignToSql: Generates inlined properties SQL from a structured design |
| [**putIntellisense**](SqlDesignApi.md#putIntellisense) | **PUT** /api/Sql/intellisense | [EXPERIMENTAL] PutIntellisense: Generate a set of possible intellisense prompts given a SQL snip-it (in need not yet be valid) and cursor location |
| [**putIntellisenseError**](SqlDesignApi.md#putIntellisenseError) | **PUT** /api/Sql/intellisenseError | [EXPERIMENTAL] PutIntellisenseError: Generate a set of error ranges, if any, in the given SQL (expressed as Lines) |
| [**putQueryDesignToSql**](SqlDesignApi.md#putQueryDesignToSql) | **PUT** /api/Sql/fromdesign | [EXPERIMENTAL] PutQueryDesignToSql: Generates SQL from a structured query design |
| [**putQueryToFormat**](SqlDesignApi.md#putQueryToFormat) | **PUT** /api/Sql/pretty | PutQueryToFormat: Formats SQL into a more readable form, a.k.a. Pretty-Print the SQL. |
| [**putSqlToFileReadDesign**](SqlDesignApi.md#putSqlToFileReadDesign) | **PUT** /api/Sql/tofilereaddesign | [EXPERIMENTAL] PutSqlToFileReadDesign: Generates a SQL-file-read-design object from SQL string, if possible. |
| [**putSqlToQueryDesign**](SqlDesignApi.md#putSqlToQueryDesign) | **PUT** /api/Sql/todesign | [EXPERIMENTAL] PutSqlToQueryDesign: Generates a SQL-design object from SQL string, if possible. |
| [**putSqlToViewDesign**](SqlDesignApi.md#putSqlToViewDesign) | **PUT** /api/Sql/toviewdesign | [EXPERIMENTAL] PutSqlToViewDesign: Generates a structured view creation design from existing view creation SQL. |
| [**putSqlToWriterDesign**](SqlDesignApi.md#putSqlToWriterDesign) | **PUT** /api/Sql/towriterdesign | [EXPERIMENTAL] PutSqlToWriterDesign: Generates a SQL-writer-design object from SQL string, if possible. |
| [**putViewDesignToSql**](SqlDesignApi.md#putViewDesignToSql) | **PUT** /api/Sql/fromviewdesign | [EXPERIMENTAL] PutViewDesignToSql: Generates view creation sql from a structured view creation design |
| [**putWriterDesignToSql**](SqlDesignApi.md#putWriterDesignToSql) | **PUT** /api/Sql/fromwriterdesign | [EXPERIMENTAL] PutWriterDesignToSql: Generates writer SQL from a valid writer-design structure |


<a id="putFileReadDesignToSql"></a>
# **putFileReadDesignToSql**
> FileReaderBuilderResponse putFileReadDesignToSql(fileReaderBuilderDef).executeQuery(executeQuery).execute();

[EXPERIMENTAL] PutFileReadDesignToSql: Generates file read SQL from a structured query design

SQL Designer specification to generate SQL from

### Example
```java
// Import classes:
import com.finbourne.luminesce.ApiClient;
import com.finbourne.luminesce.ApiException;
import com.finbourne.luminesce.Configuration;
import com.finbourne.luminesce.auth.*;
import com.finbourne.luminesce.models.*;
import com.finbourne.luminesce.api.SqlDesignApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://fbn-prd.lusid.com/honeycomb");
    
    // Configure OAuth2 access token for authorization: oauth2
    OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
    oauth2.setAccessToken("YOUR ACCESS TOKEN");

    SqlDesignApi apiInstance = new SqlDesignApi(defaultClient);
    FileReaderBuilderDef fileReaderBuilderDef = new FileReaderBuilderDef(); // FileReaderBuilderDef | Structured file read design object to generate SQL from
    Boolean executeQuery = true; // Boolean | Should the generated query be executed to build preview data or determine errors.>
    try {
      FileReaderBuilderResponse result = apiInstance.putFileReadDesignToSql(fileReaderBuilderDef)
            .executeQuery(executeQuery)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SqlDesignApi#putFileReadDesignToSql");
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
| **fileReaderBuilderDef** | [**FileReaderBuilderDef**](FileReaderBuilderDef.md)| Structured file read design object to generate SQL from | |
| **executeQuery** | **Boolean**| Should the generated query be executed to build preview data or determine errors.&gt; | [optional] [default to true] |

### Return type

[**FileReaderBuilderResponse**](FileReaderBuilderResponse.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json-patch+json, application/json, text/json, application/*+json
 - **Accept**: text/plain, application/json, text/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **400** | Bad Request |  -  |
| **403** | Forbidden |  -  |

<a id="putInlinedPropertiesDesignSqlToDesign"></a>
# **putInlinedPropertiesDesignSqlToDesign**
> InlinedPropertyDesign putInlinedPropertiesDesignSqlToDesign().body(body).execute();

[EXPERIMENTAL] PutInlinedPropertiesDesignSqlToDesign: Generates a SQL-inlined-properties-design object from SQL string, if possible.

SQL to attempt to create an inlined properties Design object from

### Example
```java
// Import classes:
import com.finbourne.luminesce.ApiClient;
import com.finbourne.luminesce.ApiException;
import com.finbourne.luminesce.Configuration;
import com.finbourne.luminesce.auth.*;
import com.finbourne.luminesce.models.*;
import com.finbourne.luminesce.api.SqlDesignApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://fbn-prd.lusid.com/honeycomb");
    
    // Configure OAuth2 access token for authorization: oauth2
    OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
    oauth2.setAccessToken("YOUR ACCESS TOKEN");

    SqlDesignApi apiInstance = new SqlDesignApi(defaultClient);
    String body = @keysToCatalog = values('Portfolio/3897-78d4-e91c-26/location', 'PortfolioLocation', false, '');
 @config = select column1 as [Key], column2 as Name, column3 as IsMain, column4 as Description from @keysToCatalog; 
 select Dockerfile Dockerfile.cicd LICENSE.md README.md docker-compose.yml docs generate justfile publish resources test_sdk from Sys.Admin.Lusid.Provider.Configure where Provider = 'Lusid.Portfolio' and Configuration = @config;; // String | SQL query to generate the inlined properties design object from
    try {
      InlinedPropertyDesign result = apiInstance.putInlinedPropertiesDesignSqlToDesign()
            .body(body)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SqlDesignApi#putInlinedPropertiesDesignSqlToDesign");
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
| **body** | **String**| SQL query to generate the inlined properties design object from | [optional] |

### Return type

[**InlinedPropertyDesign**](InlinedPropertyDesign.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: text/plain
 - **Accept**: text/plain, application/json, text/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **400** | Bad Request |  -  |
| **403** | Forbidden |  -  |

<a id="putInlinedPropertiesDesignToSql"></a>
# **putInlinedPropertiesDesignToSql**
> String putInlinedPropertiesDesignToSql(inlinedPropertyDesign).execute();

[EXPERIMENTAL] PutInlinedPropertiesDesignToSql: Generates inlined properties SQL from a structured design

Inlined properties Designer specification to generate SQL from

### Example
```java
// Import classes:
import com.finbourne.luminesce.ApiClient;
import com.finbourne.luminesce.ApiException;
import com.finbourne.luminesce.Configuration;
import com.finbourne.luminesce.auth.*;
import com.finbourne.luminesce.models.*;
import com.finbourne.luminesce.api.SqlDesignApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://fbn-prd.lusid.com/honeycomb");
    
    // Configure OAuth2 access token for authorization: oauth2
    OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
    oauth2.setAccessToken("YOUR ACCESS TOKEN");

    SqlDesignApi apiInstance = new SqlDesignApi(defaultClient);
    InlinedPropertyDesign inlinedPropertyDesign = new InlinedPropertyDesign(); // InlinedPropertyDesign | Structured file read design object to generate SQL from
    try {
      String result = apiInstance.putInlinedPropertiesDesignToSql(inlinedPropertyDesign)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SqlDesignApi#putInlinedPropertiesDesignToSql");
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
| **inlinedPropertyDesign** | [**InlinedPropertyDesign**](InlinedPropertyDesign.md)| Structured file read design object to generate SQL from | |

### Return type

**String**

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json-patch+json, application/json, text/json, application/*+json
 - **Accept**: text/plain, application/json, text/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **400** | Bad Request |  -  |
| **403** | Forbidden |  -  |

<a id="putIntellisense"></a>
# **putIntellisense**
> IntellisenseResponse putIntellisense(intellisenseRequest).execute();

[EXPERIMENTAL] PutIntellisense: Generate a set of possible intellisense prompts given a SQL snip-it (in need not yet be valid) and cursor location

SQL and a row/colum position within it from which to determine intellisense options for the user to potentially choose from.

### Example
```java
// Import classes:
import com.finbourne.luminesce.ApiClient;
import com.finbourne.luminesce.ApiException;
import com.finbourne.luminesce.Configuration;
import com.finbourne.luminesce.auth.*;
import com.finbourne.luminesce.models.*;
import com.finbourne.luminesce.api.SqlDesignApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://fbn-prd.lusid.com/honeycomb");
    
    // Configure OAuth2 access token for authorization: oauth2
    OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
    oauth2.setAccessToken("YOUR ACCESS TOKEN");

    SqlDesignApi apiInstance = new SqlDesignApi(defaultClient);
    IntellisenseRequest intellisenseRequest = new IntellisenseRequest(); // IntellisenseRequest | 
    try {
      IntellisenseResponse result = apiInstance.putIntellisense(intellisenseRequest)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SqlDesignApi#putIntellisense");
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
| **intellisenseRequest** | [**IntellisenseRequest**](IntellisenseRequest.md)|  | |

### Return type

[**IntellisenseResponse**](IntellisenseResponse.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json-patch+json, application/json, text/json, application/*+json
 - **Accept**: text/plain, application/json, text/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **400** | Bad Request |  -  |
| **403** | Forbidden |  -  |

<a id="putIntellisenseError"></a>
# **putIntellisenseError**
> ErrorHighlightResponse putIntellisenseError(errorHighlightRequest).execute();

[EXPERIMENTAL] PutIntellisenseError: Generate a set of error ranges, if any, in the given SQL (expressed as Lines)

SQL (by line) to syntax check and return error ranges from within, if any.

### Example
```java
// Import classes:
import com.finbourne.luminesce.ApiClient;
import com.finbourne.luminesce.ApiException;
import com.finbourne.luminesce.Configuration;
import com.finbourne.luminesce.auth.*;
import com.finbourne.luminesce.models.*;
import com.finbourne.luminesce.api.SqlDesignApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://fbn-prd.lusid.com/honeycomb");
    
    // Configure OAuth2 access token for authorization: oauth2
    OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
    oauth2.setAccessToken("YOUR ACCESS TOKEN");

    SqlDesignApi apiInstance = new SqlDesignApi(defaultClient);
    ErrorHighlightRequest errorHighlightRequest = new ErrorHighlightRequest(); // ErrorHighlightRequest | 
    try {
      ErrorHighlightResponse result = apiInstance.putIntellisenseError(errorHighlightRequest)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SqlDesignApi#putIntellisenseError");
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
| **errorHighlightRequest** | [**ErrorHighlightRequest**](ErrorHighlightRequest.md)|  | |

### Return type

[**ErrorHighlightResponse**](ErrorHighlightResponse.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json-patch+json, application/json, text/json, application/*+json
 - **Accept**: text/plain, application/json, text/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **400** | Bad Request |  -  |
| **403** | Forbidden |  -  |

<a id="putQueryDesignToSql"></a>
# **putQueryDesignToSql**
> String putQueryDesignToSql(queryDesign).execute();

[EXPERIMENTAL] PutQueryDesignToSql: Generates SQL from a structured query design

SQL Designer specification to generate SQL from

### Example
```java
// Import classes:
import com.finbourne.luminesce.ApiClient;
import com.finbourne.luminesce.ApiException;
import com.finbourne.luminesce.Configuration;
import com.finbourne.luminesce.auth.*;
import com.finbourne.luminesce.models.*;
import com.finbourne.luminesce.api.SqlDesignApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://fbn-prd.lusid.com/honeycomb");
    
    // Configure OAuth2 access token for authorization: oauth2
    OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
    oauth2.setAccessToken("YOUR ACCESS TOKEN");

    SqlDesignApi apiInstance = new SqlDesignApi(defaultClient);
    QueryDesign queryDesign = new QueryDesign(); // QueryDesign | Structured Query design object to generate SQL from
    try {
      String result = apiInstance.putQueryDesignToSql(queryDesign)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SqlDesignApi#putQueryDesignToSql");
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
| **queryDesign** | [**QueryDesign**](QueryDesign.md)| Structured Query design object to generate SQL from | |

### Return type

**String**

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json-patch+json, application/json, text/json, application/*+json
 - **Accept**: text/plain, application/json, text/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **400** | Bad Request |  -  |
| **403** | Forbidden |  -  |

<a id="putQueryToFormat"></a>
# **putQueryToFormat**
> String putQueryToFormat(body).trailingCommas(trailingCommas).uppercaseKeywords(uppercaseKeywords).breakJoinOnSections(breakJoinOnSections).spaceAfterExpandedComma(spaceAfterExpandedComma).keywordStandardization(keywordStandardization).expandCommaLists(expandCommaLists).expandInLists(expandInLists).expandBooleanExpressions(expandBooleanExpressions).expandBetweenConditions(expandBetweenConditions).expandCaseStatements(expandCaseStatements).maxLineWidth(maxLineWidth).spaceBeforeTrailingSingleLineComments(spaceBeforeTrailingSingleLineComments).multilineCommentExtraLineBreak(multilineCommentExtraLineBreak).execute();

PutQueryToFormat: Formats SQL into a more readable form, a.k.a. Pretty-Print the SQL.

 This formats SQL (given a set of options as to how to do so). It takes some SQL (or a fragment thereof, it need not fully parse as yet and certainly need not execute correctly) and returns the reformatted version. e.g. &#x60;&#x60;&#x60;sql select x,y,z from a inner join b on a.x&#x3D;b.x where x&gt;y or y!&#x3D;z &#x60;&#x60;&#x60; becomes &#x60;&#x60;&#x60;sql select x, y, z from a inner join b  on a.x &#x3D; b.x where x &gt; y  or y !&#x3D; z &#x60;&#x60;&#x60; 

### Example
```java
// Import classes:
import com.finbourne.luminesce.ApiClient;
import com.finbourne.luminesce.ApiException;
import com.finbourne.luminesce.Configuration;
import com.finbourne.luminesce.auth.*;
import com.finbourne.luminesce.models.*;
import com.finbourne.luminesce.api.SqlDesignApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://fbn-prd.lusid.com/honeycomb");
    
    // Configure OAuth2 access token for authorization: oauth2
    OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
    oauth2.setAccessToken("YOUR ACCESS TOKEN");

    SqlDesignApi apiInstance = new SqlDesignApi(defaultClient);
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
      String result = apiInstance.putQueryToFormat(body)
            .trailingCommas(trailingCommas)
            .uppercaseKeywords(uppercaseKeywords)
            .breakJoinOnSections(breakJoinOnSections)
            .spaceAfterExpandedComma(spaceAfterExpandedComma)
            .keywordStandardization(keywordStandardization)
            .expandCommaLists(expandCommaLists)
            .expandInLists(expandInLists)
            .expandBooleanExpressions(expandBooleanExpressions)
            .expandBetweenConditions(expandBetweenConditions)
            .expandCaseStatements(expandCaseStatements)
            .maxLineWidth(maxLineWidth)
            .spaceBeforeTrailingSingleLineComments(spaceBeforeTrailingSingleLineComments)
            .multilineCommentExtraLineBreak(multilineCommentExtraLineBreak)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SqlDesignApi#putQueryToFormat");
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

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: text/plain
 - **Accept**: text/plain, application/json, text/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **400** | Bad Request |  -  |
| **403** | Forbidden |  -  |

<a id="putSqlToFileReadDesign"></a>
# **putSqlToFileReadDesign**
> FileReaderBuilderDef putSqlToFileReadDesign().determineAvailableSources(determineAvailableSources).body(body).execute();

[EXPERIMENTAL] PutSqlToFileReadDesign: Generates a SQL-file-read-design object from SQL string, if possible.

SQL to attempt to create a Design object from

### Example
```java
// Import classes:
import com.finbourne.luminesce.ApiClient;
import com.finbourne.luminesce.ApiException;
import com.finbourne.luminesce.Configuration;
import com.finbourne.luminesce.auth.*;
import com.finbourne.luminesce.models.*;
import com.finbourne.luminesce.api.SqlDesignApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://fbn-prd.lusid.com/honeycomb");
    
    // Configure OAuth2 access token for authorization: oauth2
    OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
    oauth2.setAccessToken("YOUR ACCESS TOKEN");

    SqlDesignApi apiInstance = new SqlDesignApi(defaultClient);
    Boolean determineAvailableSources = true; // Boolean | Should the available sources be determined from `Sys.Registration`
    String body = @x = 
use Drive.Csv
 --file=/some/folder/somefile.csv
enduse;

select Dockerfile Dockerfile.cicd LICENSE.md README.md docker-compose.yml docs generate justfile publish resources test_sdk from @x;; // String | SQL query to generate the file read design object from
    try {
      FileReaderBuilderDef result = apiInstance.putSqlToFileReadDesign()
            .determineAvailableSources(determineAvailableSources)
            .body(body)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SqlDesignApi#putSqlToFileReadDesign");
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
| **determineAvailableSources** | **Boolean**| Should the available sources be determined from &#x60;Sys.Registration&#x60; | [optional] [default to true] |
| **body** | **String**| SQL query to generate the file read design object from | [optional] |

### Return type

[**FileReaderBuilderDef**](FileReaderBuilderDef.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: text/plain
 - **Accept**: text/plain, application/json, text/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **400** | Bad Request |  -  |
| **403** | Forbidden |  -  |

<a id="putSqlToQueryDesign"></a>
# **putSqlToQueryDesign**
> QueryDesign putSqlToQueryDesign(body).validateWithMetadata(validateWithMetadata).execute();

[EXPERIMENTAL] PutSqlToQueryDesign: Generates a SQL-design object from SQL string, if possible.

SQL to attempt to create a Design object from

### Example
```java
// Import classes:
import com.finbourne.luminesce.ApiClient;
import com.finbourne.luminesce.ApiException;
import com.finbourne.luminesce.Configuration;
import com.finbourne.luminesce.auth.*;
import com.finbourne.luminesce.models.*;
import com.finbourne.luminesce.api.SqlDesignApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://fbn-prd.lusid.com/honeycomb");
    
    // Configure OAuth2 access token for authorization: oauth2
    OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
    oauth2.setAccessToken("YOUR ACCESS TOKEN");

    SqlDesignApi apiInstance = new SqlDesignApi(defaultClient);
    String body = SELECT
 [TableName],
 Count(distinct [FieldName]) as [NumberOfFields]
FROM
 [Sys.Field]
WHERE
 ([TableName] = 'Sys.Registration')
GROUP BY
 [TableName]
ORDER BY
 [DataType]
LIMIT 42; // String | SQL query to generate the design object from
    Boolean validateWithMetadata = true; // Boolean | Should the table be validated against the users' view of Sys.Field to fill in DataTypes, etc.?
    try {
      QueryDesign result = apiInstance.putSqlToQueryDesign(body)
            .validateWithMetadata(validateWithMetadata)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SqlDesignApi#putSqlToQueryDesign");
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
| **body** | **String**| SQL query to generate the design object from | |
| **validateWithMetadata** | **Boolean**| Should the table be validated against the users&#39; view of Sys.Field to fill in DataTypes, etc.? | [optional] [default to true] |

### Return type

[**QueryDesign**](QueryDesign.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: text/plain
 - **Accept**: text/plain, application/json, text/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **400** | Bad Request |  -  |
| **403** | Forbidden |  -  |

<a id="putSqlToViewDesign"></a>
# **putSqlToViewDesign**
> ConvertToViewData putSqlToViewDesign(body).execute();

[EXPERIMENTAL] PutSqlToViewDesign: Generates a structured view creation design from existing view creation SQL.

SQL which creates a view into a structured ConvertToViewData object

### Example
```java
// Import classes:
import com.finbourne.luminesce.ApiClient;
import com.finbourne.luminesce.ApiException;
import com.finbourne.luminesce.Configuration;
import com.finbourne.luminesce.auth.*;
import com.finbourne.luminesce.models.*;
import com.finbourne.luminesce.api.SqlDesignApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://fbn-prd.lusid.com/honeycomb");
    
    // Configure OAuth2 access token for authorization: oauth2
    OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
    oauth2.setAccessToken("YOUR ACCESS TOKEN");

    SqlDesignApi apiInstance = new SqlDesignApi(defaultClient);
    String body = @x = 
use Sys.Admin.SetupView
 --provider=YourView
----
select Dockerfile Dockerfile.cicd LICENSE.md README.md docker-compose.yml docs generate justfile publish resources test_sdk from Lusid.Instrument
enduse;

select Dockerfile Dockerfile.cicd LICENSE.md README.md docker-compose.yml docs generate justfile publish resources test_sdk from @x;; // String | SQL Query to generate the ConvertToViewData object from
    try {
      ConvertToViewData result = apiInstance.putSqlToViewDesign(body)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SqlDesignApi#putSqlToViewDesign");
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
| **body** | **String**| SQL Query to generate the ConvertToViewData object from | |

### Return type

[**ConvertToViewData**](ConvertToViewData.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: text/plain
 - **Accept**: text/plain, application/json, text/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **400** | Bad Request |  -  |
| **403** | Forbidden |  -  |

<a id="putSqlToWriterDesign"></a>
# **putSqlToWriterDesign**
> WriterDesign putSqlToWriterDesign(body).mergeAdditionalMappingFields(mergeAdditionalMappingFields).execute();

[EXPERIMENTAL] PutSqlToWriterDesign: Generates a SQL-writer-design object from SQL string, if possible.

SQL to attempt to create a Writer Design object from

### Example
```java
// Import classes:
import com.finbourne.luminesce.ApiClient;
import com.finbourne.luminesce.ApiException;
import com.finbourne.luminesce.Configuration;
import com.finbourne.luminesce.auth.*;
import com.finbourne.luminesce.models.*;
import com.finbourne.luminesce.api.SqlDesignApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://fbn-prd.lusid.com/honeycomb");
    
    // Configure OAuth2 access token for authorization: oauth2
    OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
    oauth2.setAccessToken("YOUR ACCESS TOKEN");

    SqlDesignApi apiInstance = new SqlDesignApi(defaultClient);
    String body = Select abc from xyz; // String | SQL query to generate the writer design object from
    Boolean mergeAdditionalMappingFields = false; // Boolean | Should `Sys.Field` be used to find additional potential fields to map from? (not always possible)
    try {
      WriterDesign result = apiInstance.putSqlToWriterDesign(body)
            .mergeAdditionalMappingFields(mergeAdditionalMappingFields)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SqlDesignApi#putSqlToWriterDesign");
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
| **body** | **String**| SQL query to generate the writer design object from | |
| **mergeAdditionalMappingFields** | **Boolean**| Should &#x60;Sys.Field&#x60; be used to find additional potential fields to map from? (not always possible) | [optional] [default to false] |

### Return type

[**WriterDesign**](WriterDesign.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: text/plain
 - **Accept**: text/plain, application/json, text/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **400** | Bad Request |  -  |
| **403** | Forbidden |  -  |

<a id="putViewDesignToSql"></a>
# **putViewDesignToSql**
> String putViewDesignToSql(convertToViewData).execute();

[EXPERIMENTAL] PutViewDesignToSql: Generates view creation sql from a structured view creation design

Converts a ConvertToView specification into SQL that creates a view

### Example
```java
// Import classes:
import com.finbourne.luminesce.ApiClient;
import com.finbourne.luminesce.ApiException;
import com.finbourne.luminesce.Configuration;
import com.finbourne.luminesce.auth.*;
import com.finbourne.luminesce.models.*;
import com.finbourne.luminesce.api.SqlDesignApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://fbn-prd.lusid.com/honeycomb");
    
    // Configure OAuth2 access token for authorization: oauth2
    OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
    oauth2.setAccessToken("YOUR ACCESS TOKEN");

    SqlDesignApi apiInstance = new SqlDesignApi(defaultClient);
    ConvertToViewData convertToViewData = new ConvertToViewData(); // ConvertToViewData | Structured Query design object to generate SQL from
    try {
      String result = apiInstance.putViewDesignToSql(convertToViewData)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SqlDesignApi#putViewDesignToSql");
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
| **convertToViewData** | [**ConvertToViewData**](ConvertToViewData.md)| Structured Query design object to generate SQL from | |

### Return type

**String**

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json-patch+json, application/json, text/json, application/*+json
 - **Accept**: text/plain, application/json, text/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **400** | Bad Request |  -  |
| **403** | Forbidden |  -  |

<a id="putWriterDesignToSql"></a>
# **putWriterDesignToSql**
> String putWriterDesignToSql(writerDesign).execute();

[EXPERIMENTAL] PutWriterDesignToSql: Generates writer SQL from a valid writer-design structure

SQL Writer Design specification to generate Writer SQL from

### Example
```java
// Import classes:
import com.finbourne.luminesce.ApiClient;
import com.finbourne.luminesce.ApiException;
import com.finbourne.luminesce.Configuration;
import com.finbourne.luminesce.auth.*;
import com.finbourne.luminesce.models.*;
import com.finbourne.luminesce.api.SqlDesignApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://fbn-prd.lusid.com/honeycomb");
    
    // Configure OAuth2 access token for authorization: oauth2
    OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
    oauth2.setAccessToken("YOUR ACCESS TOKEN");

    SqlDesignApi apiInstance = new SqlDesignApi(defaultClient);
    WriterDesign writerDesign = new WriterDesign(); // WriterDesign | Structured Writer Design design object to generate Writer SQL from
    try {
      String result = apiInstance.putWriterDesignToSql(writerDesign)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SqlDesignApi#putWriterDesignToSql");
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
| **writerDesign** | [**WriterDesign**](WriterDesign.md)| Structured Writer Design design object to generate Writer SQL from | |

### Return type

**String**

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json-patch+json, application/json, text/json, application/*+json
 - **Accept**: text/plain, application/json, text/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **400** | Bad Request |  -  |
| **403** | Forbidden |  -  |

