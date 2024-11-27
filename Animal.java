// Clase abstracta Animal
public abstract class Animal {

    private static final long serialVersionUID = 1L;

    protected String nombre;

    // Constructor de la clase Animal
    public Animal(String nombre) {
        this.nombre = nombre;
    }

    // Método abstracto para hacer que el animal emita un sonido
    public abstract void hacerSonido();

    // Método abstracto para hacer que el animal emita un sonido
    public void hacerSonido(String sonidoEspecifico){
        System.out.println(getNombre() + " dice: " + sonidoEspecifico);
    }

    // getters y setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}