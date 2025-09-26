# com.finbourne.luminesce.model.BackgroundQueryCancelResponse

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**hadData** | **Boolean** |  | [optional] [default to Boolean]
**previousStatus** | [**TaskStatus**](TaskStatus.md) |  | [optional] [default to TaskStatus]
**previousState** | [**BackgroundQueryState**](BackgroundQueryState.md) |  | [optional] [default to BackgroundQueryState]
**progress** | **String** |  | [optional] [default to String]

```java
import com.finbourne.luminesce.model.BackgroundQueryCancelResponse;
import java.util.*;
import java.lang.System;
import java.net.URI;

Boolean HadData = true;
TaskStatus BackgroundQueryState @jakarta.annotation.Nullable String Progress = "example Progress";


BackgroundQueryCancelResponse backgroundQueryCancelResponseInstance = new BackgroundQueryCancelResponse()
    .HadData(HadData)
    .PreviousStatus(PreviousStatus)
    .PreviousState(PreviousState)
    .Progress(Progress);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
