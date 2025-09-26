# com.finbourne.luminesce.model.FieldDesign
Treatment of a single field within a QueryDesign

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**name** | **String** | Name of the Field (column name, constant, complex expression, etc.) | [default to String]
**tableAlias** | **String** | Alias of the Table the field belongs to | [optional] [default to String]
**alias** | **String** | Alias if any (if none the Name is used) | [optional] [default to String]
**dataType** | [**DataType**](DataType.md) |  | [optional] [default to DataType]
**shouldSelect** | **Boolean** | Should this be selected? False would imply it is only being filtered on. Ignored when Aggregations are present | [optional] [default to Boolean]
**filters** | [**List&lt;FilterTermDesign&gt;**](FilterTermDesign.md) | Filter clauses to apply to this field (And&#39;ed together) | [optional] [default to List<FilterTermDesign>]
**aggregations** | [**List&lt;Aggregation&gt;**](Aggregation.md) | Aggregations to apply (as opposed to simply selecting) | [optional] [default to List<Aggregation>]
**isExpression** | **Boolean** | Is this field an expression | [optional] [default to Boolean]

```java
import com.finbourne.luminesce.model.FieldDesign;
import java.util.*;
import java.lang.System;
import java.net.URI;

String Name = "example Name";
@jakarta.annotation.Nullable String TableAlias = "example TableAlias";
@jakarta.annotation.Nullable String Alias = "example Alias";
DataType Boolean ShouldSelect = true;
@jakarta.annotation.Nullable List<FilterTermDesign> Filters = new List<FilterTermDesign>();
@jakarta.annotation.Nullable List<Aggregation> Aggregations = new List<Aggregation>();
Boolean IsExpression = true;


FieldDesign fieldDesignInstance = new FieldDesign()
    .Name(Name)
    .TableAlias(TableAlias)
    .Alias(Alias)
    .DataType(DataType)
    .ShouldSelect(ShouldSelect)
    .Filters(Filters)
    .Aggregations(Aggregations)
    .IsExpression(IsExpression);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
