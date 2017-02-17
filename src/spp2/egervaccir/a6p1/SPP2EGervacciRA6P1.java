/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spp2.egervaccir.a6p1;
import java.util.Scanner;
/**
 *
 * @author usuario
 */
public class SPP2EGervacciRA6P1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       System.out.println("\nLa suma total es de = " + suma(solicitaEntero("un número entero positivo: ")));
       }
public static int solicitaEntero(String mensaje){
        Scanner kb = new Scanner (System.in);
        int varEntera = 0;
        boolean flag;
        
        do{
        System.out.print("Introduzca " + mensaje);
        try{
        varEntera = kb.nextInt();
        flag=false;
    }catch (Exception ex){
            System.out.println("Introdujo una variable incorrecta ");
            flag=true;
            kb.nextLine();
            
        return varEntera;
    }     
    } while (flag); 
    return varEntera;
    }
public static int suma(int num){
   int suma = 0;
   while (num>=0){
       suma = suma + num;
       num = solicitaEntero("otro número entero positivo: ");
       if (num<0){
           System.out.println("Introdujo un número negativo!");
       }
    }
   return suma;
}
}