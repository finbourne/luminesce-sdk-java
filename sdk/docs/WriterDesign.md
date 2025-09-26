# com.finbourne.luminesce.model.WriterDesign
Representation of a \"designable Query for a writer\" suitable for formatting to SQL or being built from compliant SQL.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**sql** | **String** | Original SQL that started this off | [default to String]
**availableToMapFrom** | [**List&lt;ExpressionWithAlias&gt;**](ExpressionWithAlias.md) | The data able to be mapped from as derived from the Sql | [optional] [default to List<ExpressionWithAlias>]
**parameter** | [**AvailableParameter**](AvailableParameter.md) |  | [optional] [default to AvailableParameter]
**availableParameters** | [**List&lt;AvailableParameter&gt;**](AvailableParameter.md) | All the parameter the user may wish to design | [optional] [default to List<AvailableParameter>]

```java
import com.finbourne.luminesce.model.WriterDesign;
import java.util.*;
import java.lang.System;
import java.net.URI;

String Sql = "example Sql";
@jakarta.annotation.Nullable List<ExpressionWithAlias> AvailableToMapFrom = new List<ExpressionWithAlias>();
AvailableParameter Parameter = new AvailableParameter();
@jakarta.annotation.Nullable List<AvailableParameter> AvailableParameters = new List<AvailableParameter>();


WriterDesign writerDesignInstance = new WriterDesign()
    .Sql(Sql)
    .AvailableToMapFrom(AvailableToMapFrom)
    .Parameter(Parameter)
    .AvailableParameters(AvailableParameters);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
