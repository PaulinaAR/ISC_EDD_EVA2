/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva2_11_arbol;

/**
 *
 * @author asus X556U
 */
public class EVA2_11_ARBOL_B {

   /**
    * @param args the command line arguments
    */
   public static void main(String[] args) {
      // TODO code application logic here
      ArbolBinario arbolB = new ArbolBinario();
      arbolB.add(13);
      arbolB.add(10);
      arbolB.add(18);
      arbolB.add(2);
      arbolB.add(11);
      arbolB.add(17);
      arbolB.add(20);
      arbolB.add(16);
      //pre order
      System.out.println("PRE ORDER: \n");
      arbolB.printPreOrder();
      System.out.println("");
      System.out.println("IN ORDER: \n");
      arbolB.printInOrder();
   }
   
}
