# com.finbourne.luminesce.model.ExportAggregation

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**colId** | **String** |  | [default to String]
**aggFunc** | [**ExportAggregationFunction**](ExportAggregationFunction.md) |  | [optional] [default to ExportAggregationFunction]
**placement** | [**ExportAggregationPlacement**](ExportAggregationPlacement.md) |  | [optional] [default to ExportAggregationPlacement]

```java
import com.finbourne.luminesce.model.ExportAggregation;
import java.util.*;
import java.lang.System;
import java.net.URI;

String ColId = "example ColId";
ExportAggregationFunction ExportAggregationPlacement 

ExportAggregation exportAggregationInstance = new ExportAggregation()
    .ColId(ColId)
    .AggFunc(AggFunc)
    .Placement(Placement);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
