

# OptionsExcel

Additional options applicable to the given SourceType

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**columnNames** | **String** | Column Names either overrides the header row or steps in when there is no header row (comma delimited list) |  [optional] |
|**columnTypes** | **String** | Column types (comma delimited list of: &#39;{types}&#39;, some columns may be left blank while others are specified) |  [optional] |
|**inferTypeRowCount** | **Integer** | If non-zero and &#39;types&#39; is not specified (or not specified for some columns) this will look through N rows to attempt to work out the column types for columns not pre-specified |  [optional] |
|**noHeader** | **Boolean** | Set this if there is no header row |  [optional] |
|**calculate** | **Boolean** | Whether to attempt a calculation of the imported cell range prior to import |  [optional] |
|**password** | **String** | If specified will be used as the password used for password protected workbooks |  [optional] |
|**worksheet** | **String** | The worksheet containing the cell range to import (name or index, will default to first) |  [optional] |
|**rangeOrTable** | **String** | The cell range to import as either a specified range or a table name |  [optional] |
|**ignoreInvalidCells** | **Boolean** | If specified cells which can not be successfully converted to the target type will be ignored |  [optional] |
|**ignoreBlankRows** | **Boolean** | If the entire rows has only blank cells it will be ignored will be ignored |  [optional] |



[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)


