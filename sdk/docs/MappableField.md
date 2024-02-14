

# MappableField

Information about a field that can be designed on (regardless if it currently is)  Kind of a \"mini-available catalog entry\"

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**name** | **String** | Name of the field in need of mapping (The field name from within the Table Parameter itself) |  [optional] |
|**type** | **DataType** |  |  [optional] |
|**description** | **String** | Description of the field (just for rendering to the user) |  [optional] |
|**displayName** | **String** | Display Name of the field (just for rendering to the user) |  [optional] |
|**sampleValues** | **String** | Example values for the field (just for rendering to the user) |  [optional] |
|**allowedValues** | **String** | Any set of exactly allowed values for the field (perhaps just for rendering to the user, if nothing else) |  [optional] |
|**mandatoryForActions** | **String** | Which &#x60;Actions&#x60; is this mandatory for? If any (and potentially when), perhaps just for rendering to the user, if nothing else |  [optional] |
|**mapping** | [**ExpressionWithAlias**](ExpressionWithAlias.md) |  |  [optional] |



