# com.finbourne.luminesce.model.CustomMultiQueryListItem
A custom multi-query the calling user currently has results of available to them

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**executionId** | **String** | ExecutionId of the multi-query, its queries having ExecutionIds of &#x60;{ExecutionId}_{Name}&#x60; | [optional] [default to String]
**queryName** | **String** | The QueryName given in the original request | [optional] [default to String]
**state** | [**BackgroundQueryState**](BackgroundQueryState.md) |  | [optional] [default to BackgroundQueryState]
**startedAt** | [**OffsetDateTime**](OffsetDateTime.md) | When it was started (UTC) | [optional] [default to OffsetDateTime]
**when** | [**OffsetDateTime**](OffsetDateTime.md) | When the state of it was last updated (UTC) | [optional] [default to OffsetDateTime]
**expiresAt** | [**OffsetDateTime**](OffsetDateTime.md) | When it (and the data of its queries) may be removed (UTC) | [optional] [default to OffsetDateTime]
**queries** | [**List&lt;CustomMultiQueryListItemQuery&gt;**](CustomMultiQueryListItemQuery.md) | Its queries whose results may be fetched (those that are external results), in request order | [optional] [default to List<CustomMultiQueryListItemQuery>]

```java
import com.finbourne.luminesce.model.CustomMultiQueryListItem;
import java.util.*;
import java.lang.System;
import java.net.URI;

@jakarta.annotation.Nullable String ExecutionId = "example ExecutionId";
@jakarta.annotation.Nullable String QueryName = "example QueryName";
BackgroundQueryState @jakarta.annotation.Nullable OffsetDateTime StartedAt = OffsetDateTime.now();
OffsetDateTime When = OffsetDateTime.now();
OffsetDateTime ExpiresAt = OffsetDateTime.now();
@jakarta.annotation.Nullable List<CustomMultiQueryListItemQuery> Queries = new List<CustomMultiQueryListItemQuery>();


CustomMultiQueryListItem customMultiQueryListItemInstance = new CustomMultiQueryListItem()
    .ExecutionId(ExecutionId)
    .QueryName(QueryName)
    .State(State)
    .StartedAt(StartedAt)
    .When(When)
    .ExpiresAt(ExpiresAt)
    .Queries(Queries);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
