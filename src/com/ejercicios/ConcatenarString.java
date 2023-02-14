package com.ejercicios;

public class ConcatenarString {
  public static void main(String[] args) {
    String[] cadenas = {"hola", " soy", " una", " oración", " completa"};
    String oracion="";
    for (String palabra : cadenas) {
      oracion += palabra;
    }
    System.out.println(oracion);
  }
}
