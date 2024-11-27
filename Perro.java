// Clase Perro que extiende Animal e implementa Mascota
public class Perro extends Animal implements Domesticable {

    protected String raza;

    // Constructor de la clase Perro
    public Perro(String nombre, String raza) {
        super(nombre); // Llamada al constructor de la clase base (Animal)
        this.raza = raza;
    }

    // Implementación del método hacerSonido de Animal
    @Override
    public void hacerSonido() {
        System.out.println("El perro " + nombre + " dice: ¡Guau!");
    }

    // Implementación del método serSociable de la interfaz Mascota
    @Override
    public void serSociable() {
        System.out.println("El perro " + nombre + " es muy sociable.");
    }

    // getters y setters
    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }
}
