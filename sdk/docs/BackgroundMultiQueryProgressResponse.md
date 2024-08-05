

# BackgroundMultiQueryProgressResponse


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**progress** | **String** | The full progress log (up to this point at least) |  [optional] |
|**feedback** | [**List&lt;FeedbackEventArgs&gt;**](FeedbackEventArgs.md) | Individual Feedback Messages (to replace Progress). A given message will be returned from only one call. |  [optional] |
|**status** | **TaskStatus** |  |  [optional] |
|**queries** | [**List&lt;BackgroundQueryProgressResponse&gt;**](BackgroundQueryProgressResponse.md) |  |  [optional] |



[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)


