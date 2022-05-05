
# Client Class Documentation

The following parameters are configurable for the API Client:

| Parameter | Type | Description |
|  --- | --- | --- |
| `testServer` | `String` | *Default*: `"http://3.232.88.66:4533"` |
| `environment` | Environment | The API environment. <br> **Default: `Environment.SANDBOX`** |
| `httpClientConfig` | `ReadonlyHttpClientConfiguration` | Http Client Configuration instance. |
| `accessToken` | `String` | The OAuth 2.0 Access Token to use for API requests. |

The API client can be initialized as follows:

```java
GeoventasAndroidAPIClient client = new GeoventasAndroidAPIClient.Builder()
    .httpClientConfig(configBuilder -> configBuilder
            .timeout(0))
    .accessToken("AccessToken")
    .environment(Environment.SANDBOX)
    .testServer("http://3.232.88.66:4533")
    .build();
```

## Geoventas Android APIClient Class

The gateway for the SDK. This class acts as a factory for the Controllers and also holds the configuration of the SDK.

### Controllers

| Name | Description | Return Type |
|  --- | --- | --- |
| `getAuthController()` | Provides access to Auth controller. | `AuthController` |
| `getClientesController()` | Provides access to Clientes controller. | `ClientesController` |
| `getProductosController()` | Provides access to Productos controller. | `ProductosController` |

### Methods

| Name | Description | Return Type |
|  --- | --- | --- |
| `shutdown()` | Shutdown the underlying HttpClient instance. | `void` |
| `getEnvironment()` | Current API environment. | `Environment` |
| `getTestServer()` | testServer value. | `String` |
| `getHttpClient()` | The HTTP Client instance to use for making HTTP requests. | `HttpClient` |
| `getHttpClientConfig()` | Http Client Configuration instance. | `ReadonlyHttpClientConfiguration` |
| `getBearerAuthCredentials()` | The credentials to use with BearerAuth. | `BearerAuthCredentials` |
| `getAccessToken()` | OAuth 2.0 Access Token. | `String` |
| `getBaseUri(Server server)` | Get base URI by current environment | `String` |
| `getBaseUri()` | Get base URI by current environment | `String` |

