

# OnClauseTermDesign

A single on clause term (a pair of columns to join or a column to filter on)

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**leftTableField** | **String** | Name of field in the left table to join to (complex expressions are not supported at this time) |  [optional] |
|**rightTableField** | **String** | Name of field in the left table to join to (complex expressions are not supported at this time) |  [optional] |
|**operator** | **QueryDesignerBinaryOperator** |  |  |
|**filterValue** | **String** | The value to compare against (always as a string, but will be formatted to the correct type) |  [optional] |
|**filterValueDataType** | **DataType** |  |  [optional] |



[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)


