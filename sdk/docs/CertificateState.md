# com.finbourne.luminesce.model.CertificateState
Information held about the minting / revoking of a certificate. It does *not* contain the certificate itself

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**key** | **String** | The \&quot;key\&quot; to which this belongs in the dictionary, basically the CN without any version information | [optional] [default to String]
**version** | **Integer** | The version of this certificate | [optional] [default to Integer]
**commonName** | **String** | The common Name of the Certificate | [optional] [default to String]
**type** | [**CertificateType**](CertificateType.md) |  | [optional] [default to CertificateType]
**creationStatus** | [**CertificateStatus**](CertificateStatus.md) |  | [optional] [default to CertificateStatus]
**revocationStatus** | [**CertificateStatus**](CertificateStatus.md) |  | [optional] [default to CertificateStatus]
**validityStart** | [**OffsetDateTime**](OffsetDateTime.md) | The earliest point at which a certificate can be used | [optional] [default to OffsetDateTime]
**validityEnd** | [**OffsetDateTime**](OffsetDateTime.md) | The latest point at which a certificate can be used | [optional] [default to OffsetDateTime]
**revokedAt** | [**OffsetDateTime**](OffsetDateTime.md) | The point at which this was revoked, if any | [optional] [default to OffsetDateTime]
**revokedBy** | **String** | The user which revoked this, if any | [optional] [default to String]
**createdAt** | [**OffsetDateTime**](OffsetDateTime.md) | The point at which this was created | [optional] [default to OffsetDateTime]
**permissionsSetAt** | [**OffsetDateTime**](OffsetDateTime.md) | The point at which permissions were adjusted by the system | [optional] [default to OffsetDateTime]
**createdBy** | **String** | The user which created this | [optional] [default to String]
**serialNumber** | **String** | The Vault-issued serial number of the certificate, if any - used for revocation | [optional] [default to String]
**links** | [**List&lt;Link&gt;**](Link.md) | The location within Configuration Store that this is saved to | [optional] [default to List<Link>]

```java
import com.finbourne.luminesce.model.CertificateState;
import java.util.*;
import java.lang.System;
import java.net.URI;

@jakarta.annotation.Nullable String Key = "example Key";
Integer Version = new Integer("100.00");
@jakarta.annotation.Nullable String CommonName = "example CommonName";
CertificateType CertificateStatus CertificateStatus @jakarta.annotation.Nullable OffsetDateTime ValidityStart = OffsetDateTime.now();
@jakarta.annotation.Nullable OffsetDateTime ValidityEnd = OffsetDateTime.now();
@jakarta.annotation.Nullable OffsetDateTime RevokedAt = OffsetDateTime.now();
@jakarta.annotation.Nullable String RevokedBy = "example RevokedBy";
@jakarta.annotation.Nullable OffsetDateTime CreatedAt = OffsetDateTime.now();
@jakarta.annotation.Nullable OffsetDateTime PermissionsSetAt = OffsetDateTime.now();
@jakarta.annotation.Nullable String CreatedBy = "example CreatedBy";
@jakarta.annotation.Nullable String SerialNumber = "example SerialNumber";
@jakarta.annotation.Nullable List<Link> Links = new List<Link>();


CertificateState certificateStateInstance = new CertificateState()
    .Key(Key)
    .Version(Version)
    .CommonName(CommonName)
    .Type(Type)
    .CreationStatus(CreationStatus)
    .RevocationStatus(RevocationStatus)
    .ValidityStart(ValidityStart)
    .ValidityEnd(ValidityEnd)
    .RevokedAt(RevokedAt)
    .RevokedBy(RevokedBy)
    .CreatedAt(CreatedAt)
    .PermissionsSetAt(PermissionsSetAt)
    .CreatedBy(CreatedBy)
    .SerialNumber(SerialNumber)
    .Links(Links);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
