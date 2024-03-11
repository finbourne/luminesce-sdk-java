

# FileReaderBuilderResponse

Information on how to construct a file-read sql query

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**query** | **String** | The generated SQL |  [optional] |
|**error** | **String** | The error from running generated SQL Query, if any |  [optional] |
|**columns** | [**List&lt;ColumnInfo&gt;**](ColumnInfo.md) | Column information for the results |  [optional] |
|**data** | **Object** | The resulting data from running the Query |  [optional] |



