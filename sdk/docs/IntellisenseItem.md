# com.finbourne.luminesce.model.IntellisenseItem
Representation of an item in an Intellisense popup

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**caption** | **String** | The value to show the user in the popup | [default to String]
**value** | **String** | The value to substitute in | [default to String]
**meta** | **String** | The light-grey text shown to the right of the Caption in the popup | [optional] [default to String]
**score** | **Integer** | How important is this. Bigger is more important. | [optional] [default to Integer]
**docHTML** | **String** | Popup further info (as in a whole documentation article!) | [optional] [default to String]
**type** | [**IntellisenseType**](IntellisenseType.md) |  | [optional] [default to IntellisenseType]

```java
import com.finbourne.luminesce.model.IntellisenseItem;
import java.util.*;
import java.lang.System;
import java.net.URI;

String Caption = "example Caption";
String Value = "example Value";
@jakarta.annotation.Nullable String Meta = "example Meta";
Integer Score = new Integer("100.00");
@jakarta.annotation.Nullable String DocHTML = "example DocHTML";
IntellisenseType 

IntellisenseItem intellisenseItemInstance = new IntellisenseItem()
    .Caption(Caption)
    .Value(Value)
    .Meta(Meta)
    .Score(Score)
    .DocHTML(DocHTML)
    .Type(Type);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
