# com.finbourne.luminesce.model.BackgroundQueryState

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**BackgroundQueryState** | [**String**](.md) | **** | [default to String]

```java
import com.finbourne.luminesce.model.BackgroundQueryState;
import java.util.*;
import java.lang.System;
import java.net.URI;

// Example usage of BackgroundQueryState:
BackgroundQueryState method = BackgroundQueryState.NEW;
BackgroundQueryState method = BackgroundQueryState.RUNNING;
BackgroundQueryState method = BackgroundQueryState.ERRORED;
BackgroundQueryState method = BackgroundQueryState.CANCELLED;
BackgroundQueryState method = BackgroundQueryState.EXECUTED;
BackgroundQueryState method = BackgroundQueryState.EXECUTEDNOSERIALIZATIONREQUIRED;
BackgroundQueryState method = BackgroundQueryState.SERIALIZED;
BackgroundQueryState method = BackgroundQueryState.SERIALIZATIONFAILED;
BackgroundQueryState method = BackgroundQueryState.ATTEMPTINGTODESERIALIZE;
BackgroundQueryState method = BackgroundQueryState.LOADED;
BackgroundQueryState method = BackgroundQueryState.CLEARED;
BackgroundQueryState method = BackgroundQueryState.DISPOSED;
BackgroundQueryState method = BackgroundQueryState.OWNERTERMINATED;
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
