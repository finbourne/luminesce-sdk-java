# com.finbourne.luminesce.model.MultiQueryExportState
What became of the export of a custom multi-query once its queries were done (persisted in its shared state, so known to every pod).

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**driveLocationAndFileName** | **String** | Where it was to be saved, its placeholders filled in | [optional] [default to String]
**savedTo** | **String** | The Drive path (and file name, with its extension) it was saved to, once it has been | [optional] [default to String]
**error** | **String** | Why it was not saved, if it was not | [optional] [default to String]

```java
import com.finbourne.luminesce.model.MultiQueryExportState;
import java.util.*;
import java.lang.System;
import java.net.URI;

@jakarta.annotation.Nullable String DriveLocationAndFileName = "example DriveLocationAndFileName";
@jakarta.annotation.Nullable String SavedTo = "example SavedTo";
@jakarta.annotation.Nullable String Error = "example Error";


MultiQueryExportState multiQueryExportStateInstance = new MultiQueryExportState()
    .DriveLocationAndFileName(DriveLocationAndFileName)
    .SavedTo(SavedTo)
    .Error(Error);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
