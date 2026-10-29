# com.finbourne.luminesce.model.CustomMultiQueryExport
Where (and how) to save the results of a custom multi-query to Drive, as one file, once its queries are done: the same as calling `api/MultiQueryBackground/{executionId}/drive` then, which may still be called as often as wanted.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**driveLocationAndFileName** | **String** | Location and file name within Drive to save to. Missing paths will be created, and extension (if given) will be ignored and inferred from the format (zip where several results are zipped). May contain the placeholders &#x60;{executionId}&#x60;, &#x60;{date:format}&#x60; (when the queries started, UTC, e.g. &#x60;{date:yyyyMMdd}&#x60;) and &#x60;{param:name}&#x60; (the value of a scalar parameter). | [optional] [default to String]
**format** | [**ExportType**](ExportType.md) |  | [optional] [default to ExportType]
**mayOverwrite** | **Boolean** | If there is an existing file at the location with the same name should it be overwritten (rather than the export failing)? False by default. | [optional] [default to Boolean]
**driveTemplateLocation** | **String** | Drive path and full file name including extension of a template to export with. Only Excel and Pdf exports support templates. | [optional] [default to String]
**dateTimeFormat** | **String** | Format to apply for DateTime data, leaving blank gives the Luminesce Exporter default, currently &#x60;yyyy-MM-dd HH:mm:ss.fff&#x60; | [optional] [default to String]
**whenSomeFail** | **Boolean** | Should the results of the queries that succeeded still be saved when others did not? False by default, meaning nothing is saved then. Either way the multi-query as a whole is reported as failed. | [optional] [default to Boolean]

```java
import com.finbourne.luminesce.model.CustomMultiQueryExport;
import java.util.*;
import java.lang.System;
import java.net.URI;

@jakarta.annotation.Nullable String DriveLocationAndFileName = "example DriveLocationAndFileName";
ExportType @jakarta.annotation.Nullable Boolean MayOverwrite = true;
@jakarta.annotation.Nullable String DriveTemplateLocation = "example DriveTemplateLocation";
@jakarta.annotation.Nullable String DateTimeFormat = "example DateTimeFormat";
@jakarta.annotation.Nullable Boolean WhenSomeFail = true;


CustomMultiQueryExport customMultiQueryExportInstance = new CustomMultiQueryExport()
    .DriveLocationAndFileName(DriveLocationAndFileName)
    .Format(Format)
    .MayOverwrite(MayOverwrite)
    .DriveTemplateLocation(DriveTemplateLocation)
    .DateTimeFormat(DateTimeFormat)
    .WhenSomeFail(WhenSomeFail);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
