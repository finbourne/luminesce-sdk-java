# com.finbourne.luminesce.model.TableView
Representation of the table structure

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**headerNames** | **Map&lt;String, String&gt;** | Mapping of column ids to aliases | [default to Map<String, String>]
**columnState** | [**List&lt;ColumnStateType&gt;**](ColumnStateType.md) | Array of all columns in the dashboard | [default to List<ColumnStateType>]
**filters** | [**Map&lt;String, FilterModel&gt;**](FilterModel.md) | Filters applied to columns in the dashboard | [optional] [default to Map<String, FilterModel>]
**meta** | [**TableMeta**](TableMeta.md) |  | [default to TableMeta]

```java
import com.finbourne.luminesce.model.TableView;
import java.util.*;
import java.lang.System;
import java.net.URI;

Map<String, String> HeaderNames = new Map<String, String>();
List<ColumnStateType> ColumnState = new List<ColumnStateType>();
@jakarta.annotation.Nullable Map<String, FilterModel> Filters = new Map<String, FilterModel>();
TableMeta Meta = new TableMeta();


TableView tableViewInstance = new TableView()
    .HeaderNames(HeaderNames)
    .ColumnState(ColumnState)
    .Filters(Filters)
    .Meta(Meta);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
