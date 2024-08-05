

# FieldDesign

Treatment of a single field within a QueryDesign

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**name** | **String** | Name of the Field |  |
|**alias** | **String** | Alias if any (if none the Name is used) |  [optional] |
|**dataType** | **DataType** |  |  [optional] |
|**shouldSelect** | **Boolean** | Should this be selected? False would imply it is only being filtered on.  Ignored when Aggregations are present |  [optional] |
|**filters** | [**List&lt;FilterTermDesign&gt;**](FilterTermDesign.md) | Filter clauses to apply to this field (And&#39;ed together) |  [optional] |
|**aggregations** | [**List&lt;Aggregation&gt;**](Aggregation.md) | Aggregations to apply (as opposed to simply selecting) |  [optional] |



[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)


