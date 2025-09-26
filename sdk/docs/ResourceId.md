# com.finbourne.luminesce.model.ResourceId
Unique identifier for a resource

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**scope** | **String** | The scope used to identify a resource | [default to String]
**code** | **String** | The code used to identify a resource | [optional] [default to String]

```java
import com.finbourne.luminesce.model.ResourceId;
import java.util.*;
import java.lang.System;
import java.net.URI;

String Scope = "example Scope";
@jakarta.annotation.Nullable String Code = "example Code";


ResourceId resourceIdInstance = new ResourceId()
    .Scope(Scope)
    .Code(Code);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
