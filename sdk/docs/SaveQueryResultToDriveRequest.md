# com.finbourne.luminesce.model.SaveQueryResultToDriveRequest
Where (and how) to save the results of a background query to Drive: the body equivalent of the query parameters of `GET api/SqlBackground/{executionId}/drive`.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**driveLocationAndFileName** | **String** | Location and file name within Drive where this should be saved to. Missing paths will be created, and extension (if given) will be ignored and inferred from the chosen format. | [default to String]
**mayOverwrite** | **Boolean** | If there is an existing file at the requested location with the same name should this be overridden, or an error returned? False by default. | [optional] [default to Boolean]
**format** | [**ExportType**](ExportType.md) |  | [optional] [default to ExportType]
**driveTemplateLocation** | **String** | Drive path and full file name including extension to be used for the export. Only some export types support templates, such as Excel and Pdf, and this will need to match the format type, if given. | [optional] [default to String]
**tableNameReference** | **String** | What should the &#39;exported table name&#39; be. Defaults to &#39;Results&#39;. This has different meaning for different export types. | [optional] [default to String]
**sortBy** | **String** | Order the results by these fields. Use the &#x60;-&#x60; sign to denote descending order, e.g. &#x60;-MyFieldName&#x60;. Numeric indexes may be used also, e.g. &#x60;2,-3&#x60;. Multiple fields can be denoted by a comma e.g. &#x60;-MyFieldName,AnotherFieldName,-AFurtherFieldName&#x60;. Default is null, the sort order specified in the query itself. | [optional] [default to String]
**filter** | **String** | Further limits the fetched results beyond that of the original query. - An ODATA filter per Finbourne.Filtering syntax, e.g. &#x60;SomeField eq &#39;Hello&#39;&#x60; - may be combined with &#x60;sqlFilter&#x60;. | [optional] [default to String]
**sqlFilter** | **String** | Further limits the fetched results beyond that of the original query. - Raw SQL for filtering, e.g. &#x60;strftime(&#39;%Y-%m&#39;, SomeDateField) &#x3D; &#39;2026-06&#39;&#x60; - may be combined with &#x60;filter&#x60; while supporting additional syntax that cannot. | [optional] [default to String]
**select** | **String** | Default is null (meaning return all columns in the original query itself). The values are in terms of the result column name from the original data set and are comma delimited, and may aggregate the data, e.g. &#x60;some_field, count(*) as a, max(x) as b&#x60; (where &#x60;groupBy&#x60; would likely be &#x60;1&#x60;). | [optional] [default to String]
**groupBy** | **String** | Groups by the specified fields: a comma delimited list of 1 based numeric indexes into &#x60;select&#x60;, or repeats of its expressions. Default is null (meaning no grouping will be performed on the selected columns). | [optional] [default to String]
**dateTimeFormat** | **String** | Format to apply for DateTime data, leaving blank gives the Luminesce Exporter default, currently &#x60;yyyy-MM-dd HH:mm:ss.fff&#x60; | [optional] [default to String]
**loadWaitMilliseconds** | **Integer** | Optional maximum additional wait period for post execution platform processing. | [optional] [default to Integer]
**formatting** | [**ExportFormatting**](ExportFormatting.md) |  | [optional] [default to ExportFormatting]

```java
import com.finbourne.luminesce.model.SaveQueryResultToDriveRequest;
import java.util.*;
import java.lang.System;
import java.net.URI;

String DriveLocationAndFileName = "example DriveLocationAndFileName";
Boolean MayOverwrite = true;
ExportType @jakarta.annotation.Nullable String DriveTemplateLocation = "example DriveTemplateLocation";
@jakarta.annotation.Nullable String TableNameReference = "example TableNameReference";
@jakarta.annotation.Nullable String SortBy = "example SortBy";
@jakarta.annotation.Nullable String Filter = "example Filter";
@jakarta.annotation.Nullable String SqlFilter = "example SqlFilter";
@jakarta.annotation.Nullable String Select = "example Select";
@jakarta.annotation.Nullable String GroupBy = "example GroupBy";
@jakarta.annotation.Nullable String DateTimeFormat = "example DateTimeFormat";
Integer LoadWaitMilliseconds = new Integer("100.00");
ExportFormatting Formatting = new ExportFormatting();


SaveQueryResultToDriveRequest saveQueryResultToDriveRequestInstance = new SaveQueryResultToDriveRequest()
    .DriveLocationAndFileName(DriveLocationAndFileName)
    .MayOverwrite(MayOverwrite)
    .Format(Format)
    .DriveTemplateLocation(DriveTemplateLocation)
    .TableNameReference(TableNameReference)
    .SortBy(SortBy)
    .Filter(Filter)
    .SqlFilter(SqlFilter)
    .Select(Select)
    .GroupBy(GroupBy)
    .DateTimeFormat(DateTimeFormat)
    .LoadWaitMilliseconds(LoadWaitMilliseconds)
    .Formatting(Formatting);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
