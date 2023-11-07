

# QueryDesign

Representation of a \"designable Query\" suitable for formatting to SQL or being built from compliant SQL.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**tableName** | **String** | Name of the table being designed |  |
|**alias** | **String** | Alias for the table in the generated SQL, if any |  [optional] |
|**fields** | [**List&lt;FieldDesign&gt;**](FieldDesign.md) | Fields to be selected, aggregated over and/or filtered on |  |
|**orderBy** | [**List&lt;OrderByTermDesign&gt;**](OrderByTermDesign.md) | Order By clauses to apply |  [optional] |
|**limit** | **Integer** | Row limit to apply, if any |  [optional] |
|**warnings** | **List&lt;String&gt;** | Any warnings to show the user when converting from SQL to this representation |  [optional] |
|**availableFields** | [**List&lt;AvailableField&gt;**](AvailableField.md) | Fields that are known to be available for design when parsing SQL |  [optional] |



