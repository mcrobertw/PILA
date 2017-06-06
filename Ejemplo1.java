package pila_clase1;
import java.util.*;

public class Pila_clase1 {
    public static void main(String[] args) {
        Stack pila= new Stack();
        pila.push(50);
        pila.push("String");
        pila.push("palabra");
        
        System.out.println("El elemento de la cima de la pila  es: "+pila.peek());
        
        System.out.println("\n Imprimiendo elementos de la pila: ");
        
        while(pila.empty()==false)
        {
            System.out.println("Elemento: \n"+pila.pop());
        }
    }
    
}