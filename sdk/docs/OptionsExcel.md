# com.finbourne.luminesce.model.OptionsExcel
Additional options applicable to the given SourceType

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**columnNames** | **String** | Column Names either overrides the header row or steps in when there is no header row (comma delimited list) | [optional] [default to String]
**columnTypes** | **String** | Column types (comma delimited list of: &#39;{types}&#39;, some columns may be left blank while others are specified) | [optional] [default to String]
**inferTypeRowCount** | **Integer** | If non-zero and &#39;types&#39; is not specified (or not specified for some columns) this will look through N rows to attempt to work out the column types for columns not pre-specified | [optional] [default to Integer]
**noHeader** | **Boolean** | Set this if there is no header row | [optional] [default to Boolean]
**calculate** | **Boolean** | Whether to attempt a calculation of the imported cell range prior to import | [optional] [default to Boolean]
**password** | **String** | If specified will be used as the password used for password protected workbooks | [optional] [default to String]
**worksheet** | **String** | The worksheet containing the cell range to import (name or index, will default to first) | [optional] [default to String]
**rangeOrTable** | **String** | The cell range to import as either a specified range or a table name | [optional] [default to String]
**ignoreInvalidCells** | **Boolean** | If specified cells which can not be successfully converted to the target type will be ignored | [optional] [default to Boolean]
**ignoreBlankRows** | **Boolean** | If the entire rows has only blank cells it will be ignored will be ignored | [optional] [default to Boolean]

```java
import com.finbourne.luminesce.model.OptionsExcel;
import java.util.*;
import java.lang.System;
import java.net.URI;

@jakarta.annotation.Nullable String ColumnNames = "example ColumnNames";
@jakarta.annotation.Nullable String ColumnTypes = "example ColumnTypes";
Integer InferTypeRowCount = new Integer("100.00");
Boolean NoHeader = true;
Boolean Calculate = true;
@jakarta.annotation.Nullable String Password = "example Password";
@jakarta.annotation.Nullable String Worksheet = "example Worksheet";
@jakarta.annotation.Nullable String RangeOrTable = "example RangeOrTable";
Boolean IgnoreInvalidCells = true;
Boolean IgnoreBlankRows = true;


OptionsExcel optionsExcelInstance = new OptionsExcel()
    .ColumnNames(ColumnNames)
    .ColumnTypes(ColumnTypes)
    .InferTypeRowCount(InferTypeRowCount)
    .NoHeader(NoHeader)
    .Calculate(Calculate)
    .Password(Password)
    .Worksheet(Worksheet)
    .RangeOrTable(RangeOrTable)
    .IgnoreInvalidCells(IgnoreInvalidCells)
    .IgnoreBlankRows(IgnoreBlankRows);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
