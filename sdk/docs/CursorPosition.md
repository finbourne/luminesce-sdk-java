# com.finbourne.luminesce.model.CursorPosition
Represents a cursor location

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**row** | **Integer** | Row (0 based) of the user&#39;s cursor position | [default to Integer]
**column** | **Integer** | Column (0 based) of the user&#39;s cursor position | [default to Integer]

```java
import com.finbourne.luminesce.model.CursorPosition;
import java.util.*;
import java.lang.System;
import java.net.URI;

Integer Row = new Integer("100.00");
Integer Column = new Integer("100.00");


CursorPosition cursorPositionInstance = new CursorPosition()
    .Row(Row)
    .Column(Column);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
