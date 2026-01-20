# com.finbourne.luminesce.model.BackgroundQueryResponse
Response for Background Query Start requests

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**executionId** | **String** | ExecutionId of the started-query | [optional] [default to String]
**progress** | [**Link**](Link.md) |  | [optional] [default to Link]
**cancel** | [**Link**](Link.md) |  | [optional] [default to Link]
**fetchJson** | [**Link**](Link.md) |  | [optional] [default to Link]
**fetchJsonProper** | [**Link**](Link.md) |  | [optional] [default to Link]
**fetchJsonProperWithLineage** | [**Link**](Link.md) |  | [optional] [default to Link]
**fetchXml** | [**Link**](Link.md) |  | [optional] [default to Link]
**fetchParquet** | [**Link**](Link.md) |  | [optional] [default to Link]
**fetchCsv** | [**Link**](Link.md) |  | [optional] [default to Link]
**fetchPipe** | [**Link**](Link.md) |  | [optional] [default to Link]
**fetchExcel** | [**Link**](Link.md) |  | [optional] [default to Link]
**fetchSqlite** | [**Link**](Link.md) |  | [optional] [default to Link]
**histogram** | [**Link**](Link.md) |  | [optional] [default to Link]

```java
import com.finbourne.luminesce.model.BackgroundQueryResponse;
import java.util.*;
import java.lang.System;
import java.net.URI;

@jakarta.annotation.Nullable String ExecutionId = "example ExecutionId";
Link Progress = new Link();
Link Cancel = new Link();
Link FetchJson = new Link();
Link FetchJsonProper = new Link();
Link FetchJsonProperWithLineage = new Link();
Link FetchXml = new Link();
Link FetchParquet = new Link();
Link FetchCsv = new Link();
Link FetchPipe = new Link();
Link FetchExcel = new Link();
Link FetchSqlite = new Link();
Link Histogram = new Link();


BackgroundQueryResponse backgroundQueryResponseInstance = new BackgroundQueryResponse()
    .ExecutionId(ExecutionId)
    .Progress(Progress)
    .Cancel(Cancel)
    .FetchJson(FetchJson)
    .FetchJsonProper(FetchJsonProper)
    .FetchJsonProperWithLineage(FetchJsonProperWithLineage)
    .FetchXml(FetchXml)
    .FetchParquet(FetchParquet)
    .FetchCsv(FetchCsv)
    .FetchPipe(FetchPipe)
    .FetchExcel(FetchExcel)
    .FetchSqlite(FetchSqlite)
    .Histogram(Histogram);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
