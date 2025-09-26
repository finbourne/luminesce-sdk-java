# com.finbourne.luminesce.model.CaseStatementItem
Information about a case statement. A typical case statement would look like: CASE WHEN Field {Filter} Source THEN Target For example: CASE WHEN 'currency' = 'USD' THEN 'US' Here the Field is 'currency', the Source is 'USD', the Filter is '=', and the Target is 'US'

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**filter** | **String** | The operator in the case statement SQL expression | [default to String]
**source** | **String** | The expression that is on the LHS of the operator A typical case statement would look like: CASE Field {Filter} Source THEN Target | [default to String]
**target** | **String** | The expression that is on the RHS of the operator A typical case statement would look like: CASE Field {Filter} Source THEN Target | [default to String]
**isTargetNonLiteral** | **Boolean** | The Target can be a literal value or a non literal (field) and hence will be interpreted differently. This can be determined from the UI and passed down as a true / false | [optional] [default to Boolean]

```java
import com.finbourne.luminesce.model.CaseStatementItem;
import java.util.*;
import java.lang.System;
import java.net.URI;

String Filter = "example Filter";
String Source = "example Source";
String Target = "example Target";
Boolean IsTargetNonLiteral = true;


CaseStatementItem caseStatementItemInstance = new CaseStatementItem()
    .Filter(Filter)
    .Source(Source)
    .Target(Target)
    .IsTargetNonLiteral(IsTargetNonLiteral);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
