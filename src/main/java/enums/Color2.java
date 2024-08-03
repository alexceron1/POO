package enums;

public enum Color2 {
    /**
     * Se puede asociar campos a las constantes
     * para ello tenemos que crear un constructor
     */
    VERDE("Verde limón y verde aguacate"),
    AZUL("Como los avatar"),
    BLANCO("Regalame tu pantalon");
    private final String color;
    /*
     * El constructor sirve para inicializar los campos asociados a las constantes
     */
    Color2(String descripcion){
        this.color = descripcion;
    }
    /**
     * Metodo para obtener el valor del campo asociado
     */
    public String getColor2(){
        return color;
    }
    /**
     * Automatizar la obtencion del valor que tiene el campo asociado
    */
    @Override
    public String toString(){
        return this.color;
    }
}
