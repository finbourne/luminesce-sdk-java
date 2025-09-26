# com.finbourne.luminesce.model.AvailableField
Information about a field that can be designed on (regardless if it currently is) Kind of a \"mini-available catalog entry\"

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**name** | **String** | Name of the Field | [default to String]
**dataType** | [**DataType**](DataType.md) |  | [optional] [default to DataType]
**fieldType** | [**FieldType**](FieldType.md) |  | [default to FieldType]
**isMain** | **Boolean** | Is this a Main Field within the Provider | [optional] [default to Boolean]
**isPrimaryKey** | **Boolean** | Is this a member of the PrimaryKey of the Provider | [optional] [default to Boolean]

```java
import com.finbourne.luminesce.model.AvailableField;
import java.util.*;
import java.lang.System;
import java.net.URI;

String Name = "example Name";
DataType FieldType @jakarta.annotation.Nullable Boolean IsMain = true;
@jakarta.annotation.Nullable Boolean IsPrimaryKey = true;


AvailableField availableFieldInstance = new AvailableField()
    .Name(Name)
    .DataType(DataType)
    .FieldType(FieldType)
    .IsMain(IsMain)
    .IsPrimaryKey(IsPrimaryKey);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
