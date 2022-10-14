/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package listadobleligada;

/**
 *
 * @author VANIA
 */
public class Nodo {
    private int elemento1;
    private int elemento2;
    private Nodo siguiente;
    private Nodo anterior;

public Nodo (int elem1,int elem2, Nodo sig, Nodo ant){
    elemento1 = elem1;
    elemento2 = elem2;
    siguiente = sig;
    anterior=ant;
}
public int getElemento1(){
    return elemento1;
}
public int getElemento2(){
    return elemento2;
}
public Nodo getSig(){
    return siguiente;
}
public Nodo getAnt(){
    return anterior;
}
public void setElemento1(int elem1){
    elemento1 = elem1;
}
public void setElemento2(int elem2){
    elemento2 = elem2;
}
public void setSig(Nodo sig){
    siguiente = sig;
}
public void setAnt(Nodo ant){
    anterior= ant;
} 
}
