package com.ibm.academia;

public class Noperecible extends Productos
{
    String contenido;
    Integer calorias;

    public Noperecible(String nombre, Double precio, String contenido, Integer calorias) {
        super(nombre, precio);
        this.contenido = contenido;
        this.calorias = calorias;
    }

    public String getContenido() {
        return contenido;
    }

    public void setContenido(String contenido) {
        this.contenido = contenido;
    }

    public Integer getCalorias() {
        return calorias;
    }

    public void setCalorias(Integer calorias) {
        this.calorias = calorias;
    }

    @Override
    public String toString() {
        return "Noperecible{" +
                "contenido=" + contenido +
                ", calorias=" + calorias +
                ", nombre='" + nombre + '\'' +
                ", precio=" + precio +
                '}';
    }
}
