////////////////////////////////////////////////////////////////////
// FILIPPO RIZZOLO 2042377
// EDOARDO GALLO 2042357
////////////////////////////////////////////////////////////////////
package it.unipd.mtss;

public class NumberUnderZeroException extends Exception {
    /* Eccezione per i numeri sotto lo zero */
    public NumberUnderZeroException() {
        super("Non esistono numeri romani in negativo.");
    }
}