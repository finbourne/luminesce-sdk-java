# com.finbourne.luminesce.model.TableExport

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**tableName** | **String** |  | [optional] [default to String]
**columns** | [**List&lt;ExportColumn&gt;**](ExportColumn.md) |  | [optional] [default to List<ExportColumn>]
**grouping** | [**ExportGrouping**](ExportGrouping.md) |  | [optional] [default to ExportGrouping]

```java
import com.finbourne.luminesce.model.TableExport;
import java.util.*;
import java.lang.System;
import java.net.URI;

@jakarta.annotation.Nullable String TableName = "example TableName";
@jakarta.annotation.Nullable List<ExportColumn> Columns = new List<ExportColumn>();
ExportGrouping Grouping = new ExportGrouping();


TableExport tableExportInstance = new TableExport()
    .TableName(TableName)
    .Columns(Columns)
    .Grouping(Grouping);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
