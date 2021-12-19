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
public class ArbolBinario {
   private Nodo root;
   
   public ArbolBinario(){
      this.root = null;//Árbol vacío
   }
   
   //A PARTIR DE AQUÍ TODO ES RECURSIVO
   //AGREGAR NODO:
   public void add(int valor){
      Nodo nuevo = new Nodo(valor);
      //VERIFICAMOS SI HAY NODOS EN EL ÁRBOL
      if(root == null){//ÁRBOL VACÍO
         root = nuevo;
      }else{
         //método recursivo para agregar nodos
         addRecu(root, nuevo);
      }
   }
   
   //método recursivo (nodo actual, nodo nuevo
   private void addRecu(Nodo actual, Nodo nuevo){
      //VERIFICAR EL LADO AL QUE VA EL NODO
      if(nuevo.getDato() < actual.getDato()){//IZQ: VALOR NUEVO MENOR QUE NODO ACTUAL
         if(actual.getIzquierda() == null){//TENEMOS ESPACIO, AQUÍ INSERTAMOS EL NODO NUEVO
            actual.setIzquierda(nuevo);
         }else{//Llamar de nuevo al método recursivo, pero moviendome a la izq
            addRecu(actual.getIzquierda(), nuevo);
         }
      }else if(nuevo.getDato() > actual.getDato()){//DERECHA
         if(actual.getDerecha() == null){//TENEMOS ESPACIO, AQUÍ INSERTAMOS EL NODO NUEVO
            actual.setDerecha(nuevo);
         }else{//Llamar de nuevo al método recursivo, pero moviendome a la izq
            addRecu(actual.getDerecha(), nuevo);
          }
         
      }else{//VALOR IGUAL AL ACTUAL
         System.out.println("El valor ya existe en el árbol");
      }
   }
   
   //IMPRIMIR NODOS DEL ÁRBOL
   public void printPreOrder(){
      preOrder(root);//llama al método recursivo pre order
   }
   
   private void preOrder(Nodo actual){
      if(actual != null){
         System.out.println("[" + actual.getDato() + "]");//visit node
         preOrder(actual.getIzquierda());//travers left subtree
         preOrder(actual.getDerecha());//travers right subtree
      }
   }
   //HACER MÉTODOS
   //POST ORDER
   public void printPostOrder(){
      PostOrder(root);//llama al método recursivo In order
   }
   
   private void PostOrder(Nodo actual){
      if(actual != null){
         System.out.println("[" + actual.getDato() + "]");//visit node
         PostOrder(actual.getIzquierda());//travers left subtree
         PostOrder(actual.getDerecha());//travers right subtree
      }
   }
   //IN ORDER
   public void printInOrder(){
      InOrder(root);//llama al método recursivo In order
   }
   
   private void InOrder(Nodo actual){
      if(actual != null){
         System.out.println("[" + actual.getDato() + "]");//visit node
         InOrder(actual.getIzquierda());//travers left subtree
         InOrder(actual.getDerecha());//travers right subtree
      }
   }
}

