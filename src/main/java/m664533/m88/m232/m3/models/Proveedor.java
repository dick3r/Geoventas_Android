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
import m664533.m88.m232.m3.internal.OptionalNullable;

/**
 * This is a model class for Proveedor type.
 */
public class Proveedor {
    private Integer id;
    private OptionalNullable<String> nombre;

    /**
     * Default constructor.
     */
    public Proveedor() {
    }

    /**
     * Initialization constructor.
     * @param  id  Integer value for id.
     * @param  nombre  String value for nombre.
     */
    public Proveedor(
            Integer id,
            String nombre) {
        this.id = id;
        this.nombre = OptionalNullable.of(nombre);
    }

    /**
     * Internal initialization constructor.
     */
    protected Proveedor(Integer id, OptionalNullable<String> nombre) {
        this.id = id;
        this.nombre = nombre;
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
     * Converts this Proveedor into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "Proveedor [" + "id=" + id + ", nombre=" + nombre + "]";
    }

    /**
     * Builds a new {@link Proveedor.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link Proveedor.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .id(getId());
        builder.nombre = internalGetNombre();
        return builder;
    }

    /**
     * Class to build instances of {@link Proveedor}.
     */
    public static class Builder {
        private Integer id;
        private OptionalNullable<String> nombre;



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
         * Builds a new {@link Proveedor} object using the set fields.
         * @return {@link Proveedor}
         */
        public Proveedor build() {
            return new Proveedor(id, nombre);
        }
    }
}
