/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package examen1p1_liaerazo;
import java.util.Scanner;
/**
 *
 * @author Paola
 */
public class Examen1P1_LiaErazo {

    /**
     * @param args the command line arguments
     */
    @SuppressWarnings("empty-statement")
    public static void main(String[] args) {
                Scanner leer=new Scanner(System.in);
                 boolean seguir=true;
                 while(seguir){
                    System.out.println("MENU");
                    System.out.println("1. Sumador Binario");
                    System.out.println("2. Estrella de David");
                    System.out.println("3.  Salir");
                    int opcion=leer.nextInt();
                    switch(opcion){
                        case 1 -> {
                            String A,B;
                            System.out.println("Ingrese la primera cadena de numeros:");
                            A=leer.next();
                            System.out.println("Ingrese la sugunda cadena de numeros:");
                            B=leer.next();
                            String suma = null;
                            boolean chase=false;
                            while(A.length()==B.length()){
                                for(int i=0;i<A.length();i++){
                                    char r=A.charAt(i);
                                    for(int t=0;t<B.length();t++);
                                    if(r>='1'&&r<='1'|| r<='1'&&r>='1'){
                                        chase=true;
                                    }
                                }
                              suma=A+B;
                            }
                            System.out.println("La primera cadena de numeros:"+A);
                            System.out.println("La segunda cadena de numeros:"+B);
                            System.out.println("La suma es:"+suma);
                           }
                        case 2 -> {
                           System.out.println("1. Triangulo Invertido");
                           System.out.println("2. Triangulo ");
                           int opcion_2=leer.nextInt();
                          switch (opcion_2){
                          case 1 -> {
                            System.out.print("Ingrese numero de filas:");
                            int numfila = leer.nextInt();
                            if(numfila>9&&numfila%2==1){
                               for(int espacio=0,relleno=(numfila*2)-1;relleno>0;espacio++,relleno-= 2){
                                for(int i=0;i<espacio;i++){
                                    System.out.print(" ");
                                }
                               //imprime los asteriscos
                               for(int j=relleno;j>0;j--){
                                   System.out.print("*");
                                    for(int k=j;k<0;k++){
                                     System.out.println();
                                    }
                               }
                               //imprime los espacios
                               System.out.println("");
                                 }
                          } else{
                           System.out.println("ERROR,solo numeros impares y mayores que 9");
                            }       
                          }
                            case 2->{
                              System.out.print("Ingrese numero de filas:");
                              int numfila = leer.nextInt();
                              if(numfila>9&&numfila%2==1){
                                  for(int altura=1;altura<=numfila; altura++){ 
                                    //espacios
                                    for(int espacio_2 = 1; espacio_2<=numfila-altura; espacio_2++){ 
                                       System.out.print(" "); 
                                      }
                                      for(int relleno_2=1; relleno_2<=(altura*2)-1; relleno_2++){
                                          System.out.print("*");
                                        }
                                      System.out.println();
                                }
                            }
                         }    
                    }
                 }
                case 3 -> {
                      seguir=false;
                }
             }
         }
    }
}