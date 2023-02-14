package com.ejercicios;

import java.util.Scanner;

public class PrecioAddIVA {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("ingrese el precio sin IVA");
    double precio = scanner.nextDouble();
    getIVA(precio);
  }
  static void getIVA( double precio){
     System.out.println("el precio con iva de " + precio + " es: "+ (precio + precio*0.21));
  }
}
