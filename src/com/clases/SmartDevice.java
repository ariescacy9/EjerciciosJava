package com.clases;

public class SmartDevice {
  protected String fabricante;
  protected String modelo;
  protected String color;
  protected int year;

  public SmartDevice () {
  }

  public SmartDevice (String fabricante, String modelo) {
    this.fabricante = fabricante;
    this.modelo = modelo;
  }

  public SmartDevice (String fabricante, String modelo, String color,int year){
    this.fabricante = fabricante;
    this.modelo = modelo;
    this.color = color;
    this.year = year;
  }

}
