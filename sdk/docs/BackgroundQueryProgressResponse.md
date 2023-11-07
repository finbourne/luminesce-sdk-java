

# BackgroundQueryProgressResponse


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**hasData** | **Boolean** | Is there currently data for this Query? |  [optional] |
|**rowCount** | **Integer** | Number of rows of data held. -1 if none as yet. |  [optional] |
|**status** | **TaskStatus** |  |  [optional] |
|**state** | **BackgroundQueryState** |  |  [optional] |
|**progress** | **String** | The full progress log (up to this point at least) |  [optional] |
|**feedback** | [**List&lt;FeedbackEventArgs&gt;**](FeedbackEventArgs.md) | Individual Feedback Messages (to replace Progress). A given message will be returned from only one call. |  [optional] |
|**query** | **String** | The LuminesceSql of the original request |  [optional] |
|**queryName** | **String** | The QueryName given in the original request |  [optional] |
|**columnsAvailable** | [**List&lt;Column&gt;**](Column.md) | When HasData is true this is the schema of columns that will be returned if the data is requested |  [optional] |



