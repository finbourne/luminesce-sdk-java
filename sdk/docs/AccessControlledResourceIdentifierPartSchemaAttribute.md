# com.finbourne.luminesce.model.AccessControlledResourceIdentifierPartSchemaAttribute

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**index** | **Integer** |  | [optional] [default to Integer]
**name** | **String** |  | [optional] [default to String]
**displayName** | **String** |  | [optional] [default to String]
**description** | **String** |  | [optional] [default to String]
**required** | **Boolean** |  | [optional] [default to Boolean]
**valuesPath** | **String** |  | [optional] [default to String]
**typeId** | **Object** |  | [optional] [readonly] [default to Object]

```java
import com.finbourne.luminesce.model.AccessControlledResourceIdentifierPartSchemaAttribute;
import java.util.*;
import java.lang.System;
import java.net.URI;

Integer Index = new Integer("100.00");
@jakarta.annotation.Nullable String Name = "example Name";
@jakarta.annotation.Nullable String DisplayName = "example DisplayName";
@jakarta.annotation.Nullable String Description = "example Description";
Boolean Required = true;
@jakarta.annotation.Nullable String ValuesPath = "example ValuesPath";
@jakarta.annotation.Nullable Object 

AccessControlledResourceIdentifierPartSchemaAttribute accessControlledResourceIdentifierPartSchemaAttributeInstance = new AccessControlledResourceIdentifierPartSchemaAttribute()
    .Index(Index)
    .Name(Name)
    .DisplayName(DisplayName)
    .Description(Description)
    .Required(Required)
    .ValuesPath(ValuesPath)
    .TypeId(TypeId);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
