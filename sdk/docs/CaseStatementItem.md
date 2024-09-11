

# CaseStatementItem

Information about a case statement.  A typical case statement would look like:  CASE WHEN Field {Filter} Source THEN Target  For example: CASE WHEN 'currency' = 'USD' THEN 'US'  Here the Field is 'currency', the Source is 'USD', the Filter is '=', and the Target is 'US'

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**filter** | **String** | The operator in the case statement SQL expression |  |
|**source** | **String** | The expression that is on the LHS of the operator  A typical case statement would look like:  CASE Field {Filter} Source THEN Target |  |
|**target** | **String** | The expression that is on the RHS of the operator  A typical case statement would look like:  CASE Field {Filter} Source THEN Target |  |



[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)


