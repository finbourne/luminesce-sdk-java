# com.finbourne.luminesce.model.OrderByTermDesign
A single clause within an Order BY

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**field** | **String** | Name of the field to order by | [default to String]
**direction** | [**OrderByDirection**](OrderByDirection.md) |  | [optional] [default to OrderByDirection]
**tableAlias** | **String** | Table Alias of the field to order by | [optional] [default to String]

```java
import com.finbourne.luminesce.model.OrderByTermDesign;
import java.util.*;
import java.lang.System;
import java.net.URI;

String Field = "example Field";
OrderByDirection @jakarta.annotation.Nullable String TableAlias = "example TableAlias";


OrderByTermDesign orderByTermDesignInstance = new OrderByTermDesign()
    .Field(Field)
    .Direction(Direction)
    .TableAlias(TableAlias);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
