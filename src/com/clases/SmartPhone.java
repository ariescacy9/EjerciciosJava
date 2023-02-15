package com.clases;
import com.clases.SmartDevice;

public class SmartPhone extends SmartDevice {
  private String bateria;
  private boolean cargaRapida;
  public SmartPhone(){
    super();
  }

  public SmartPhone(String fabricante, String modelo, String color,int year,String bateria, boolean cargaRapida){
    super(fabricante,modelo,color,year);
    this.bateria = bateria;
    this.cargaRapida = cargaRapida;
  }
  @Override
  public String toString() {
    return "fabricante=" + fabricante +
        ", modelo=" + modelo +
        ", color=" + color +
        ", year=" + year +
        ", bateria=" + bateria+
        ",cargaRapida=" + cargaRapida;
  }
}
