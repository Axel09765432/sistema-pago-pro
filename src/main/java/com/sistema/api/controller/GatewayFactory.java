package com.sistema.api.controller;
import com.sistema.api.service.StripeAdapter;
import com.sistema.api.service.PayPalAdapter;
import com.sistema.api.model.ProcesadorDePagos;

public class GatewayFactory {
    public static ProcesadorDePagos obtenerGateway(String tipo) {
        if ("STRIPE".equalsIgnoreCase(tipo)) {
            return new StripeAdapter();
        } else if ("PAYPAL".equalsIgnoreCase(tipo)) {
            return new PayPalAdapter();
        }
        throw new IllegalArgumentException("Proveedor no soportado: " + 
tipo);
    }
}
