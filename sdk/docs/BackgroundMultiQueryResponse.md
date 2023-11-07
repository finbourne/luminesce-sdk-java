

# BackgroundMultiQueryResponse


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**executionId** | **UUID** |  |  [optional] [readonly] |
|**progress** | [**Link**](Link.md) |  |  [optional] |
|**cancel** | [**Link**](Link.md) |  |  [optional] |
|**fetchJson** | [**List&lt;Link&gt;**](Link.md) | Json (as a string) data request links for all of the child queries |  [optional] [readonly] |
|**fetchJsonProper** | [**List&lt;Link&gt;**](Link.md) | Json-proper data request links for all of the child queries |  [optional] [readonly] |
|**fetchXml** | [**List&lt;Link&gt;**](Link.md) | Xml data request links for all of the child queries |  [optional] [readonly] |
|**fetchParquet** | [**List&lt;Link&gt;**](Link.md) | Parquet data request links for all of the child queries |  [optional] [readonly] |
|**fetchCsv** | [**List&lt;Link&gt;**](Link.md) | CSV data request links for all of the child queries |  [optional] [readonly] |
|**fetchPipe** | [**List&lt;Link&gt;**](Link.md) | Pipe delimited data request links for all of the child queries |  [optional] [readonly] |
|**fetchExcel** | [**List&lt;Link&gt;**](Link.md) | Excel workbook data request links for all of the child queries |  [optional] [readonly] |
|**fetchSqlite** | [**List&lt;Link&gt;**](Link.md) | SqLite DB data request links for all of the child queries |  [optional] [readonly] |
|**histogram** | [**List&lt;Link&gt;**](Link.md) | Histogram links for all of the child queries |  [optional] [readonly] |



