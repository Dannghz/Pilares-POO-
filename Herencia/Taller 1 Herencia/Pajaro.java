public class Pajaro extends Animal {

    public Pajaro(String nombre, int edad) {
        super(nombre, edad);
    }

    @Override
    public void hacerSonido() {
        System.out.println(nombre + " dice: Pio pio!");
    }

    @Override
    public void comer() {
        System.out.println(nombre + " esta comiendo.");
    }

    @Override
    public void dormir() {
        System.out.println(nombre + " esta durmiendo.");
    }

    public void volar() {
        System.out.println(nombre + " vuela en el cielo.");
    }
}
