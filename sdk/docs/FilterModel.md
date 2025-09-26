# com.finbourne.luminesce.model.FilterModel
Representation of the data used in a filter for the where clause

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**filterType** | [**FilterType**](FilterType.md) |  | [default to FilterType]
**type** | [**Type**](Type.md) |  | [optional] [default to Type]
**filter** | **String** | The filter value | [optional] [default to String]
**filterTo** | **java.math.BigDecimal** | The upper bound filter value for the number filter type | [optional] [default to java.math.BigDecimal]
**values** | **List&lt;String&gt;** | An array of possible values for the set filter type | [optional] [default to List<String>]
**dateFrom** | **String** | A lower bound date for the date filter type | [optional] [default to String]
**dateTo** | **String** | An upper bound date for the date filter type | [optional] [default to String]

```java
import com.finbourne.luminesce.model.FilterModel;
import java.util.*;
import java.lang.System;
import java.net.URI;

FilterType Type @jakarta.annotation.Nullable String Filter = "example Filter";
@jakarta.annotation.Nullable java.math.BigDecimal FilterTo = new java.math.BigDecimal("100.00");
@jakarta.annotation.Nullable List<String> Values = new List<String>();
@jakarta.annotation.Nullable String DateFrom = "example DateFrom";
@jakarta.annotation.Nullable String DateTo = "example DateTo";


FilterModel filterModelInstance = new FilterModel()
    .FilterType(FilterType)
    .Type(Type)
    .Filter(Filter)
    .FilterTo(FilterTo)
    .Values(Values)
    .DateFrom(DateFrom)
    .DateTo(DateTo);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
