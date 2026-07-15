package com.sistema.api.model;

public interface ProcesadorDePagos {
    boolean autorizarPago(double monto, String moneda);
    boolean capturarPago(String transaccionId);
    void reembolsarPago(String transaccionId);
}
