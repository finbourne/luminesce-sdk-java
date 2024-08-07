![LUSID_by_Finbourne](./resources/Finbourne_Logo_Teal.svg)

# Java SDK for the FINBOURNE Luminesce Web API

## Contents

- [Summary](#summary)
- [Versions](#versions)
- [Requirements](#requirements)
- [Installation](#installation)
    * [Maven](#maven)
    * [Gradle](#gradle)
- [Getting Started](#getting-started)
    * [Environment variables](#environment-variables)
    * [Secrets file](#secrets-file)
    * [Example](#example)
- [Endpoints and models](#endpoints-and-models)

## Summary

This is the java SDK for the FINBOURNE Luminesce Web API, part of the [LUSID by FINBOURNE](https://www.finbourne.com/lusid-technology) platform. To use it you'll need a LUSID account - [sign up for free at lusid.com](https://www.lusid.com/app/signup).

Luminesce is a SQL-based data virtualisation service (read/write data to multiple sources, including LUSID) - see https://support.lusid.com/knowledgebase/article/KA-01677/ to learn more.

For more details on other applications in the LUSID platform, see [Understanding all the applications in the LUSID platform](https://support.lusid.com/knowledgebase/article/KA-01787).

This sdk supports `Production`, `Early Access`, `Beta` and `Experimental` API endpoints. For more details on API endpoint categories, see [What is the LUSID feature release lifecycle](https://support.lusid.com/knowledgebase/article/KA-01786). To find out which category an API endpoint falls into, see the [swagger page](https://fbn-prd.lusid.com/honeycomb/swagger/index.html).

This code is automatically generated by the [OpenAPI Generator](https://openapi-generator.tech) project.

## Versions

- API version: 1.16.421
- SDK version: 2.0.227

## Requirements

- Java 1.8+

## Installation

### Maven

Add this dependency to your pom.xml

```xml
<dependency>
    <groupId>com.finbourne</groupId>
    <artifactId>luminesce-sdk</artifactId>
    <version>2.0.227</version>
</dependency>
```

### Gradle

Add this dependency to your build.gradle

```groovy
  repositories {
    mavenCentral()
  }

  dependencies {
     implementation "com.finbourne:luminesce-sdk:2.0.227"
  }
```

## Getting Started

You'll need to provide some configuration to connect to the FINBOURNE Luminesce Web API - see the articles about [short-lived access tokens](https://support.lusid.com/knowledgebase/article/KA-01654) and a [long-lived Personal Access Token](https://support.lusid.com/knowledgebase/article/KA-01774). This configuration can be provided using a secrets file or environment variables. 

### Environment variables

Required for a short-lived access token
``` 
FBN_TOKEN_URL
FBN_LUMINESCE_URL
FBN_USERNAME
FBN_PASSWORD
FBN_CLIENT_ID
FBN_CLIENT_SECRET
```

Required for a long-lived access token
``` 
FBN_LUMINESCE_URL
FBN_ACCESS_TOKEN
```

You can send your requests to the FINBOURNE Luminesce Web API via a proxy, by setting `FBN_PROXY_ADDRESS`. If your proxy has basic auth enabled, you must also set `FBN_PROXY_USERNAME` and `FBN_PROXY_PASSWORD`.

### Secrets file

The secrets file must be in the current working directory.

Required for a short-lived access token
```json
{
    "api":
    {
        "tokenUrl":"<your-token-url>",
        "luminesceUrl":"https://<your-domain>.lusid.com/honeycomb",
        "username":"<your-username>",
        "password":"<your-password>",
        "clientId":"<your-client-id>",
        "clientSecret":"<your-client-secret>",
    }
}
```

Required for a long-lived access token
```json
{
    "api":
    {
        "luminesceUrl":"https://<your-domain>.lusid.com/honeycomb",
        "accessToken":"<your-access-token>"
    }
}
```

You can send your requests to the FINBOURNE Luminesce Web API via a proxy, by adding a proxy section. If your proxy has basic auth enabled, you must also supply a `username` and `password` in this section.

```json
{
    "api":
    {
        "luminesceUrl":"https://<your-domain>.lusid.com/honeycomb",
        "accessToken":"<your-access-token>"
    },
    "proxy":
    {
        "address":"<your-proxy-address>",
        "username":"<your-proxy-username>",
        "password":"<your-proxy-password>"
    }
}
```

### Example
```java
import com.finbourne.luminesce.model.*;
import com.finbourne.luminesce.api.ApplicationMetadataApi;
import com.finbourne.luminesce.extensions.ApiConfigurationException;
import com.finbourne.luminesce.extensions.ApiFactoryBuilder;
import com.finbourne.luminesce.extensions.auth.FinbourneTokenException;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class ApplicationMetadataApiExample {

    public static void main(String[] args) throws FileNotFoundException, UnsupportedEncodingException, ApiConfigurationException, FinbourneTokenException {
        String fileName = "secrets.json";
        try(PrintWriter writer = new PrintWriter(fileName, "UTF-8")) {
          writer.write("{" +
            "\"api\": {" +
            "    \"tokenUrl\": \"<your-token-url>\"," +
            "    \"luminesceUrl\": \"https://<your-domain>.lusid.com/honeycomb\"," +
            "    \"username\": \"<your-username>\"," +
            "    \"password\": \"<your-password>\"," +
            "    \"clientId\": \"<your-client-id>\"," +
            "    \"clientSecret\": \"<your-client-secret>\"" +
            "  }" +
            "}");
        }

        ApplicationMetadataApi apiInstance = ApiFactoryBuilder.build(fileName).build(ApplicationMetadataApi.class);
        try {
            ResourceListOfAccessControlledResource result = apiInstance.getServicesAsAccessControlledResources().execute();
            System.out.println(result.toJson());
        } catch (ApiException e) {
            System.err.println("Exception when calling ApplicationMetadataApi#getServicesAsAccessControlledResources");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            e.printStackTrace();
        }
    }
}
```


## Endpoints and models

- See [Documentation for API Endpoints](sdk/README.md#documentation-for-api-endpoints) for a description of each endpoint
- See [Documentation for Models](sdk/README.md#documentation-for-models) for descriptions of the models used

