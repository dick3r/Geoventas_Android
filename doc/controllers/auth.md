# Auth

```java
AuthController authController = client.getAuthController();
```

## Class Name

`AuthController`


# Auth POST

```java
CompletableFuture<Void> authPOSTAsync(
    final Map<String, String> body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `body` | `Map<String, String>` | Body, Optional | - |

## Response Type

`void`

## Example Usage

```java
authController.authPOSTAsync(null).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```

