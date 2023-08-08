
package sistemasdecontroldeversiones;

import java.util.Scanner;

public class SistemasDeControlDeVersiones {

    //Programa para usar en practicas de SISTEMAS DE CONTROL DE VERSIONES...
   
    public static void main(String[] args) {
       Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese un numero para saber si es par o impar");
        int n = leer.nextInt();
        if (n % 2 == 0 && n!=0){
            System.out.println("El numero es par");
        }else{
            System.out.println("El numero es impar");
        }
        
        esPositivo numero = new esPositivo(n);
         if(numero.esMultiploDe(n)==true){
            System.out.println("Es positivo");
        } else{
            System.out.println("Es negativo");
         }
    
    }

//    private static esMultiplo esMultiplo(int i) {
//        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
//   
    }

