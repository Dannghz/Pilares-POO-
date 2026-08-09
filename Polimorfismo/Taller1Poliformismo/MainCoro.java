package Polimorfismo.Taller1Poliformismo;

public class MainCoro {
    public static void main(String[] args) {
        // POLIMORFISMO: arreglo del tipo padre con objetos hijos
        Animal[] animales = {
                new Perro("Firulais"),
                new Gato("Michi"),
                new Vaca("Lola"),
                new Loro("Cacao")
        };
        // Un solo bucle sirve para TODOS los tipos de animal
        for (Animal a : animales) {
            a.hacerSonido(); // Java elige la version correcta
        }
    }
}