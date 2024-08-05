

# FileReaderBuilderDef

Information on how to construct a file-read sql query

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**autoDetect** | **AutoDetectType** |  |  [optional] |
|**columns** | [**List&lt;ColumnInfo&gt;**](ColumnInfo.md) | Column information for the results |  [optional] |
|**limit** | **Integer** | What limit be added to the load query? Less than or equal to zero means none |  [optional] |
|**source** | [**Source**](Source.md) |  |  [optional] |
|**availableSources** | [**List&lt;Source&gt;**](Source.md) | The source locations the user has access to. The provider in essence. |  [optional] |
|**variableName** | **String** | The name of the variable for the &#x60;use&#x60; statement |  [optional] |
|**filePath** | **String** | The file (or folder) path |  [optional] |
|**folderFilter** | **String** | The filter to apply to a folder (all matching files then being read) a RegExp |  [optional] |
|**zipFilter** | **String** | The filter to apply to folder structures with zip archives (all matching files then being read) a RegExp |  [optional] |
|**addFileName** | **Boolean** | Should a file name column be added to the output? |  [optional] |
|**csv** | [**OptionsCsv**](OptionsCsv.md) |  |  [optional] |
|**excel** | [**OptionsExcel**](OptionsExcel.md) |  |  [optional] |
|**sqLite** | [**OptionsSqLite**](OptionsSqLite.md) |  |  [optional] |
|**xml** | [**OptionsXml**](OptionsXml.md) |  |  [optional] |
|**parquet** | [**OptionsParquet**](OptionsParquet.md) |  |  [optional] |



[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)


