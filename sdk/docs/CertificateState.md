

# CertificateState

Information held about the minting / revoking of a certificate.  It does *not* contain the certificate itself

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**key** | **String** | The \&quot;key\&quot; to which this belongs in the dictionary,  basically the CN without any version information |  [optional] |
|**version** | **Integer** | The version of this certificate |  [optional] |
|**commonName** | **String** | The common Name of the Certificate |  [optional] |
|**type** | **CertificateType** |  |  [optional] |
|**creationStatus** | **CertificateStatus** |  |  [optional] |
|**revocationStatus** | **CertificateStatus** |  |  [optional] |
|**validityStart** | **OffsetDateTime** | The earliest point at which a certificate can be used |  [optional] |
|**validityEnd** | **OffsetDateTime** | The latest point at which a certificate can be used |  [optional] |
|**revokedAt** | **OffsetDateTime** | The point at which this was revoked, if any |  [optional] |
|**revokedBy** | **String** | The user which revoked this, if any |  [optional] |
|**createdAt** | **OffsetDateTime** | The point at which this was created |  [optional] |
|**permissionsSetAt** | **OffsetDateTime** | The point at which permissions were adjusted by the system |  [optional] |
|**createdBy** | **String** | The user which created this |  [optional] |
|**serialNumber** | **String** | The Vault-issued serial number of the certificate, if any - used for revocation |  [optional] |
|**links** | [**List&lt;Link&gt;**](Link.md) | The location within Configuration Store that this is saved to |  [optional] |



[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)


