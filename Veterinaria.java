public class Veterinaria {
    private Gato[] gatos;
    private Perro[] perros;

    public Veterinaria() {
        gatos = new Gato[5]; // puede tener máximo 5 gatos
        perros = new Perro[5];// puede tener máximo 5 perros        
    }
    
    public void agregarGato(Gato gato) {
        for (int i = 0; i < gatos.length; i++) {
            if (gatos[i] == null) {
                gatos[i] = gato;
                break;
            }
        }
    }

    public void agregarPerro(Perro perro) {
        for (int i = 0; i < perros.length; i++) {
            if (perros[i] == null) {
                perros[i] = perro;
                break;
            }
        }
    }

    // getters y setters
    public Gato[] getGatos() {
        return gatos;
    }

    public Perro[] getPerros() {
        return perros;
    }

    public void setPerros(Perro[] perros) {
        this.perros = perros;
    }

    public void setGatos(Gato[] gatos) {
        this.gatos = gatos;
    }
}
