////////////////////////////////////////////////////////////////////
// FILIPPO RIZZOLO 2042377
// EDOARDO GALLO 2042357
////////////////////////////////////////////////////////////////////
package it.unipd.mtss;

public class NumberOverFiveThousand extends Exception {
    /* Eccezione per i numeri superiori o uguali a 5000 */
    public NumberOverFiveThousand() {
        super("Numeri oltre 4999 non validi. ");
    }
}