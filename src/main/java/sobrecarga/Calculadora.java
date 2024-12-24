
package sobrecarga;

/**
 *
 * @author oscar
 */


public class Calculadora {
    
    //Obligar a nuestra aplicacion que no se cree una instancia de calculadora
    private Calculadora(){
    }
    
    
    
    /**
     * Distintos metodos con el mismo nombre, pero que haceptan parametros distintos
     * y en algunos casos returnan valores diferentes.
     */
    public static int sumar(int a, int b){
        return a + b;
    }
    public static float sumar(float x, float y){
        return x + y;
    }
    public static float sumar(int i, float j){
        return i + j;
    }
    public static double sumar(double a, double b){
        return a + b;
    }
    public static int sumar(String a, String b){
        int resultado;
        try {
            resultado = Integer.parseInt(a) + Integer.parseInt(b);
        } catch(NumberFormatException e) {
            resultado = 0;
        }
        return resultado;
    }
    /*
    public int sumar(int a, int b, int c){
        return a + b + c;
    }
    */
    
    // "varargs" - Argumentos variables - Parametros variables
    // Obtenemos un arreglo de caracteres del mismo tipo
    
    // Ejemplo metodo usando varargs
    public static int sumar(int... argumentos){
        int total = 0;
        for(int i : argumentos){
            total += i;
        }
        return total;
    }
    // Combinar con otros argumentos o parametros
    // Nota: estos solo pueden ir al inicio, porque sino seria un error de sintaxis
    public static double sumar(String str, double... argumentos){
        System.out.println(str);
        double total = 0;
        for(double i : argumentos){
            total += i;
        }
        return total;
    }
}
