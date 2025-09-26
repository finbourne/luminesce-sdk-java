# com.finbourne.luminesce.model.FileReaderBuilderResponse
Information on how to construct a file-read sql query

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**query** | **String** | The generated SQL | [optional] [default to String]
**error** | **String** | The error from running generated SQL Query, if any | [optional] [default to String]
**columns** | [**List&lt;ColumnInfo&gt;**](ColumnInfo.md) | Column information for the results | [optional] [default to List<ColumnInfo>]
**data** | **Object** | The resulting data from running the Query | [optional] [default to Object]

```java
import com.finbourne.luminesce.model.FileReaderBuilderResponse;
import java.util.*;
import java.lang.System;
import java.net.URI;

@jakarta.annotation.Nullable String Query = "example Query";
@jakarta.annotation.Nullable String Error = "example Error";
@jakarta.annotation.Nullable List<ColumnInfo> Columns = new List<ColumnInfo>();
@jakarta.annotation.Nullable Object 

FileReaderBuilderResponse fileReaderBuilderResponseInstance = new FileReaderBuilderResponse()
    .Query(Query)
    .Error(Error)
    .Columns(Columns)
    .Data(Data);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
