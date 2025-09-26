# com.finbourne.luminesce.model.BackgroundMultiQueryProgressResponse

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**progress** | **String** | The full progress log (up to this point at least) | [optional] [default to String]
**feedback** | [**List&lt;FeedbackEventArgs&gt;**](FeedbackEventArgs.md) | Individual Feedback Messages (to replace Progress). A given message will be returned from only one call. | [optional] [default to List<FeedbackEventArgs>]
**status** | [**TaskStatus**](TaskStatus.md) |  | [optional] [default to TaskStatus]
**queries** | [**List&lt;BackgroundQueryProgressResponse&gt;**](BackgroundQueryProgressResponse.md) |  | [optional] [default to List<BackgroundQueryProgressResponse>]

```java
import com.finbourne.luminesce.model.BackgroundMultiQueryProgressResponse;
import java.util.*;
import java.lang.System;
import java.net.URI;

@jakarta.annotation.Nullable String Progress = "example Progress";
@jakarta.annotation.Nullable List<FeedbackEventArgs> Feedback = new List<FeedbackEventArgs>();
TaskStatus @jakarta.annotation.Nullable List<BackgroundQueryProgressResponse> Queries = new List<BackgroundQueryProgressResponse>();


BackgroundMultiQueryProgressResponse backgroundMultiQueryProgressResponseInstance = new BackgroundMultiQueryProgressResponse()
    .Progress(Progress)
    .Feedback(Feedback)
    .Status(Status)
    .Queries(Queries);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
