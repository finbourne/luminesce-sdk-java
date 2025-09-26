# com.finbourne.luminesce.model.ViewParameter
Parameters of view

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**name** | **String** | Name of the provider | [default to String]
**dataType** | [**DataType**](DataType.md) |  | [default to DataType]
**value** | **String** | Value of the provider | [default to String]
**isTableDataMandatory** | **Boolean** | Should this be selected? False would imply it is only being filtered on. Ignored when Aggregations are present | [optional] [default to Boolean]
**description** | **String** | Description of the parameter | [optional] [default to String]

```java
import com.finbourne.luminesce.model.ViewParameter;
import java.util.*;
import java.lang.System;
import java.net.URI;

String Name = "example Name";
DataType String Value = "example Value";
Boolean IsTableDataMandatory = true;
@jakarta.annotation.Nullable String Description = "example Description";


ViewParameter viewParameterInstance = new ViewParameter()
    .Name(Name)
    .DataType(DataType)
    .Value(Value)
    .IsTableDataMandatory(IsTableDataMandatory)
    .Description(Description);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
