# com.finbourne.luminesce.model.ConvertToViewData
Representation of view data where will template the data into a 'create view' sql

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**query** | **String** | view query | [default to String]
**name** | **String** | Name of view | [default to String]
**description** | **String** | Description of view | [optional] [default to String]
**documentationLink** | **String** | Documentation link | [optional] [default to String]
**viewParameters** | [**List&lt;ViewParameter&gt;**](ViewParameter.md) | View parameters | [optional] [default to List<ViewParameter>]
**otherParameters** | **Map&lt;String, String&gt;** | Other parameters not explicitly handled by the ConvertToView generation. These will be populated by the \&quot;From SQL\&quot; and should simply be returned by the web GUI should the user edit / update / regenerate | [optional] [default to Map<String, String>]
**startingVariableName** | **String** | Which variable the this start with, null if not started from a full Create View Sql Statement. | [optional] [default to String]

```java
import com.finbourne.luminesce.model.ConvertToViewData;
import java.util.*;
import java.lang.System;
import java.net.URI;

String Query = "example Query";
String Name = "example Name";
@jakarta.annotation.Nullable String Description = "example Description";
@jakarta.annotation.Nullable String DocumentationLink = "example DocumentationLink";
@jakarta.annotation.Nullable List<ViewParameter> ViewParameters = new List<ViewParameter>();
@jakarta.annotation.Nullable Map<String, String> OtherParameters = new Map<String, String>();
@jakarta.annotation.Nullable String StartingVariableName = "example StartingVariableName";


ConvertToViewData convertToViewDataInstance = new ConvertToViewData()
    .Query(Query)
    .Name(Name)
    .Description(Description)
    .DocumentationLink(DocumentationLink)
    .ViewParameters(ViewParameters)
    .OtherParameters(OtherParameters)
    .StartingVariableName(StartingVariableName);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
