# com.finbourne.luminesce.model.BackgroundQueryProgressResponse

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**hasData** | **Boolean** | Is there currently data for this Query? | [optional] [default to Boolean]
**rowCount** | **Integer** | Number of rows of data held. -1 if none as yet. | [optional] [default to Integer]
**status** | [**TaskStatus**](TaskStatus.md) |  | [optional] [default to TaskStatus]
**state** | [**BackgroundQueryState**](BackgroundQueryState.md) |  | [optional] [default to BackgroundQueryState]
**progress** | **String** | The full progress log (up to this point at least) | [optional] [default to String]
**feedback** | [**List&lt;FeedbackEventArgs&gt;**](FeedbackEventArgs.md) | Individual Feedback Messages (to replace Progress). A given message will be returned from only one call. | [optional] [default to List<FeedbackEventArgs>]
**query** | **String** | The LuminesceSql of the original request | [optional] [default to String]
**queryName** | **String** | The QueryName given in the original request | [optional] [default to String]
**columnsAvailable** | [**List&lt;Column&gt;**](Column.md) | When HasData is true this is the schema of columns that will be returned if the data is requested | [optional] [default to List<Column>]
**lineage** | [**TableLineage**](TableLineage.md) |  | [optional] [default to TableLineage]

```java
import com.finbourne.luminesce.model.BackgroundQueryProgressResponse;
import java.util.*;
import java.lang.System;
import java.net.URI;

Boolean HasData = true;
Integer RowCount = new Integer("100.00");
TaskStatus BackgroundQueryState @jakarta.annotation.Nullable String Progress = "example Progress";
@jakarta.annotation.Nullable List<FeedbackEventArgs> Feedback = new List<FeedbackEventArgs>();
@jakarta.annotation.Nullable String Query = "example Query";
@jakarta.annotation.Nullable String QueryName = "example QueryName";
@jakarta.annotation.Nullable List<Column> ColumnsAvailable = new List<Column>();
TableLineage Lineage = new TableLineage();


BackgroundQueryProgressResponse backgroundQueryProgressResponseInstance = new BackgroundQueryProgressResponse()
    .HasData(HasData)
    .RowCount(RowCount)
    .Status(Status)
    .State(State)
    .Progress(Progress)
    .Feedback(Feedback)
    .Query(Query)
    .QueryName(QueryName)
    .ColumnsAvailable(ColumnsAvailable)
    .Lineage(Lineage);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
