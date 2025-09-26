# com.finbourne.luminesce.model.DateParameters
Collection of date parameters used in dashboards

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**dateFrom** | [**OffsetDateTime**](OffsetDateTime.md) | Parameter to determine the lower bound in a date range | [optional] [default to OffsetDateTime]
**dateTo** | [**OffsetDateTime**](OffsetDateTime.md) | Parameter to determine the upper bound in a date range | [optional] [default to OffsetDateTime]
**effectiveAt** | [**OffsetDateTime**](OffsetDateTime.md) | EffectiveAt of the dashboard | [optional] [default to OffsetDateTime]
**asAt** | [**OffsetDateTime**](OffsetDateTime.md) | AsAt of the dashboard | [default to OffsetDateTime]

```java
import com.finbourne.luminesce.model.DateParameters;
import java.util.*;
import java.lang.System;
import java.net.URI;

@jakarta.annotation.Nullable OffsetDateTime DateFrom = OffsetDateTime.now();
@jakarta.annotation.Nullable OffsetDateTime DateTo = OffsetDateTime.now();
@jakarta.annotation.Nullable OffsetDateTime EffectiveAt = OffsetDateTime.now();
OffsetDateTime AsAt = OffsetDateTime.now();


DateParameters dateParametersInstance = new DateParameters()
    .DateFrom(DateFrom)
    .DateTo(DateTo)
    .EffectiveAt(EffectiveAt)
    .AsAt(AsAt);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
