# com.finbourne.luminesce.model.ExpressionWithAlias
Contract for an expression of data we \"have\" that we may \"want to map to a table-parameter's column\"

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**expression** | **String** | Expression (column name, constant, complex expression, etc.) | [default to String]
**alias** | **String** | Column Alias for the expression | [optional] [default to String]
**flags** | [**MappingFlags**](MappingFlags.md) |  | [optional] [default to MappingFlags]

```java
import com.finbourne.luminesce.model.ExpressionWithAlias;
import java.util.*;
import java.lang.System;
import java.net.URI;

String Expression = "example Expression";
@jakarta.annotation.Nullable String Alias = "example Alias";
MappingFlags 

ExpressionWithAlias expressionWithAliasInstance = new ExpressionWithAlias()
    .Expression(Expression)
    .Alias(Alias)
    .Flags(Flags);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
