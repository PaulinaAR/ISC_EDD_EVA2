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
public class MyStack extends Lista{
   //COMO LA FILA DEL SUPERMERCADO
   //LOS ELEMENTOS SE AGREGAN AL FINAL DE LA LISTA
   //METODO ADD DE LA LISTA --> SIN CAMBIOS
   //SOLO PODEMOS ACCEDER A LOS ELEMENTOS AL INICIO DE LA LISTA
   public int peek() throws Exception{
//REGRESA EL VALOR DEL ELEMENTO AL INICIO DE LA LISTA
      return get(length() - 1);
   }
   
   public int pop() throws Exception{//REGRESA Y ELIMINA EL ELEMENTO AL INICIO DE LA LISTA
      //GUARDAR EL VALOR
      int temp = get(length() - 1);
      //ELIMINAMOS EL VALOR
         deleteAt(length() - 1);
      //ENVIAMOS EL VALOR
      return temp;
   }
}
