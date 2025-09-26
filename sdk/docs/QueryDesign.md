# com.finbourne.luminesce.model.QueryDesign
Representation of a \"designable Query\" suitable for formatting to SQL or being built from compliant SQL.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**tableName** | **String** | Name of the table being designed | [default to String]
**alias** | **String** | Alias for the table in the generated SQL, if any | [optional] [default to String]
**fields** | [**List&lt;FieldDesign&gt;**](FieldDesign.md) | Fields to be selected, aggregated over and/or filtered on | [default to List<FieldDesign>]
**joinedTables** | [**List&lt;JoinedTableDesign&gt;**](JoinedTableDesign.md) | Joined in table to the main TableName / Alias | [optional] [default to List<JoinedTableDesign>]
**orderBy** | [**List&lt;OrderByTermDesign&gt;**](OrderByTermDesign.md) | Order By clauses to apply | [optional] [default to List<OrderByTermDesign>]
**limit** | **Integer** | Row limit to apply, if any | [optional] [default to Integer]
**offset** | **Integer** | Row offset to apply, if any | [optional] [default to Integer]
**warnings** | **List&lt;String&gt;** | Any warnings to show the user when converting from SQL to this representation | [optional] [default to List<String>]
**availableFields** | [**List&lt;AvailableField&gt;**](AvailableField.md) | Fields that are known to be available for design when parsing SQL | [optional] [default to List<AvailableField>]

```java
import com.finbourne.luminesce.model.QueryDesign;
import java.util.*;
import java.lang.System;
import java.net.URI;

String TableName = "example TableName";
@jakarta.annotation.Nullable String Alias = "example Alias";
List<FieldDesign> Fields = new List<FieldDesign>();
@jakarta.annotation.Nullable List<JoinedTableDesign> JoinedTables = new List<JoinedTableDesign>();
@jakarta.annotation.Nullable List<OrderByTermDesign> OrderBy = new List<OrderByTermDesign>();
@jakarta.annotation.Nullable Integer Limit = new Integer("100.00");
@jakarta.annotation.Nullable Integer Offset = new Integer("100.00");
@jakarta.annotation.Nullable List<String> Warnings = new List<String>();
@jakarta.annotation.Nullable List<AvailableField> AvailableFields = new List<AvailableField>();


QueryDesign queryDesignInstance = new QueryDesign()
    .TableName(TableName)
    .Alias(Alias)
    .Fields(Fields)
    .JoinedTables(JoinedTables)
    .OrderBy(OrderBy)
    .Limit(Limit)
    .Offset(Offset)
    .Warnings(Warnings)
    .AvailableFields(AvailableFields);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
