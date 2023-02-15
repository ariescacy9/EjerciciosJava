package com.clases;
import com.clases.SmartDevice;

public class SmartWath extends SmartDevice{
  private String pila;
  private String tipo;
  public SmartWath(){
    super();
  }

  public SmartWath(String fabricante, String modelo, String color,int year,String pila, String tipo){
    super(fabricante,modelo,color,year);
    this.pila = pila;
    this.tipo = tipo;
  }

  @Override
  public String toString() {
    return "fabricante=" + fabricante +
        ", modelo=" + modelo +
        ", color=" + color +
        ", year=" + year +
        ", pila=" + pila+
        ",tipo=" + tipo;
  }
}