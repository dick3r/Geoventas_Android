# Clientes

```java
ClientesController clientesController = client.getClientesController();
```

## Class Name

`ClientesController`


# Clientes GET

```java
CompletableFuture<List<ClientesAPI>> clientesGETAsync()
```

## Response Type

[`List<ClientesAPI>`](../../doc/models/clientes-api.md)

## Example Usage

```java
clientesController.clientesGETAsync().thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```

