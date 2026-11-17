public class Termometro {

    private double temperatura;

    public Termometro() {
        temperatura = 0.0;
    }

    public void subir(double grados) {
        temperatura += grados;
    }

    public void bajar(double grados) {
        temperatura -= grados;
    }

    public double mostrarTemperatura() {
        return temperatura;
    }

    public static void main(String[] args) {

        Termometro t = new Termometro();

        t.subir(5.0);
        t.bajar(2.0);

        System.out.println("Temperatura actual: " + t.mostrarTemperatura());
    }
}