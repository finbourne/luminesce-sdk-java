# com.finbourne.luminesce.model.TableLineage

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**columnLineage** | [**List&lt;Lineage&gt;**](Lineage.md) |  | [optional] [default to List<Lineage>]
**rowLineage** | [**Lineage**](Lineage.md) |  | [optional] [default to Lineage]
**failureReason** | **String** |  | [optional] [default to String]

```java
import com.finbourne.luminesce.model.TableLineage;
import java.util.*;
import java.lang.System;
import java.net.URI;

@jakarta.annotation.Nullable List<Lineage> ColumnLineage = new List<Lineage>();
Lineage RowLineage = new Lineage();
@jakarta.annotation.Nullable String FailureReason = "example FailureReason";


TableLineage tableLineageInstance = new TableLineage()
    .ColumnLineage(ColumnLineage)
    .RowLineage(RowLineage)
    .FailureReason(FailureReason);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
