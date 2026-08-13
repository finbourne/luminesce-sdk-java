# com.finbourne.luminesce.model.ExportType
The types of Exporting capable of being delivered by the WebAPI. Similar but not identical to <seealso cref=\"T:Finbourne.Honeycomb.Api.Hosting.Exporting.OutputType\" />

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ExportType** | [**String**](.md) | **The types of Exporting capable of being delivered by the WebAPI. Similar but not identical to &lt;seealso cref&#x3D;\&quot;T:Finbourne.Honeycomb.Api.Hosting.Exporting.OutputType\&quot; /&gt;** | [default to String]

```java
import com.finbourne.luminesce.model.ExportType;
import java.util.*;
import java.lang.System;
import java.net.URI;

// Example usage of ExportType:
ExportType method = ExportType.CSV;
ExportType method = ExportType.PIPE;
ExportType method = ExportType.EXCEL;
ExportType method = ExportType.JSON;
ExportType method = ExportType.JSONPROPER;
ExportType method = ExportType.XML;
ExportType method = ExportType.PARQUET;
ExportType method = ExportType.SQLITE;
ExportType method = ExportType.TABLEINTERNAL;
ExportType method = ExportType.JSONPROPERWITHLINEAGE;
ExportType method = ExportType.PDF;
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
