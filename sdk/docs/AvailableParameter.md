# com.finbourne.luminesce.model.AvailableParameter
Information about a field that can be designed on (regardless if it currently is) Kind of a \"mini-available catalog entry\"

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**providerName** | **String** | Name of the Provider with a TableParameter | [default to String]
**parameterName** | **String** | Name of the TableParameter on the Provider | [default to String]
**fields** | [**List&lt;MappableField&gt;**](MappableField.md) | Fields that can be mapped to | [default to List<MappableField>]

```java
import com.finbourne.luminesce.model.AvailableParameter;
import java.util.*;
import java.lang.System;
import java.net.URI;

String ProviderName = "example ProviderName";
String ParameterName = "example ParameterName";
List<MappableField> Fields = new List<MappableField>();


AvailableParameter availableParameterInstance = new AvailableParameter()
    .ProviderName(ProviderName)
    .ParameterName(ParameterName)
    .Fields(Fields);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
