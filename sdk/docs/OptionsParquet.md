# com.finbourne.luminesce.model.OptionsParquet
Additional options applicable to the given SourceType

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**columnNamesWanted** | **String** | Column (by Name) that should be returned (comma delimited list) | [optional] [default to String]

```java
import com.finbourne.luminesce.model.OptionsParquet;
import java.util.*;
import java.lang.System;
import java.net.URI;

@jakarta.annotation.Nullable String ColumnNamesWanted = "example ColumnNamesWanted";


OptionsParquet optionsParquetInstance = new OptionsParquet()
    .ColumnNamesWanted(ColumnNamesWanted);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
