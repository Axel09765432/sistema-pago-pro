package com.sistema.api.service;
import com.sistema.api.model.ProcesadorDePagos;

public class PayPalAdapter implements ProcesadorDePagos {
    @Override
    public boolean autorizarPago(double monto, String moneda) {
        System.out.println("Conectando con API de PayPal para cobrar: " + 
monto + " " + moneda);
        return true;
    }

    @Override
    public boolean capturarPago(String transaccionId) {
        System.out.println("Capturando pago en PayPal con ID: " + 
transaccionId);
        return true;
    }

    @Override
    public void reembolsarPago(String transaccionId) {
        System.out.println("Procesando reembolso en PayPal para: " + 
transaccionId);
    }
}
