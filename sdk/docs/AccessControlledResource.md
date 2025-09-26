# com.finbourne.luminesce.model.AccessControlledResource

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**application** | **String** |  | [optional] [default to String]
**name** | **String** |  | [optional] [default to String]
**description** | **String** |  | [optional] [default to String]
**actions** | [**List&lt;AccessControlledAction&gt;**](AccessControlledAction.md) |  | [optional] [default to List<AccessControlledAction>]
**identifierParts** | [**List&lt;AccessControlledResourceIdentifierPartSchemaAttribute&gt;**](AccessControlledResourceIdentifierPartSchemaAttribute.md) |  | [optional] [default to List<AccessControlledResourceIdentifierPartSchemaAttribute>]

```java
import com.finbourne.luminesce.model.AccessControlledResource;
import java.util.*;
import java.lang.System;
import java.net.URI;

@jakarta.annotation.Nullable String Application = "example Application";
@jakarta.annotation.Nullable String Name = "example Name";
@jakarta.annotation.Nullable String Description = "example Description";
@jakarta.annotation.Nullable List<AccessControlledAction> Actions = new List<AccessControlledAction>();
@jakarta.annotation.Nullable List<AccessControlledResourceIdentifierPartSchemaAttribute> IdentifierParts = new List<AccessControlledResourceIdentifierPartSchemaAttribute>();


AccessControlledResource accessControlledResourceInstance = new AccessControlledResource()
    .Application(Application)
    .Name(Name)
    .Description(Description)
    .Actions(Actions)
    .IdentifierParts(IdentifierParts);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
