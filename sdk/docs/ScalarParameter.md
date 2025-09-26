# com.finbourne.luminesce.model.ScalarParameter
Describes a scalar parameter as defined in the SQL

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**name** | **String** | Name of the scalar parameter | [default to String]
**type** | [**DataType**](DataType.md) |  | [default to DataType]
**value** | **Object** | the default value of the parameter | [optional] [default to Object]
**valueOptions** | **List&lt;Object&gt;** | Values of the parameter listed as being available for choosing from. | [optional] [default to List<Object>]
**valueMustBeFromOptions** | **Boolean** | Must Value be one of ValueOptions (if any)? | [optional] [default to Boolean]

```java
import com.finbourne.luminesce.model.ScalarParameter;
import java.util.*;
import java.lang.System;
import java.net.URI;

String Name = "example Name";
DataType @jakarta.annotation.Nullable Object @jakarta.annotation.Nullable List<Object> ValueOptions = new List<Object>();
Boolean ValueMustBeFromOptions = true;


ScalarParameter scalarParameterInstance = new ScalarParameter()
    .Name(Name)
    .Type(Type)
    .Value(Value)
    .ValueOptions(ValueOptions)
    .ValueMustBeFromOptions(ValueMustBeFromOptions);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
