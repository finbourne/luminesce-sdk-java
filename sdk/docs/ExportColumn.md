# com.finbourne.luminesce.model.ExportColumn

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**colId** | **String** |  | [default to String]
**header** | **String** |  | [optional] [default to String]
**dataType** | [**ExportColumnDataType**](ExportColumnDataType.md) |  | [optional] [default to ExportColumnDataType]
**hidden** | **Boolean** |  | [optional] [default to Boolean]
**wrapText** | **Boolean** |  | [optional] [default to Boolean]
**columnColor** | [**ExportColumnColor**](ExportColumnColor.md) |  | [optional] [default to ExportColumnColor]
**number** | [**ExportNumberFormat**](ExportNumberFormat.md) |  | [optional] [default to ExportNumberFormat]
**date** | [**ExportDateFormat**](ExportDateFormat.md) |  | [optional] [default to ExportDateFormat]
**conditionalRules** | [**List&lt;ExportConditionalRule&gt;**](ExportConditionalRule.md) |  | [optional] [default to List<ExportConditionalRule>]

```java
import com.finbourne.luminesce.model.ExportColumn;
import java.util.*;
import java.lang.System;
import java.net.URI;

String ColId = "example ColId";
@jakarta.annotation.Nullable String Header = "example Header";
ExportColumnDataType Boolean Hidden = true;
Boolean WrapText = true;
ExportColumnColor ColumnColor = new ExportColumnColor();
ExportNumberFormat Number = new ExportNumberFormat();
ExportDateFormat Date = new ExportDateFormat();
@jakarta.annotation.Nullable List<ExportConditionalRule> ConditionalRules = new List<ExportConditionalRule>();


ExportColumn exportColumnInstance = new ExportColumn()
    .ColId(ColId)
    .Header(Header)
    .DataType(DataType)
    .Hidden(Hidden)
    .WrapText(WrapText)
    .ColumnColor(ColumnColor)
    .Number(Number)
    .Date(Date)
    .ConditionalRules(ConditionalRules);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
