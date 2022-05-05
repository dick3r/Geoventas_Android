/*
 * GeoventasAndroidAPILib
 *
 * This file was automatically generated by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package m664533.m88.m232.m3.models;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import java.util.List;
import m664533.m88.m232.m3.internal.OptionalNullable;

/**
 * This is a model class for ProductsAPI type.
 */
public class ProductsAPI {
    private Integer id;
    private OptionalNullable<String> codigo;
    private OptionalNullable<String> nombre;
    private Double precio;
    private Boolean iva;
    private OptionalNullable<List<Categoria>> categoria;
    private OptionalNullable<List<Subcategoria>> subCategoria;
    private OptionalNullable<String> foto;
    private OptionalNullable<String> unidadManejo;
    private Integer unidadMinimaVenta;
    private Integer peso;
    private Integer unidadesPorCaja;
    private Proveedor proveedor;

    /**
     * Default constructor.
     */
    public ProductsAPI() {
    }

    /**
     * Initialization constructor.
     * @param  id  Integer value for id.
     * @param  codigo  String value for codigo.
     * @param  nombre  String value for nombre.
     * @param  precio  Double value for precio.
     * @param  iva  Boolean value for iva.
     * @param  categoria  List of Categoria value for categoria.
     * @param  subCategoria  List of Subcategoria value for subCategoria.
     * @param  foto  String value for foto.
     * @param  unidadManejo  String value for unidadManejo.
     * @param  unidadMinimaVenta  Integer value for unidadMinimaVenta.
     * @param  peso  Integer value for peso.
     * @param  unidadesPorCaja  Integer value for unidadesPorCaja.
     * @param  proveedor  Proveedor value for proveedor.
     */
    public ProductsAPI(
            Integer id,
            String codigo,
            String nombre,
            Double precio,
            Boolean iva,
            List<Categoria> categoria,
            List<Subcategoria> subCategoria,
            String foto,
            String unidadManejo,
            Integer unidadMinimaVenta,
            Integer peso,
            Integer unidadesPorCaja,
            Proveedor proveedor) {
        this.id = id;
        this.codigo = OptionalNullable.of(codigo);
        this.nombre = OptionalNullable.of(nombre);
        this.precio = precio;
        this.iva = iva;
        this.categoria = OptionalNullable.of(categoria);
        this.subCategoria = OptionalNullable.of(subCategoria);
        this.foto = OptionalNullable.of(foto);
        this.unidadManejo = OptionalNullable.of(unidadManejo);
        this.unidadMinimaVenta = unidadMinimaVenta;
        this.peso = peso;
        this.unidadesPorCaja = unidadesPorCaja;
        this.proveedor = proveedor;
    }

    /**
     * Internal initialization constructor.
     */
    protected ProductsAPI(Integer id, OptionalNullable<String> codigo,
            OptionalNullable<String> nombre, Double precio, Boolean iva,
            OptionalNullable<List<Categoria>> categoria,
            OptionalNullable<List<Subcategoria>> subCategoria, OptionalNullable<String> foto,
            OptionalNullable<String> unidadManejo, Integer unidadMinimaVenta, Integer peso,
            Integer unidadesPorCaja, Proveedor proveedor) {
        this.id = id;
        this.codigo = codigo;
        this.nombre = nombre;
        this.precio = precio;
        this.iva = iva;
        this.categoria = categoria;
        this.subCategoria = subCategoria;
        this.foto = foto;
        this.unidadManejo = unidadManejo;
        this.unidadMinimaVenta = unidadMinimaVenta;
        this.peso = peso;
        this.unidadesPorCaja = unidadesPorCaja;
        this.proveedor = proveedor;
    }

    /**
     * Getter for Id.
     * @return Returns the Integer
     */
    @JsonGetter("id")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Integer getId() {
        return id;
    }

