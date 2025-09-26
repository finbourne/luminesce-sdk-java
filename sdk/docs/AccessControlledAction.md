# com.finbourne.luminesce.model.AccessControlledAction

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**description** | **String** |  | [optional] [default to String]
**action** | [**ActionId**](ActionId.md) |  | [optional] [default to ActionId]
**limitedSet** | [**List&lt;IdSelectorDefinition&gt;**](IdSelectorDefinition.md) |  | [optional] [default to List<IdSelectorDefinition>]

```java
import com.finbourne.luminesce.model.AccessControlledAction;
import java.util.*;
import java.lang.System;
import java.net.URI;

@jakarta.annotation.Nullable String Description = "example Description";
ActionId Action = new ActionId();
@jakarta.annotation.Nullable List<IdSelectorDefinition> LimitedSet = new List<IdSelectorDefinition>();


AccessControlledAction accessControlledActionInstance = new AccessControlledAction()
    .Description(Description)
    .Action(Action)
    .LimitedSet(LimitedSet);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
