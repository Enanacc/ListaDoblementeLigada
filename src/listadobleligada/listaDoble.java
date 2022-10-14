/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package listadobleligada;

/**
 *
 * @author VANIA
 */
public class listaDoble {
    private Nodo primero;
    private Nodo ultimo;
    private int numElem; 
public listaDoble(){ 
    ultimo=null;
    primero = null;
    numElem = 0;
}

public void insertar(int elem1,int elem2){
     Nodo nuevo = new Nodo(elem1,elem2, null,null);
   //Insertar primer elemento de la lista
   
    if (primero == null){
        primero=nuevo;
        ultimo=nuevo;
    
        
    }
    //Insertar Segundo Elemento
    else if (primero.getSig()==null){
         //orden ascendente puntero primero
        if (primero.getElemento1()<elem1){
            primero.setSig(nuevo);
        }else{
            nuevo.setSig(primero);
            primero=nuevo;
        }
        //orden descendente puntero último
        if ( ultimo.getElemento2()>elem2){
            ultimo.setAnt(nuevo);
            
        }else{
            nuevo.setAnt(ultimo);
            ultimo=nuevo;
        }
    }
    //insertar elementos sucesivos
    else{
        
             Nodo actual = primero;
             //como primer elemento ascendente
            if (primero.getElemento1()>elem1){
            nuevo.setSig(primero);
            primero=nuevo;
            }
            else{
                while (actual.getSig()!=null ){

                if(actual.getSig().getElemento1() > elem1)
                {
                    nuevo.setSig(actual.getSig());
                   
                    actual.setSig(nuevo);
                   
                    actual=nuevo.getSig();
                    
                }else{
                actual = actual.getSig();
            }
                }
                //como ultimo elemento Ascendente
            if (actual.getSig()==null && actual.getElemento1()<elem1){
            actual.setSig(nuevo);
            }
            }
            actual=ultimo;
            // Como primer elemento Descendente
            if (ultimo.getElemento2()<elem2){
                nuevo.setAnt(ultimo);
                ultimo=nuevo;
            }else{
                while (actual.getAnt()!=null ){
                
                
                if(actual.getAnt().getElemento2() < elem2)
                {
                    nuevo.setAnt(actual.getAnt());
                    actual.setAnt(nuevo);
                    actual=nuevo.getAnt();
                    
                }else{
                actual = actual.getAnt();
                }
                }
                //como ultimo elementoDescendente
            if (actual.getAnt()==null && actual.getElemento2()>elem2){
                actual.setAnt(nuevo);
            
            }
        }
        }
    }

    void listar() {
        throw new UnsupportedOperationException("Not supported yet."); 
        // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
