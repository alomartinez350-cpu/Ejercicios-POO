public class semaforo {

    private String color;

    public semaforo() {
        color = "rojo";
    }

    public void cambiarRojo() {
        color = "rojo";
    }

    public void cambiarAmarillo() {
        color = "amarillo";
    }

    public void cambiarVerde() {
        color = "verde";
    }

    public String mostrarColor() {
        return color;
    }

    public static void main(String[] args) {

        semaforo semaforo = new semaforo();

        System.out.println("Color inicial: " + semaforo.mostrarColor());

        semaforo.cambiarAmarillo();
        System.out.println("Color actual: " + semaforo.mostrarColor());

        semaforo.cambiarVerde();
        System.out.println("Color actual: " + semaforo.mostrarColor());

        semaforo.cambiarRojo();
        System.out.println("Color actual: " + semaforo.mostrarColor());
    }
}






 