# com.finbourne.luminesce.model.ExportGrouping

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**groupKeys** | **List&lt;String&gt;** |  | [optional] [default to List<String>]
**dateParts** | **Map&lt;String, String&gt;** |  | [optional] [default to Map<String, String>]
**aggregations** | [**List&lt;ExportAggregation&gt;**](ExportAggregation.md) |  | [optional] [default to List<ExportAggregation>]

```java
import com.finbourne.luminesce.model.ExportGrouping;
import java.util.*;
import java.lang.System;
import java.net.URI;

@jakarta.annotation.Nullable List<String> GroupKeys = new List<String>();
@jakarta.annotation.Nullable Map<String, String> DateParts = new Map<String, String>();
@jakarta.annotation.Nullable List<ExportAggregation> Aggregations = new List<ExportAggregation>();


ExportGrouping exportGroupingInstance = new ExportGrouping()
    .GroupKeys(GroupKeys)
    .DateParts(DateParts)
    .Aggregations(Aggregations);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
