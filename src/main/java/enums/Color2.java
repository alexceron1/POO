package enums;

public enum Color2 {
    /**
     * Se puede asociar campos a las constantes
     * para ello tenemos que crear un constructor
     */
    VERDE("Verde limón y verde aguacate", 1),
    AZUL("Como los avatar", 2),
    BLANCO("Regalame tu pantalon", 3);
    private final String color;
    private final int numeroLista;
    /*
     * El constructor sirve para inicializar los campos asociados a las constantes
     */
    Color2(String descripcion, int numeroLista){
        this.color = descripcion;
        this.numeroLista = numeroLista;
    }
    /**
     * Metodo para obtener el valor del campo asociado
     */
    public String getColor2(){
        return color;
    }
    public int getNumColor(){
        return numeroLista;
    }
    /**
     * El método toString() nos devuelve por defecto el nombre de la constante,
     * podemos sobreescribirlo para que nos devuelva el campo asociado a la constante
     * de forma automatica.
    */
    @Override
    public String toString(){
        return this.color + ", numero lista: " + numeroLista;
    }
}
