# com.finbourne.luminesce.model.IntellisenseRequest
Representation of a request for IntellisenseItems

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**lines** | **List&lt;String&gt;** | The lines of text the user currently has in the editor | [default to List<String>]
**position** | [**CursorPosition**](CursorPosition.md) |  | [default to CursorPosition]

```java
import com.finbourne.luminesce.model.IntellisenseRequest;
import java.util.*;
import java.lang.System;
import java.net.URI;

List<String> Lines = new List<String>();
CursorPosition Position = new CursorPosition();


IntellisenseRequest intellisenseRequestInstance = new IntellisenseRequest()
    .Lines(Lines)
    .Position(Position);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
