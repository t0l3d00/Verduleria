package com.ibm.academia.test;

import com.ibm.academia.*;

public class TestMain
{
    public static void main(String agrs[])
    {
        Productos [] arregloProductos = new Productos[8];

        Fruta Pera = new Fruta("Pera",8.50,.250,"verde");
        Fruta Platano = new Fruta("Platano",10.50,.500,"amarillo");

        Lacteo Queso = new Lacteo(.180,15,"Queso",35.50);
        Lacteo Crema = new Lacteo(.500,8,"Crema",22.50);

        Limpieza Cloro = new Limpieza("Cloro",7.50,"hipoclorito",.500);
        Limpieza Limpiapiso = new Limpieza("Limpiapiso",7.50,"Agua, tensoactivo aniónico, perfume, tensoactivos no iónicos, regulador de pH, glutaraldehído, colorante.",.500);

        Noperecible Jamon = new Noperecible("Jamon",25.90,"hierro",100);
        Noperecible Chorizo = new Noperecible("Chorizo",40.90,"hierro",500);

        arregloProductos[0]=Pera;
        arregloProductos[1]=Platano;
        arregloProductos[2]=Queso;
        arregloProductos[3]=Crema;
        arregloProductos[4]=Cloro;
        arregloProductos[5]=Limpiapiso;
        arregloProductos[6]=Jamon;
        arregloProductos[7]=Chorizo;
    }
}
