package Boletin15;

public class TemperaturaErradaExcepcion extends Exception {

    public TemperaturaErradaExcepcion() {

        super("temperatura <80ºC");
    }

    public TemperaturaErradaExcepcion(String s) {
        super(s);
    }
}
