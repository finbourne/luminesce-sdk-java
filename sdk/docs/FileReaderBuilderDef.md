# com.finbourne.luminesce.model.FileReaderBuilderDef
Information on how to construct a file-read sql query

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**autoDetect** | [**AutoDetectType**](AutoDetectType.md) |  | [optional] [default to AutoDetectType]
**columns** | [**List&lt;ColumnInfo&gt;**](ColumnInfo.md) | Column information for the results | [optional] [default to List<ColumnInfo>]
**limit** | **Integer** | What limit be added to the load query? Less than or equal to zero means none | [optional] [default to Integer]
**source** | [**Source**](Source.md) |  | [optional] [default to Source]
**availableSources** | [**List&lt;Source&gt;**](Source.md) | The source locations the user has access to. The provider in essence. | [optional] [default to List<Source>]
**variableName** | **String** | The name of the variable for the &#x60;use&#x60; statement | [optional] [default to String]
**filePath** | **String** | The file (or folder) path | [optional] [default to String]
**folderFilter** | **String** | The filter to apply to a folder (all matching files then being read) a RegExp | [optional] [default to String]
**zipFilter** | **String** | The filter to apply to folder structures with zip archives (all matching files then being read) a RegExp | [optional] [default to String]
**addFileName** | **Boolean** | Should a file name column be added to the output? | [optional] [default to Boolean]
**csv** | [**OptionsCsv**](OptionsCsv.md) |  | [optional] [default to OptionsCsv]
**excel** | [**OptionsExcel**](OptionsExcel.md) |  | [optional] [default to OptionsExcel]
**sqLite** | [**OptionsSqLite**](OptionsSqLite.md) |  | [optional] [default to OptionsSqLite]
**xml** | [**OptionsXml**](OptionsXml.md) |  | [optional] [default to OptionsXml]
**parquet** | [**OptionsParquet**](OptionsParquet.md) |  | [optional] [default to OptionsParquet]

```java
import com.finbourne.luminesce.model.FileReaderBuilderDef;
import java.util.*;
import java.lang.System;
import java.net.URI;

AutoDetectType @jakarta.annotation.Nullable List<ColumnInfo> Columns = new List<ColumnInfo>();
Integer Limit = new Integer("100.00");
Source Source = new Source();
@jakarta.annotation.Nullable List<Source> AvailableSources = new List<Source>();
@jakarta.annotation.Nullable String VariableName = "example VariableName";
@jakarta.annotation.Nullable String FilePath = "example FilePath";
@jakarta.annotation.Nullable String FolderFilter = "example FolderFilter";
@jakarta.annotation.Nullable String ZipFilter = "example ZipFilter";
Boolean AddFileName = true;
OptionsCsv Csv = new OptionsCsv();
OptionsExcel Excel = new OptionsExcel();
OptionsSqLite SqLite = new OptionsSqLite();
OptionsXml Xml = new OptionsXml();
OptionsParquet Parquet = new OptionsParquet();


FileReaderBuilderDef fileReaderBuilderDefInstance = new FileReaderBuilderDef()
    .AutoDetect(AutoDetect)
    .Columns(Columns)
    .Limit(Limit)
    .Source(Source)
    .AvailableSources(AvailableSources)
    .VariableName(VariableName)
    .FilePath(FilePath)
    .FolderFilter(FolderFilter)
    .ZipFilter(ZipFilter)
    .AddFileName(AddFileName)
    .Csv(Csv)
    .Excel(Excel)
    .SqLite(SqLite)
    .Xml(Xml)
    .Parquet(Parquet);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
