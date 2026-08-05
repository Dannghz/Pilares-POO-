public class Gato extends Animal {
    
    public Gato(String nombre, int edad) {
        super(nombre, edad);
    }

    @Override
    public void hacerSonido() {
        System.out.println(nombre + " dice: Miau!");
    }

    @Override
    public void comer() {
        System.out.println(nombre + " esta comiendo.");
    }

    @Override
    public void dormir() {
        System.out.println(nombre + " esta durmiendo.");
    }

    public void ronronear() {
        System.out.println(nombre + " ronronea felizmente.");
    }
}
