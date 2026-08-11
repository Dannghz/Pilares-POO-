package Abstraccion.Taller5Abstraccion;

public class MainNotificaciones {
    public static void main(String[] args) {
        NotificacionEmail email = new NotificacionEmail(
                "carlos@sena.edu.co",
                "Su matricula fue aprobada.");
        NotificacionSMS sms = new NotificacionSMS(
                "3001234567",
                "Su pedido esta en camino.");
        NotificacionWhatsApp whatsApp = new NotificacionWhatsApp(
                "322909037",
                "Su pedido esta en camino.");
        email.enviar();
        System.out.println("---");
        sms.enviar();
        System.out.println("---");
        whatsApp.enviar();
    }
}