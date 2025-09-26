# com.finbourne.luminesce.model.OnClauseTermDesign
A single on clause term (a pair of columns to join or a column to filter on)

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**leftTableField** | **String** | Name of field in the left table to join to (complex expressions are not supported at this time) | [optional] [default to String]
**rightTableField** | **String** | Name of field in the left table to join to (complex expressions are not supported at this time) | [optional] [default to String]
**operator** | [**QueryDesignerBinaryOperator**](QueryDesignerBinaryOperator.md) |  | [default to QueryDesignerBinaryOperator]
**filterValue** | **String** | The value to compare against (always as a string, but will be formatted to the correct type) | [optional] [default to String]
**filterValueDataType** | [**DataType**](DataType.md) |  | [optional] [default to DataType]

```java
import com.finbourne.luminesce.model.OnClauseTermDesign;
import java.util.*;
import java.lang.System;
import java.net.URI;

@jakarta.annotation.Nullable String LeftTableField = "example LeftTableField";
@jakarta.annotation.Nullable String RightTableField = "example RightTableField";
QueryDesignerBinaryOperator @jakarta.annotation.Nullable String FilterValue = "example FilterValue";
DataType 

OnClauseTermDesign onClauseTermDesignInstance = new OnClauseTermDesign()
    .LeftTableField(LeftTableField)
    .RightTableField(RightTableField)
    .Operator(Operator)
    .FilterValue(FilterValue)
    .FilterValueDataType(FilterValueDataType);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
