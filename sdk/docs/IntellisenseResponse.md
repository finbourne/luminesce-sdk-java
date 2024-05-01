

# IntellisenseResponse

Available intellisense response information

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**autoCompleteList** | [**List&lt;IntellisenseItem&gt;**](IntellisenseItem.md) | The available items at this point |  |
|**tryAgainSoonForMore** | **Boolean** | Should the caller try again soon? (true means a cache is being built and this is a preliminary response!) |  |
|**sqlWithMarker** | **String** | The SQL this is for with characters indicating the location the pop-up is for |  |
|**startReplacementPosition** | [**CursorPosition**](CursorPosition.md) |  |  |
|**endReplacementPosition** | [**CursorPosition**](CursorPosition.md) |  |  |



