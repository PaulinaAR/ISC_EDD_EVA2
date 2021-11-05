/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva2_5_fibonacci;

/**
 *
 * @author asus X556U
 */
public class EVA2_5_FIBONACCI {

   /**
    * @param args the command line arguments
    */
   public static void main(String[] args) {
      // TODO code application logic here
      System.out.println("El número que puso en fibonacci es " + fibonacci(8));
   }
   
   public static int fibonacci(int iPos){
      if (iPos>1)
         return fibonacci(iPos-1)+ fibonacci(iPos-2);
      else if (iPos ==1)
         return 1;
      else if(iPos ==0)
         return 0;
      else{
         return -1;
      }
   }
}