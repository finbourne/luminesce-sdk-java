# com.finbourne.luminesce.model.IntellisenseResponse
Available intellisense response information

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**autoCompleteList** | [**List&lt;IntellisenseItem&gt;**](IntellisenseItem.md) | The available items at this point | [default to List<IntellisenseItem>]
**tryAgainSoonForMore** | **Boolean** | Should the caller try again soon? (true means a cache is being built and this is a preliminary response!) | [default to Boolean]
**sqlWithMarker** | **String** | The SQL this is for with characters indicating the location the pop-up is for | [default to String]
**startReplacementPosition** | [**CursorPosition**](CursorPosition.md) |  | [default to CursorPosition]
**endReplacementPosition** | [**CursorPosition**](CursorPosition.md) |  | [default to CursorPosition]

```java
import com.finbourne.luminesce.model.IntellisenseResponse;
import java.util.*;
import java.lang.System;
import java.net.URI;

List<IntellisenseItem> AutoCompleteList = new List<IntellisenseItem>();
Boolean TryAgainSoonForMore = true;
String SqlWithMarker = "example SqlWithMarker";
CursorPosition StartReplacementPosition = new CursorPosition();
CursorPosition EndReplacementPosition = new CursorPosition();


IntellisenseResponse intellisenseResponseInstance = new IntellisenseResponse()
    .AutoCompleteList(AutoCompleteList)
    .TryAgainSoonForMore(TryAgainSoonForMore)
    .SqlWithMarker(SqlWithMarker)
    .StartReplacementPosition(StartReplacementPosition)
    .EndReplacementPosition(EndReplacementPosition);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
