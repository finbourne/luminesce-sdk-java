# com.finbourne.luminesce.model.FilterTermDesign
A single filter clause

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**operator** | [**QueryDesignerBinaryOperator**](QueryDesignerBinaryOperator.md) |  | [default to QueryDesignerBinaryOperator]
**value** | **String** | The value to compare against (always as a string, but will be formatted to the correct type) | [default to String]

```java
import com.finbourne.luminesce.model.FilterTermDesign;
import java.util.*;
import java.lang.System;
import java.net.URI;

QueryDesignerBinaryOperator String Value = "example Value";


FilterTermDesign filterTermDesignInstance = new FilterTermDesign()
    .Operator(Operator)
    .Value(Value);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
