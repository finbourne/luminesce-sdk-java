# com.finbourne.luminesce.model.Column

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**isPrimaryKey** | **Boolean** |  | [optional] [default to Boolean]
**isMain** | **Boolean** |  | [optional] [default to Boolean]
**isRequiredByProvider** | **Boolean** |  | [optional] [default to Boolean]
**mandatoryForActions** | **String** |  | [optional] [default to String]
**name** | **String** |  | [optional] [default to String]
**type** | [**DataType**](DataType.md) |  | [optional] [default to DataType]
**description** | **String** |  | [optional] [default to String]
**displayName** | **String** |  | [optional] [default to String]
**conditionUsage** | [**ConditionAttributes**](ConditionAttributes.md) |  | [optional] [default to ConditionAttributes]
**sampleValues** | **String** |  | [optional] [default to String]
**allowedValues** | **String** |  | [optional] [default to String]

```java
import com.finbourne.luminesce.model.Column;
import java.util.*;
import java.lang.System;
import java.net.URI;

Boolean IsPrimaryKey = true;
Boolean IsMain = true;
Boolean IsRequiredByProvider = true;
@jakarta.annotation.Nullable String MandatoryForActions = "example MandatoryForActions";
@jakarta.annotation.Nullable String Name = "example Name";
DataType @jakarta.annotation.Nullable String Description = "example Description";
@jakarta.annotation.Nullable String DisplayName = "example DisplayName";
ConditionAttributes @jakarta.annotation.Nullable String SampleValues = "example SampleValues";
@jakarta.annotation.Nullable String AllowedValues = "example AllowedValues";


Column columnInstance = new Column()
    .IsPrimaryKey(IsPrimaryKey)
    .IsMain(IsMain)
    .IsRequiredByProvider(IsRequiredByProvider)
    .MandatoryForActions(MandatoryForActions)
    .Name(Name)
    .Type(Type)
    .Description(Description)
    .DisplayName(DisplayName)
    .ConditionUsage(ConditionUsage)
    .SampleValues(SampleValues)
    .AllowedValues(AllowedValues);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
