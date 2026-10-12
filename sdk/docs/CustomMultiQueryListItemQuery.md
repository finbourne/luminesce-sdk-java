# com.finbourne.luminesce.model.CustomMultiQueryListItemQuery
One of the queries of a Finbourne.Honeycomb.WebApi.BackgroundQueries.MultiQuery.CustomMultiQueryListItem

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**name** | **String** | The Name given to the query in the original request | [optional] [default to String]
**state** | [**BackgroundQueryState**](BackgroundQueryState.md) |  | [optional] [default to BackgroundQueryState]
**hasResult** | **Boolean** | Whether its results may be fetched | [optional] [default to Boolean]

```java
import com.finbourne.luminesce.model.CustomMultiQueryListItemQuery;
import java.util.*;
import java.lang.System;
import java.net.URI;

@jakarta.annotation.Nullable String Name = "example Name";
BackgroundQueryState Boolean HasResult = true;


CustomMultiQueryListItemQuery customMultiQueryListItemQueryInstance = new CustomMultiQueryListItemQuery()
    .Name(Name)
    .State(State)
    .HasResult(HasResult);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
