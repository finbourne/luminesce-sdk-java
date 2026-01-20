# com.finbourne.luminesce.model.Lineage

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**type** | **String** |  | [optional] [default to String]
**subtype** | **String** |  | [optional] [default to String]
**alias** | **String** |  | [optional] [default to String]
**displayName** | **String** |  | [optional] [default to String]
**description** | **String** |  | [optional] [default to String]
**documentationAsHtml** | **String** |  | [optional] [default to String]
**documentationAsMarkDown** | **String** |  | [optional] [default to String]
**fullText** | **String** |  | [optional] [default to String]
**children** | [**List&lt;Lineage&gt;**](Lineage.md) |  | [optional] [default to List<Lineage>]

```java
import com.finbourne.luminesce.model.Lineage;
import java.util.*;
import java.lang.System;
import java.net.URI;

@jakarta.annotation.Nullable String Type = "example Type";
@jakarta.annotation.Nullable String Subtype = "example Subtype";
@jakarta.annotation.Nullable String Alias = "example Alias";
@jakarta.annotation.Nullable String DisplayName = "example DisplayName";
@jakarta.annotation.Nullable String Description = "example Description";
@jakarta.annotation.Nullable String DocumentationAsHtml = "example DocumentationAsHtml";
@jakarta.annotation.Nullable String DocumentationAsMarkDown = "example DocumentationAsMarkDown";
@jakarta.annotation.Nullable String FullText = "example FullText";
@jakarta.annotation.Nullable List<Lineage> Children = new List<Lineage>();


Lineage lineageInstance = new Lineage()
    .Type(Type)
    .Subtype(Subtype)
    .Alias(Alias)
    .DisplayName(DisplayName)
    .Description(Description)
    .DocumentationAsHtml(DocumentationAsHtml)
    .DocumentationAsMarkDown(DocumentationAsMarkDown)
    .FullText(FullText)
    .Children(Children);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
