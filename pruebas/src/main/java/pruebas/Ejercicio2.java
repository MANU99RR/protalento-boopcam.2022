package pruebas;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		
     Scanner teclado = new Scanner(System.in);
     
     //Ahora puedo leer datos del teclado
     System.out.println("ingrese el valor de a:");
    
      int a = teclado.nextInt();//leer un darto entero
    System.out.println("ingrese el valor de b:");
    
    int b = teclado.nextInt();
    
    int suma = a + b;
    
    System.out.println("la suma es=" + suma);
    
    //cierro el teclado
    teclado.close();
	}

}
