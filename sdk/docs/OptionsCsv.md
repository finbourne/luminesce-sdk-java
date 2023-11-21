

# OptionsCsv

Additional options applicable to the given SourceType

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**columnNames** | **String** | Column Names either overrides the header row or steps in when there is no header row (comma delimited list) |  [optional] |
|**columnNamesWanted** | **String** | Column (by Name) that should be returned (comma delimited list) |  [optional] |
|**columnTypes** | **String** | Column types (comma delimited list of: &#39;{types}&#39;, some columns may be left blank while others are specified) |  [optional] |
|**inferTypeRowCount** | **Integer** | If non-zero and &#39;types&#39; is not specified (or not specified for some columns) this will look through N rows to attempt to work out the column types for columns not pre-specified |  [optional] |
|**noHeader** | **Boolean** | Set this if there is no header row |  [optional] |
|**delimiter** | **String** | The delimiter between values (\\t for tab) |  [optional] |
|**escape** | **String** | Character used to escape the &#39;Quote&#39; character when within a value |  [optional] |
|**quote** | **String** | Character used around any field containing the &#39;delimiter&#39; or a line break. |  [optional] |
|**valuesToMakeNull** | **String** | Regex of values to map to &#39;null&#39; in the returned data. |  [optional] |
|**skipPreHeader** | **Integer** | Number of rows to ignore before the header row |  [optional] |
|**skipPostHeader** | **Integer** | Number of rows to ignore after the header row |  [optional] |
|**skipInvalidRows** | **Boolean** | Skip invalid data rows (totally invalid ones),   This also allows for potentially wrong data if it can be handled somewhat e.g. embedded quotes misused (and still returns such rows).  In either case a warning will show in the progress feedback. |  [optional] |



