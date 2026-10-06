# com.finbourne.luminesce.model.BackgroundQueryListItem
A background query the calling user currently has available to them

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**executionId** | **String** | ExecutionId of the query | [optional] [default to String]
**query** | **String** | The LuminesceSql of the original request | [optional] [default to String]
**queryName** | **String** | The QueryName given in the original request | [optional] [default to String]
**state** | [**BackgroundQueryState**](BackgroundQueryState.md) |  | [optional] [default to BackgroundQueryState]
**when** | [**OffsetDateTime**](OffsetDateTime.md) | When the state of this query (and so its data) was last updated (UTC) | [optional] [default to OffsetDateTime]
**expiresAt** | [**OffsetDateTime**](OffsetDateTime.md) | When the query (and its data) may be removed (UTC) | [optional] [default to OffsetDateTime]

```java
import com.finbourne.luminesce.model.BackgroundQueryListItem;
import java.util.*;
import java.lang.System;
import java.net.URI;

@jakarta.annotation.Nullable String ExecutionId = "example ExecutionId";
@jakarta.annotation.Nullable String Query = "example Query";
@jakarta.annotation.Nullable String QueryName = "example QueryName";
BackgroundQueryState OffsetDateTime When = OffsetDateTime.now();
OffsetDateTime ExpiresAt = OffsetDateTime.now();


BackgroundQueryListItem backgroundQueryListItemInstance = new BackgroundQueryListItem()
    .ExecutionId(ExecutionId)
    .Query(Query)
    .QueryName(QueryName)
    .State(State)
    .When(When)
    .ExpiresAt(ExpiresAt);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
