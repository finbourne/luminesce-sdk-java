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

```java
import com.finbourne.luminesce.model.LusidGridData;
import java.util.*;
import java.lang.System;
import java.net.URI;

TableView LusidGridDesign = new TableView();
ResourceId ResourceId = new ResourceId();
DashboardType @jakarta.annotation.Nullable Boolean UseSettleDate = true;
DateParameters Dates = new DateParameters();


LusidGridData lusidGridDataInstance = new LusidGridData()
    .LusidGridDesign(LusidGridDesign)
    .ResourceId(ResourceId)
    .DashboardType(DashboardType)
    .UseSettleDate(UseSettleDate)
    .Dates(Dates);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
