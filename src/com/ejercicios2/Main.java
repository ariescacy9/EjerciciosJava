package com.ejercicios2;

import java.io.FileInputStream;
import java.io.InputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.Vector;

public class Main {
  public static void main(String[] args) {
    //Escribe el código que devuelva una cadena al revés. Por ejemplo, la cadena "hola mundo", debe retornar "odnum aloh".
    reverseText();

    //Crea un array unidimensional de Strings y recórrelo, mostrando únicamente sus valores.
    arrayUnidimencinal();

    //Crea un array bidimensional de enteros y recórrelo, mostrando la posición y el valor de cada elemento en ambas dimensiones.
    arrayBidimencinal();

    //Crea un "Vector" del tipo de dato que prefieras, y añádele 5 elementos. Elimina el 2o y 3er elemento y muestra el resultado final.
    vectores();

    //Crea un ArrayList de tipo String, con 4 elementos. Cópialo en una LinkedList. Recorre ambos mostrando únicamente el valor de cada elemento.
    copyLinkedListOfArrayList();

    //Crea un ArrayList de tipo int, y, utilizando un bucle rellénalo con elementos 1..10. A continuación, con otro bucle, recórrelo y elimina los numeros pares. Por último, vuelve a recorrerlo y muestra el ArrayList final.
    arrayListAutomatic();

    //Crea una función DividePorCero. Esta, debe generar una excepción ("throws") a su llamante del tipo ArithmeticException que será capturada por su llamante (desde "main", por ejemplo). Si se dispara la excepción, mostraremos el mensaje "Esto no puede hacerse". Finalmente, mostraremos en cualquier caso: "Demo de código".
    errorThrow();

    //Utilizando InputStream y PrintStream, crea una función que reciba dos parámetros: "fileIn" y "fileOut". La tarea de la función será realizar la copia del fichero dado en el parámetro "fileIn" al fichero dado en "fileOut".
    copiandoArchivos();

  }
//--------------------------------------------------
  static void reverseText(){

    Scanner texto = new Scanner(System.in);
    System.out.println("ingrese el texto a voltear");
    String cadena = texto.nextLine();
    String showReverse="";

    /*
    StringBuilder showReverse=new StringBuilder(cadena);
    cadena = showReverse.reverse().toString();
    System.out.println(cadena);
    */

    for(int i = cadena.length() -1;i>-1;i--){
      showReverse += cadena.charAt(i);
    }

    System.out.println("el texto al reverso es: " + showReverse);
  }
//----------------------------------------------------
  static void arrayUnidimencinal(){
    String nombres[] = {"lucas", "juan","pablito"};

    for(String nombre: nombres){
      System.out.println(nombre);
    }
  }
  //-------------------------------------------
  static void arrayBidimencinal(){
    int enteros [][] = {
        {1,2,3,4},
        {5,6,7,8},
        {9,10,11,12}
    };

    for(int i = 0 ; i< enteros.length; i++){
      for(int j = 0 ; j< enteros[i].length; j++){
        System.out.println("posicion: i=" + i + " j=" + j +" -valor: "+enteros[i][j]);
      }
    }
  }
  //-------------------------------------------------
  static void vectores(){
    Vector vectores = new Vector();
    vectores.add("A");
    vectores.add("E");
    vectores.add("I");
    vectores.add("O");
    vectores.add("U");
    System.out.println("el vector es: "+vectores);

    vectores.remove(2);
    vectores.remove(1);
    System.out.println("eliminados el tercero y el segundo de vectores: "+vectores);
  }
//----------------------------------------------------------
  static void copyLinkedListOfArrayList(){
    ArrayList<Integer> listaArray = new ArrayList<Integer>();
    listaArray.add(10);
    listaArray.add(20);
    listaArray.add(50);
    listaArray.add(100);

    LinkedList<Integer> linkedlist = new LinkedList<Integer>();
    for (int i = 0; i < listaArray.size(); i++) {
      linkedlist.add(i, listaArray.get(i));
    }
    System.out.println("ArrayList es: ");
    for(Integer list: listaArray){
      System.out.println(list + " ");
    }

    System.out.println("linkedlist es: ");
    for(Integer linked: linkedlist){
      System.out.println(linked+" ");
    }
  }
//--------------------------------------------------------
  static void arrayListAutomatic(){
    ArrayList<Integer> listaArrayAutomatic = new ArrayList<Integer>();
    for(int i= 1; i<=10; i++){
      listaArrayAutomatic.add(i);
    }
    System.out.println("el array es:"+listaArrayAutomatic);

    for (int i=0; i<listaArrayAutomatic.size();i++){
      if(listaArrayAutomatic.get(i) % 2 == 0){
        listaArrayAutomatic.remove(i);
      }
    }
    System.out.println("el array final sin pares es: "+listaArrayAutomatic);
  }
//------------------------------------------------------------------
  static void divisionErrorByZero() throws ArithmeticException{
    Scanner scanner = new Scanner(System.in);
    System.out.print("Ingrese 2 numeros: ");

    int numero1 = scanner.nextInt();
    int numero2 = scanner.nextInt();

    try{
      int resultado = numero1/numero2;
      System.out.println("el resultado es: "+resultado);
    } catch ( ArithmeticException e){
      throw e;
    }
  }

  static void errorThrow(){
    try{
      divisionErrorByZero();
    } catch (ArithmeticException e){
      System.out.println( "Esto no puede hacerse: "+ e.getMessage());
    } finally {
      System.out.println("Demo de código");
    }
  }
//----------------------------------------------------------------
  static void copiandoArchivos(){
    Scanner scanner = new Scanner(System.in);
    System.out.println("Introduce el fichero de origen: ");
    String fileIn = scanner.nextLine();
    System.out.println("Introduce el fichero de destino: ");
    String fileOut = scanner.nextLine();
    copiar(fileIn, fileOut);
  }

  private static void copiar(String fileIn, String fileOut) {
    try {
      InputStream in = new FileInputStream(fileIn);
      byte[] datos = in.readAllBytes();
      in.close();

      PrintStream out = new PrintStream(fileOut);
      out.write(datos);
      out.close();
      System.out.println("archivos copiados con exito !!!");
    } catch (Exception e) {
      System.out.println("Excepcion: " + e.getMessage());
    }
  }
}

