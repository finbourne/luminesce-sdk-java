

# WriterDesign

Representation of a \"designable Query for a writer\" suitable for formatting to SQL or being built from compliant SQL.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**sql** | **String** | Original SQL that started this off |  |
|**availableToMapFrom** | [**List&lt;ExpressionWithAlias&gt;**](ExpressionWithAlias.md) | The data able to be mapped from as derived from the Sql |  [optional] |
|**parameter** | [**AvailableParameter**](AvailableParameter.md) |  |  [optional] |
|**availableParameters** | [**List&lt;AvailableParameter&gt;**](AvailableParameter.md) | All the parameter the user may wish to design |  [optional] |



