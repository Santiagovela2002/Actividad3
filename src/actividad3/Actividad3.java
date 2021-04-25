/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actividad3;

import java.util.Scanner;

/**
 *
 * @author Santiago Vela
 */
public class Actividad3 {


    public static void encabezado() {
    System.out.println("Universidad Autonóma de Campeche");
    System.out.println("Facultad de Ingeniería");
    System.out.println("Ingeniería de Sistemas Computacionales");
    System.out.println("Santiago Joel Vela Mena");
    System.out.println("Abril 2021");
    }

    public static void cuerpo() {
        System.out.println("=========================================================");
        System.out.println("Seleccione una Opción para efectuar: ");
        System.out.println("1: Suma del 0 al 10");
        System.out.println("2: Factorial del 1 al 10");
        System.out.println("3: Factorial de un numero introducido por usted");
        System.out.println("4: Media de la suma del 0 hasta el numero que usted proporcione ");
        System.out.println("5: Suma de números, promedio, determinar cuál numero es mayor y menor y la distancia numérica entre ellos, de n números que usted proporcione");
        System.out.println("6: Días de la semana");
        System.out.println("7: Modelo del juego de gato");
        System.out.println("=========================================================");
    }

    public static void pie() {
        System.out.println("=========================================================");
        System.out.println("SVM.2021");
    }
    
    
    public static void principal(int numero){
        
        Scanner entrada = new Scanner(System.in);
        
        int Valores = numero;
        
        switch(Valores){
            
            case 1:
                System.out.println("Suma del 0 al 10");
                System.out.println("=========================================================");
                suma();
                break;
            case 2:
                System.out.println("Factorial del 10");
                System.out.println("=========================================================");
                factorial();
                break;
            case 3:
                System.out.println("Factorial de un numero introducido por usted");
                System.out.println("=========================================================");
                System.out.print("Introduzca un número para calcular el factorial: ");
                entradaFactorial(entrada.nextInt());
                break;
            case 4:
                System.out.println("Media de la suma del 0 hasta el numero que usted proporcione");
                System.out.println("=========================================================");
                System.out.print("Introduzca un número para calcular la media: ");
                media(entrada.nextDouble());
                break;
            case 5:
                System.out.println("Suma de números, promedio, determinar cuál numero es mayor y menor y la distancia numérica entre ellos, de n números que usted proporcione");
                System.out.println("=========================================================");
                System.out.print("Introduzca la cantidad de números que deseas introducir: ");
                sumaPromedio(entrada.nextInt());
                break;
            case 6:
                System.out.println("Días de la semana");
                System.out.println("=========================================================");
                diadelaSemana();
                break;
            case 7:
                System.out.println("Modelo del juego de gato");
                System.out.println("=========================================================");
                juegodegato();
                break;
                
        }
        
    }
    
    public static void suma(){
        int suma = 0;
        
        for (int i = 0; i <= 10; i++) {
            
            suma += i;
        }
        System.out.println("La suma del 0 hasta el 10 es de: " + suma);   
    }
    
    public static void factorial(){
       
        int factorial = 1;
        
        for (int i = 10; i >= 1; i--) {
            
            factorial *= i;
 
        }

        
        System.out.println("El factorial de 10 es " + factorial);
        
    }
    
    public static void entradaFactorial(int valor){
        
        int numero = valor;
        int factorial = 1;
        
        for (int i = numero; i >= 1; i--) {
            
            factorial *= i;
            
        }

        System.out.println("El factorial de " + numero + " es: " + factorial);
        
    }
    
    public static void media(double valor){
        
        double numero = valor;
        double suma = 0;
        
        for (int i = 1; i <= numero; i++) {
            
            suma += i;  
        }
        double media = suma / numero;
        
        System.out.println("La media de los numeros que estan entre el 0 y " + numero + " es " + media);
        
    }
    
    public static void sumaPromedio(int valor){
         
        Scanner entrada = new Scanner(System.in);
        
        int numero = valor;
        int suma = 0;
        double promedio;
        int diferencia;
        
        int arrays[] = new int[numero];
        
        for (int i = 0; i < arrays.length; i++) {
            
            System.out.print("Introduzca el numero " + (i + 1) + ": ");
            arrays[i] = entrada.nextInt();
            
        }
        
        int mayor, menor;
        mayor = menor = arrays[0];
        
        for (int i = 0; i < arrays.length; i++) {
            
            if(arrays[i] > mayor){
                mayor = arrays[i];
            } else if(arrays[i] < menor){
                menor = arrays[i];
            }
            
            suma += arrays[i];
            
        }
        
        promedio = (double)suma / (double)numero;
        diferencia = mayor - menor;
        
        System.out.println("La cantidad de numeros introducidos fueron : " + numero);
        System.out.println("El promedio de los numeros introducidos es de: " + promedio);
        System.out.println("El numero mayor introducido fue: " + mayor);
        System.out.println("El numero menor introducido fue: " + menor);
        System.out.println("La diferencia del numero mayor y menor es de: " + diferencia);
        
    }
    
    public static void diadelaSemana(){
        
        String dias[] = new String[7];
  
        dias[0] = "Lunes";
        dias[1] = "Martes";
        dias[2] = "Miercoles";
        dias[3] = "Jueves";
        dias[4] = "Viernes";
        dias[5] = "Sabado";
        dias[6] = "Domingo";
        for(String diaS: dias){   
            System.out.println(diaS);
        }
        
    }
    
    public static void juegodegato(){
        
        String gato[][] = new String[3][3];
        
        for(String vertical[]: gato){
            for(String horizontal: vertical){
                System.out.print("+  " + "   ");
            }
            System.out.println("");
        }
        
    }
    
        public static void main(String[] args) {
    
    encabezado();
    
    cuerpo();
    
    Scanner entrada = new Scanner(System.in);

    System.out.print("Introduzca el número de la opción que quiera ejecutar: ");

    principal(entrada.nextInt());
    
    pie();
    
    }
    
}

    
    
    




    


