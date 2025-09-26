# com.finbourne.luminesce.model.InlinedPropertyDesign
Representation of a set of inlined properties for a given provider so that SQL can be generated to be able to inline properties into luminesce

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**providerName** | **String** | The provider name for which these properties are to be inlined | [optional] [default to String]
**providerNameExtension** | **String** | The provider extension name for extended providers | [optional] [default to String]
**inlinedPropertyItems** | [**List&lt;InlinedPropertyItem&gt;**](InlinedPropertyItem.md) | Collection of Inlined properties | [optional] [default to List<InlinedPropertyItem>]

```java
import com.finbourne.luminesce.model.InlinedPropertyDesign;
import java.util.*;
import java.lang.System;
import java.net.URI;

@jakarta.annotation.Nullable String ProviderName = "example ProviderName";
@jakarta.annotation.Nullable String ProviderNameExtension = "example ProviderNameExtension";
@jakarta.annotation.Nullable List<InlinedPropertyItem> InlinedPropertyItems = new List<InlinedPropertyItem>();


InlinedPropertyDesign inlinedPropertyDesignInstance = new InlinedPropertyDesign()
    .ProviderName(ProviderName)
    .ProviderNameExtension(ProviderNameExtension)
    .InlinedPropertyItems(InlinedPropertyItems);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
