# com.finbourne.luminesce.model.Source
Information leading to choosing the provider

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**location** | **String** | The source location. Start of a provider name, &#x60;Drive&#x60;, &#x60;LocalFs&#x60;, &#x60;AwsS3&#x60; etc. | [optional] [default to String]
**type** | [**SourceType**](SourceType.md) |  | [optional] [default to SourceType]

```java
import com.finbourne.luminesce.model.Source;
import java.util.*;
import java.lang.System;
import java.net.URI;

@jakarta.annotation.Nullable String Location = "example Location";
SourceType 

Source sourceInstance = new Source()
    .Location(Location)
    .Type(Type);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
