# com.finbourne.luminesce.model.BackgroundMultiQueryResponse

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**executionId** | [**UUID**](UUID.md) |  | [optional] [readonly] [default to UUID]
**progress** | [**Link**](Link.md) |  | [optional] [default to Link]
**cancel** | [**Link**](Link.md) |  | [optional] [default to Link]
**fetchJson** | [**List&lt;Link&gt;**](Link.md) | Json (as a string) data request links for all of the child queries | [optional] [readonly] [default to List<Link>]
**fetchJsonProper** | [**List&lt;Link&gt;**](Link.md) | Json-proper data request links for all of the child queries | [optional] [readonly] [default to List<Link>]
**fetchJsonProperWithLineage** | [**List&lt;Link&gt;**](Link.md) | Json-proper-with-lineage data request links for all of the child queries | [optional] [readonly] [default to List<Link>]
**fetchXml** | [**List&lt;Link&gt;**](Link.md) | Xml data request links for all of the child queries | [optional] [readonly] [default to List<Link>]
**fetchParquet** | [**List&lt;Link&gt;**](Link.md) | Parquet data request links for all of the child queries | [optional] [readonly] [default to List<Link>]
**fetchCsv** | [**List&lt;Link&gt;**](Link.md) | CSV data request links for all of the child queries | [optional] [readonly] [default to List<Link>]
**fetchPipe** | [**List&lt;Link&gt;**](Link.md) | Pipe delimited data request links for all of the child queries | [optional] [readonly] [default to List<Link>]
**fetchExcel** | [**List&lt;Link&gt;**](Link.md) | Excel workbook data request links for all of the child queries | [optional] [readonly] [default to List<Link>]
**fetchSqlite** | [**List&lt;Link&gt;**](Link.md) | SqLite DB data request links for all of the child queries | [optional] [readonly] [default to List<Link>]
**histogram** | [**List&lt;Link&gt;**](Link.md) | Histogram links for all of the child queries | [optional] [readonly] [default to List<Link>]

```java
import com.finbourne.luminesce.model.BackgroundMultiQueryResponse;
import java.util.*;
import java.lang.System;
import java.net.URI;

UUID ExecutionId = "example ExecutionId";
Link Progress = new Link();
Link Cancel = new Link();
@jakarta.annotation.Nullable List<Link> FetchJson = new List<Link>();
@jakarta.annotation.Nullable List<Link> FetchJsonProper = new List<Link>();
@jakarta.annotation.Nullable List<Link> FetchJsonProperWithLineage = new List<Link>();
@jakarta.annotation.Nullable List<Link> FetchXml = new List<Link>();
@jakarta.annotation.Nullable List<Link> FetchParquet = new List<Link>();
@jakarta.annotation.Nullable List<Link> FetchCsv = new List<Link>();
@jakarta.annotation.Nullable List<Link> FetchPipe = new List<Link>();
@jakarta.annotation.Nullable List<Link> FetchExcel = new List<Link>();
@jakarta.annotation.Nullable List<Link> FetchSqlite = new List<Link>();
@jakarta.annotation.Nullable List<Link> Histogram = new List<Link>();


BackgroundMultiQueryResponse backgroundMultiQueryResponseInstance = new BackgroundMultiQueryResponse()
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
