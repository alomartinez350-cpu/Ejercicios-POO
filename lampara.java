public class lampara {

    private boolean encendida = false;

    public void encender() {
        encendida = true;
    }

    public void apagar() {
        encendida = false;
    }

    public String estado() {
        if (encendida) {
            return "Encendida";
        } else {
            return "Apagada";
        }
    }

    public static void main(String[] args) {

        lampara lampara = new lampara();

        System.out.println("Estado inicial: " + lampara.estado());

        lampara.encender();
        System.out.println("Después de encender: " + lampara.estado());

        lampara.apagar();
        System.out.println("Después de apagar: " + lampara.estado());
    }
}