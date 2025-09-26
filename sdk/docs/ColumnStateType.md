# com.finbourne.luminesce.model.ColumnStateType
Representation of a column within the grid

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**colId** | **String** | Unique identifier for the column | [default to String]
**hide** | **Boolean** | Flag to determine whether the column is visible in the grid | [default to Boolean]
**sort** | **String** | The sort order (asc or desc) | [optional] [default to String]
**sortIndex** | **Integer** | The index of the sort to determine the order in which the sorts are applied | [optional] [default to Integer]

```java
import com.finbourne.luminesce.model.ColumnStateType;
import java.util.*;
import java.lang.System;
import java.net.URI;

String ColId = "example ColId";
Boolean Hide = true;
@jakarta.annotation.Nullable String Sort = "example Sort";
@jakarta.annotation.Nullable Integer SortIndex = new Integer("100.00");


ColumnStateType columnStateTypeInstance = new ColumnStateType()
    .ColId(ColId)
    .Hide(Hide)
    .Sort(Sort)
    .SortIndex(SortIndex);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
