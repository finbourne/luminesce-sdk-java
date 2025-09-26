# com.finbourne.luminesce.model.OptionsCsv
Additional options applicable to the given SourceType

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**columnNames** | **String** | Column Names either overrides the header row or steps in when there is no header row (comma delimited list) | [optional] [default to String]
**columnNamesWanted** | **String** | Column (by Name) that should be returned (comma delimited list) | [optional] [default to String]
**columnTypes** | **String** | Column types (comma delimited list of: &#39;{types}&#39;, some columns may be left blank while others are specified) | [optional] [default to String]
**inferTypeRowCount** | **Integer** | If non-zero and &#39;types&#39; is not specified (or not specified for some columns) this will look through N rows to attempt to work out the column types for columns not pre-specified | [optional] [default to Integer]
**noHeader** | **Boolean** | Set this if there is no header row | [optional] [default to Boolean]
**delimiter** | **String** | The delimiter between values (\\t for tab) | [optional] [default to String]
**escape** | **String** | Character used to escape the &#39;Quote&#39; character when within a value | [optional] [default to String]
**quote** | **String** | Character used around any field containing the &#39;delimiter&#39; or a line break. | [optional] [default to String]
**valuesToMakeNull** | **String** | Regex of values to map to &#39;null&#39; in the returned data. | [optional] [default to String]
**skipPreHeader** | **Integer** | Number of rows to ignore before the header row | [optional] [default to Integer]
**skipPostHeader** | **Integer** | Number of rows to ignore after the header row | [optional] [default to Integer]
**skipInvalidRows** | **Boolean** | Skip invalid data rows (totally invalid ones),  This also allows for potentially wrong data if it can be handled somewhat e.g. embedded quotes misused (and still returns such rows). In either case a warning will show in the progress feedback. | [optional] [default to Boolean]

```java
import com.finbourne.luminesce.model.OptionsCsv;
import java.util.*;
import java.lang.System;
import java.net.URI;

@jakarta.annotation.Nullable String ColumnNames = "example ColumnNames";
@jakarta.annotation.Nullable String ColumnNamesWanted = "example ColumnNamesWanted";
@jakarta.annotation.Nullable String ColumnTypes = "example ColumnTypes";
Integer InferTypeRowCount = new Integer("100.00");
Boolean NoHeader = true;
@jakarta.annotation.Nullable String Delimiter = "example Delimiter";
@jakarta.annotation.Nullable String Escape = "example Escape";
@jakarta.annotation.Nullable String Quote = "example Quote";
@jakarta.annotation.Nullable String ValuesToMakeNull = "example ValuesToMakeNull";
Integer SkipPreHeader = new Integer("100.00");
Integer SkipPostHeader = new Integer("100.00");
Boolean SkipInvalidRows = true;


OptionsCsv optionsCsvInstance = new OptionsCsv()
    .ColumnNames(ColumnNames)
    .ColumnNamesWanted(ColumnNamesWanted)
    .ColumnTypes(ColumnTypes)
    .InferTypeRowCount(InferTypeRowCount)
    .NoHeader(NoHeader)
    .Delimiter(Delimiter)
    .Escape(Escape)
    .Quote(Quote)
    .ValuesToMakeNull(ValuesToMakeNull)
    .SkipPreHeader(SkipPreHeader)
    .SkipPostHeader(SkipPostHeader)
    .SkipInvalidRows(SkipInvalidRows);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
