public class Perro extends Animal {

    public Perro(String nombre, int edad) {
        super(nombre, edad);
    }

    @Override
    public void hacerSonido() {
        System.out.println(nombre + " dice: Guau guau!");
    }

    @Override
    public void comer() {
        System.out.println(nombre + " esta comiendo.");
    }

    @Override
    public void dormir() {
        System.out.println(nombre + " esta durmiendo.");
    }
    
    public void perseguirCola() {
        System.out.println(nombre + " persigue su cola.");
    }
}
