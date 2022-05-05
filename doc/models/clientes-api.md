
# Clientes API

## Structure

`ClientesAPI`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Id` | `Integer` | Optional | - | Integer getId() | setId(Integer id) |
| `Codigo` | `String` | Optional | - | String getCodigo() | setCodigo(String codigo) |
| `RazonSocial` | `String` | Optional | - | String getRazonSocial() | setRazonSocial(String razonSocial) |
| `NombreComercial` | `String` | Optional | - | String getNombreComercial() | setNombreComercial(String nombreComercial) |
| `Direccion` | `String` | Optional | - | String getDireccion() | setDireccion(String direccion) |
| `Ruc` | `String` | Optional | - | String getRuc() | setRuc(String ruc) |
| `Telefono` | `String` | Optional | - | String getTelefono() | setTelefono(String telefono) |
| `Latitud` | `Double` | Optional | - | Double getLatitud() | setLatitud(Double latitud) |
| `Longitud` | `Double` | Optional | - | Double getLongitud() | setLongitud(Double longitud) |
| `DiaVisita` | [`DiaEnum`](../../doc/models/dia-enum.md) | Optional | - | DiaEnum getDiaVisita() | setDiaVisita(DiaEnum diaVisita) |
| `Email` | `String` | Optional | - | String getEmail() | setEmail(String email) |
| `JerarquiaPrincipal` | [`JerarquiaPrincipal`](../../doc/models/jerarquia-principal.md) | Optional | - | JerarquiaPrincipal getJerarquiaPrincipal() | setJerarquiaPrincipal(JerarquiaPrincipal jerarquiaPrincipal) |
| `Credito` | [`List<Credito>`](../../doc/models/credito.md) | Optional | - | List<Credito> getCredito() | setCredito(List<Credito> credito) |
| `Cartera` | [`List<Cartera>`](../../doc/models/cartera.md) | Optional | - | List<Cartera> getCartera() | setCartera(List<Cartera> cartera) |

## Example (as JSON)

```json
{
  "id": null,
  "codigo": null,
  "razonSocial": null,
  "nombreComercial": null,
  "direccion": null,
  "ruc": null,
  "telefono": null,
  "latitud": null,
  "longitud": null,
  "diaVisita": null,
  "email": null,
  "jerarquiaPrincipal": null,
  "credito": null,
  "cartera": null
}
```

