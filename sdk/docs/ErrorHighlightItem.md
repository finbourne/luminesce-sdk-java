# com.finbourne.luminesce.model.ErrorHighlightItem
Representation of a sql error

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**start** | [**CursorPosition**](CursorPosition.md) |  | [default to CursorPosition]
**stop** | [**CursorPosition**](CursorPosition.md) |  | [default to CursorPosition]
**noViableAlternativeStart** | [**CursorPosition**](CursorPosition.md) |  | [optional] [default to CursorPosition]
**length** | **Integer** | The length of the error token counting line breaks if any | [default to Integer]
**message** | **String** | The error message | [default to String]

```java
import com.finbourne.luminesce.model.ErrorHighlightItem;
import java.util.*;
import java.lang.System;
import java.net.URI;

CursorPosition Start = new CursorPosition();
CursorPosition Stop = new CursorPosition();
CursorPosition NoViableAlternativeStart = new CursorPosition();
Integer Length = new Integer("100.00");
String Message = "example Message";


ErrorHighlightItem errorHighlightItemInstance = new ErrorHighlightItem()
    .Start(Start)
    .Stop(Stop)
    .NoViableAlternativeStart(NoViableAlternativeStart)
    .Length(Length)
    .Message(Message);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
