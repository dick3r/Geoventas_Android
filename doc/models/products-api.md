
# Products API

## Structure

`ProductsAPI`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Id` | `Integer` | Optional | - | Integer getId() | setId(Integer id) |
| `Codigo` | `String` | Optional | - | String getCodigo() | setCodigo(String codigo) |
| `Nombre` | `String` | Optional | - | String getNombre() | setNombre(String nombre) |
| `Precio` | `Double` | Optional | - | Double getPrecio() | setPrecio(Double precio) |
| `Iva` | `Boolean` | Optional | - | Boolean getIva() | setIva(Boolean iva) |
| `Categoria` | [`List<Categoria>`](../../doc/models/categoria.md) | Optional | - | List<Categoria> getCategoria() | setCategoria(List<Categoria> categoria) |
| `SubCategoria` | [`List<Subcategoria>`](../../doc/models/subcategoria.md) | Optional | - | List<Subcategoria> getSubCategoria() | setSubCategoria(List<Subcategoria> subCategoria) |
| `Foto` | `String` | Optional | - | String getFoto() | setFoto(String foto) |
| `UnidadManejo` | `String` | Optional | - | String getUnidadManejo() | setUnidadManejo(String unidadManejo) |
| `UnidadMinimaVenta` | `Integer` | Optional | - | Integer getUnidadMinimaVenta() | setUnidadMinimaVenta(Integer unidadMinimaVenta) |
| `Peso` | `Integer` | Optional | - | Integer getPeso() | setPeso(Integer peso) |
| `UnidadesPorCaja` | `Integer` | Optional | - | Integer getUnidadesPorCaja() | setUnidadesPorCaja(Integer unidadesPorCaja) |
| `Proveedor` | [`Proveedor`](../../doc/models/proveedor.md) | Optional | - | Proveedor getProveedor() | setProveedor(Proveedor proveedor) |

## Example (as JSON)

```json
{
  "id": null,
  "codigo": null,
  "nombre": null,
  "precio": null,
  "iva": null,
  "categoria": null,
  "subCategoria": null,
  "foto": null,
  "unidadManejo": null,
  "unidadMinimaVenta": null,
  "peso": null,
  "unidadesPorCaja": null,
  "proveedor": null
}
```

