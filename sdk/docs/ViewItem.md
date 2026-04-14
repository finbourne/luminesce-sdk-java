# com.finbourne.luminesce.model.ViewItem

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**name** | **String** | The name of the view | [optional] [default to String]
**domain** | **String** | The domain the view applies to | [optional] [default to String]
**filePath** | **String** | The full file path in the HcFs | [optional] [default to String]
**fileContent** | **String** | The full file content in the HcFs. This will be needed for Upserting the view to a different domain / for use in fbn-config. | [optional] [default to String]
**lastUpdatedExecutionId** | [**UUID**](UUID.md) | The last ExecutionId, needed to get the creating Sql out of the logs | [optional] [default to UUID]
**lastUpdatedAt** | [**OffsetDateTime**](OffsetDateTime.md) | The last updated at time, needed to get the creating Sql out of the logs | [optional] [default to OffsetDateTime]
**lastUpdatedBy** | **String** | The last updated by this user | [optional] [default to String]
**createdByUserId** | **String** | Originally created by this user | [optional] [default to String]
**notes** | **String** | Any notes around saving or whatnot | [optional] [default to String]

```java
import com.finbourne.luminesce.model.ViewItem;
import java.util.*;
import java.lang.System;
import java.net.URI;

@jakarta.annotation.Nullable String Name = "example Name";
@jakarta.annotation.Nullable String Domain = "example Domain";
@jakarta.annotation.Nullable String FilePath = "example FilePath";
@jakarta.annotation.Nullable String FileContent = "example FileContent";
@jakarta.annotation.Nullable UUID LastUpdatedExecutionId = "example LastUpdatedExecutionId";
@jakarta.annotation.Nullable OffsetDateTime LastUpdatedAt = OffsetDateTime.now();
@jakarta.annotation.Nullable String LastUpdatedBy = "example LastUpdatedBy";
@jakarta.annotation.Nullable String CreatedByUserId = "example CreatedByUserId";
@jakarta.annotation.Nullable String Notes = "example Notes";


ViewItem viewItemInstance = new ViewItem()
    .Name(Name)
    .Domain(Domain)
    .FilePath(FilePath)
    .FileContent(FileContent)
    .LastUpdatedExecutionId(LastUpdatedExecutionId)
    .LastUpdatedAt(LastUpdatedAt)
    .LastUpdatedBy(LastUpdatedBy)
    .CreatedByUserId(CreatedByUserId)
    .Notes(Notes);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
