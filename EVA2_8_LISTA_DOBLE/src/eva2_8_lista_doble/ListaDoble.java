/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva2_8_lista_doble;

/**
 *
 * @author asus X556U
 */
public class ListaDoble {
   private Nodo inicio;//ACCESO A MI LISTA, PUNTO DE PARTIDA
   private Nodo fin;
   private int tama; //contador de nodos

   public ListaDoble() {
      inicio = null;//LISTA VACÍA
      fin = null;
      tama = 0;
   }
   //IMPRIMIR LA LISTA
   public void printList(){
      Nodo temp = inicio;// Aquí empezamos
      //While
      while(temp != null){//MIENTRAS TEMP ! = NULL NOS VAMOS A MOVER
         System.out.print(temp.getDato() + " - ");
         temp = temp.getSiguiente();//mover a temp al siguiente nodo
      }
   }
      //BORRAR LA LISTA    O(1)
   public void clear(){//borramos todos los nodos de la lista
      inicio = null;
      fin = null;
      tama = 0;
   }
 
   //AGREGAR NODOS
   public void add(int valor){
      Nodo nuevo = new Nodo(valor);
      
      //¿HAY NODOS EN LA LISTA?
      if(inicio == null){ //LISTA VACÍA
         inicio = nuevo; //conectamos el primer nodo a la lista
         fin = nuevo;
      }else{//LISTA CON NODOS
         //agregar el nodo al final de la lista:
         fin.setSiguiente(nuevo);
         nuevo.setPrevio(fin);
         fin = nuevo; //NOS MOVEMOS AL FINAL DE LA LISTA
      }
      tama++;
      
   }
   //CONTAR LOS NODOS:
   public int length(){ // O(1)
      int iCont = 0;
      Nodo temp = inicio;// aquí empezamos
      //WHILE
      while(temp != null){//MIENTRAS TEMP != NULL NOS VAMOS A MOVER
         temp = temp.getSiguiente();//mover a temp al siguiente nodo
      }
      //return iCont;
      return tama;
   }
   //LA LISTA ESTÁ VACÍA: TRUE, CON NODOS: FALSE
   public boolean isEmpty(){
      if(inicio == null)
         return true;
      else
         return false;
   }
   //RECUPERAR UN VALOR DE LA LISTA:
   public int get(int pos) throws Exception{ //O(N)
      //VERIFICACIÓN
      if(isEmpty()){//LISTA VACÍA
         throw new Exception("No hay valores almacenados en la lista!!");
   }else{//POSICIÓN QUE NO EXISTA: POSICIÓN NEGATIVA O QUE NOS PASEMOS
      //pos tienen que estar entre cero y N - 1 --> N es el tamaño (lenght)
      if((pos < 0) || (pos >= length()))//si pos es menor a cero 0 pos es mayor o igual a N
         throw new Exception("El valor " + pos + " no es una posición válida en la lista!!");
   }
      Nodo temp = inicio;
      for (int i = 0; i < pos; i++) {
         temp = temp.getSiguiente();//mover a temp al siguiente nodo
      }
      return temp.getDato();
   }
   public void insertAtBeginnig(Nodo nuevo){ //O(1)
      nuevo.setSiguiente(inicio);//PRIMERO CONECTAMOS EL NUEVO NODO A LA LISTA
      inicio.setPrevio(nuevo);
      inicio = nuevo;            //CONECTAR LA LISTA AL NUEVO NODO
   }
   
   public void insertAt(int pos, int valor){//O(N)
      Nodo nuevo = new Nodo(valor);
      //VALIDAR
      //SITUACIONES:
      if(pos == 0){//INSERTAR AL INICIO
         insertAtBeginnig(nuevo);
      }
      else{//CUALQUIER OTRO CASO
         //MOVERNOS AL NODO PREVIO A LA POSICIÓN
         Nodo temp = inicio;
         for(int i = 0; i < pos; i++){//NOS MOVEMOS A LA POSICIÓN DE INSERCIÓN
            temp = temp.getSiguiente();//mover a temp al siguiente nodo
         }
         //FALTA RECONECTAR
         //primero conectamos el nuevo nodo
         nuevo.setSiguiente(temp.getSiguiente());
         nuevo.setPrevio(temp.getPrevio());
         //conectamos la lista al nuevo nodo
         temp.getPrevio().setSiguiente(nuevo);
         temp.setPrevio(nuevo);
      }
}
   public void deleteAt (int pos){//O(N)
      int iTamaLista = length();//obtengo el tamaño de la lista
      //VALIDAR
      if(iTamaLista == 1){
         clear();
      }else{
      //SITUACIONES:
         if(pos == 0){//BORRAR UN NODO AL INICIO
            inicio = inicio.getSiguiente();
      }
      else{//CUALQUIER OTRO CASO
         //MOVERNOS AL NODO PREVIO A LA POSICION
         Nodo temp = inicio;
         for (int i = 0; i < pos; i++) {
            temp = temp.getSiguiente();//mover a temp al siguiente nodo
         }
         //FALTA RECONECTAR
         temp.setSiguiente(temp.getSiguiente().getSiguiente());
         if(pos == (iTamaLista - 1))//verifico si es el último nodo de la lista
            fin = temp;
         }
         tama--;
      }
   }
}
