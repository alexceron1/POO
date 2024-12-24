package sobrecarga;

// Importal METODOS estaticos
import static sobrecarga.Calculadora.*;

public class EjemploSobrecarga {
    public static void main(String[] args){
        // Calculadora cal = new Calculadora(); // No se puede crear instancias de la clase Calculadora
        
        System.out.println("Sumar int: " + sumar(10, 5));
        System.out.println("Sumar float: " + sumar(10.0f, 5f));
        System.out.println("Sumar float-int: " + sumar(10f, 5));
        System.out.println("Sumar int-float: " + sumar(10, 5.0f));
        System.out.println("Sumar double: " + sumar(10.0, 5.0));
        System.out.println("Sumar String: " + sumar("10", "5"));
        System.out.println("Sumar tres int: " + sumar(10, 5, 3));
        
        System.out.println("Sumar long: " + sumar(10L, 5L));
        System.out.println("Sumar int: " + sumar(10, '@'));
        System.out.println("Sumar cinco int: " + sumar(10,5,5,10,6,4,9,1,10,20,15,5));
    }
}