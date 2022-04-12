package com.ibm.academia;

public class Limpieza extends Productos
{
    String componentes;
    Double litros;

    public Limpieza(String nombre, Double precio, String componentes, Double litros) {
        super(nombre, precio);
        this.componentes = componentes;
        this.litros = litros;
    }

    public String getComponentes() {
        return componentes;
    }

    public void setComponentes(String componentes) {
        this.componentes = componentes;
    }

    public Double getLitros() {
        return litros;
    }

    public void setLitros(Double litros) {
        this.litros = litros;
    }

    @Override
    public String toString() {
        return "Limpieza{" +
                "componentes='" + componentes + '\'' +
                ", litros=" + litros +
                ", nombre='" + nombre + '\'' +
                ", precio=" + precio +
                '}';
    }
}
