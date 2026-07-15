import com.sistema.api.controller.GatewayFactory;
import com.sistema.api.model.ProcesadorDePagos;

public class PruebaSistema {
    public static void main(String[] args) {
        // Ahora usamos PAYPAL
        ProcesadorDePagos gateway = 
GatewayFactory.obtenerGateway("PAYPAL");
        
        // Ejecutamos la operación
        gateway.autorizarPago(500.0, "MXN");
    }
}
