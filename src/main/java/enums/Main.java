package enums;

public class Main {
    public static void main(String[] args){
        /*
         * Se imprime el valor del campo asociado a las constantes
         */
        System.out.println(Color2.AZUL);
        /**
         * Metodos para manipulación de los enums
         */
        //name(): Devuelve una cadena de caracteres con el nombre de la constante.
        String color = Color.AMARILLO.name();
        //ordinal(): devuelve un entero con la posición de la constante.
        int posicionAzul = Color.AZUL.ordinal();
        //values(): devuelve un arreglo con las constantes
        Color[] colores = Color.values();
        //valueOf(String name): devuelve la constante que coincide con el String pasado como parametro
        Color colorAnaranjado = Color.valueOf("ANARANJADO");
    }
}
