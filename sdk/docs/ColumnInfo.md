# com.finbourne.luminesce.model.ColumnInfo
Information on how to construct a file-read sql query

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**select** | **Boolean** | Should the column be used/selected? | [optional] [default to Boolean]
**type** | [**DataType**](DataType.md) |  | [optional] [default to DataType]
**name** | **String** | The name of the column | [optional] [default to String]
**xPath** | **String** | Xpath for the column (only applicable to XML defined columns) | [optional] [default to String]

```java
import com.finbourne.luminesce.model.ColumnInfo;
import java.util.*;
import java.lang.System;
import java.net.URI;

Boolean Select = true;
DataType @jakarta.annotation.Nullable String Name = "example Name";
@jakarta.annotation.Nullable String XPath = "example XPath";


ColumnInfo columnInfoInstance = new ColumnInfo()
    .Select(Select)
    .Type(Type)
    .Name(Name)
    .XPath(XPath);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
