# com.finbourne.luminesce.model.ExportConditionalRule

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**operator** | [**ExportRuleOperator**](ExportRuleOperator.md) |  | [default to ExportRuleOperator]
**value** | **String** |  | [optional] [default to String]
**valueTo** | **String** |  | [optional] [default to String]
**valueColumn** | **String** |  | [optional] [default to String]
**valueToColumn** | **String** |  | [optional] [default to String]
**sourceColumn** | **String** |  | [optional] [default to String]
**effect** | [**ExportRuleEffect**](ExportRuleEffect.md) |  | [default to ExportRuleEffect]
**color** | [**ExportRuleColor**](ExportRuleColor.md) |  | [optional] [default to ExportRuleColor]
**hex** | **String** |  | [optional] [default to String]
**text** | **String** |  | [optional] [default to String]
**format** | **String** |  | [optional] [default to String]
**includeAggregates** | **Boolean** |  | [optional] [default to Boolean]

```java
import com.finbourne.luminesce.model.ExportConditionalRule;
import java.util.*;
import java.lang.System;
import java.net.URI;

ExportRuleOperator @jakarta.annotation.Nullable String Value = "example Value";
@jakarta.annotation.Nullable String ValueTo = "example ValueTo";
@jakarta.annotation.Nullable String ValueColumn = "example ValueColumn";
@jakarta.annotation.Nullable String ValueToColumn = "example ValueToColumn";
@jakarta.annotation.Nullable String SourceColumn = "example SourceColumn";
ExportRuleEffect ExportRuleColor @jakarta.annotation.Nullable String Hex = "example Hex";
@jakarta.annotation.Nullable String Text = "example Text";
@jakarta.annotation.Nullable String Format = "example Format";
Boolean IncludeAggregates = true;


ExportConditionalRule exportConditionalRuleInstance = new ExportConditionalRule()
    .Operator(Operator)
    .Value(Value)
    .ValueTo(ValueTo)
    .ValueColumn(ValueColumn)
    .ValueToColumn(ValueToColumn)
    .SourceColumn(SourceColumn)
    .Effect(Effect)
    .Color(Color)
    .Hex(Hex)
    .Text(Text)
    .Format(Format)
    .IncludeAggregates(IncludeAggregates);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
