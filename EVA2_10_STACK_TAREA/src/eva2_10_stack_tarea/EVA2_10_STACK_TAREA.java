/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva2_10_stack_tarea;

/**
 *
 * @author asus X556U
 */
public class EVA2_10_STACK_TAREA {

   /**
    * @param args the command line arguments
    */
   public static void main(String[] args) {
      // TODO code application logic here
      MyStack myStack = new MyStack();
      myStack.add(100);
      myStack.add(200);
      myStack.add(300);
      myStack.add(400);
      myStack.printList();
        
        try {
            System.out.println("Último elemento de la fila: " + myStack.peek());
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        myStack.printList();
        try {
            System.out.println("Último elemento de la fila: " + myStack.pop());
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        
        myStack.printList();
   }
   
}
