# com.finbourne.luminesce.model.ExportFormatting

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**timezone** | **String** |  | [optional] [default to String]
**locale** | **String** |  | [optional] [default to String]
**tables** | [**List&lt;TableExport&gt;**](TableExport.md) |  | [optional] [default to List<TableExport>]

```java
import com.finbourne.luminesce.model.ExportFormatting;
import java.util.*;
import java.lang.System;
import java.net.URI;

@jakarta.annotation.Nullable String Timezone = "example Timezone";
@jakarta.annotation.Nullable String Locale = "example Locale";
@jakarta.annotation.Nullable List<TableExport> Tables = new List<TableExport>();


ExportFormatting exportFormattingInstance = new ExportFormatting()
    .Timezone(Timezone)
    .Locale(Locale)
    .Tables(Tables);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
