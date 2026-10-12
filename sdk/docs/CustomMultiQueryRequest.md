# com.finbourne.luminesce.model.CustomMultiQueryRequest
A caller-supplied set of queries to run in the background, as one multi-query.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**executionId** | **String** | An explicit ExecutionId to use. This must be blank OR assigned to a valid GUID-as-a-string. | [optional] [default to String]
**scalarParameters** | **Map&lt;String, String&gt;** | Scalar parameter values, handed to every query that runs (e.g. filling in &#x60;:someParameter:defaultValue&#x60; style references). At most 100, each named as an identifier of at most 256 characters, with a value of at most 4096. | [optional] [default to Map<String, String>]
**queries** | [**List&lt;CustomMultiQueryItem&gt;**](CustomMultiQueryItem.md) | The queries to run. Those ready are started in the order given here (one still waiting on those it refers to does not hold up a later one), and each may only refer to queries earlier in the list. | [default to List<CustomMultiQueryItem>]
**maxInParallel** | **Integer** | Maximum number of the queries that may run concurrently. Defaults to 1, meaning they run one after another. Explicitly null means as many as their dependencies allow. | [optional] [default to Integer]
**timeoutSeconds** | **Integer** | Maximum time each query may run for, in seconds, timed from when it starts: &lt;0 → ∞, 0 → 1200s (20m). There is no limit on the set as a whole. | [optional] [default to Integer]
**keepForSeconds** | **Integer** | Maximum time the results may be kept for, in seconds: &lt;0 → 1200 (20m), 0 → 28800 (8h), max &#x3D; 2,678,400 (31d) | [optional] [default to Integer]
**queryName** | **String** | A name for this set of queries. This goes into logs and is returned when listing the sets of queries. | [optional] [default to String]

```java
import com.finbourne.luminesce.model.CustomMultiQueryRequest;
import java.util.*;
import java.lang.System;
import java.net.URI;

@jakarta.annotation.Nullable String ExecutionId = "example ExecutionId";
@jakarta.annotation.Nullable Map<String, String> ScalarParameters = new Map<String, String>();
List<CustomMultiQueryItem> Queries = new List<CustomMultiQueryItem>();
@jakarta.annotation.Nullable Integer MaxInParallel = new Integer("100.00");
Integer TimeoutSeconds = new Integer("100.00");
Integer KeepForSeconds = new Integer("100.00");
@jakarta.annotation.Nullable String QueryName = "example QueryName";


CustomMultiQueryRequest customMultiQueryRequestInstance = new CustomMultiQueryRequest()
    .ExecutionId(ExecutionId)
    .ScalarParameters(ScalarParameters)
    .Queries(Queries)
    .MaxInParallel(MaxInParallel)
    .TimeoutSeconds(TimeoutSeconds)
    .KeepForSeconds(KeepForSeconds)
    .QueryName(QueryName);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
