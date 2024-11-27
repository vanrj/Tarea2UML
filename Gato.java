public class Gato extends Animal implements Domesticable {
    private boolean esIndependiente;

    // Constructor
    public Gato(String nombre, boolean esIndependiente) {
        super(nombre); // Llama al constructor de la clase Animal
        this.esIndependiente = esIndependiente;
    }

    // Implementación del método abstracto hacerSonido
    @Override
    public void hacerSonido() {
        System.out.println(getNombre() + " dice: ¡Miau!");
    }

    @Override
    public void hacerSonido(String sonidoEspecifico) {
        System.out.println(getNombre() + " dice:"  + sonidoEspecifico);
    }

    // Implementación del método de la interfaz Mascota
    @Override
    public void serSociable() {
        if (esIndependiente) {
            System.out.println(getNombre() + " es sociable solo cuando tiene ganas.");
        } else {
            System.out.println(getNombre() + " es muy sociable y disfruta de la compañía humana.");
        }
    }

    // getters y setters
    public boolean esIndependiente() {
        return esIndependiente;
    }

    public void setIndependencia(boolean independencia) {
        this.esIndependiente = independencia;
    }
}
