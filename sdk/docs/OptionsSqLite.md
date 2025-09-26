# com.finbourne.luminesce.model.OptionsSqLite
Additional options applicable to the given SourceType

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**table** | **String** | Table name to read. If missing then an error will be raised if there is any number of tables other than one. | [optional] [default to String]

```java
import com.finbourne.luminesce.model.OptionsSqLite;
import java.util.*;
import java.lang.System;
import java.net.URI;

@jakarta.annotation.Nullable String Table = "example Table";


OptionsSqLite optionsSqLiteInstance = new OptionsSqLite()
    .Table(Table);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
