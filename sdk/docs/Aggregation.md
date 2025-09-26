# com.finbourne.luminesce.model.Aggregation
How to aggregate over a field

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**type** | [**AggregateFunction**](AggregateFunction.md) |  | [default to AggregateFunction]
**alias** | **String** | Alias, if any, for the Aggregate expression when selected | [optional] [default to String]

```java
import com.finbourne.luminesce.model.Aggregation;
import java.util.*;
import java.lang.System;
import java.net.URI;

AggregateFunction @jakarta.annotation.Nullable String Alias = "example Alias";


Aggregation aggregationInstance = new Aggregation()
    .Type(Type)
    .Alias(Alias);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
