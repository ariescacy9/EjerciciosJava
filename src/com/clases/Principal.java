package com.clases;
import com.clases.SmartDevice;
import com.clases.SmartPhone;
import com.clases.SmartWath;

public class Principal {
  public static void main(String[] args) {

    SmartWath smartWhath1 = new SmartWath();
    SmartPhone smartPhone1 = new SmartPhone();
    SmartPhone smartPhone2 = new SmartPhone("NOKIA","KL12","Verde",2022,"bateryLitio",true);
    SmartWath smartWatch2 = new SmartWath("Camon", "H6YA", "Azul",2021, "pilaRay","intellij");

    System.out.println("smartphone1: " + smartPhone1 + "\nsmartwatch1: " + smartWhath1);
    System.out.println("smartphone2: " + smartPhone2 + "\nsmartwatch2: " + smartWatch2);
  }
}
