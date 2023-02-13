package com.ejercicios;

public class Variables {
  public static void main(String[] args) {
    byte variable1 = 1;
    short variable2 = 2;
    int variable3 = 3;
    long variable4 = 4;
    float variable5 = 5.0f;
    double variable6 = 6.0d;
    boolean variable7 = true;
    boolean variable8 = false;
    char variable9 = 'a';
    String variable10 = "hi my friends";
    Object[] salidaVariable = {variable1,variable2,variable3,variable4,variable5,variable6,variable7,variable8,variable9,variable10};
    for (Object o : salidaVariable) {
      System.out.println("el dato: " + o + " es de tipo: " + o.getClass().getSimpleName());
    }
  }
}
