

# ConvertToViewData

Representation of view data where will template the data into a 'create view' sql

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**query** | **String** | view query |  |
|**name** | **String** | Name of view |  |
|**description** | **String** | Description of view |  [optional] |
|**documentationLink** | **String** | Documentation link |  [optional] |
|**viewParameters** | [**List&lt;ViewParameter&gt;**](ViewParameter.md) | View parameters |  [optional] |
|**otherParameters** | **Map&lt;String, String&gt;** | Other parameters not explicitly handled by the ConvertToView generation. These will be populated by the \&quot;From SQL\&quot; and should simply be returned by the web GUI should the user edit / update / regenerate |  [optional] |
|**startingVariableName** | **String** | Which variable the this start with, null if not started from a full Create View Sql Statement. |  [optional] |



[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)


