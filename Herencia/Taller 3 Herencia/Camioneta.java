public class Camioneta extends Vehiculo {

    private int capacidadCarga;

    public Camioneta(String marca, String modelo, double precio, int capacidadCarga) {
        super(marca, modelo, precio);
        this.capacidadCarga = capacidadCarga;
    }

    @Override
    public void describir() {
        super.describir();
        System.out.println("Tipo: Camioneta - capacidad de carga: " + capacidadCarga + " kg");
    }
}


