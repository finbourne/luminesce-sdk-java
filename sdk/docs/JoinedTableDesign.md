# com.finbourne.luminesce.model.JoinedTableDesign
Treatment of a joined-to-table a QueryDesign

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**joinedTableName** | **String** | Name of the table on the right side of the join | [default to String]
**joinedTableAlias** | **String** | Alias for the table on the right side of the join | [default to String]
**leftTableAlias** | **String** | Alias for the table on the left side of the join | [default to String]
**joinType** | [**DesignJoinType**](DesignJoinType.md) |  | [default to DesignJoinType]
**onClauseTerms** | [**List&lt;OnClauseTermDesign&gt;**](OnClauseTermDesign.md) | Filter clauses to apply to this join in the on clause | [default to List<OnClauseTermDesign>]
**rightTableAvailableFields** | [**List&lt;AvailableField&gt;**](AvailableField.md) | Fields that are known to be available for design when parsing SQL, of the right hand table | [optional] [default to List<AvailableField>]

```java
import com.finbourne.luminesce.model.JoinedTableDesign;
import java.util.*;
import java.lang.System;
import java.net.URI;

String JoinedTableName = "example JoinedTableName";
String JoinedTableAlias = "example JoinedTableAlias";
String LeftTableAlias = "example LeftTableAlias";
DesignJoinType List<OnClauseTermDesign> OnClauseTerms = new List<OnClauseTermDesign>();
@jakarta.annotation.Nullable List<AvailableField> RightTableAvailableFields = new List<AvailableField>();


JoinedTableDesign joinedTableDesignInstance = new JoinedTableDesign()
    .JoinedTableName(JoinedTableName)
    .JoinedTableAlias(JoinedTableAlias)
    .LeftTableAlias(LeftTableAlias)
    .JoinType(JoinType)
    .OnClauseTerms(OnClauseTerms)
    .RightTableAvailableFields(RightTableAvailableFields);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
