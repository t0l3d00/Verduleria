package com.ibm.academia;

public class Lacteo extends Productos
{
    Double cantidad;
    Integer proteinas;

    public Lacteo(Double cantidad, Integer proteinas, String nombre, Double precio) {
        super (nombre, precio);
        this.cantidad = cantidad;
        this.proteinas = proteinas;
    }


    public Double getCantidad() {
        return cantidad;
    }

    public void setCantidad(Double cantidad) {
        this.cantidad = cantidad;
    }

    public Integer getProteinas() {
        return proteinas;
    }

    public void setProteinas(Integer proteinas) {
        this.proteinas = proteinas;
    }

    @Override
    public String toString() {
        return "Lacteo{" +
                "cantidad=" + cantidad +
                ", proteinas=" + proteinas +
                ", nombre='" + nombre + '\'' +
                ", precio=" + precio +
                '}';
    }
}
