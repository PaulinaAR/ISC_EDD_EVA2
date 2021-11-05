/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva2_4_gcd;

/**
 *
 * @author asus X556U
 */
public class EVA2_4_GCD {

   /**
    * @param args the command line arguments
    */
   public static void main(String[] args) {
      // TODO code application logic here
      System.out.println("El MCD de 180 y 48 es " + gcd(180,48));
   }
   
   public static int gcd(int iDividendo, int iDivisor){
      //¿Cómo calculamos el residuo?
      //Módulo -->%
      if(iDivisor ==0)//DETENERNOS
         return iDividendo;
      else{//RECURSIVIDAD
      int iResi = iDividendo % iDivisor;
      //¿Cómo hacemos el método recursivo?
      return gcd(iDivisor, iResi);
      }
   }
}
