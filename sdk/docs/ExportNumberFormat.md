# com.finbourne.luminesce.model.ExportNumberFormat

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**minDecimals** | **Integer** |  | [optional] [default to Integer]
**maxDecimals** | **Integer** |  | [optional] [default to Integer]
**thousandSeparator** | **Boolean** |  | [optional] [default to Boolean]
**displayAsPercentage** | **Boolean** |  | [optional] [default to Boolean]
**negativeNumberFormat** | [**ExportNegativeNumberFormat**](ExportNegativeNumberFormat.md) |  | [optional] [default to ExportNegativeNumberFormat]
**excelFormat** | **String** |  | [optional] [default to String]

```java
import com.finbourne.luminesce.model.ExportNumberFormat;
import java.util.*;
import java.lang.System;
import java.net.URI;

@jakarta.annotation.Nullable Integer MinDecimals = new Integer("100.00");
@jakarta.annotation.Nullable Integer MaxDecimals = new Integer("100.00");
Boolean ThousandSeparator = true;
Boolean DisplayAsPercentage = true;
ExportNegativeNumberFormat @jakarta.annotation.Nullable String ExcelFormat = "example ExcelFormat";


ExportNumberFormat exportNumberFormatInstance = new ExportNumberFormat()
    .MinDecimals(MinDecimals)
    .MaxDecimals(MaxDecimals)
    .ThousandSeparator(ThousandSeparator)
    .DisplayAsPercentage(DisplayAsPercentage)
    .NegativeNumberFormat(NegativeNumberFormat)
    .ExcelFormat(ExcelFormat);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
