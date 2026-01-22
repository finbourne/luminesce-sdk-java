# com.finbourne.luminesce.model.LusidGridData
Representation of the data we will get from the dashboard

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**lusidGridDesign** | [**TableView**](TableView.md) |  | [default to TableView]
**resourceId** | [**ResourceId**](ResourceId.md) |  | [default to ResourceId]
**dashboardType** | [**DashboardType**](DashboardType.md) |  | [optional] [default to DashboardType]
**useSettleDate** | **Boolean** | Whether to use the Settlement date or the Transaction date | [optional] [default to Boolean]
**dates** | [**DateParameters**](DateParameters.md) |  | [optional] [default to DateParameters]
**recipe** | **String** | The recipe to use for valuations | [optional] [default to String]
**currency** | **String** | The currency to use for valuations | [optional] [default to String]
**tenor** | **String** | The tenor to use for valuations | [optional] [default to String]
**orderFlow** | **String** | Type of order flow to include | [optional] [default to String]

```java
import com.finbourne.luminesce.model.LusidGridData;
import java.util.*;
import java.lang.System;
import java.net.URI;

TableView LusidGridDesign = new TableView();
ResourceId ResourceId = new ResourceId();
DashboardType @jakarta.annotation.Nullable Boolean UseSettleDate = true;
DateParameters Dates = new DateParameters();
@jakarta.annotation.Nullable String Recipe = "example Recipe";
@jakarta.annotation.Nullable String Currency = "example Currency";
@jakarta.annotation.Nullable String Tenor = "example Tenor";
@jakarta.annotation.Nullable String OrderFlow = "example OrderFlow";


LusidGridData lusidGridDataInstance = new LusidGridData()
    .LusidGridDesign(LusidGridDesign)
    .ResourceId(ResourceId)
    .DashboardType(DashboardType)
    .UseSettleDate(UseSettleDate)
    .Dates(Dates)
    .Recipe(Recipe)
    .Currency(Currency)
    .Tenor(Tenor)
    .OrderFlow(OrderFlow);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
