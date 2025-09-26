# com.finbourne.luminesce.model.ErrorHighlightRequest
Request for Error highlighting

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**lines** | **List&lt;String&gt;** | The lines of text the user currently has in the editor | [default to List<String>]
**ensureSomeTextIsSelected** | **Boolean** | If an editor requires some selection of non-whitespace this can be set to true to force at least one visible character to be selected. | [optional] [default to Boolean]

```java
import com.finbourne.luminesce.model.ErrorHighlightRequest;
import java.util.*;
import java.lang.System;
import java.net.URI;

List<String> Lines = new List<String>();
Boolean EnsureSomeTextIsSelected = true;


ErrorHighlightRequest errorHighlightRequestInstance = new ErrorHighlightRequest()
    .Lines(Lines)
    .EnsureSomeTextIsSelected(EnsureSomeTextIsSelected);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
