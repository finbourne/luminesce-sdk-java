# com.finbourne.luminesce.model.ErrorHighlightResponse
Response for error highlighting

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**errors** | [**List&lt;ErrorHighlightItem&gt;**](ErrorHighlightItem.md) | The errors within the Sql | [default to List<ErrorHighlightItem>]
**sqlWithMarker** | **String** | The SQL this is for, with characters indicating the error locations | [default to String]

```java
import com.finbourne.luminesce.model.ErrorHighlightResponse;
import java.util.*;
import java.lang.System;
import java.net.URI;

List<ErrorHighlightItem> Errors = new List<ErrorHighlightItem>();
String SqlWithMarker = "example SqlWithMarker";


ErrorHighlightResponse errorHighlightResponseInstance = new ErrorHighlightResponse()
    .Errors(Errors)
    .SqlWithMarker(SqlWithMarker);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
