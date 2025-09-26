# com.finbourne.luminesce.model.MappableField
Information about a field that can be designed on (regardless if it currently is) Kind of a \"mini-available catalog entry\"

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**name** | **String** | Name of the field in need of mapping (The field name from within the Table Parameter itself) | [optional] [default to String]
**type** | [**DataType**](DataType.md) |  | [optional] [default to DataType]
**description** | **String** | Description of the field (just for rendering to the user) | [optional] [default to String]
**displayName** | **String** | Display Name of the field (just for rendering to the user) | [optional] [default to String]
**sampleValues** | **String** | Example values for the field (just for rendering to the user) | [optional] [default to String]
**allowedValues** | **String** | Any set of exactly allowed values for the field (perhaps just for rendering to the user, if nothing else) | [optional] [default to String]
**mandatoryForActions** | **String** | Which &#x60;Actions&#x60; is this mandatory for? If any (and potentially when), perhaps just for rendering to the user, if nothing else | [optional] [default to String]
**mapping** | [**ExpressionWithAlias**](ExpressionWithAlias.md) |  | [optional] [default to ExpressionWithAlias]

```java
import com.finbourne.luminesce.model.MappableField;
import java.util.*;
import java.lang.System;
import java.net.URI;

@jakarta.annotation.Nullable String Name = "example Name";
DataType @jakarta.annotation.Nullable String Description = "example Description";
@jakarta.annotation.Nullable String DisplayName = "example DisplayName";
@jakarta.annotation.Nullable String SampleValues = "example SampleValues";
@jakarta.annotation.Nullable String AllowedValues = "example AllowedValues";
@jakarta.annotation.Nullable String MandatoryForActions = "example MandatoryForActions";
ExpressionWithAlias Mapping = new ExpressionWithAlias();


MappableField mappableFieldInstance = new MappableField()
    .Name(Name)
    .Type(Type)
    .Description(Description)
    .DisplayName(DisplayName)
    .SampleValues(SampleValues)
    .AllowedValues(AllowedValues)
    .MandatoryForActions(MandatoryForActions)
    .Mapping(Mapping);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
