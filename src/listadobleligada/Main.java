/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package listadobleligada;

/**
 *
 * @author VANIA
 */
public class Main {
    public static void main(String args[]) {
        System.out.println("Comenzamos");
          listaDoble n1=new listaDoble();
          
          System.out.println("insertar  2-20");
          n1.insertar(2,20);
          n1.listar();
          
          System.out.println("insertar 1-10");
          n1.insertar(1,10);
          n1.listar();
          System.out.println("insertar  3-15");
          n1.insertar(3,15);
        n1.listar();
       System.out.println("insertar  0-40");
       n1.insertar(0,40);
      n1.listar();
    }
    private Nodo primero;
    private Nodo ultimo;
    public void listar(){
     Nodo actual = primero;
   
    System.out.println("Listar desde primero");
     while (actual.getSig()!= null){
        System.out.println(actual.getElemento1()+"--"+actual.getElemento2());
        actual = actual.getSig();
    
    }
    System.out.println(actual.getElemento1()+"--"+actual.getElemento2());
    
    actual = ultimo;
   System.out.println("Listar desde ultimo");
    
     while (actual.getAnt()!= null){
        System.out.println(actual.getElemento1()+"--"+actual.getElemento2());
        actual = actual.getAnt();
    
    }
    System.out.println(actual.getElemento1()+"--"+actual.getElemento2());
 
}
}
