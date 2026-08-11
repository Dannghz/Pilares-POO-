package Polimorfismo.Taller6Polimorfismo;

public class MainAgencia {
    public static void main(String[] args) {
        // 1. Crear un arreglo mezclado de al menos 5 reservas
        Reserva[] carrito = new Reserva[5];
        
        carrito[0] = new ReservaVuelo("Ana Gómez", true, 3500); // Vuelo Internacional
        carrito[1] = new ReservaVuelo("Luis Pérez", false, 600); // Vuelo Nacional
        carrito[2] = new ReservaHotel("Carlos Ruiz", 4, 120000); // 4 noches de hotel
        carrito[3] = new ReservaBusIntermunicipal("María Díaz", "Cúcuta", "Bucaramanga", 75000); // Bus
        carrito[4] = new ReservaHotel("Elena Mora", 2, 85000); // 2 noches de hotel
        
        double totalCarrito = 0;
        
        System.out.println("--- DETALLE DEL CARRITO DE RESERVAS ---");
        
        // 2. Recorrer el arreglo mostrando cada precio y sumando el total
        for (Reserva reserva : carrito) {
            double precioReserva = reserva.calcularPrecio();
            totalCarrito += precioReserva;
            
            System.out.println("Cliente: " + reserva.getCliente() + " | Precio: $" + precioReserva);
            
            // 3. Cuando sea ReservaVuelo, indicar si es internacional (usando instanceof)
            if (reserva instanceof ReservaVuelo) {
                ReservaVuelo vuelo = (ReservaVuelo) reserva; // Casting
                if (vuelo.esInternacional()) {
                    System.out.println("   -> NOTA: Este es un vuelo INTERNACIONAL.");
                } else {
                    System.out.println("   -> NOTA: Este es un vuelo NACIONAL.");
                }
            }
        }
        
        // 4. Mostrar al final el total del carrito
        System.out.println("---------------------------------------");
        System.out.println("TOTAL DEL CARRITO: $" + totalCarrito);
    }
}