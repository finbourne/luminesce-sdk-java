# com.finbourne.luminesce.model.CaseStatementDesign
Representation of the selected field and a list of: filter, source, and target.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**selectedField** | **String** | Selected field in the SQL query. | [optional] [default to String]
**caseStatementItems** | [**List&lt;CaseStatementItem&gt;**](CaseStatementItem.md) | A list containing the filter, source, and target. | [optional] [default to List<CaseStatementItem>]

```java
import com.finbourne.luminesce.model.CaseStatementDesign;
import java.util.*;
import java.lang.System;
import java.net.URI;

@jakarta.annotation.Nullable String SelectedField = "example SelectedField";
@jakarta.annotation.Nullable List<CaseStatementItem> CaseStatementItems = new List<CaseStatementItem>();


CaseStatementDesign caseStatementDesignInstance = new CaseStatementDesign()
    .SelectedField(SelectedField)
    .CaseStatementItems(CaseStatementItems);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
