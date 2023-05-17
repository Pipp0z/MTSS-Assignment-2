////////////////////////////////////////////////////////////////////
// FILIPPO RIZZOLO 2042377
// EDOARDO GALLO 2042357
////////////////////////////////////////////////////////////////////
package it.unipd.mtss;

public class NonRightCharacterException extends Exception {
    public NonRightCharacterException(char c) {
        super("Lettera non valida: " + c);
    }
}