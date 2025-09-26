# com.finbourne.luminesce.model.OptionsXml
Additional options applicable to the given SourceType

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**columnTypes** | **String** | Column types (comma delimited list of: &#39;{types}&#39;, some columns may be left blank while others are specified) | [optional] [default to String]
**inferTypeRowCount** | **Integer** | If non-zero and &#39;types&#39; is not specified (or not specified for some columns) this will look through N rows to attempt to work out the column types for columns not pre-specified | [optional] [default to Integer]
**valuesToMakeNull** | **String** | Regex of values to map to &#39;null&#39; in the returned data. | [optional] [default to String]
**columnNames** | **String** | Column Names either overrides the header row or steps in when there is no header row (comma delimited list) | [optional] [default to String]
**nodePath** | **String** | XPath query that selects the nodes to map to rows | [optional] [default to String]
**namespaces** | **String** | Selected prefix(es) and namespace(s):prefix1&#x3D;namespace1-uri1,prefix2&#x3D;namespace2-uri2,...prefixN&#x3D;namespaceN-uriN | [optional] [default to String]

```java
import com.finbourne.luminesce.model.OptionsXml;
import java.util.*;
import java.lang.System;
import java.net.URI;

@jakarta.annotation.Nullable String ColumnTypes = "example ColumnTypes";
Integer InferTypeRowCount = new Integer("100.00");
@jakarta.annotation.Nullable String ValuesToMakeNull = "example ValuesToMakeNull";
@jakarta.annotation.Nullable String ColumnNames = "example ColumnNames";
@jakarta.annotation.Nullable String NodePath = "example NodePath";
@jakarta.annotation.Nullable String Namespaces = "example Namespaces";


OptionsXml optionsXmlInstance = new OptionsXml()
    .ColumnTypes(ColumnTypes)
    .InferTypeRowCount(InferTypeRowCount)
    .ValuesToMakeNull(ValuesToMakeNull)
    .ColumnNames(ColumnNames)
    .NodePath(NodePath)
    .Namespaces(Namespaces);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
