# com.finbourne.luminesce.model.TaskStatus

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**TaskStatus** | [**String**](.md) | **** | [default to String]

```java
import com.finbourne.luminesce.model.TaskStatus;
import java.util.*;
import java.lang.System;
import java.net.URI;

// Example usage of TaskStatus:
TaskStatus method = TaskStatus.CREATED;
TaskStatus method = TaskStatus.WAITINGFORACTIVATION;
TaskStatus method = TaskStatus.WAITINGTORUN;
TaskStatus method = TaskStatus.RUNNING;
TaskStatus method = TaskStatus.WAITINGFORCHILDRENTOCOMPLETE;
TaskStatus method = TaskStatus.RANTOCOMPLETION;
TaskStatus method = TaskStatus.CANCELED;
TaskStatus method = TaskStatus.FAULTED;
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
