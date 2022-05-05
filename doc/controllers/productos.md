# Productos

```java
ProductosController productosController = client.getProductosController();
```

## Class Name

`ProductosController`


# Productos GET

```java
CompletableFuture<List<ProductsAPI>> productosGETAsync()
```

## Response Type

[`List<ProductsAPI>`](../../doc/models/products-api.md)

## Example Usage

```java
productosController.productosGETAsync().thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```

