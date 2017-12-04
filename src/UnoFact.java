import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ADMIN
 */
public class UnoFact {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     
  
   int n, fac;
   Scanner y = new Scanner (System.in);
   System.out.print("ingrese el numero al cual desea calcularle el factorial : ");
   n = y.nextInt();
   System.out.println ("la multiplicacion de los siguientes numeros entre si da  el factorial de "+ n );
   fac = factorial (n);
   System.out.println("el factorial de "+ n + " es " + fac);
   
    }
   static int factorial (int n){
   int factor, fac;
   if (n == 0){
     fac = 1;
   }
   else{
   fac = n * factorial (n - 1);
   System.out.println (n-1 +"x"+ n);
   }
   return fac;
   } 
}
