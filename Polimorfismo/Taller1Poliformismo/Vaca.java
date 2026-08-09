package Polimorfismo.Taller1Poliformismo;

public class Vaca extends Animal {
    public Vaca(String nombre) {
        super(nombre);
    }

    @Override
    public void hacerSonido() {
        System.out.println(nombre + ": Muuu!");
    }
}
