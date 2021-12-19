/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva2_12_collections_1;

import java.util.LinkedList;

/**
 *
 * @author asus X556U
 */
public class EVA2_12_COLLECTIONS_1 {

   /**
    * @param args the command line arguments
    */
   public static void main(String[] args) {
      // TODO code application logic here
      //Lista enlazada --> LinkedList
      LinkedList<Integer> linkedList = new LinkedList();
      /*<> Tipos de datos genéricos
      E – Element (usado bastante por Java Collections Framework)
      K – Key (Llave, usado en mapas)
      N – Number (para números)
      T – Type (Representa un tipo, es decir, una clase)
      V – Value (representa el valor, también se usa en mapas)
      S,U,V etc. – usado para representar otros tipos.
      */
      linkedList.add(100);
      linkedList.add(200);
      linkedList.add(300);
      linkedList.add(400);
      linkedList.add(500);
      linkedList.add(600);
      linkedList.add(700);
      System.out.println(linkedList);
      System.out.println(linkedList.get(4));
      linkedList.remove(4);
      System.out.println(linkedList);
      linkedList.clear();
      System.out.println(linkedList);
      //linkedList
   }
   
}
