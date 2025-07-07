

# JoinedTableDesign

Treatment of a joined-to-table a QueryDesign

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**joinedTableName** | **String** | Name of the table on the right side of the join |  |
|**joinedTableAlias** | **String** | Alias for the table on the right side of the join |  |
|**leftTableAlias** | **String** | Alias for the table on the left side of the join |  |
|**joinType** | **DesignJoinType** |  |  |
|**onClauseTerms** | [**List&lt;OnClauseTermDesign&gt;**](OnClauseTermDesign.md) | Filter clauses to apply to this join in the on clause |  |
|**rightTableAvailableFields** | [**List&lt;AvailableField&gt;**](AvailableField.md) | Fields that are known to be available for design when parsing SQL, of the right hand table |  [optional] |



[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)