    /**
     * Setter for Id.
     * @param id Value for Integer
     */
    @JsonSetter("id")
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * Internal Getter for Codigo.
     * @return Returns the Internal String
     */
    @JsonGetter("codigo")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.Serializer.class)
    protected OptionalNullable<String> internalGetCodigo() {
        return this.codigo;
    }

    /**
     * Getter for Codigo.
     * @return Returns the String
     */
    public String getCodigo() {
        return OptionalNullable.getFrom(codigo);
    }

    /**
     * Setter for Codigo.
     * @param codigo Value for String
     */
    @JsonSetter("codigo")
    public void setCodigo(String codigo) {
        this.codigo = OptionalNullable.of(codigo);
    }

    /**
     * UnSetter for Codigo.
     */
    public void unsetCodigo() {
        codigo = null;
    }

    /**
     * Internal Getter for Nombre.
     * @return Returns the Internal String
     */
    @JsonGetter("nombre")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.Serializer.class)
    protected OptionalNullable<String> internalGetNombre() {
        return this.nombre;
    }

    /**
     * Getter for Nombre.
     * @return Returns the String
     */
    public String getNombre() {
        return OptionalNullable.getFrom(nombre);
    }

    /**
     * Setter for Nombre.
     * @param nombre Value for String
     */
    @JsonSetter("nombre")
    public void setNombre(String nombre) {
        this.nombre = OptionalNullable.of(nombre);
    }

    /**
     * UnSetter for Nombre.
     */
    public void unsetNombre() {
        nombre = null;
    }

    /**
     * Getter for Precio.
     * @return Returns the Double
     */
    @JsonGetter("precio")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Double getPrecio() {
        return precio;
    }

    /**
     * Setter for Precio.
     * @param precio Value for Double
     */
    @JsonSetter("precio")
    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    /**
     * Getter for Iva.
     * @return Returns the Boolean
     */
    @JsonGetter("iva")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Boolean getIva() {
        return iva;
    }

    /**
     * Setter for Iva.
     * @param iva Value for Boolean
     */
    @JsonSetter("iva")
    public void setIva(Boolean iva) {
        this.iva = iva;
    }

    /**
     * Internal Getter for Categoria.
     * @return Returns the Internal List of Categoria
     */
    @JsonGetter("categoria")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.Serializer.class)
    protected OptionalNullable<List<Categoria>> internalGetCategoria() {
        return this.categoria;
    }

    /**
     * Getter for Categoria.
     * @return Returns the List of Categoria
     */
    public List<Categoria> getCategoria() {
        return OptionalNullable.getFrom(categoria);
    }

    /**
     * Setter for Categoria.
     * @param categoria Value for List of Categoria
     */
    @JsonSetter("categoria")
    public void setCategoria(List<Categoria> categoria) {
        this.categoria = OptionalNullable.of(categoria);
    }

    /**
     * UnSetter for Categoria.
     */
    public void unsetCategoria() {
        categoria = null;
    }

    /**
     * Internal Getter for SubCategoria.
     * @return Returns the Internal List of Subcategoria
     */
    @JsonGetter("subCategoria")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.Serializer.class)
    protected OptionalNullable<List<Subcategoria>> internalGetSubCategoria() {
        return this.subCategoria;
    }

    /**
     * Getter for SubCategoria.
     * @return Returns the List of Subcategoria
     */
    public List<Subcategoria> getSubCategoria() {
        return OptionalNullable.getFrom(subCategoria);
    }

    /**
     * Setter for SubCategoria.
     * @param subCategoria Value for List of Subcategoria
     */
    @JsonSetter("subCategoria")
    public void setSubCategoria(List<Subcategoria> subCategoria) {
        this.subCategoria = OptionalNullable.of(subCategoria);
    }

    /**
     * UnSetter for SubCategoria.
     */
    public void unsetSubCategoria() {
        subCategoria = null;
    }

    /**
     * Internal Getter for Foto.
     * @return Returns the Internal String
     */
    @JsonGetter("foto")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.Serializer.class)
    protected OptionalNullable<String> internalGetFoto() {
        return this.foto;
    }

    /**
     * Getter for Foto.
     * @return Returns the String
     */
    public String getFoto() {
        return OptionalNullable.getFrom(foto);
    }

    /**
     * Setter for Foto.
     * @param foto Value for String
     */
    @JsonSetter("foto")
    public void setFoto(String foto) {
        this.foto = OptionalNullable.of(foto);
    }

    /**
     * UnSetter for Foto.
     */
    public void unsetFoto() {
        foto = null;
    }

    /**
     * Internal Getter for UnidadManejo.
     * @return Returns the Internal String
     */
    @JsonGetter("unidadManejo")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.Serializer.class)
    protected OptionalNullable<String> internalGetUnidadManejo() {
        return this.unidadManejo;
    }

    /**
     * Getter for UnidadManejo.
     * @return Returns the String
     */
    public String getUnidadManejo() {
        return OptionalNullable.getFrom(unidadManejo);
    }

    /**
     * Setter for UnidadManejo.
     * @param unidadManejo Value for String
     */
    @JsonSetter("unidadManejo")
    public void setUnidadManejo(String unidadManejo) {
        this.unidadManejo = OptionalNullable.of(unidadManejo);
    }

    /**
     * UnSetter for UnidadManejo.
     */
    public void unsetUnidadManejo() {
        unidadManejo = null;
    }

    /**
     * Getter for UnidadMinimaVenta.
     * @return Returns the Integer
     */
    @JsonGetter("unidadMinimaVenta")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Integer getUnidadMinimaVenta() {
        return unidadMinimaVenta;
    }

    /**
     * Setter for UnidadMinimaVenta.
     * @param unidadMinimaVenta Value for Integer
     */
    @JsonSetter("unidadMinimaVenta")
    public void setUnidadMinimaVenta(Integer unidadMinimaVenta) {
        this.unidadMinimaVenta = unidadMinimaVenta;
    }

    /**
     * Getter for Peso.
     * @return Returns the Integer
     */
    @JsonGetter("peso")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Integer getPeso() {
        return peso;
    }

    /**
     * Setter for Peso.
     * @param peso Value for Integer
     */
    @JsonSetter("peso")
    public void setPeso(Integer peso) {
        this.peso = peso;
    }

    /**
     * Getter for UnidadesPorCaja.
     * @return Returns the Integer
     */
    @JsonGetter("unidadesPorCaja")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Integer getUnidadesPorCaja() {
        return unidadesPorCaja;
    }

    /**
     * Setter for UnidadesPorCaja.
     * @param unidadesPorCaja Value for Integer
     */
    @JsonSetter("unidadesPorCaja")
    public void setUnidadesPorCaja(Integer unidadesPorCaja) {
        this.unidadesPorCaja = unidadesPorCaja;
    }

    /**
     * Getter for Proveedor.
     * @return Returns the Proveedor
     */
    @JsonGetter("proveedor")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Proveedor getProveedor() {
        return proveedor;
    }

    /**
     * Setter for Proveedor.
     * @param proveedor Value for Proveedor
     */
    @JsonSetter("proveedor")
    public void setProveedor(Proveedor proveedor) {
        this.proveedor = proveedor;
    }

    /**
     * Converts this ProductsAPI into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "ProductsAPI [" + "id=" + id + ", codigo=" + codigo + ", nombre=" + nombre
                + ", precio=" + precio + ", iva=" + iva + ", categoria=" + categoria
                + ", subCategoria=" + subCategoria + ", foto=" + foto + ", unidadManejo="
                + unidadManejo + ", unidadMinimaVenta=" + unidadMinimaVenta + ", peso=" + peso
                + ", unidadesPorCaja=" + unidadesPorCaja + ", proveedor=" + proveedor + "]";
    }

    /**
     * Builds a new {@link ProductsAPI.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link ProductsAPI.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .id(getId())
                .precio(getPrecio())
                .iva(getIva())
                .unidadMinimaVenta(getUnidadMinimaVenta())
                .peso(getPeso())
                .unidadesPorCaja(getUnidadesPorCaja())
                .proveedor(getProveedor());
        builder.codigo = internalGetCodigo();
        builder.nombre = internalGetNombre();
        builder.categoria = internalGetCategoria();
        builder.subCategoria = internalGetSubCategoria();
        builder.foto = internalGetFoto();
        builder.unidadManejo = internalGetUnidadManejo();
        return builder;
    }

    /**
     * Class to build instances of {@link ProductsAPI}.
     */
    public static class Builder {
        private Integer id;
        private OptionalNullable<String> codigo;
        private OptionalNullable<String> nombre;
        private Double precio;
        private Boolean iva;
        private OptionalNullable<List<Categoria>> categoria;
        private OptionalNullable<List<Subcategoria>> subCategoria;
        private OptionalNullable<String> foto;
        private OptionalNullable<String> unidadManejo;
        private Integer unidadMinimaVenta;
        private Integer peso;
        private Integer unidadesPorCaja;
        private Proveedor proveedor;



        /**
         * Setter for id.
         * @param  id  Integer value for id.
         * @return Builder
         */
        public Builder id(Integer id) {
            this.id = id;
            return this;
        }

        /**
         * Setter for codigo.
         * @param  codigo  String value for codigo.
         * @return Builder
         */
        public Builder codigo(String codigo) {
            this.codigo = OptionalNullable.of(codigo);
            return this;
        }

        /**
         * UnSetter for codigo.
         * @return Builder
         */
        public Builder unsetCodigo() {
            codigo = null;
            return this;
        }

        /**
         * Setter for nombre.
         * @param  nombre  String value for nombre.
         * @return Builder
         */
        public Builder nombre(String nombre) {
            this.nombre = OptionalNullable.of(nombre);
            return this;
        }

        /**
         * UnSetter for nombre.
         * @return Builder
         */
        public Builder unsetNombre() {
            nombre = null;
            return this;
        }

        /**
         * Setter for precio.
         * @param  precio  Double value for precio.
         * @return Builder
         */
        public Builder precio(Double precio) {
            this.precio = precio;
            return this;
        }

        /**
         * Setter for iva.
         * @param  iva  Boolean value for iva.
         * @return Builder
         */
        public Builder iva(Boolean iva) {
            this.iva = iva;
            return this;
        }

        /**
         * Setter for categoria.
         * @param  categoria  List of Categoria value for categoria.
         * @return Builder
         */
        public Builder categoria(List<Categoria> categoria) {
            this.categoria = OptionalNullable.of(categoria);
            return this;
        }

        /**
         * UnSetter for categoria.
         * @return Builder
         */
        public Builder unsetCategoria() {
            categoria = null;
            return this;
        }

        /**
         * Setter for subCategoria.
         * @param  subCategoria  List of Subcategoria value for subCategoria.
         * @return Builder
         */
        public Builder subCategoria(List<Subcategoria> subCategoria) {
            this.subCategoria = OptionalNullable.of(subCategoria);
            return this;
        }

        /**
         * UnSetter for subCategoria.
         * @return Builder
         */
        public Builder unsetSubCategoria() {
            subCategoria = null;
            return this;
        }

        /**
         * Setter for foto.
         * @param  foto  String value for foto.
         * @return Builder
         */
        public Builder foto(String foto) {
            this.foto = OptionalNullable.of(foto);
            return this;
        }

        /**
         * UnSetter for foto.
         * @return Builder
         */
        public Builder unsetFoto() {
            foto = null;
            return this;
        }

        /**
         * Setter for unidadManejo.
         * @param  unidadManejo  String value for unidadManejo.
         * @return Builder
         */
        public Builder unidadManejo(String unidadManejo) {
            this.unidadManejo = OptionalNullable.of(unidadManejo);
            return this;
        }

        /**
         * UnSetter for unidadManejo.
         * @return Builder
         */
        public Builder unsetUnidadManejo() {
            unidadManejo = null;
            return this;
        }

        /**
         * Setter for unidadMinimaVenta.
         * @param  unidadMinimaVenta  Integer value for unidadMinimaVenta.
         * @return Builder
         */
        public Builder unidadMinimaVenta(Integer unidadMinimaVenta) {
            this.unidadMinimaVenta = unidadMinimaVenta;
            return this;
        }

        /**
         * Setter for peso.
         * @param  peso  Integer value for peso.
         * @return Builder
         */
        public Builder peso(Integer peso) {
            this.peso = peso;
            return this;
        }

        /**
         * Setter for unidadesPorCaja.
         * @param  unidadesPorCaja  Integer value for unidadesPorCaja.
         * @return Builder
         */
        public Builder unidadesPorCaja(Integer unidadesPorCaja) {
            this.unidadesPorCaja = unidadesPorCaja;
            return this;
        }

        /**
         * Setter for proveedor.
         * @param  proveedor  Proveedor value for proveedor.
         * @return Builder
         */
        public Builder proveedor(Proveedor proveedor) {
            this.proveedor = proveedor;
            return this;
        }

        /**
         * Builds a new {@link ProductsAPI} object using the set fields.
         * @return {@link ProductsAPI}
         */
        public ProductsAPI build() {
            return new ProductsAPI(id, codigo, nombre, precio, iva, categoria, subCategoria, foto,
                    unidadManejo, unidadMinimaVenta, peso, unidadesPorCaja, proveedor);
        }
    }
}
