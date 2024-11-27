public class PerroGuardian extends Perro {
    private boolean estaEnPatrulla;

    // Constructor
    public PerroGuardian(String nombre, String raza, boolean estaEnPatrulla) {
        super(nombre, raza); // Llama al constructor de la clase Perro
        this.estaEnPatrulla = estaEnPatrulla;
    }

    // Método específico para patrullar
    public void patrullar() {
        if (estaEnPatrulla) {
            System.out.println(getNombre() + " está patrullando la zona.");
        } else {
            System.out.println(getNombre() + " no está en patrulla en este momento.");
        }
    }
    
    // Sobrescribe el método hacerSonido
    @Override
    public void hacerSonido() {
        System.out.println(getNombre() + " dice: ¡Guau! ¡Grrrr!");
    }

    // Implementación de serSociable de manera específica para un perro de guardia
    @Override
    public void serSociable() {
        System.out.println(getNombre() + " es sociable solo con personas de confianza.");
    }

    // getters y setters
    public void setEnPatrulla(boolean enPatrulla) {
        this.estaEnPatrulla = enPatrulla;
    }

    public boolean isEstaEnPatrulla() {
        return estaEnPatrulla;
    }

}
