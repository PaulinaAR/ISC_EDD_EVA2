/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva2_1_for_recursivo;

/**
 *
 * @author asus X556U
 */
public class EVA2_1_FOR_RECURSIVO {

   /**
    * @param args the command line arguments
    */
   public static void main(String[] args) {
      // TODO code application logic here
      recursivo();
   }
   
   public static void recursivo(){//MÉTODO RECURSIVO
      System.out.println("HOLA MUNDO!");
      recursivo();
   }
}
