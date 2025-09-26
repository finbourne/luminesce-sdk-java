# com.finbourne.luminesce.model.CertificateAction
The action to take with a certificate

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**CertificateAction** | [**String**](.md) | **The action to take with a certificate** | [default to String]

```java
import com.finbourne.luminesce.model.CertificateAction;
import java.util.*;
import java.lang.System;
import java.net.URI;

// Example usage of CertificateAction:
CertificateAction method = CertificateAction.CREATE;
CertificateAction method = CertificateAction.CREATEANDALLOWMULTIPLEWHICHAREVALID;
CertificateAction method = CertificateAction.RENEW;
CertificateAction method = CertificateAction.REVOKE;
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
