# com.finbourne.luminesce.model.FeedbackEventArgs

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**when** | [**OffsetDateTime**](OffsetDateTime.md) |  | [optional] [default to OffsetDateTime]
**sessionId** | [**UUID**](UUID.md) |  | [optional] [default to UUID]
**executionId** | [**UUID**](UUID.md) |  | [optional] [default to UUID]
**level** | [**FeedbackLevel**](FeedbackLevel.md) |  | [optional] [default to FeedbackLevel]
**sender** | **String** |  | [optional] [default to String]
**stateId** | **Integer** |  | [optional] [default to Integer]
**messageTemplate** | **String** |  | [optional] [default to String]
**propertyValues** | **List&lt;Object&gt;** |  | [optional] [default to List<Object>]
**message** | **String** |  | [optional] [readonly] [default to String]

```java
import com.finbourne.luminesce.model.FeedbackEventArgs;
import java.util.*;
import java.lang.System;
import java.net.URI;

OffsetDateTime When = OffsetDateTime.now();
UUID SessionId = "example SessionId";
UUID ExecutionId = "example ExecutionId";
FeedbackLevel @jakarta.annotation.Nullable String Sender = "example Sender";
@jakarta.annotation.Nullable Integer StateId = new Integer("100.00");
@jakarta.annotation.Nullable String MessageTemplate = "example MessageTemplate";
@jakarta.annotation.Nullable List<Object> PropertyValues = new List<Object>();
@jakarta.annotation.Nullable String Message = "example Message";


FeedbackEventArgs feedbackEventArgsInstance = new FeedbackEventArgs()
    .When(When)
    .SessionId(SessionId)
    .ExecutionId(ExecutionId)
    .Level(Level)
    .Sender(Sender)
    .StateId(StateId)
    .MessageTemplate(MessageTemplate)
    .PropertyValues(PropertyValues)
    .Message(Message);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
